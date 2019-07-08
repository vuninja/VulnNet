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




import data7.importer.cve.DatasetUpdateListener;
import data7.model.Data7;
import data7.model.change.Commit;
import data7.project.Project;
import data7.model.vulnerability.Vulnerability;
import data7.ResourcesPath;
import gitUtilitaries.GitActions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static data7.Utils.generateCommitOfInterest;


/**
 *
 */
public class CVEAnalysis {

    private final List<CVE> cveList;
    private final Data7 dataset;
    private final DatasetUpdateListener[] listeners;
    private final GitActions git;
    private final ResourcesPath path;


    private CVEAnalysis(List<CVE> cveList, Data7 dataset, DatasetUpdateListener[] listeners, GitActions git, ResourcesPath path) {
        this.cveList = cveList;
        this.dataset = dataset;
        this.git = git;
        if (listeners == null){
            this.listeners = new DatasetUpdateListener[0];
        }else{
        this.listeners = listeners;}
        this.path = path;
    }

    /**
     * Main function to be called
     */
    private void process() {
        Map<String, Vulnerability> vd = dataset.getVulnerabilitySet().getVulnerabilityDataset();
        //For each of the cve found in the parsing step
        for (CVE cve : cveList) {
            //if the vulnerability exist then update the entry
            if (vd.containsKey(cve.getCVE())) {
                updateVulnerability(cve, vd);
            } else { //otherwise create a new vulnerability entry
                createVulnerability(cve, vd);
            }
        }
    }

    /**
     * Function to update a vulnerability entry
     *
     * @param cve object
     * @param vd  corresponding to the cve
     */
    private void updateVulnerability(CVE cve, Map<String, Vulnerability> vd) {
        Vulnerability vulnerability = vd.get(cve.getCVE());
        //if the latest modification is not more recent than the previous one just do nothing
        if (cve.getLastModified() > vulnerability.getLastModified()) {
            vulnerability.setLastModified(cve.getLastModified());
            //updating the cwe if needed
            if (!cve.getCWE().equals(vulnerability.getCwe())) {
                updateCWE(vulnerability, cve.getCWE());
            }
            //updating the score if needed
            if (!cve.getScore().equals(vulnerability.getScore())) {
                updateScore(vulnerability, cve.getScore());
            }
            handleHashAndBugIds(cve, vulnerability, false);
        }
    }

    /**
     * Function to create a vulnerability entry from a CVE object
     *
     * @param cve
     */
    private void createVulnerability(CVE cve, Map<String, Vulnerability> vd) {
        //Create the vulnerability object
        Vulnerability vulnerability = createVulnerabilityEntry(cve);
        //For each hash retrieve the fixes
        handleHashAndBugIds(cve, vulnerability, true);
        vd.put(cve.getCVE(), vulnerability);
    }

    private Vulnerability createVulnerabilityEntry(CVE cve) {
        Vulnerability vulnerability = new Vulnerability(cve);
        newVulnerabilityEvent(vulnerability);
        return vulnerability;
    }


    private void handleHashAndBugIds(CVE cve, Vulnerability vulnerability, boolean newEntry) {
        //for each hash check whether it's already been handled
        for (String hash : cve.getPatchingCommits()) {
            if (newEntry || !vulnerability.getPatchingCommits().containsKey(hash)) {
                addCommitOfInterest(vulnerability, hash);
            }
        }
        //For each bug add it to the vuln
        for (String bugId : cve.getBugsId()) {
            if (newEntry || !dataset.getBugToCve().containsKey(bugId)) {
                addBugToVuln(vulnerability, bugId);
            }
        }
    }


    private void updateCWE(Vulnerability vulnerability, String cwe) {
        vulnerability.setCwe(cwe);
        cweUpdatedForVulnerabilityEvent(vulnerability);
    }

    private void updateScore(Vulnerability vulnerability, String score) {
        vulnerability.setScore(score);
        scoreUpdatedForVulnerabilityEvent(vulnerability);
    }


    private void addCommitOfInterest(Vulnerability vulnerability, String hash) {
        Commit commit = generateCommitOfInterest(git, hash, true, path, dataset);
        if (commit != null) {
            vulnerability.getPatchingCommits().put(hash, commit);
            String bugId = checkCommitForBugId(commit.getMessage());
            if (bugId != null) {
                vulnerability.getBugIds().add(bugId);
                if (dataset.getBugToCve().containsKey(bugId)) {
                    dataset.getBugToCve().get(bugId).add(vulnerability.getCve());
                } else {
                    List<String> cve = new ArrayList<>();
                    cve.add(vulnerability.getCve());
                    dataset.getBugToCve().put(bugId, cve);
                }
                if (dataset.getBugToHash().containsKey(bugId)) {
                    dataset.getBugToHash().get(bugId).add(hash);
                } else {
                    List<String> hashes = new ArrayList<>();
                    hashes.add(hash);
                    dataset.getBugToHash().put(bugId, hashes);
                }
            }
            commitAddedToVulnerabilityEvent(vulnerability, hash);
        }
    }


    private void addBugToVuln(Vulnerability vulnerability, String bugId) {
        if (dataset.getBugToHash().containsKey(bugId)) {
            for (String hash : dataset.getBugToHash().get(bugId)) {
                vulnerability.getPatchingCommits().put(hash, generateCommitOfInterest(git, hash,true, path, dataset));
            }
            vulnerability.getBugIds().add(bugId);
            bugAddedToVulnerabilityEvent(vulnerability, bugId);
        }
        if (dataset.getBugToCve().containsKey(bugId)) {
            dataset.getBugToCve().get(bugId).add(vulnerability.getCve());
        } else {
            List<String> cve = new ArrayList<>();
            cve.add(vulnerability.getCve());
            dataset.getBugToCve().put(bugId, cve);
        }
    }


    private String checkCommitForBugId(String message) {
        Project project = dataset.getProject();
        if (project.getIndexOfBugIdinCommitMessage() != 0) {
            Pattern pattern = Pattern.compile("[.|\\r|\\n]*" + project.getPatchInCommitessageRegexp());
            Matcher m = pattern.matcher(message);
            if (m.find()) {
                return m.group(project.getIndexOfBugIdinCommitMessage());
            }
        }
        return null;
    }


    private void newVulnerabilityEvent(Vulnerability vulnerability) {
        for (DatasetUpdateListener listener : listeners) {
            listener.addVulnerability(vulnerability);
        }
    }

    private void bugAddedToVulnerabilityEvent(Vulnerability vulnerability, String bugId) {
        for (DatasetUpdateListener listener : listeners) {
            listener.bugAddedTo(vulnerability, bugId);
        }
    }

    private void commitAddedToVulnerabilityEvent(Vulnerability vulnerability, String hash) {
        for (DatasetUpdateListener listener : listeners) {
            listener.commitAddedTo(vulnerability, hash);
        }
    }

    private void scoreUpdatedForVulnerabilityEvent(Vulnerability vulnerability) {
        for (DatasetUpdateListener listener : listeners) {
            listener.scoreUpdatedFor(vulnerability);
        }
    }

    private void cweUpdatedForVulnerabilityEvent(Vulnerability vulnerability) {
        for (DatasetUpdateListener listener : listeners) {
            listener.cweUpdatedFor(vulnerability);
        }
    }

    public static void proceedWithAnalysis(List<CVE> cveList, Data7 dataset, DatasetUpdateListener[] listeners, GitActions git, ResourcesPath path) {
        new CVEAnalysis(cveList, dataset, listeners, git, path).process();
    }

}
