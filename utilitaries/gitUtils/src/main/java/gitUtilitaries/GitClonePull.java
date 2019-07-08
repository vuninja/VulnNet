package gitUtilitaries;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.RefNotAdvertisedException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.api.errors.CheckoutConflictException;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Git importer class
 */
public class GitClonePull {

    private final String GitURL;
    private File destinationFolder;

    /**
     * Constructor
     *
     * @param GitURL         of the project to import
     * @param destinationFolder to clone in
     */
    public GitClonePull(String GitURL, String destinationFolder) {
        this.GitURL = GitURL;
        checkFolderDestination(destinationFolder);
    }

    /**
     * Will create the folder of destination if not existing
     *
     * @param dest folder
     */
    private void checkFolderDestination(String dest) {
        File f = new File(dest);
        if (!(f.exists() && f.isDirectory())) {
            f.mkdirs();
        }
        this.destinationFolder = f;
    }

    /**
     * Function that clone or pull the remote repository
     *
     * @throws GitAPIException
     * @throws IOException
     */
    public Git updateRepo() throws GitAPIException, IOException {
        File git = new File(destinationFolder, ".git");
        Git result;
        if (!git.exists()) {
            result = Git.cloneRepository()
                    .setURI(GitURL)
                    .setDirectory(destinationFolder)
                    .call();
        } else {
            System.out.println(git.getParent());
            result = Git.open(git);
            int maxTries = 3;
            int tries = 0;
            while(true) {
                try {
                    result.pull().call();
                    break;
                } catch (RefNotAdvertisedException e) {
                    tries++;
                    System.err.println("Reference not advertised");
                } catch (JGitInternalException e) {
                    tries++;
                    System.err.println(e.getMessage());
                    String str = e.getCause().getMessage().split(" ")[17];
                    String err_path = str.substring(0, str.length() - 1);
                    File err_file = new File(err_path);
                    if (err_file.delete()) {
                        System.out.println("index.lock deleted. Retrying...");
                    } else {
                        System.out.println("Delete failed. Continuing");
                    }
                } catch (CheckoutConflictException e) {
                    tries++;
                    System.err.println(e);
                    break;
                }
            }
        }
        return result;
    }


}
