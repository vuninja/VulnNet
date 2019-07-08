package data7;

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



import data7.model.Data7;
import data7.model.change.Commit;
import data7.model.change.FileFix;
import data7.model.change.FileInterest;
import data7.ResourcesPath;
import gitUtilitaries.GitActions;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.api.errors.RefNotAdvertisedException;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static data7.Resources.FILE_EXTENSION;

@SuppressWarnings("Duplicates")
public class Utils {

    /**
     * Function to get the epoc time from a date encoded under the format yyyy-MM-dd'T'HH:mm:ss.SSSXXX
     * @param str date
     * @return long epoc time
     * @throws ParseException
     */
    public static long dateToLong(String str) throws ParseException {
        DateFormat formatter;
        Date date;
        formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        date = (Date) formatter.parse(str);
        return date.getTime();
    }


    public static long dateToLongWoM(String str) throws ParseException {
        DateFormat formatter;
        Date date;
        formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        date = (Date) formatter.parse(str);
        return date.getTime();
    }

    /**
     * Function to generate a commit Object from a hash
     * @param git git repository
     * @param hash to generate the commit object from
     * @param filter whether of not files should be filtered
     * @return a commit object
     * @see Commit
     */
    public static Commit generateCommitOfInterest(GitActions git, String hash, boolean filter, ResourcesPath path, Data7 data7) {
        try {
            String commitMessage = git.getCommitMessage(hash);
            int timestamp = git.getTimeCommit(hash);
            List<String> modifiedFiles = git.getListOfModifiedFile(hash, FILE_EXTENSION);
            List<FileFix> fixes = new ArrayList<>();
            for (String modifiedFile : modifiedFiles) {
                if (!filter || !modifiedFile.toLowerCase().contains("test")) {
                    String newName = modifiedFile;
                    GitActions.NamedCommit previousCommit = git.previousCommitImpactingAFile(modifiedFile, hash);
                    String oldname = previousCommit.getFilePath();
                    String oldHash = previousCommit.getRevCommit().getName();
                    String oldContent = git.retrievingFileFromSpecificCommit(oldHash, oldname);
                    String newContent = git.retrievingFileFromSpecificCommit(hash, newName);
                    FileInterest old = new FileInterest(oldContent, oldname);
                    FileInterest newer = new FileInterest(newContent, newName);
                    fixes.add(new FileFix(old, newer, oldHash, git.getTimeCommit(oldHash)));
                }
            }
            return new Commit(hash, commitMessage, timestamp, fixes);
        } catch (IOException | NullPointerException e) {
            System.err.println("commit hash: "+hash);
            System.err.println(e.getMessage());
            try {
                appendToExistingFile(path, data7, hash, e);
            } catch (IOException er) {
                System.err.println(er.getMessage());
            }
            return null;
        }
    }

    /**
     * Function to generate a commit Object from a revcommit object
     * @param git git repository
     * @param commit to generate the commit object from
     * @param filter whether of not files should be filtered
     * @return a commit object
     * @see Commit
     */
    public static Commit generateCommitOfInterest(GitActions git, RevCommit commit,boolean filter) {
        try {
            String hash = commit.getName();
            String commitMessage = commit.getFullMessage();
            int timestamp = commit.getCommitTime();
            List<String> modifiedFiles = git.getListOfModifiedFile(commit.getName(), FILE_EXTENSION);
            List<FileFix> fixes = new ArrayList<>();
            for (String modifiedFile : modifiedFiles) {
                if (!filter || !modifiedFile.toLowerCase().contains("test")) {
                    String newName = modifiedFile;
                    GitActions.NamedCommit previousCommit = git.previousCommitImpactingAFile(modifiedFile, hash);
                    String oldname = previousCommit.getFilePath();
                    String oldHash = previousCommit.getRevCommit().getName();
                    String oldContent = git.retrievingFileFromSpecificCommit(oldHash, oldname);
                    String newContent = git.retrievingFileFromSpecificCommit(hash, newName);
                    FileInterest old = new FileInterest(oldContent, oldname);
                    FileInterest newer = new FileInterest(newContent, newName);
                    fixes.add(new FileFix(old, newer, oldHash, git.getTimeCommit(oldHash)));
                }
            }
            return new Commit(hash, commitMessage, timestamp, fixes);
        } catch (IOException e) {
            System.err.println(e);
            return null;
        }
    }


    /**
     * Will create the folder of destination if not existing
     *
     * @param dest folder
     */
    public static void checkFolderDestination(String dest) {
        File f = new File(dest);
        if (!(f.exists() && f.isDirectory())) {
            f.mkdirs();
        }
        return ;
    }

    private static void appendToExistingFile(ResourcesPath path, Data7 data7, String hash, Exception e) throws IOException{
        File errors_csv = new File(path.getErrorPath()+"failed_commits.csv");
        if (errors_csv.exists()) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(errors_csv, true));
            writer.append(data7.getProject() +
                    "," +
                    hash +
                    "," +
                    e.getMessage() +
                    "\n");

            writer.close();
        } else {
            writeToNewFile(path, data7, hash, e);
        }
    }

    private static void writeToNewFile(ResourcesPath path, Data7 data7, String hash, Exception e) throws IOException{
        File errors_dir = new File(path.getErrorPath());
        errors_dir.mkdir();
        File errors_csv = new File(path.getErrorPath()+"failed_commits.csv");
        FileWriter fw = new FileWriter(errors_csv);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write("sep=,\n"+
                data7.getProject().getName()+
                ","+
                hash+
                ","+
                e.getMessage()+
                "\n");

        writer.close();
    }
}
