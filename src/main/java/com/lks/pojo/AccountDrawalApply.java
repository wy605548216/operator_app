package com.lks.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AccountDrawalApply {
    private Integer id;

    private Integer orgId;

    private BigDecimal drawalMeony;

    private Date applyTime;

    private String applyUserName;

    private Integer applyUserId;

    private Integer auditStatus;

    private String auditUserName;

    private Integer auditUserId;

    private Date auditTime;

    private String remark;

    private String drawalCardNumber;

    private String drawalAccountName;

    private String drawalAccountBank;

    private String drawalBankName;

    private String auditRemark;

    private Integer drawalAccountType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public BigDecimal getDrawalMeony() {
        return drawalMeony;
    }

    public void setDrawalMeony(BigDecimal drawalMeony) {
        this.drawalMeony = drawalMeony;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName == null ? null : applyUserName.trim();
    }

    public Integer getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Integer applyUserId) {
        this.applyUserId = applyUserId;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditUserName() {
        return auditUserName;
    }

    public void setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName == null ? null : auditUserName.trim();
    }

    public Integer getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(Integer auditUserId) {
        this.auditUserId = auditUserId;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDrawalCardNumber() {
        return drawalCardNumber;
    }

    public void setDrawalCardNumber(String drawalCardNumber) {
        this.drawalCardNumber = drawalCardNumber == null ? null : drawalCardNumber.trim();
    }

    public String getDrawalAccountName() {
        return drawalAccountName;
    }

    public void setDrawalAccountName(String drawalAccountName) {
        this.drawalAccountName = drawalAccountName == null ? null : drawalAccountName.trim();
    }

    public String getDrawalAccountBank() {
        return drawalAccountBank;
    }

    public void setDrawalAccountBank(String drawalAccountBank) {
        this.drawalAccountBank = drawalAccountBank == null ? null : drawalAccountBank.trim();
    }

    public String getDrawalBankName() {
        return drawalBankName;
    }

    public void setDrawalBankName(String drawalBankName) {
        this.drawalBankName = drawalBankName == null ? null : drawalBankName.trim();
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark == null ? null : auditRemark.trim();
    }

    public Integer getDrawalAccountType() {
        return drawalAccountType;
    }

    public void setDrawalAccountType(Integer drawalAccountType) {
        this.drawalAccountType = drawalAccountType;
    }
}