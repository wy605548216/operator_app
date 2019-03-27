package com.lks.pojo;

import java.math.BigDecimal;

public class OrderGood {
    private Integer id;

    private Integer orgId;

    private Integer goodId;

    private String goodNo;

    private String goodTitle;

    private String imgUrl;

    private BigDecimal goodPrice;

    private BigDecimal realPrice;

    private Integer quantity;

    private Integer aisleNo;

    private Integer containerId;

    private Integer orderId;

    private Byte promotionType;

    private Integer terminalCabinetId;

    private Integer cabNo;

    private BigDecimal realAmount;

    private BigDecimal disAmount;

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

    public String getGoodNo() {
        return goodNo;
    }

    public void setGoodNo(String goodNo) {
        this.goodNo = goodNo == null ? null : goodNo.trim();
    }

    public String getGoodTitle() {
        return goodTitle;
    }

    public void setGoodTitle(String goodTitle) {
        this.goodTitle = goodTitle == null ? null : goodTitle.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAisleNo() {
        return aisleNo;
    }

    public void setAisleNo(Integer aisleNo) {
        this.aisleNo = aisleNo;
    }

    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Byte getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Byte promotionType) {
        this.promotionType = promotionType;
    }

    public Integer getTerminalCabinetId() {
        return terminalCabinetId;
    }

    public void setTerminalCabinetId(Integer terminalCabinetId) {
        this.terminalCabinetId = terminalCabinetId;
    }

    public Integer getCabNo() {
        return cabNo;
    }

    public void setCabNo(Integer cabNo) {
        this.cabNo = cabNo;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getDisAmount() {
        return disAmount;
    }

    public void setDisAmount(BigDecimal disAmount) {
        this.disAmount = disAmount;
    }
}