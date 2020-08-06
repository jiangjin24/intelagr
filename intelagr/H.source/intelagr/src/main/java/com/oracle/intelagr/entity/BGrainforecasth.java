package com.oracle.intelagr.entity;

import java.util.Date;

public class BGrainforecasth {
    private Integer id;

    private String year;

    private String companycode;

    private String companyname;

    private Date forecastdate;

    private String farmername;

    private String idnumber;

    private Float actualmu;

    private Float measurementmu;

    private Float minestimatetotalyield;

    private Float maxestimatetotalyield;

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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode == null ? null : companycode.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public Date getForecastdate() {
        return forecastdate;
    }

    public void setForecastdate(Date forecastdate) {
        this.forecastdate = forecastdate;
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

    public Float getMinestimatetotalyield() {
        return minestimatetotalyield;
    }

    public void setMinestimatetotalyield(Float minestimatetotalyield) {
        this.minestimatetotalyield = minestimatetotalyield;
    }

    public Float getMaxestimatetotalyield() {
        return maxestimatetotalyield;
    }

    public void setMaxestimatetotalyield(Float maxestimatetotalyield) {
        this.maxestimatetotalyield = maxestimatetotalyield;
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