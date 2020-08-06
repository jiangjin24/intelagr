package com.oracle.intelagr.entity;

import java.util.Date;

public class MMonitorpoint {
    private Integer id;

    private String monitorpointtype;

    private String monitorpointcode;

    private String monitorpointname;

    private String monitorpointaddress;

    private String sectiondescription;

    private String longitude;

    private String latitude;

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

    public String getMonitorpointtype() {
        return monitorpointtype;
    }

    public void setMonitorpointtype(String monitorpointtype) {
        this.monitorpointtype = monitorpointtype == null ? null : monitorpointtype.trim();
    }

    public String getMonitorpointcode() {
        return monitorpointcode;
    }

    public void setMonitorpointcode(String monitorpointcode) {
        this.monitorpointcode = monitorpointcode == null ? null : monitorpointcode.trim();
    }

    public String getMonitorpointname() {
        return monitorpointname;
    }

    public void setMonitorpointname(String monitorpointname) {
        this.monitorpointname = monitorpointname == null ? null : monitorpointname.trim();
    }

    public String getMonitorpointaddress() {
        return monitorpointaddress;
    }

    public void setMonitorpointaddress(String monitorpointaddress) {
        this.monitorpointaddress = monitorpointaddress == null ? null : monitorpointaddress.trim();
    }

    public String getSectiondescription() {
        return sectiondescription;
    }

    public void setSectiondescription(String sectiondescription) {
        this.sectiondescription = sectiondescription == null ? null : sectiondescription.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
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