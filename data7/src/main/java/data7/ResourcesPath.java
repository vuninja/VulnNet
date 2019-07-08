package data7;

import java.io.File;

public class ResourcesPath {

    private final String savingPath;
    private final String binaryPath;
    private final String gitPath;
    private final String xmlPath;
    private final String cvePath;
    private final String errorPath;

    public ResourcesPath(String path) {
        File f = new File(path);
        if (f.exists() && f.isDirectory()) {
            savingPath = path;
            binaryPath = savingPath + "binary/";
            gitPath = "/auto/ugrad_space/ecvu/git/";
            xmlPath = savingPath + "xml/";
            cvePath = savingPath + "cve/";
            errorPath = savingPath + "errors/";
        } else throw new RuntimeException("Path is incorrect or inexisting");
    }

    public String getSavingPath() {
        return savingPath;
    }

    public String getBinaryPath() {
        return binaryPath;
    }

    public String getGitPath() {
        return gitPath;
    }

    public String getXmlPath() {
        return xmlPath;
    }

    public String getCvePath() {
        return cvePath;
    }

    public String getErrorPath() { return errorPath; }
}
