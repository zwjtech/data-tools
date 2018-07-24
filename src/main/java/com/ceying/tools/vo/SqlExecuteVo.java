package com.ceying.tools.vo;

/**
 * @author : Meow
 * @date : 2018-7-18
 * @description : TODO
 */
public class SqlExecuteVo {
    private String startVersion;
    private String endVersion;
    private String svnPath;
    public String getStartVersion() {
        return startVersion;
    }

    public void setStartVersion(String startVersion) {
        this.startVersion = startVersion;
    }

    public String getEndVersion() {
        return endVersion;
    }

    public void setEndVersion(String endVersion) {
        this.endVersion = endVersion;
    }

    public String getSvnPath() {
        return svnPath;
    }

    public void setSvnPath(String svnPath) {
        this.svnPath = svnPath;
    }
}
