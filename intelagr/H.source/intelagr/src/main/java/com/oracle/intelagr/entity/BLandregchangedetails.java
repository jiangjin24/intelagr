package com.oracle.intelagr.entity;

import java.util.Date;

public class BLandregchangedetails {
    private Integer id;

    private Integer hid;

    private Integer landreghid;

    private Integer landregsid;

    private Float archiveacreage;

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

    public Integer getLandreghid() {
        return landreghid;
    }

    public void setLandreghid(Integer landreghid) {
        this.landreghid = landreghid;
    }

    public Integer getLandregsid() {
        return landregsid;
    }

    public void setLandregsid(Integer landregsid) {
        this.landregsid = landregsid;
    }

    public Float getArchiveacreage() {
        return archiveacreage;
    }

    public void setArchiveacreage(Float archiveacreage) {
        this.archiveacreage = archiveacreage;
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