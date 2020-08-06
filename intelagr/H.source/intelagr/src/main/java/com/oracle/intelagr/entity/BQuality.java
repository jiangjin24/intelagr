package com.oracle.intelagr.entity;

import java.util.Date;

public class BQuality {
    private Integer id;

    private String year;

    private String companycode;

    private String checkcode;

    private Date deliverydate;

    private Date inspectdate;

    private String deliveryperson;

    private String handoverperson;

    private Date handovertime;

    private String inspectperson;

    private String inspectstatus;

    private String path;

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

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode == null ? null : checkcode.trim();
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public Date getInspectdate() {
        return inspectdate;
    }

    public void setInspectdate(Date inspectdate) {
        this.inspectdate = inspectdate;
    }

    public String getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(String deliveryperson) {
        this.deliveryperson = deliveryperson == null ? null : deliveryperson.trim();
    }

    public String getHandoverperson() {
        return handoverperson;
    }

    public void setHandoverperson(String handoverperson) {
        this.handoverperson = handoverperson == null ? null : handoverperson.trim();
    }

    public Date getHandovertime() {
        return handovertime;
    }

    public void setHandovertime(Date handovertime) {
        this.handovertime = handovertime;
    }

    public String getInspectperson() {
        return inspectperson;
    }

    public void setInspectperson(String inspectperson) {
        this.inspectperson = inspectperson == null ? null : inspectperson.trim();
    }

    public String getInspectstatus() {
        return inspectstatus;
    }

    public void setInspectstatus(String inspectstatus) {
        this.inspectstatus = inspectstatus == null ? null : inspectstatus.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
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