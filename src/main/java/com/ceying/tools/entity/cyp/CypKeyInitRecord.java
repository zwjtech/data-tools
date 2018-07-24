package com.ceying.tools.entity.cyp;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "T_KEYINITRECORD")
public class CypKeyInitRecord implements Serializable {
    private String urid;

    private BigDecimal tenantid;

    private String orgid;

    private Date initdate;

    private String handler;

    private String handlerpubkey;

    private String handlerserialno;

    private String checker;

    private String checkerpubkey;

    private String checkerserialno;

    private String approver;

    private String approverpubkey;

    private String approverserialno;

    private String witness;

    private String signature;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String identno;

    private byte[] confirmation;

    private byte[] timestamp;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public BigDecimal getTenantid() {
        return tenantid;
    }

    public void setTenantid(BigDecimal tenantid) {
        this.tenantid = tenantid;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public Date getInitdate() {
        return initdate;
    }

    public void setInitdate(Date initdate) {
        this.initdate = initdate;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public String getHandlerpubkey() {
        return handlerpubkey;
    }

    public void setHandlerpubkey(String handlerpubkey) {
        this.handlerpubkey = handlerpubkey == null ? null : handlerpubkey.trim();
    }

    public String getHandlerserialno() {
        return handlerserialno;
    }

    public void setHandlerserialno(String handlerserialno) {
        this.handlerserialno = handlerserialno == null ? null : handlerserialno.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public String getCheckerpubkey() {
        return checkerpubkey;
    }

    public void setCheckerpubkey(String checkerpubkey) {
        this.checkerpubkey = checkerpubkey == null ? null : checkerpubkey.trim();
    }

    public String getCheckerserialno() {
        return checkerserialno;
    }

    public void setCheckerserialno(String checkerserialno) {
        this.checkerserialno = checkerserialno == null ? null : checkerserialno.trim();
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }

    public String getApproverpubkey() {
        return approverpubkey;
    }

    public void setApproverpubkey(String approverpubkey) {
        this.approverpubkey = approverpubkey == null ? null : approverpubkey.trim();
    }

    public String getApproverserialno() {
        return approverserialno;
    }

    public void setApproverserialno(String approverserialno) {
        this.approverserialno = approverserialno == null ? null : approverserialno.trim();
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness == null ? null : witness.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
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

    public String getIdentno() {
        return identno;
    }

    public void setIdentno(String identno) {
        this.identno = identno == null ? null : identno.trim();
    }

    public byte[] getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(byte[] confirmation) {
        this.confirmation = confirmation;
    }

    public byte[] getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(byte[] timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", tenantid=").append(tenantid);
        sb.append(", orgid=").append(orgid);
        sb.append(", initdate=").append(initdate);
        sb.append(", handler=").append(handler);
        sb.append(", handlerpubkey=").append(handlerpubkey);
        sb.append(", handlerserialno=").append(handlerserialno);
        sb.append(", checker=").append(checker);
        sb.append(", checkerpubkey=").append(checkerpubkey);
        sb.append(", checkerserialno=").append(checkerserialno);
        sb.append(", approver=").append(approver);
        sb.append(", approverpubkey=").append(approverpubkey);
        sb.append(", approverserialno=").append(approverserialno);
        sb.append(", witness=").append(witness);
        sb.append(", signature=").append(signature);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", identno=").append(identno);
        sb.append(", confirmation=").append(confirmation);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}