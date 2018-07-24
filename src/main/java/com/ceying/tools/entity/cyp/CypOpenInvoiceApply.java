package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "T_OPENINVOICEAPPLY")
public class CypOpenInvoiceApply implements Serializable {
    private String urid;

    private String openinvoiceinfoid;

    private BigDecimal applyamount;

    private Date applydate;

    private String contactsname;

    private String cellphone;

    private String address;

    private String openstate;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String openorgid;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getOpeninvoiceinfoid() {
        return openinvoiceinfoid;
    }

    public void setOpeninvoiceinfoid(String openinvoiceinfoid) {
        this.openinvoiceinfoid = openinvoiceinfoid == null ? null : openinvoiceinfoid.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getContactsname() {
        return contactsname;
    }

    public void setContactsname(String contactsname) {
        this.contactsname = contactsname == null ? null : contactsname.trim();
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone == null ? null : cellphone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getOpenstate() {
        return openstate;
    }

    public void setOpenstate(String openstate) {
        this.openstate = openstate == null ? null : openstate.trim();
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

    public BigDecimal getApplyamount() {
        return applyamount;
    }

    public void setApplyamount(BigDecimal applyamount) {
        this.applyamount = applyamount;
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

    public String getOpenorgid() {
        return openorgid;
    }

    public void setOpenorgid(String openorgid) {
        this.openorgid = openorgid == null ? null : openorgid.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", openinvoiceinfoid=").append(openinvoiceinfoid);
        sb.append(", applyamount=").append(applyamount);
        sb.append(", applydate=").append(applydate);
        sb.append(", contactsname=").append(contactsname);
        sb.append(", cellphone=").append(cellphone);
        sb.append(", address=").append(address);
        sb.append(", openstate=").append(openstate);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", openorgid=").append(openorgid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}