package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "T_TRIPARTITEAGREEMENTTEMPLATE")
public class CypTripartiteAgreementTemplate implements Serializable {
    private String urid;

    private Integer tenantid;

    private String tatemplatecode;

    private BigDecimal tatemplateversion;

    private String bankid;

    private String corecompanyid;

    private BigDecimal creditlimits;

    private String isrecourse;

    private String isactive;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String lastoperateflag;

    private String businesstype;

    private byte[] templatecontent;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getTatemplatecode() {
        return tatemplatecode;
    }

    public void setTatemplatecode(String tatemplatecode) {
        this.tatemplatecode = tatemplatecode == null ? null : tatemplatecode.trim();
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid == null ? null : bankid.trim();
    }

    public String getCorecompanyid() {
        return corecompanyid;
    }

    public void setCorecompanyid(String corecompanyid) {
        this.corecompanyid = corecompanyid == null ? null : corecompanyid.trim();
    }

    public String getIsrecourse() {
        return isrecourse;
    }

    public void setIsrecourse(String isrecourse) {
        this.isrecourse = isrecourse == null ? null : isrecourse.trim();
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby == null ? null : lastmodifiedby.trim();
    }

    public Date getLastmodifiedon() {
        return lastmodifiedon;
    }

    public void setLastmodifiedon(Date lastmodifiedon) {
        this.lastmodifiedon = lastmodifiedon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLastoperateflag() {
        return lastoperateflag;
    }

    public void setLastoperateflag(String lastoperateflag) {
        this.lastoperateflag = lastoperateflag == null ? null : lastoperateflag.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public byte[] getTemplatecontent() {
        return templatecontent;
    }

    public void setTemplatecontent(byte[] templatecontent) {
        this.templatecontent = templatecontent;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public BigDecimal getTatemplateversion() {
        return tatemplateversion;
    }

    public void setTatemplateversion(BigDecimal tatemplateversion) {
        this.tatemplateversion = tatemplateversion;
    }

    public BigDecimal getCreditlimits() {
        return creditlimits;
    }

    public void setCreditlimits(BigDecimal creditlimits) {
        this.creditlimits = creditlimits;
    }

    public Integer getRowversion() {
        return rowversion;
    }

    public void setRowversion(Integer rowversion) {
        this.rowversion = rowversion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", tatemplatecode=").append(tatemplatecode);
        sb.append(", tatemplateversion=").append(tatemplateversion);
        sb.append(", bankid=").append(bankid);
        sb.append(", corecompanyid=").append(corecompanyid);
        sb.append(", creditlimits=").append(creditlimits);
        sb.append(", isrecourse=").append(isrecourse);
        sb.append(", isactive=").append(isactive);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", lastoperateflag=").append(lastoperateflag);
        sb.append(", businesstype=").append(businesstype);
        sb.append(", templatecontent=").append(templatecontent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}