package com.oracle.intelagr.entity;

import java.util.Date;

public class BSeedcomplaint {
    private Integer id;

    private String companycode;

    private Date complaintdate;

    private Date buyseedsdate;

    private String complainant;

    private String complainantsex;

    private String complainanttel;

    private String complainantmail;

    private String complaintcontent;

    private String settlestatus;

    private String processmode;

    private String processresult;

    private Float productionweight;

    private String blacklisttimelimit;

    private Date blacklistenddate;

    private Date settledate;

    private String processor;

    private String processorstel;

    private String processorsmail;

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

    public Date getComplaintdate() {
        return complaintdate;
    }

    public void setComplaintdate(Date complaintdate) {
        this.complaintdate = complaintdate;
    }

    public Date getBuyseedsdate() {
        return buyseedsdate;
    }

    public void setBuyseedsdate(Date buyseedsdate) {
        this.buyseedsdate = buyseedsdate;
    }

    public String getComplainant() {
        return complainant;
    }

    public void setComplainant(String complainant) {
        this.complainant = complainant == null ? null : complainant.trim();
    }

    public String getComplainantsex() {
        return complainantsex;
    }

    public void setComplainantsex(String complainantsex) {
        this.complainantsex = complainantsex == null ? null : complainantsex.trim();
    }

    public String getComplainanttel() {
        return complainanttel;
    }

    public void setComplainanttel(String complainanttel) {
        this.complainanttel = complainanttel == null ? null : complainanttel.trim();
    }

    public String getComplainantmail() {
        return complainantmail;
    }

    public void setComplainantmail(String complainantmail) {
        this.complainantmail = complainantmail == null ? null : complainantmail.trim();
    }

    public String getComplaintcontent() {
        return complaintcontent;
    }

    public void setComplaintcontent(String complaintcontent) {
        this.complaintcontent = complaintcontent == null ? null : complaintcontent.trim();
    }

    public String getSettlestatus() {
        return settlestatus;
    }

    public void setSettlestatus(String settlestatus) {
        this.settlestatus = settlestatus == null ? null : settlestatus.trim();
    }

    public String getProcessmode() {
        return processmode;
    }

    public void setProcessmode(String processmode) {
        this.processmode = processmode == null ? null : processmode.trim();
    }

    public String getProcessresult() {
        return processresult;
    }

    public void setProcessresult(String processresult) {
        this.processresult = processresult == null ? null : processresult.trim();
    }

    public Float getProductionweight() {
        return productionweight;
    }

    public void setProductionweight(Float productionweight) {
        this.productionweight = productionweight;
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

    public Date getSettledate() {
        return settledate;
    }

    public void setSettledate(Date settledate) {
        this.settledate = settledate;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor == null ? null : processor.trim();
    }

    public String getProcessorstel() {
        return processorstel;
    }

    public void setProcessorstel(String processorstel) {
        this.processorstel = processorstel == null ? null : processorstel.trim();
    }

    public String getProcessorsmail() {
        return processorsmail;
    }

    public void setProcessorsmail(String processorsmail) {
        this.processorsmail = processorsmail == null ? null : processorsmail.trim();
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