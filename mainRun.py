from github import Github
from github.GithubException import UnknownObjectException
from github.GithubException import BadCredentialsException
import github
from datetime import datetime
from collections import defaultdict as DD
from requests.exceptions import ReadTimeout
import xml.etree.ElementTree as ET
import urllib
import urllib2
import json
import time
import zipfile
import sys
import os
import subprocess


def download_cve():
    base = 'https://static.nvd.nist.gov/feeds/xml/cve/2.0/nvdcve-2.0-'
    xml = '.xml.zip'
    target = './xml/nvdcve-2.0-'
    year = int(datetime.now().year) + 1

    if not os.path.isdir('./xml/'):
        os.mkdir('./xml/')
    else:
        for i in range(2002, year):
            if not os.path.exists(target+str(i)+xml):
                urllib.urlretrieve(base + str(i) + xml, target + str(i) + xml)
                zipfile.ZipFile(target+str(i)+xml, 'r').extractall('./xml/')
        if not os.path.exists(target + 'modified' + xml):
            urllib.urlretrieve(base + 'modified' + xml, target + 'modified' + xml)
            zipfile.ZipFile(target + 'modified' + xml, 'r').extractall('./xml/')
        if not os.path.exists(target + 'recent' + xml):
            urllib.urlretrieve(base + 'recent' + xml, target + 'recent' + xml)
            zipfile.ZipFile(target + 'recent' + xml, 'r').extractall('./xml/')

    dir_name = './xml/'
    test = os.listdir(dir_name)

    for item in test:
        if item.endswith('.zip'):
            os.remove(os.path.join(dir_name, item))


def find_soft(elem):
    if elem.tag != '{http://cpe.mitre.org/language/2.0}fact-ref':
        return find_soft(elem[0])
    return elem


def parse_xml(root):
    vendors = DD(set)
    for child in root:
        for grandchild in child:
            if grandchild.tag == '{http://scap.nist.gov/schema/vulnerability/0.4}references':
                for greatgrandchild in grandchild:
                    if greatgrandchild.tag == '{http://scap.nist.gov/schema/vulnerability/0.4}reference' and 'commit' in greatgrandchild.attrib['href'] and 'https://github.com/' in greatgrandchild.attrib['href']:
                        try:
                            soft = find_soft(child)
                            if soft != 0:
                                url = greatgrandchild.attrib['href'].split('commit',1)[0]
                                if len(url.split('/')) <= 6:
                                    vendors[soft.attrib['name'].split(':')[3]].add(url)
                                else:
                                    vendors[soft.attrib['name'].split(':')[3]].add('/'.join(url.split('/')[:5])+'/')
                        except IndexError:
                            pass
                        except KeyError as e:
                            pass
    return vendors


def union_dict(dict1, dict2):
    for k, v in dict1.items():
        if k in dict2:
            dict1[k] = v.union(dict2[k])
    for k, v in dict2.items():
        if k not in dict1:
            dict1[k] = v
    return dict1


def find_product_git():
    vendors = DD(set)
    base = './xml/nvdcve-2.0-'
    xml = '.xml'
    year = int(datetime.now().year) + 1
    for i in range(2002, year):
        tree = ET.parse(base + str(i) + xml)
        root = tree.getroot()
        vendors = union_dict(parse_xml(root), vendors)
    tree = ET.parse(base + 'recent' + xml)
    root = tree.getroot()
    vendors = union_dict(parse_xml(root), vendors)
    tree = ET.parse(base + 'modified' + xml)
    root = tree.getroot()
    vendors = union_dict(parse_xml(root), vendors)

    try:
        os.makedirs('./csv/')
    except OSError as e:
        if e.errno != errno.EEXIST:
            raise

    file = open('./csv/git_products.csv', 'w')
    file.write('sep=,\n')
    for i in vendors:
        file.write(str(i))
        for j in vendors[i]:
            file.write(',' + str(j) + '\n')

    file.close()


def find_languages(access_token = None):
    headers = {'Accept':'application/vnd.github.v3+json', 'Authorization': 'token '+access_token, 'User-Agent': 'PyGithub/Python'}
    input_file = open('./csv/git_products.csv', 'r+')
    output_file = open('./csv/lang_git_products.csv', 'w+')

    if access_token:
        git = Github(str(access_token))  # 3a23465ae5a78097c4ae8b47ee947303ad1df6a5
    else:
        git = Github()

    sleeptime = 60/git.get_rate_limit().core.remaining

    for line in input_file:
        git_url = line.split(',')[1]
        repo_name = git_url.split('/')
        try:
            product = '/'.join(repo_name[3:5])
            repo = git.get_repo(product)
            lang_url = repo.languages_url
            lang_request = urllib2.Request(lang_url)
            for k,v in headers.iteritems():
                lang_request.add_header(k,v)
            response = urllib2.urlopen(lang_request)
            data = response.read()
            lang_json = json.loads(data)
            keys = sorted(lang_json.iteritems(), key=lambda (k, v): (v, k), reverse=True)
            lang_list = [x[0].encode('utf-8') for x in keys]
            string_list = str(lang_list).replace(',', ';')
            remove_chars = ['\'', ' ', '[', ']']
            for c in remove_chars:
                string_list = string_list.replace(c, '')
            output_file.write(line.rstrip('\n') + ',' + string_list + '\n')
        except UnknownObjectException:
            output_file.write(line.rstrip('\n') + ',' + '404 Error' + '\n')
        except urllib2.HTTPError as e:
            print(e)
            print(lang_request.header_items())
        except BadCredentialsException:
            output_file.write(line.rstrip('\n')+ ','+'401 Error Bad Credentials'+'\n')
        except ReadTimeout:
            output_file.write(line.rstrip('\n' + ',' + 'ReadTimeOut\n'))
        time.sleep(sleeptime)

    input_file.close()
    output_file.close()


def build_classes(specify_lang,language):
    print('finding all '+language+' projects')
    class_string = "\tpublic static final Project {product_upper} = new Project(\n" \
                   "\t\t\"{product}\",\n" \
                   "\t\t\"{repo}\",\n" \
                   "\t\t\".*?(github\\\\.com).*?(commit)+.*?(/)+([a-f0-9]+)\",\n" \
                   "\t\t4,\n" \
                   "\t\t\"\",\n" \
                   "\t\t0,\n" \
                   "\t\t\"{repo}issues\",\n" \
                   "\t\t\".*?(github\\\\.com\\\\/{vendor}\\\\/{product_git}\\\\/issues\\\\/)([0-9]+)\",\n" \
                   "\t\t2,\n" \
                   "\t\t\"{languages}\"\n" \
                   "\t);\n"
    product = {'product': '', 'repo': '', 'vendor': '', 'product_upper': '', 'product_git': '', 'languages': ''}

    input_file = open('./csv/lang_git_products.csv', 'r')
    output_file = open('./data7/src/main/java/data7/project/CProjects.java', 'w+')
    second_output = open('make_run_lines.txt', 'w+')

    output_file.write("package data7.project;" \
                      "\n" \
                      " /*-\n" \
                      " * #%L\n" \
                      " * Data\n7" \
                      " * %%\n" \
                      " * Copyright (C) 2018 University of Luxembourg, Matthieu Jimenez\n" \
                      " * %% \n" \
                      " * Licensed under the Apache License, Version 2.0 (the \"License\");\n" \
                      " * you may not use this file except in compliance with the License.\n" \
                      " * You may obtain a copy of the License at\n" \
                      " * \n" \
                      " *      http://www.apache.org/licenses/LICENSE-2.0\n" \
                      " * \n" \
                      " * Unless required by applicable law or agreed to in writing, software\n" \
                      " * distributed under the License is distributed on an \"AS IS\" BASIS,\n" \
                      " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\n" \
                      " * See the License for the specific language governing permissions and\n" \
                      " * limitations under the License.\n" \
                      " * #L%\n" \
                      " */\n" \
                      "\n" \
                      "\n" \
                      "\n" \
                      "import java.util.TreeMap;\n" \
                      "\n" \
                      "public class CProjects {\n" \
                      "\n")


    run_file_format = "import data7.project.CProjects;\n"\
                      "import data7.project.Project;\n"\
                      "import data7.Importer;\n"\
                      "import data7.Exporter;\n"\
                      "import data7.ResourcesPath;\n"\
                      "import java.text.ParseException;\n"\
                      "import java.io.IOException;\n"\
                      "import java.lang.ClassNotFoundException;\n"\
                      "\n\npublic class run{\n"\
                      "\tpublic static void main(String[] args) {\n"\
                      "\t\tResourcesPath path = new ResourcesPath(System.getProperty(\"user.home\")+\"/Research/GitNet/Collect/\");\n"\
                      "\t\tImporter importer = new Importer(path);\n" \
                      "\t\tExporter exporter = new Exporter(path);\n" \
                      "\t\ttry{\n"

    end = "\t\t} catch (ParseException e) {\n"\
             "\t\t\tSystem.out.println(\"ParseException\");\n"\
             "\t\t} catch (ClassNotFoundException e) {\n"\
             "\t\t\tSystem.out.println(\"ClassNotFoundException 1\");\n"\
             "\t\t} catch (IOException e) {\n"\
             "\t\t\tSystem.out.println(\"IOException 1\");\n"\
             "\t\t}\n}"

    count = 1
    for line in input_file:
        split_line = line.rstrip().split(',')
        print(split_line)
        if split_line[0] != 'sep=':
            if (specify_lang and (language in split_line[2].split(';'))) or not specify_lang:
                if split_line[0]:
                    formatted = urllib.unquote(split_line[0])
                    upper_formatted = split_line[0].upper().replace('%','00')
                    product['product'] = formatted
                    product['product_upper'] = upper_formatted
                    count = 1
                elif product['product']:
                    product['product_upper'] = product['product'].upper() + '_' + str(count)
                    count += 1
                product['repo'] = split_line[1]
                product['vendor'] = split_line[1].split('/')[3]
                product['product_git'] = split_line[1].split('/')[4]
                product['product_upper'] = product['product_upper'].replace('-', '_')
                product['product_upper'] = product['product_upper'].replace('.', '_')
                product['languages'] = split_line[2]
                output_file.write(class_string.format(**product) + '\n')
                second_output.write("importer.updateOrCreateDatasetFor(CProjects.{});\n".format(product['product_upper']))
                second_output.write("exporter.exportDatasetToXML(exporter.loadDataset(\"{}\"));\n".format(product['product']))

    output_file.write("}")
    second_output.close()

    # second_output = open('make_run_lines.txt', 'r')
    # lines = [line for line in second_output]
    # lines.sort()
    # second_output.close()

    # second_output = open('make_run_lines.txt', 'w')
    # second_output.writelines(lines)
    # second_output.close()

    third_output = open('run.java', 'w+')
    second_output = open('make_run_lines.txt', 'r')
    third_output.write(run_file_format)
    # for line in second_output:
    #     if line.startswith('importer'):
    #         third_output.write('\t\t\t'+line)
    # second_output.seek(0)
    third_output.writelines(second_output.readlines())
    # third_output.write(middle)
    # for line in second_output:
    #     if line.startswith('exporter'):
    #         third_output.write('\t\t\t'+line)
    third_output.write(end)


    input_file.close()
    output_file.close()
    second_output.close()
    third_output.close()


def find_target_software(root):
    count = set()
    dupes = DD(set)
    hrefs = []
    references = set()
    last_product_was_android = False
    last_product = ''
    for child in root:
        if child.tag == '{http://scap.nist.gov/schema/feed/vulnerability/2.0}entry' and last_product_was_android:
#            for href in hrefs:
#                print(last_product)
#                print(href)
#                references.add(href)
            last_product_was_android = False
#        hrefs = []
        for grandchild in child:
            for greatgrand in grandchild:
                if grandchild.tag == '{http://scap.nist.gov/schema/vulnerability/0.4}references':
                    if grandchild.attrib['reference_type'] == 'PATCH':
                        if greatgrand.tag == '{http://scap.nist.gov/schema/vulnerability/0.4}reference':
                            if last_product_was_android:
                                print(last_product)
                                print(grandchild.attrib['reference_type'])
                                print(greatgrand.attrib['href'])
                                hrefs.append(greatgrand.attrib['href'])
                    elif greatgrand.tag == '{http://scap.nist.gov/schema/vulnerability/0.4}reference' and ('git' in greatgrand.attrib['href'] or 'code' in  greatgrand.attrib['href']):
                        if greatgrand.tag == '{http://scap.nist.gov/schema/vulnerability/0.4}reference':
                            if last_product_was_android:
                                print(last_product)
                                print(grandchild.attrib['reference_type'])
                                print(greatgrand.attrib['href'])
                                hrefs.append(greatgrand.attrib['href'])
                for g2 in greatgrand:
                    if greatgrand.tag == '{http://cpe.mitre.org/language/2.0}logical-test':
                        if g2.tag == '{http://cpe.mitre.org/language/2.0}fact-ref':
                            if '~~~android~~' in g2.attrib['name']:
                                last_product = g2.attrib['name']
                                last_product_was_android = True
                                set_item = g2.attrib['name'].split(':')[2]+':'+g2.attrib['name'].split(':')[3]
                                count.add(set_item)
                                dupes[set_item].add(g2.attrib['name'])

    return dupes


def parse_for_android():
    dupes = DD(set)
    count = set()
    base = './xml/nvdcve-2.0-'
    xml = '.xml'
    year = int(datetime.now().year) + 1
    for i in range(2002, year):
        tree = ET.parse(base + str(i) + xml)
        root = tree.getroot()
        # count = count.union(find_target_software(root))
        dupes = merge_dict_set(dupes, find_target_software(root))
    tree = ET.parse(base + 'recent' + xml)
    root = tree.getroot()
    # count = count.union(find_target_software(root))
    dupes = merge_dict_set(dupes, find_target_software(root))
    tree = ET.parse(base + 'modified' + xml)
    root = tree.getroot()
    # count = count.union(find_target_software(root))
    dupes = merge_dict_set(dupes, find_target_software(root))
    return dupes


def merge_dict_list(d1, d2):
    for i, j in d2.items():
        d1[i].extend(j)
    return d1


def merge_dict_set(d1, d2):
    for i, j in d2.items():
        d1[i] = d1[i].union(j)
    return d1


if __name__ == '__main__':
    if len(sys.argv) == 2:
        if sys.argv[1] == "-h" or sys.argv[1] == "-help":
            print("Written in Python 2.7.5\n"
                  "This is a script to collect all projects in NVD with a specific language.\n"\
                  "To run the program, run this script with a programming language.\n"\
                  "Example: \n"\
                  "python "+sys.argv[0]+" Java\n"\
                  "Note: The programming language selected must be found within a CPE within NVD to collect any data.")
        else:
            target_lang = sys.argv[1][0].upper()+sys.argv[1][1:]

            download_cve()
            print('downloaded xmls')
            find_product_git()
            print('found all git cves')

            find_languages('3a23465ae5a78097c4ae8b47ee947303ad1df6a5')
            print('langauges found')

            build_classes(True, target_lang)
            move_file = raw_input('move to data7 folder? (y/n)')
            if move_file == 'y':
                os.rename('/home/ecvu/Research/GitNet/python_scripts/run.java', '/home/ecvu/Research/GitNet/data7/run.java')
                os.rename('/home/ecvu/Research/GitNet/python_scripts/CProjects.java', '/home/ecvu/Research/GitNet/data7/data7/src/main/java/data7/project/CProjects.java')
            subprocess.call(["ls", "-a"])
            subprocess.call(["maven", "install"])
    else:
        print("Expected 1 language as commandline argument. e.g. python "+sys.argv[0]+" Java")
        if len(sys.argv) > 2:
            print("Too many arguments.")
        else:
            print("No language found.")

