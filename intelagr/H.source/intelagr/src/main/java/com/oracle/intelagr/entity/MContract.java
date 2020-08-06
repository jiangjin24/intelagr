package com.oracle.intelagr.entity;

import java.util.Date;

public class MContract {
    private Integer id;

    private String contractorcode;

    private String graphcode;

    private String landcode;

    private String landname;

    private String eastto;

    private Float contractarea;

    private Float measurementmu;

    private String westto;

    private String southto;

    private String northto;

    private String landlevel;

    private String landtype;

    private String isbaseland;

    private String ownership;

    private String landclass;

    private String disputereason;

    private String landpurpose;

    private Date contractstartdate;

    private Integer contractyear;

    private Date contractenddate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractorcode() {
        return contractorcode;
    }

    public void setContractorcode(String contractorcode) {
        this.contractorcode = contractorcode == null ? null : contractorcode.trim();
    }

    public String getGraphcode() {
        return graphcode;
    }

    public void setGraphcode(String graphcode) {
        this.graphcode = graphcode == null ? null : graphcode.trim();
    }

    public String getLandcode() {
        return landcode;
    }

    public void setLandcode(String landcode) {
        this.landcode = landcode == null ? null : landcode.trim();
    }

    public String getLandname() {
        return landname;
    }

    public void setLandname(String landname) {
        this.landname = landname == null ? null : landname.trim();
    }

    public String getEastto() {
        return eastto;
    }

    public void setEastto(String eastto) {
        this.eastto = eastto == null ? null : eastto.trim();
    }

    public Float getContractarea() {
        return contractarea;
    }

    public void setContractarea(Float contractarea) {
        this.contractarea = contractarea;
    }

    public Float getMeasurementmu() {
        return measurementmu;
    }

    public void setMeasurementmu(Float measurementmu) {
        this.measurementmu = measurementmu;
    }

    public String getWestto() {
        return westto;
    }

    public void setWestto(String westto) {
        this.westto = westto == null ? null : westto.trim();
    }

    public String getSouthto() {
        return southto;
    }

    public void setSouthto(String southto) {
        this.southto = southto == null ? null : southto.trim();
    }

    public String getNorthto() {
        return northto;
    }

    public void setNorthto(String northto) {
        this.northto = northto == null ? null : northto.trim();
    }

    public String getLandlevel() {
        return landlevel;
    }

    public void setLandlevel(String landlevel) {
        this.landlevel = landlevel == null ? null : landlevel.trim();
    }

    public String getLandtype() {
        return landtype;
    }

    public void setLandtype(String landtype) {
        this.landtype = landtype == null ? null : landtype.trim();
    }

    public String getIsbaseland() {
        return isbaseland;
    }

    public void setIsbaseland(String isbaseland) {
        this.isbaseland = isbaseland == null ? null : isbaseland.trim();
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership == null ? null : ownership.trim();
    }

    public String getLandclass() {
        return landclass;
    }

    public void setLandclass(String landclass) {
        this.landclass = landclass == null ? null : landclass.trim();
    }

    public String getDisputereason() {
        return disputereason;
    }

    public void setDisputereason(String disputereason) {
        this.disputereason = disputereason == null ? null : disputereason.trim();
    }

    public String getLandpurpose() {
        return landpurpose;
    }

    public void setLandpurpose(String landpurpose) {
        this.landpurpose = landpurpose == null ? null : landpurpose.trim();
    }

    public Date getContractstartdate() {
        return contractstartdate;
    }

    public void setContractstartdate(Date contractstartdate) {
        this.contractstartdate = contractstartdate;
    }

    public Integer getContractyear() {
        return contractyear;
    }

    public void setContractyear(Integer contractyear) {
        this.contractyear = contractyear;
    }

    public Date getContractenddate() {
        return contractenddate;
    }

    public void setContractenddate(Date contractenddate) {
        this.contractenddate = contractenddate;
    }
}