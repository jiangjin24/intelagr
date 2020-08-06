package com.oracle.intelagr.entity;

import java.util.Date;

public class BSamplings {
    private Integer id;

    private String year;

    private String companycode;

    private String checkcode;

    private Date sampledate;

    private String sampleperson;

    private String batchno;

    private String productcode;

    private Integer productnum;

    private Date producedate;

    private String securitycode;

    private String inspectstatus;

    private String deliveryperson;

    private Date deliverydate;

    private String activationstatus;

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

    public Date getSampledate() {
        return sampledate;
    }

    public void setSampledate(Date sampledate) {
        this.sampledate = sampledate;
    }

    public String getSampleperson() {
        return sampleperson;
    }

    public void setSampleperson(String sampleperson) {
        this.sampleperson = sampleperson == null ? null : sampleperson.trim();
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno == null ? null : batchno.trim();
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }

    public Integer getProductnum() {
        return productnum;
    }

    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }

    public Date getProducedate() {
        return producedate;
    }

    public void setProducedate(Date producedate) {
        this.producedate = producedate;
    }

    public String getSecuritycode() {
        return securitycode;
    }

    public void setSecuritycode(String securitycode) {
        this.securitycode = securitycode == null ? null : securitycode.trim();
    }

    public String getInspectstatus() {
        return inspectstatus;
    }

    public void setInspectstatus(String inspectstatus) {
        this.inspectstatus = inspectstatus == null ? null : inspectstatus.trim();
    }

    public String getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(String deliveryperson) {
        this.deliveryperson = deliveryperson == null ? null : deliveryperson.trim();
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getActivationstatus() {
        return activationstatus;
    }

    public void setActivationstatus(String activationstatus) {
        this.activationstatus = activationstatus == null ? null : activationstatus.trim();
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