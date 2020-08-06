package com.oracle.intelagr.entity;

import java.util.Date;

public class BBlacklistmanaged {
    private Integer id;

    private String companycode;

    private String processor;

    private Date settledate;

    private String blacklisttimelimit;

    private Date blacklistenddate;

    private String blacklistreason;

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

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode == null ? null : companycode.trim();
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor == null ? null : processor.trim();
    }

    public Date getSettledate() {
        return settledate;
    }

    public void setSettledate(Date settledate) {
        this.settledate = settledate;
    }

    public String getBlacklisttimelimit() {
        return blacklisttimelimit;
    }

    public void setBlacklisttimelimit(String blacklisttimelimit) {
        this.blacklisttimelimit = blacklisttimelimit == null ? null : blacklisttimelimit.trim();
    }

    public Date getBlacklistenddate() {
        return blacklistenddate;
    }

    public void setBlacklistenddate(Date blacklistenddate) {
        this.blacklistenddate = blacklistenddate;
    }

    public String getBlacklistreason() {
        return blacklistreason;
    }

    public void setBlacklistreason(String blacklistreason) {
        this.blacklistreason = blacklistreason == null ? null : blacklistreason.trim();
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