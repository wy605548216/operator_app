package com.lks.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Terminals {
    private Integer id;

    private Integer orgId;

    private Integer provinceId;

    private String imgUrl;

    private Integer cityId;

    private Integer areaId;

    private String address;

    private String name;

    private String terminalNo;

    private Byte status;

    private Date addTime;

    private Double longitude;

    private Double latitude;

    private String label;

    private String imgLogo;

    private Boolean stockStatus;

    private String provinceName;

    private String cityName;

    private String areaName;

    private Integer distribUserId;

    private Integer containerDepth;

    private Byte controlType;

    private Byte terminalType;

    private String maker;

    private String modelNum;

    private Integer modelId;

    private Integer outCount;

    private BigDecimal takeOutTime;

    private Integer buyWay;

    private Date contractDate;

    private Integer lineId;

    private String lineTitle;

    private Integer pointId;

    private String pointTitle;

    private Date lastAdvertTime;

    private Boolean isDelete;

    private Boolean isMergeShipment;

    private Boolean isSyncTerminal;

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

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo == null ? null : terminalNo.trim();
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

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getImgLogo() {
        return imgLogo;
    }

    public void setImgLogo(String imgLogo) {
        this.imgLogo = imgLogo == null ? null : imgLogo.trim();
    }

    public Boolean getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(Boolean stockStatus) {
        this.stockStatus = stockStatus;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getDistribUserId() {
        return distribUserId;
    }

    public void setDistribUserId(Integer distribUserId) {
        this.distribUserId = distribUserId;
    }

    public Integer getContainerDepth() {
        return containerDepth;
    }

    public void setContainerDepth(Integer containerDepth) {
        this.containerDepth = containerDepth;
    }

    public Byte getControlType() {
        return controlType;
    }

    public void setControlType(Byte controlType) {
        this.controlType = controlType;
    }

    public Byte getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Byte terminalType) {
        this.terminalType = terminalType;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker == null ? null : maker.trim();
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum == null ? null : modelNum.trim();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getOutCount() {
        return outCount;
    }

    public void setOutCount(Integer outCount) {
        this.outCount = outCount;
    }

    public BigDecimal getTakeOutTime() {
        return takeOutTime;
    }

    public void setTakeOutTime(BigDecimal takeOutTime) {
        this.takeOutTime = takeOutTime;
    }

    public Integer getBuyWay() {
        return buyWay;
    }

    public void setBuyWay(Integer buyWay) {
        this.buyWay = buyWay;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getLineTitle() {
        return lineTitle;
    }

    public void setLineTitle(String lineTitle) {
        this.lineTitle = lineTitle == null ? null : lineTitle.trim();
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public String getPointTitle() {
        return pointTitle;
    }

    public void setPointTitle(String pointTitle) {
        this.pointTitle = pointTitle == null ? null : pointTitle.trim();
    }

    public Date getLastAdvertTime() {
        return lastAdvertTime;
    }

    public void setLastAdvertTime(Date lastAdvertTime) {
        this.lastAdvertTime = lastAdvertTime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Boolean getIsMergeShipment() {
        return isMergeShipment;
    }

    public void setIsMergeShipment(Boolean isMergeShipment) {
        this.isMergeShipment = isMergeShipment;
    }

    public Boolean getIsSyncTerminal() {
        return isSyncTerminal;
    }

    public void setIsSyncTerminal(Boolean isSyncTerminal) {
        this.isSyncTerminal = isSyncTerminal;
    }
}