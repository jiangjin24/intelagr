package com.oracle.intelagr.entity;

import java.util.Date;

public class BWatermonitoring {
    private Integer id;

    private Date monitordate;

    private String monitorpointcode;

    private Float ph;

    private Float dovalue;

    private Float codmn;

    private Float bod5;

    private Float nh3n;

    private Float tp;

    private Float codcr;

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

    public Date getMonitordate() {
        return monitordate;
    }

    public void setMonitordate(Date monitordate) {
        this.monitordate = monitordate;
    }

    public String getMonitorpointcode() {
        return monitorpointcode;
    }

    public void setMonitorpointcode(String monitorpointcode) {
        this.monitorpointcode = monitorpointcode == null ? null : monitorpointcode.trim();
    }

    public Float getPh() {
        return ph;
    }

    public void setPh(Float ph) {
        this.ph = ph;
    }

    public Float getDovalue() {
        return dovalue;
    }

    public void setDovalue(Float dovalue) {
        this.dovalue = dovalue;
    }

    public Float getCodmn() {
        return codmn;
    }

    public void setCodmn(Float codmn) {
        this.codmn = codmn;
    }

    public Float getBod5() {
        return bod5;
    }

    public void setBod5(Float bod5) {
        this.bod5 = bod5;
    }

    public Float getNh3n() {
        return nh3n;
    }

    public void setNh3n(Float nh3n) {
        this.nh3n = nh3n;
    }

    public Float getTp() {
        return tp;
    }

    public void setTp(Float tp) {
        this.tp = tp;
    }

    public Float getCodcr() {
        return codcr;
    }

    public void setCodcr(Float codcr) {
        this.codcr = codcr;
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