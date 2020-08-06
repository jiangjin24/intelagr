package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MMonitorpointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MMonitorpointExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeIsNull() {
            addCriterion("MonitorPointType is null");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeIsNotNull() {
            addCriterion("MonitorPointType is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeEqualTo(String value) {
            addCriterion("MonitorPointType =", value, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeNotEqualTo(String value) {
            addCriterion("MonitorPointType <>", value, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeGreaterThan(String value) {
            addCriterion("MonitorPointType >", value, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeGreaterThanOrEqualTo(String value) {
            addCriterion("MonitorPointType >=", value, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeLessThan(String value) {
            addCriterion("MonitorPointType <", value, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeLessThanOrEqualTo(String value) {
            addCriterion("MonitorPointType <=", value, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeLike(String value) {
            addCriterion("MonitorPointType like", value, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeNotLike(String value) {
            addCriterion("MonitorPointType not like", value, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeIn(List<String> values) {
            addCriterion("MonitorPointType in", values, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeNotIn(List<String> values) {
            addCriterion("MonitorPointType not in", values, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeBetween(String value1, String value2) {
            addCriterion("MonitorPointType between", value1, value2, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointtypeNotBetween(String value1, String value2) {
            addCriterion("MonitorPointType not between", value1, value2, "monitorpointtype");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeIsNull() {
            addCriterion("MonitorPointCode is null");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeIsNotNull() {
            addCriterion("MonitorPointCode is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeEqualTo(String value) {
            addCriterion("MonitorPointCode =", value, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeNotEqualTo(String value) {
            addCriterion("MonitorPointCode <>", value, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeGreaterThan(String value) {
            addCriterion("MonitorPointCode >", value, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MonitorPointCode >=", value, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeLessThan(String value) {
            addCriterion("MonitorPointCode <", value, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeLessThanOrEqualTo(String value) {
            addCriterion("MonitorPointCode <=", value, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeLike(String value) {
            addCriterion("MonitorPointCode like", value, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeNotLike(String value) {
            addCriterion("MonitorPointCode not like", value, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeIn(List<String> values) {
            addCriterion("MonitorPointCode in", values, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeNotIn(List<String> values) {
            addCriterion("MonitorPointCode not in", values, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeBetween(String value1, String value2) {
            addCriterion("MonitorPointCode between", value1, value2, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointcodeNotBetween(String value1, String value2) {
            addCriterion("MonitorPointCode not between", value1, value2, "monitorpointcode");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameIsNull() {
            addCriterion("MonitorPointName is null");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameIsNotNull() {
            addCriterion("MonitorPointName is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameEqualTo(String value) {
            addCriterion("MonitorPointName =", value, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameNotEqualTo(String value) {
            addCriterion("MonitorPointName <>", value, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameGreaterThan(String value) {
            addCriterion("MonitorPointName >", value, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameGreaterThanOrEqualTo(String value) {
            addCriterion("MonitorPointName >=", value, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameLessThan(String value) {
            addCriterion("MonitorPointName <", value, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameLessThanOrEqualTo(String value) {
            addCriterion("MonitorPointName <=", value, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameLike(String value) {
            addCriterion("MonitorPointName like", value, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameNotLike(String value) {
            addCriterion("MonitorPointName not like", value, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameIn(List<String> values) {
            addCriterion("MonitorPointName in", values, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameNotIn(List<String> values) {
            addCriterion("MonitorPointName not in", values, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameBetween(String value1, String value2) {
            addCriterion("MonitorPointName between", value1, value2, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointnameNotBetween(String value1, String value2) {
            addCriterion("MonitorPointName not between", value1, value2, "monitorpointname");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressIsNull() {
            addCriterion("MonitorPointAddress is null");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressIsNotNull() {
            addCriterion("MonitorPointAddress is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressEqualTo(String value) {
            addCriterion("MonitorPointAddress =", value, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressNotEqualTo(String value) {
            addCriterion("MonitorPointAddress <>", value, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressGreaterThan(String value) {
            addCriterion("MonitorPointAddress >", value, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressGreaterThanOrEqualTo(String value) {
            addCriterion("MonitorPointAddress >=", value, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressLessThan(String value) {
            addCriterion("MonitorPointAddress <", value, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressLessThanOrEqualTo(String value) {
            addCriterion("MonitorPointAddress <=", value, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressLike(String value) {
            addCriterion("MonitorPointAddress like", value, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressNotLike(String value) {
            addCriterion("MonitorPointAddress not like", value, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressIn(List<String> values) {
            addCriterion("MonitorPointAddress in", values, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressNotIn(List<String> values) {
            addCriterion("MonitorPointAddress not in", values, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressBetween(String value1, String value2) {
            addCriterion("MonitorPointAddress between", value1, value2, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andMonitorpointaddressNotBetween(String value1, String value2) {
            addCriterion("MonitorPointAddress not between", value1, value2, "monitorpointaddress");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionIsNull() {
            addCriterion("SectionDescription is null");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionIsNotNull() {
            addCriterion("SectionDescription is not null");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionEqualTo(String value) {
            addCriterion("SectionDescription =", value, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionNotEqualTo(String value) {
            addCriterion("SectionDescription <>", value, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionGreaterThan(String value) {
            addCriterion("SectionDescription >", value, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("SectionDescription >=", value, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionLessThan(String value) {
            addCriterion("SectionDescription <", value, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionLessThanOrEqualTo(String value) {
            addCriterion("SectionDescription <=", value, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionLike(String value) {
            addCriterion("SectionDescription like", value, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionNotLike(String value) {
            addCriterion("SectionDescription not like", value, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionIn(List<String> values) {
            addCriterion("SectionDescription in", values, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionNotIn(List<String> values) {
            addCriterion("SectionDescription not in", values, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionBetween(String value1, String value2) {
            addCriterion("SectionDescription between", value1, value2, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andSectiondescriptionNotBetween(String value1, String value2) {
            addCriterion("SectionDescription not between", value1, value2, "sectiondescription");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("Longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("Longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("Longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("Longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("Longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("Longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("Longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("Longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("Longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("Longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("Longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("Longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("Longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("Longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("Latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("Latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("Latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("Latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("Latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("Latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("Latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("Latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("Latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("Latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("Latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("Latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("Latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("Latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNull() {
            addCriterion("DeleteFlag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIsNotNull() {
            addCriterion("DeleteFlag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteflagEqualTo(String value) {
            addCriterion("DeleteFlag =", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotEqualTo(String value) {
            addCriterion("DeleteFlag <>", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThan(String value) {
            addCriterion("DeleteFlag >", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagGreaterThanOrEqualTo(String value) {
            addCriterion("DeleteFlag >=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThan(String value) {
            addCriterion("DeleteFlag <", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLessThanOrEqualTo(String value) {
            addCriterion("DeleteFlag <=", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagLike(String value) {
            addCriterion("DeleteFlag like", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotLike(String value) {
            addCriterion("DeleteFlag not like", value, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagIn(List<String> values) {
            addCriterion("DeleteFlag in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotIn(List<String> values) {
            addCriterion("DeleteFlag not in", values, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagBetween(String value1, String value2) {
            addCriterion("DeleteFlag between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andDeleteflagNotBetween(String value1, String value2) {
            addCriterion("DeleteFlag not between", value1, value2, "deleteflag");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CreateUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CreateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CreateUserId =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CreateUserId <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CreateUserId >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CreateUserId >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CreateUserId <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CreateUserId <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CreateUserId like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CreateUserId not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CreateUserId in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CreateUserId not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CreateUserId between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CreateUserId not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("UpdateUserId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("UpdateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(String value) {
            addCriterion("UpdateUserId =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(String value) {
            addCriterion("UpdateUserId <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(String value) {
            addCriterion("UpdateUserId >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("UpdateUserId >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(String value) {
            addCriterion("UpdateUserId <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("UpdateUserId <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLike(String value) {
            addCriterion("UpdateUserId like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotLike(String value) {
            addCriterion("UpdateUserId not like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<String> values) {
            addCriterion("UpdateUserId in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<String> values) {
            addCriterion("UpdateUserId not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(String value1, String value2) {
            addCriterion("UpdateUserId between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("UpdateUserId not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UpdateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UpdateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterion("UpdateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterion("UpdateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterion("UpdateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterion("UpdateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterion("UpdateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterion("UpdateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterion("UpdateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterion("UpdateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterion("UpdateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}