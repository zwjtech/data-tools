package com.ceying.tools.entity.scyp.system;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrganizationRelation implements Serializable {
    private String urid;

    private String ourorgid;

    private String opporgid;

    private String priority;

    private String category;

    private BigDecimal corecompanysupplierrate;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String isblack;

    private Integer extensiondate;

    private String organizationrelationid;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getOurorgid() {
        return ourorgid;
    }

    public void setOurorgid(String ourorgid) {
        this.ourorgid = ourorgid == null ? null : ourorgid.trim();
    }

    public String getOpporgid() {
        return opporgid;
    }

    public void setOpporgid(String opporgid) {
        this.opporgid = opporgid == null ? null : opporgid.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
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

    public String getIsblack() {
        return isblack;
    }

    public void setIsblack(String isblack) {
        this.isblack = isblack == null ? null : isblack.trim();
    }

    public Integer getExtensiondate() {
        return extensiondate;
    }

    public void setExtensiondate(Integer extensiondate) {
        this.extensiondate = extensiondate;
    }

    public String getOrganizationrelationid() {
        return organizationrelationid;
    }

    public void setOrganizationrelationid(String organizationrelationid) {
        this.organizationrelationid = organizationrelationid == null ? null : organizationrelationid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", ourorgid=").append(ourorgid);
        sb.append(", opporgid=").append(opporgid);
        sb.append(", priority=").append(priority);
        sb.append(", category=").append(category);
        sb.append(", corecompanysupplierrate=").append(corecompanysupplierrate);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", isblack=").append(isblack);
        sb.append(", extensiondate=").append(extensiondate);
        sb.append(", organizationrelationid=").append(organizationrelationid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}