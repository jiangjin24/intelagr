package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BPmaqimonitoringExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BPmaqimonitoringExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMonitordateIsNull() {
            addCriterion("MonitorDate is null");
            return (Criteria) this;
        }

        public Criteria andMonitordateIsNotNull() {
            addCriterion("MonitorDate is not null");
            return (Criteria) this;
        }

        public Criteria andMonitordateEqualTo(Date value) {
            addCriterion("MonitorDate =", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateNotEqualTo(Date value) {
            addCriterion("MonitorDate <>", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateGreaterThan(Date value) {
            addCriterion("MonitorDate >", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateGreaterThanOrEqualTo(Date value) {
            addCriterion("MonitorDate >=", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateLessThan(Date value) {
            addCriterion("MonitorDate <", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateLessThanOrEqualTo(Date value) {
            addCriterion("MonitorDate <=", value, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateIn(List<Date> values) {
            addCriterion("MonitorDate in", values, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateNotIn(List<Date> values) {
            addCriterion("MonitorDate not in", values, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateBetween(Date value1, Date value2) {
            addCriterion("MonitorDate between", value1, value2, "monitordate");
            return (Criteria) this;
        }

        public Criteria andMonitordateNotBetween(Date value1, Date value2) {
            addCriterion("MonitorDate not between", value1, value2, "monitordate");
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

        public Criteria andAqiIsNull() {
            addCriterion("AQI is null");
            return (Criteria) this;
        }

        public Criteria andAqiIsNotNull() {
            addCriterion("AQI is not null");
            return (Criteria) this;
        }

        public Criteria andAqiEqualTo(Float value) {
            addCriterion("AQI =", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiNotEqualTo(Float value) {
            addCriterion("AQI <>", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiGreaterThan(Float value) {
            addCriterion("AQI >", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiGreaterThanOrEqualTo(Float value) {
            addCriterion("AQI >=", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiLessThan(Float value) {
            addCriterion("AQI <", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiLessThanOrEqualTo(Float value) {
            addCriterion("AQI <=", value, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiIn(List<Float> values) {
            addCriterion("AQI in", values, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiNotIn(List<Float> values) {
            addCriterion("AQI not in", values, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiBetween(Float value1, Float value2) {
            addCriterion("AQI between", value1, value2, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqiNotBetween(Float value1, Float value2) {
            addCriterion("AQI not between", value1, value2, "aqi");
            return (Criteria) this;
        }

        public Criteria andAqinameIsNull() {
            addCriterion("AQIName is null");
            return (Criteria) this;
        }

        public Criteria andAqinameIsNotNull() {
            addCriterion("AQIName is not null");
            return (Criteria) this;
        }

        public Criteria andAqinameEqualTo(String value) {
            addCriterion("AQIName =", value, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameNotEqualTo(String value) {
            addCriterion("AQIName <>", value, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameGreaterThan(String value) {
            addCriterion("AQIName >", value, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameGreaterThanOrEqualTo(String value) {
            addCriterion("AQIName >=", value, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameLessThan(String value) {
            addCriterion("AQIName <", value, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameLessThanOrEqualTo(String value) {
            addCriterion("AQIName <=", value, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameLike(String value) {
            addCriterion("AQIName like", value, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameNotLike(String value) {
            addCriterion("AQIName not like", value, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameIn(List<String> values) {
            addCriterion("AQIName in", values, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameNotIn(List<String> values) {
            addCriterion("AQIName not in", values, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameBetween(String value1, String value2) {
            addCriterion("AQIName between", value1, value2, "aqiname");
            return (Criteria) this;
        }

        public Criteria andAqinameNotBetween(String value1, String value2) {
            addCriterion("AQIName not between", value1, value2, "aqiname");
            return (Criteria) this;
        }

        public Criteria andPm25IsNull() {
            addCriterion("PM2_5 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("PM2_5 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(Float value) {
            addCriterion("PM2_5 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(Float value) {
            addCriterion("PM2_5 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(Float value) {
            addCriterion("PM2_5 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(Float value) {
            addCriterion("PM2_5 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(Float value) {
            addCriterion("PM2_5 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(Float value) {
            addCriterion("PM2_5 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<Float> values) {
            addCriterion("PM2_5 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<Float> values) {
            addCriterion("PM2_5 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(Float value1, Float value2) {
            addCriterion("PM2_5 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(Float value1, Float value2) {
            addCriterion("PM2_5 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm10IsNull() {
            addCriterion("PM10 is null");
            return (Criteria) this;
        }

        public Criteria andPm10IsNotNull() {
            addCriterion("PM10 is not null");
            return (Criteria) this;
        }

        public Criteria andPm10EqualTo(Float value) {
            addCriterion("PM10 =", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotEqualTo(Float value) {
            addCriterion("PM10 <>", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThan(Float value) {
            addCriterion("PM10 >", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10GreaterThanOrEqualTo(Float value) {
            addCriterion("PM10 >=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThan(Float value) {
            addCriterion("PM10 <", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10LessThanOrEqualTo(Float value) {
            addCriterion("PM10 <=", value, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10In(List<Float> values) {
            addCriterion("PM10 in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotIn(List<Float> values) {
            addCriterion("PM10 not in", values, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10Between(Float value1, Float value2) {
            addCriterion("PM10 between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andPm10NotBetween(Float value1, Float value2) {
            addCriterion("PM10 not between", value1, value2, "pm10");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("CO is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("CO is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(Float value) {
            addCriterion("CO =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(Float value) {
            addCriterion("CO <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(Float value) {
            addCriterion("CO >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(Float value) {
            addCriterion("CO >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(Float value) {
            addCriterion("CO <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(Float value) {
            addCriterion("CO <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<Float> values) {
            addCriterion("CO in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<Float> values) {
            addCriterion("CO not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(Float value1, Float value2) {
            addCriterion("CO between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(Float value1, Float value2) {
            addCriterion("CO not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andNo2IsNull() {
            addCriterion("NO2 is null");
            return (Criteria) this;
        }

        public Criteria andNo2IsNotNull() {
            addCriterion("NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andNo2EqualTo(Float value) {
            addCriterion("NO2 =", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotEqualTo(Float value) {
            addCriterion("NO2 <>", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThan(Float value) {
            addCriterion("NO2 >", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2GreaterThanOrEqualTo(Float value) {
            addCriterion("NO2 >=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThan(Float value) {
            addCriterion("NO2 <", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2LessThanOrEqualTo(Float value) {
            addCriterion("NO2 <=", value, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2In(List<Float> values) {
            addCriterion("NO2 in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotIn(List<Float> values) {
            addCriterion("NO2 not in", values, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2Between(Float value1, Float value2) {
            addCriterion("NO2 between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andNo2NotBetween(Float value1, Float value2) {
            addCriterion("NO2 not between", value1, value2, "no2");
            return (Criteria) this;
        }

        public Criteria andO3IsNull() {
            addCriterion("O3 is null");
            return (Criteria) this;
        }

        public Criteria andO3IsNotNull() {
            addCriterion("O3 is not null");
            return (Criteria) this;
        }

        public Criteria andO3EqualTo(Float value) {
            addCriterion("O3 =", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotEqualTo(Float value) {
            addCriterion("O3 <>", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThan(Float value) {
            addCriterion("O3 >", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3GreaterThanOrEqualTo(Float value) {
            addCriterion("O3 >=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThan(Float value) {
            addCriterion("O3 <", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3LessThanOrEqualTo(Float value) {
            addCriterion("O3 <=", value, "o3");
            return (Criteria) this;
        }

        public Criteria andO3In(List<Float> values) {
            addCriterion("O3 in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotIn(List<Float> values) {
            addCriterion("O3 not in", values, "o3");
            return (Criteria) this;
        }

        public Criteria andO3Between(Float value1, Float value2) {
            addCriterion("O3 between", value1, value2, "o3");
            return (Criteria) this;
        }

        public Criteria andO3NotBetween(Float value1, Float value2) {
            addCriterion("O3 not between", value1, value2, "o3");
            return (Criteria) this;
        }

        public Criteria andSo2IsNull() {
            addCriterion("SO2 is null");
            return (Criteria) this;
        }

        public Criteria andSo2IsNotNull() {
            addCriterion("SO2 is not null");
            return (Criteria) this;
        }

        public Criteria andSo2EqualTo(Float value) {
            addCriterion("SO2 =", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotEqualTo(Float value) {
            addCriterion("SO2 <>", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThan(Float value) {
            addCriterion("SO2 >", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2GreaterThanOrEqualTo(Float value) {
            addCriterion("SO2 >=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThan(Float value) {
            addCriterion("SO2 <", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2LessThanOrEqualTo(Float value) {
            addCriterion("SO2 <=", value, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2In(List<Float> values) {
            addCriterion("SO2 in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotIn(List<Float> values) {
            addCriterion("SO2 not in", values, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2Between(Float value1, Float value2) {
            addCriterion("SO2 between", value1, value2, "so2");
            return (Criteria) this;
        }

        public Criteria andSo2NotBetween(Float value1, Float value2) {
            addCriterion("SO2 not between", value1, value2, "so2");
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