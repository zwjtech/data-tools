package com.ceying.tools.entity.scyp.system;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SupplierBusinessType implements Serializable {
    private String urid;

    private String organizationrelationid;

    private String businesstype;

    private String issupport;

    private BigDecimal corecompanysupplierrate;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getOrganizationrelationid() {
        return organizationrelationid;
    }

    public void setOrganizationrelationid(String organizationrelationid) {
        this.organizationrelationid = organizationrelationid == null ? null : organizationrelationid.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getIssupport() {
        return issupport;
    }

    public void setIssupport(String issupport) {
        this.issupport = issupport == null ? null : issupport.trim();
    }

    public BigDecimal getCorecompanysupplierrate() {
        return corecompanysupplierrate;
    }

    public void setCorecompanysupplierrate(BigDecimal corecompanysupplierrate) {
        this.corecompanysupplierrate = corecompanysupplierrate;
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

    public Integer getRowversion() {
        return rowversion;
    }

    public void setRowversion(Integer rowversion) {
        this.rowversion = rowversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", organizationrelationid=").append(organizationrelationid);
        sb.append(", businesstype=").append(businesstype);
        sb.append(", issupport=").append(issupport);
        sb.append(", corecompanysupplierrate=").append(corecompanysupplierrate);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}