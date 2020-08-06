package com.oracle.intelagr.entity;

import java.util.Date;

public class BGrainforecastd {
    private Integer id;

    private Integer hid;

    private String landtype;

    private Float actualmu;

    private Float measurementmu;

    private String landclass;

    private String landname;

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

    public String getLandtype() {
        return landtype;
    }

    public void setLandtype(String landtype) {
        this.landtype = landtype == null ? null : landtype.trim();
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

    public String getLandclass() {
        return landclass;
    }

    public void setLandclass(String landclass) {
        this.landclass = landclass == null ? null : landclass.trim();
    }

    public String getLandname() {
        return landname;
    }

    public void setLandname(String landname) {
        this.landname = landname == null ? null : landname.trim();
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