package com.ceying.tools.entity.scyp.biz;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CoreCompanyQuota implements Serializable {
    private String urid;

    private String corecompanyid;

    private BigDecimal amountlimits;

    private BigDecimal freezeamount;

    private BigDecimal availableamount;

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

    public String getCorecompanyid() {
        return corecompanyid;
    }

    public void setCorecompanyid(String corecompanyid) {
        this.corecompanyid = corecompanyid == null ? null : corecompanyid.trim();
    }

    public BigDecimal getAmountlimits() {
        return amountlimits;
    }

    public void setAmountlimits(BigDecimal amountlimits) {
        this.amountlimits = amountlimits;
    }

    public BigDecimal getFreezeamount() {
        return freezeamount;
    }

    public void setFreezeamount(BigDecimal freezeamount) {
        this.freezeamount = freezeamount;
    }

    public BigDecimal getAvailableamount() {
        return availableamount;
    }

    public void setAvailableamount(BigDecimal availableamount) {
        this.availableamount = availableamount;
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
        sb.append(", corecompanyid=").append(corecompanyid);
        sb.append(", amountlimits=").append(amountlimits);
        sb.append(", freezeamount=").append(freezeamount);
        sb.append(", availableamount=").append(availableamount);
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