package com.oracle.intelagr.entity;

import java.util.Date;

public class BGenerallandregd {
    private Integer id;

    private Integer hid;

    private String contractortype;

    private String idtype;

    private String contractorid;

    private String contractorname;

    private String contractortel;

    private String citycode;

    private String towncode;

    private String countrycode;

    private String groupname;

    private Float archiveacreage;

    private Float contracttotalyield;

    private Float registeredtotalyield;

    private String operatorname;

    private Date operatordate;

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

    public String getContractortype() {
        return contractortype;
    }

    public void setContractortype(String contractortype) {
        this.contractortype = contractortype == null ? null : contractortype.trim();
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    public String getContractorid() {
        return contractorid;
    }

    public void setContractorid(String contractorid) {
        this.contractorid = contractorid == null ? null : contractorid.trim();
    }

    public String getContractorname() {
        return contractorname;
    }

    public void setContractorname(String contractorname) {
        this.contractorname = contractorname == null ? null : contractorname.trim();
    }

    public String getContractortel() {
        return contractortel;
    }

    public void setContractortel(String contractortel) {
        this.contractortel = contractortel == null ? null : contractortel.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getTowncode() {
        return towncode;
    }

    public void setTowncode(String towncode) {
        this.towncode = towncode == null ? null : towncode.trim();
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode == null ? null : countrycode.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public Float getArchiveacreage() {
        return archiveacreage;
    }

    public void setArchiveacreage(Float archiveacreage) {
        this.archiveacreage = archiveacreage;
    }

    public Float getContracttotalyield() {
        return contracttotalyield;
    }

    public void setContracttotalyield(Float contracttotalyield) {
        this.contracttotalyield = contracttotalyield;
    }

    public Float getRegisteredtotalyield() {
        return registeredtotalyield;
    }

    public void setRegisteredtotalyield(Float registeredtotalyield) {
        this.registeredtotalyield = registeredtotalyield;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    public Date getOperatordate() {
        return operatordate;
    }

    public void setOperatordate(Date operatordate) {
        this.operatordate = operatordate;
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