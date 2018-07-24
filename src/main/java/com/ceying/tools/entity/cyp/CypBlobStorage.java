package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "TBLOBSTORAGE")
public class CypBlobStorage implements Serializable {
    private Integer lStorageid;

    private String cCatalog;

    private String cSubkeyid;

    private String cFilename;

    private Long lFilesize;

    private String cCreator;

    private Date dCreatedate;

    private String cSecuritylevel;

    private String cIsuse;

    private String cType;

    private String cMemo;

    private String cFileid;

    private byte[] bAccessory;

    private static final long serialVersionUID = 1L;

    public String getcCatalog() {
        return cCatalog;
    }

    public void setcCatalog(String cCatalog) {
        this.cCatalog = cCatalog == null ? null : cCatalog.trim();
    }

    public String getcSubkeyid() {
        return cSubkeyid;
    }

    public void setcSubkeyid(String cSubkeyid) {
        this.cSubkeyid = cSubkeyid == null ? null : cSubkeyid.trim();
    }

    public String getcFilename() {
        return cFilename;
    }

    public void setcFilename(String cFilename) {
        this.cFilename = cFilename == null ? null : cFilename.trim();
    }

    public Integer getlStorageid() {
        return lStorageid;
    }

    public void setlStorageid(Integer lStorageid) {
        this.lStorageid = lStorageid;
    }

    public Long getlFilesize() {
        return lFilesize;
    }

    public void setlFilesize(Long lFilesize) {
        this.lFilesize = lFilesize;
    }

    public String getcCreator() {
        return cCreator;
    }

    public void setcCreator(String cCreator) {
        this.cCreator = cCreator == null ? null : cCreator.trim();
    }

    public Date getdCreatedate() {
        return dCreatedate;
    }

    public void setdCreatedate(Date dCreatedate) {
        this.dCreatedate = dCreatedate;
    }

    public String getcSecuritylevel() {
        return cSecuritylevel;
    }

    public void setcSecuritylevel(String cSecuritylevel) {
        this.cSecuritylevel = cSecuritylevel == null ? null : cSecuritylevel.trim();
    }

    public String getcIsuse() {
        return cIsuse;
    }

    public void setcIsuse(String cIsuse) {
        this.cIsuse = cIsuse == null ? null : cIsuse.trim();
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType == null ? null : cType.trim();
    }

    public String getcMemo() {
        return cMemo;
    }

    public void setcMemo(String cMemo) {
        this.cMemo = cMemo == null ? null : cMemo.trim();
    }

    public String getcFileid() {
        return cFileid;
    }

    public void setcFileid(String cFileid) {
        this.cFileid = cFileid == null ? null : cFileid.trim();
    }

    public byte[] getbAccessory() {
        return bAccessory;
    }

    public void setbAccessory(byte[] bAccessory) {
        this.bAccessory = bAccessory;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lStorageid=").append(lStorageid);
        sb.append(", cCatalog=").append(cCatalog);
        sb.append(", cSubkeyid=").append(cSubkeyid);
        sb.append(", cFilename=").append(cFilename);
        sb.append(", lFilesize=").append(lFilesize);
        sb.append(", cCreator=").append(cCreator);
        sb.append(", dCreatedate=").append(dCreatedate);
        sb.append(", cSecuritylevel=").append(cSecuritylevel);
        sb.append(", cIsuse=").append(cIsuse);
        sb.append(", cType=").append(cType);
        sb.append(", cMemo=").append(cMemo);
        sb.append(", cFileid=").append(cFileid);
        sb.append(", bAccessory=").append(bAccessory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}