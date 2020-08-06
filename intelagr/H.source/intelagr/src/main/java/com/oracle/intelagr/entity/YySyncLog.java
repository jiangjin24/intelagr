package com.oracle.intelagr.entity;

import java.util.Date;

public class YySyncLog {
    private Integer id;

    private String biztype;

    private Date syncdate;

    private Integer syncstatus;

    private Integer synccount;

    private Integer datapath;

    private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiztype() {
        return biztype;
    }

    public void setBiztype(String biztype) {
        this.biztype = biztype == null ? null : biztype.trim();
    }

    public Date getSyncdate() {
        return syncdate;
    }

    public void setSyncdate(Date syncdate) {
        this.syncdate = syncdate;
    }

    public Integer getSyncstatus() {
        return syncstatus;
    }

    public void setSyncstatus(Integer syncstatus) {
        this.syncstatus = syncstatus;
    }

    public Integer getSynccount() {
        return synccount;
    }

    public void setSynccount(Integer synccount) {
        this.synccount = synccount;
    }

    public Integer getDatapath() {
        return datapath;
    }

    public void setDatapath(Integer datapath) {
        this.datapath = datapath;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}