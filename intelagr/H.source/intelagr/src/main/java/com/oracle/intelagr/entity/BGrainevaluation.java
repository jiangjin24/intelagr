package com.oracle.intelagr.entity;

import java.util.Date;

public class BGrainevaluation {
    private Integer id;

    private String year;

    private String seedcode;

    private Float minyield;

    private Float maxyield;

    private Float milledricerate;

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

    public String getSeedcode() {
        return seedcode;
    }

    public void setSeedcode(String seedcode) {
        this.seedcode = seedcode == null ? null : seedcode.trim();
    }

    public Float getMinyield() {
        return minyield;
    }

    public void setMinyield(Float minyield) {
        this.minyield = minyield;
    }

    public Float getMaxyield() {
        return maxyield;
    }

    public void setMaxyield(Float maxyield) {
        this.maxyield = maxyield;
    }

    public Float getMilledricerate() {
        return milledricerate;
    }

    public void setMilledricerate(Float milledricerate) {
        this.milledricerate = milledricerate;
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