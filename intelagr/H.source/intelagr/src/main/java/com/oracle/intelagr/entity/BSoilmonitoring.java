package com.oracle.intelagr.entity;

import java.util.Date;

public class BSoilmonitoring {
    private Integer id;

    private Date monitordate;

    private String monitorpointcode;

    private Float omvalue;

    private Float alkelinen;

    private Float olsenp;

    private Float olsenk;

    private Float ph;

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

    public Float getOmvalue() {
        return omvalue;
    }

    public void setOmvalue(Float omvalue) {
        this.omvalue = omvalue;
    }

    public Float getAlkelinen() {
        return alkelinen;
    }

    public void setAlkelinen(Float alkelinen) {
        this.alkelinen = alkelinen;
    }

    public Float getOlsenp() {
        return olsenp;
    }

    public void setOlsenp(Float olsenp) {
        this.olsenp = olsenp;
    }

    public Float getOlsenk() {
        return olsenk;
    }

    public void setOlsenk(Float olsenk) {
        this.olsenk = olsenk;
    }

    public Float getPh() {
        return ph;
    }

    public void setPh(Float ph) {
        this.ph = ph;
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