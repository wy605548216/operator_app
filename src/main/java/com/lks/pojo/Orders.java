package com.lks.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer id;

    private Integer orgId;

    private Integer goodId;

    private Integer terminalId;

    private String terminalImg;

    private String terminalName;

    private String terminalNo;

    private String describeA;

    private String orderNo;

    private String tradeNo;

    private Integer userId;

    private String userName;

    private Integer paymentId;

    private BigDecimal paymentFee;

    private Byte paymentStatus;

    private Date paymentTime;

    private Date deadline;

    private String acceptName;

    private String postCode;

    private String telphone;

    private String mobile;

    private String email;

    private Integer provinceId;

    private Integer cityId;

    private String address;

    private String message;

    private String remark;

    private Byte isInvoice;

    private String invoiceTitle;

    private BigDecimal invoiceTaxes;

    private BigDecimal payableAmount;

    private BigDecimal realAmount;

    private BigDecimal orderAmount;

    private Integer point;

    private Byte status;

    private Date addTime;

    private Date confirmTime;

    private Date completeTime;

    private String verificationCode;

    private Byte refundType;

    private Date refundTime;

    private Date refundArrivalTime;

    private Byte refundMode;

    private Date refundAcceptanceTime;

    private String refundAccount;

    private Integer customerRedenvId;

    private String refundAdminName;

    private Integer refundAdminId;

    private BigDecimal refundAmount;

    private Boolean isSyncKis;

    private Short resoureType;

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

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalImg() {
        return terminalImg;
    }

    public void setTerminalImg(String terminalImg) {
        this.terminalImg = terminalImg == null ? null : terminalImg.trim();
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName == null ? null : terminalName.trim();
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo == null ? null : terminalNo.trim();
    }

    public String getDescribeA() {
        return describeA;
    }

    public void setDescribeA(String describeA) {
        this.describeA = describeA == null ? null : describeA.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public BigDecimal getPaymentFee() {
        return paymentFee;
    }

    public void setPaymentFee(BigDecimal paymentFee) {
        this.paymentFee = paymentFee;
    }

    public Byte getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Byte paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getAcceptName() {
        return acceptName;
    }

    public void setAcceptName(String acceptName) {
        this.acceptName = acceptName == null ? null : acceptName.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Byte isInvoice) {
        this.isInvoice = isInvoice;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public BigDecimal getInvoiceTaxes() {
        return invoiceTaxes;
    }

    public void setInvoiceTaxes(BigDecimal invoiceTaxes) {
        this.invoiceTaxes = invoiceTaxes;
    }

    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode == null ? null : verificationCode.trim();
    }

    public Byte getRefundType() {
        return refundType;
    }

    public void setRefundType(Byte refundType) {
        this.refundType = refundType;
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Date getRefundArrivalTime() {
        return refundArrivalTime;
    }

    public void setRefundArrivalTime(Date refundArrivalTime) {
        this.refundArrivalTime = refundArrivalTime;
    }

    public Byte getRefundMode() {
        return refundMode;
    }

    public void setRefundMode(Byte refundMode) {
        this.refundMode = refundMode;
    }

    public Date getRefundAcceptanceTime() {
        return refundAcceptanceTime;
    }

    public void setRefundAcceptanceTime(Date refundAcceptanceTime) {
        this.refundAcceptanceTime = refundAcceptanceTime;
    }

    public String getRefundAccount() {
        return refundAccount;
    }

    public void setRefundAccount(String refundAccount) {
        this.refundAccount = refundAccount == null ? null : refundAccount.trim();
    }

    public Integer getCustomerRedenvId() {
        return customerRedenvId;
    }

    public void setCustomerRedenvId(Integer customerRedenvId) {
        this.customerRedenvId = customerRedenvId;
    }

    public String getRefundAdminName() {
        return refundAdminName;
    }

    public void setRefundAdminName(String refundAdminName) {
        this.refundAdminName = refundAdminName == null ? null : refundAdminName.trim();
    }

    public Integer getRefundAdminId() {
        return refundAdminId;
    }

    public void setRefundAdminId(Integer refundAdminId) {
        this.refundAdminId = refundAdminId;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Boolean getIsSyncKis() {
        return isSyncKis;
    }

    public void setIsSyncKis(Boolean isSyncKis) {
        this.isSyncKis = isSyncKis;
    }

    public Short getResoureType() {
        return resoureType;
    }

    public void setResoureType(Short resoureType) {
        this.resoureType = resoureType;
    }
}