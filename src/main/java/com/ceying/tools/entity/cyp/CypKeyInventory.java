package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "T_KEYINVENTORY")
public class CypKeyInventory implements Serializable {
    private String urid;

    private Integer tenantid;

    private String serialno;

    private String source;

    private Date enteringdate;

    private String target;

    private Date deliverydate;

    private String lastoperateflag;

    private String isactive;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String applyorgid;

    private String certsn;

    private String owner;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getEnteringdate() {
        return enteringdate;
    }

    public void setEnteringdate(Date enteringdate) {
        this.enteringdate = enteringdate;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getLastoperateflag() {
        return lastoperateflag;
    }

    public void setLastoperateflag(String lastoperateflag) {
        this.lastoperateflag = lastoperateflag == null ? null : lastoperateflag.trim();
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

    public String getApplyorgid() {
        return applyorgid;
    }

    public void setApplyorgid(String applyorgid) {
        this.applyorgid = applyorgid == null ? null : applyorgid.trim();
    }

    public String getCertsn() {
        return certsn;
    }

    public void setCertsn(String certsn) {
        this.certsn = certsn == null ? null : certsn.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
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
        sb.append(", serialno=").append(serialno);
        sb.append(", source=").append(source);
        sb.append(", enteringdate=").append(enteringdate);
        sb.append(", target=").append(target);
        sb.append(", deliverydate=").append(deliverydate);
        sb.append(", lastoperateflag=").append(lastoperateflag);
        sb.append(", isactive=").append(isactive);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", applyorgid=").append(applyorgid);
        sb.append(", certsn=").append(certsn);
        sb.append(", owner=").append(owner);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}