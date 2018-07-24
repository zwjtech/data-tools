package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "T_KEYPURCHASEAPPLY")
public class CypKeyPurchaseApply implements Serializable {
    private String urid;

    private Integer tenantid;

    private Integer numofkey;

    private String applicant;

    private Date applydate;

    private String approver;

    private Date approvedate;

    private String packageid;

    private String recipient;

    private Date receiptdate;

    private String operateflag;

    private String recipientname;

    private String recipientphone;

    private String recipientaddress;

    private String recipientzipcode;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String startnum;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public Date getApprovedate() {
        return approvedate;
    }

    public void setApprovedate(Date approvedate) {
        this.approvedate = approvedate;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public Date getReceiptdate() {
        return receiptdate;
    }

    public void setReceiptdate(Date receiptdate) {
        this.receiptdate = receiptdate;
    }

    public String getOperateflag() {
        return operateflag;
    }

    public void setOperateflag(String operateflag) {
        this.operateflag = operateflag == null ? null : operateflag.trim();
    }

    public String getRecipientname() {
        return recipientname;
    }

    public void setRecipientname(String recipientname) {
        this.recipientname = recipientname == null ? null : recipientname.trim();
    }

    public String getRecipientphone() {
        return recipientphone;
    }

    public void setRecipientphone(String recipientphone) {
        this.recipientphone = recipientphone == null ? null : recipientphone.trim();
    }

    public String getRecipientaddress() {
        return recipientaddress;
    }

    public void setRecipientaddress(String recipientaddress) {
        this.recipientaddress = recipientaddress == null ? null : recipientaddress.trim();
    }

    public String getRecipientzipcode() {
        return recipientzipcode;
    }

    public void setRecipientzipcode(String recipientzipcode) {
        this.recipientzipcode = recipientzipcode == null ? null : recipientzipcode.trim();
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

    public String getStartnum() {
        return startnum;
    }

    public void setStartnum(String startnum) {
        this.startnum = startnum == null ? null : startnum.trim();
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public Integer getNumofkey() {
        return numofkey;
    }

    public void setNumofkey(Integer numofkey) {
        this.numofkey = numofkey;
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
        sb.append(", numofkey=").append(numofkey);
        sb.append(", applicant=").append(applicant);
        sb.append(", applydate=").append(applydate);
        sb.append(", approver=").append(approver);
        sb.append(", approvedate=").append(approvedate);
        sb.append(", packageid=").append(packageid);
        sb.append(", recipient=").append(recipient);
        sb.append(", receiptdate=").append(receiptdate);
        sb.append(", operateflag=").append(operateflag);
        sb.append(", recipientname=").append(recipientname);
        sb.append(", recipientphone=").append(recipientphone);
        sb.append(", recipientaddress=").append(recipientaddress);
        sb.append(", recipientzipcode=").append(recipientzipcode);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", startnum=").append(startnum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}