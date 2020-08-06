package com.oracle.intelagr.entity;

import java.util.Date;

public class BGrainfarmerdetail {
    private Integer id;

    private Integer hid;

    private String farmername;

    private String idnumber;

    private Float actualmu;

    private Float measurementmu;

    private Float registeredtotalyield;

    private Float graintotalyield;

    private Float estimatetotalyield;

    private Float seedpurchasetotal;

    private Float soldyield;

    private String surplusyield;

    private String remark;

    private String deleteflag;

    private String createuserid;

    private Date createdate;

    private String updateuserid;

    private Date updatedate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getFarmername() {
        return farmername;
    }

    public void setFarmername(String farmername) {
        this.farmername = farmername == null ? null : farmername.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public Float getActualmu() {
        return actualmu;
    }

    public void setActualmu(Float actualmu) {
        this.actualmu = actualmu;
    }

    public Float getMeasurementmu() {
        return measurementmu;
    }

    public void setMeasurementmu(Float measurementmu) {
        this.measurementmu = measurementmu;
    }

    public Float getRegisteredtotalyield() {
        return registeredtotalyield;
    }

    public void setRegisteredtotalyield(Float registeredtotalyield) {
        this.registeredtotalyield = registeredtotalyield;
    }

    public Float getGraintotalyield() {
        return graintotalyield;
    }

    public void setGraintotalyield(Float graintotalyield) {
        this.graintotalyield = graintotalyield;
    }

    public Float getEstimatetotalyield() {
        return estimatetotalyield;
    }

    public void setEstimatetotalyield(Float estimatetotalyield) {
        this.estimatetotalyield = estimatetotalyield;
    }

    public Float getSeedpurchasetotal() {
        return seedpurchasetotal;
    }

    public void setSeedpurchasetotal(Float seedpurchasetotal) {
        this.seedpurchasetotal = seedpurchasetotal;
    }

    public Float getSoldyield() {
        return soldyield;
    }

    public void setSoldyield(Float soldyield) {
        this.soldyield = soldyield;
    }

    public String getSurplusyield() {
        return surplusyield;
    }

    public void setSurplusyield(String surplusyield) {
        this.surplusyield = surplusyield == null ? null : surplusyield.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag == null ? null : deleteflag.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getUpdateuserid() {
        return updateuserid;
    }

    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid == null ? null : updateuserid.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}