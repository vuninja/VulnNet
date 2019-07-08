package data7.importer.cve.processing.cve;

/*-
 * #%L
 * Data7
 * %%
 * Copyright (C) 2018 University of Luxembourg, Matthieu Jimenez
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */




import data7.Utils;
import data7.project.Project;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CVEParser implements Callable<List<CVE>> {

    private final Project project;
    private final String filepath;

    public CVEParser(Project project, String filepath) {
        this.filepath = filepath;
        this.project = project;
    }

    /**
     * @return
     * @throws FileNotFoundException
     * @throws XMLStreamException
     * @throws ParseException
     */
    @Override
    public List<CVE> call() throws FileNotFoundException, XMLStreamException, ParseException {
        List<CVE> cves = new ArrayList<>();
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader eventReader = factory.createXMLEventReader(new FileInputStream(filepath));
        factory.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, false);


        CVE currentCVE;
        String cve = "";
        String cwe = "";
        String summary = "";
        Set<String> versions = new HashSet<>();
        boolean softstudy = false;
        String score = "";
        List<String> bugId = new ArrayList<>();
        List<String> commit = new ArrayList<>();
        long lastModified = 0;
        long creationTime = 0;

        while (eventReader.hasNext()) {
            XMLEvent xmlEvent = eventReader.nextEvent();
            if (xmlEvent.isStartElement()) {
                StartElement startElement = xmlEvent.asStartElement();

                switch (startElement.getName().getLocalPart()) {
                    case "entry":
                        if (softstudy) {
                            currentCVE = new CVE(cve, score, summary, lastModified, creationTime, versions);
                            if (cwe.length() > 0) currentCVE.setCWE(cwe);
                            currentCVE.setBugsId(bugId);
                            currentCVE.setPatchingCommits(commit);
                            cves.add(currentCVE);
                        }
                        softstudy = false;
                        Attribute idAttr = startElement.getAttributeByName(new QName("id"));
                        cwe = "";
                        summary = "";
                        score = "";
                        versions= new HashSet<>();
                        lastModified = 0;
                        bugId = new ArrayList<>();
                        commit = new ArrayList<>();
                        cve = idAttr.getValue();
                        break;
                    case "last-modified-datetime":
                        xmlEvent = eventReader.nextEvent();
                        lastModified = Utils.dateToLong(xmlEvent.asCharacters().getData()) / 1000;
                        break;
                    case "published-datetime":
                        xmlEvent = eventReader.nextEvent();
                        creationTime = Utils.dateToLong(xmlEvent.asCharacters().getData()) / 1000;
                        break;
                    case "summary":
                        xmlEvent = eventReader.nextEvent();
                        summary = xmlEvent.asCharacters().getData();
                        break;
                    case "vulnerable-configuration":
                        xmlEvent = eventReader.nextEvent();
                        while (functionSOftConfig(xmlEvent)) {
                            if (xmlEvent.isStartElement()) {
                                Attribute softAtt = xmlEvent.asStartElement().getAttributeByName(new QName("name"));
                                if (softAtt != null) {
                                    String soft = softAtt.getValue();
                                    Matcher m = softwareMatch(soft);
                                    if (m.find()) {
                                        soft = m.group(1);
                                        if (soft.compareTo(project.getName()) == 0){
                                            versions.add(m.group(2));
                                            softstudy = true;
                                        }
                                    }
                                }
                            }
                            xmlEvent = eventReader.nextEvent();
                        }
                        break;
                    case "vulnerable-software-list":
                        xmlEvent = eventReader.nextEvent();
                        while (functionSOftList(xmlEvent)) {
                            if (!xmlEvent.isStartElement() && !xmlEvent.isEndElement()) {
                                Matcher m = softwareMatch(xmlEvent.asCharacters().getData());
                                if (m.find()) {
                                    String soft = m.group(1);
                                    if (soft.compareTo(project.getName()) == 0){
                                        versions.add(m.group(2));
                                        softstudy = true;
                                    }
                                }
                            }
                            xmlEvent = eventReader.nextEvent();
                        }
                        break;
                    case "cwe":
                        Attribute idAttrs = startElement.getAttributeByName(new QName("id"));
                        cwe = idAttrs.getValue().substring(4);
                        break;
                    case "score":
                        xmlEvent = eventReader.nextEvent();
                        score = xmlEvent.asCharacters().getData();
                        break;
                    case "references":
                        //startElement = xmlEvent.asStartElement();
                        eventReader.nextEvent();
                        eventReader.nextEvent();
                        eventReader.nextEvent();
                        eventReader.nextEvent();
                        eventReader.nextEvent();
                        xmlEvent = eventReader.nextEvent();
                        startElement = xmlEvent.asStartElement();
                        idAttr = startElement.getAttributeByName(new QName("href"));
                        if (idAttr != null) {
                            String link = idAttr.getValue();
                            //commit
                            Matcher m = gitMatch(link, project);
                            if (m.find() && softstudy) {
                                String ha = m.group(project.getIndexOfHashInRegexp());
                                if (ha.length() > 6) {
                                    commit.add(ha);
                                }
                            }
                            //bug
                            m = btMatch(link, project);
                            if (m.find() && softstudy) {
                                bugId.add(m.group(project.getIndexOfBugIdInBugTracker()));
                            }
                        }
                        break;
                    default:
                        eventReader.nextEvent();
                        break;
                }
            }
        }
        return cves;
    }

    /**
     * Method to create a Matcher for finding a given software in a NVD software label
     *
     * @param soft: software under study
     *              *
     * @return Matcher for the software
     */
    private Matcher softwareMatch(String soft) {
        String re1 = "(?:[a-z][a-z]+)";    // Uninteresting: cpe
        String re_semi = ":";    // Match literal semicolon
        String re2 = "(?:/[a|h|o])"; // Uninteresting: part a- application h- hardware o- operating system
        String re3 = "(?:[a-z][-a-z0-9_.]+)";   // Uniteresting: vendor
        String re4 = "([a-z][-a-z0-9_.]+)";    // soft
        String re5 = "([-a-z0-9_.]+).*";    // version and uninteresting
        Pattern p = Pattern.compile(re1 + re_semi + re2 + re_semi + re3 + re_semi + re4 + re_semi + re5, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        return p.matcher(soft);
    }

    /**
     * Method to create a Matcher for finding if an url is a git one
     *
     * @param url: url to check
     * @return Matcher
     */
    private Matcher gitMatch(String url, Project pI) {
        Pattern p = Pattern.compile(pI.getRegexpOnlineRepo(), Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        return p.matcher(url);
    }

    /**
     * Method to create a Matcher for finding if an url is a  bugtracker one
     *
     * @param url: url to check
     * @return Matcher
     */
    private Matcher btMatch(String url, Project pI) {
        Pattern p = Pattern.compile(pI.getBugTrackerRegexp(), Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
        return p.matcher(url);
    }

    /**
     * Sub Method
     *
     * @param xmlEvent xml event under consideration
     * @return true if the xml event is different from vulnerable-Software-list
     */
    private boolean functionSOftList(XMLEvent xmlEvent) {
        return !xmlEvent.isEndElement() || !xmlEvent.asEndElement().getName().getLocalPart().equals("vulnerable-software-list");
    }

    /**
     * Sub Method
     *
     * @param xmlEvent xml event under consideration
     * @return true if the xml event is different from vulnerable-Software-list
     */
    private boolean functionSOftConfig(XMLEvent xmlEvent) {
        return !xmlEvent.isEndElement() || !xmlEvent.asEndElement().getName().getLocalPart().equals("vulnerable-configuration");
    }

}
