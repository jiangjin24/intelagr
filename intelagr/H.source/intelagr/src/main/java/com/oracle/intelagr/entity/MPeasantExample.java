package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MPeasantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPeasantExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andContractorcodeIsNull() {
            addCriterion("ContractorCode is null");
            return (Criteria) this;
        }

        public Criteria andContractorcodeIsNotNull() {
            addCriterion("ContractorCode is not null");
            return (Criteria) this;
        }

        public Criteria andContractorcodeEqualTo(String value) {
            addCriterion("ContractorCode =", value, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeNotEqualTo(String value) {
            addCriterion("ContractorCode <>", value, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeGreaterThan(String value) {
            addCriterion("ContractorCode >", value, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorCode >=", value, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeLessThan(String value) {
            addCriterion("ContractorCode <", value, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeLessThanOrEqualTo(String value) {
            addCriterion("ContractorCode <=", value, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeLike(String value) {
            addCriterion("ContractorCode like", value, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeNotLike(String value) {
            addCriterion("ContractorCode not like", value, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeIn(List<String> values) {
            addCriterion("ContractorCode in", values, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeNotIn(List<String> values) {
            addCriterion("ContractorCode not in", values, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeBetween(String value1, String value2) {
            addCriterion("ContractorCode between", value1, value2, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractorcodeNotBetween(String value1, String value2) {
            addCriterion("ContractorCode not between", value1, value2, "contractorcode");
            return (Criteria) this;
        }

        public Criteria andContractornameIsNull() {
            addCriterion("ContractorName is null");
            return (Criteria) this;
        }

        public Criteria andContractornameIsNotNull() {
            addCriterion("ContractorName is not null");
            return (Criteria) this;
        }

        public Criteria andContractornameEqualTo(String value) {
            addCriterion("ContractorName =", value, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameNotEqualTo(String value) {
            addCriterion("ContractorName <>", value, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameGreaterThan(String value) {
            addCriterion("ContractorName >", value, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorName >=", value, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameLessThan(String value) {
            addCriterion("ContractorName <", value, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameLessThanOrEqualTo(String value) {
            addCriterion("ContractorName <=", value, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameLike(String value) {
            addCriterion("ContractorName like", value, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameNotLike(String value) {
            addCriterion("ContractorName not like", value, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameIn(List<String> values) {
            addCriterion("ContractorName in", values, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameNotIn(List<String> values) {
            addCriterion("ContractorName not in", values, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameBetween(String value1, String value2) {
            addCriterion("ContractorName between", value1, value2, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractornameNotBetween(String value1, String value2) {
            addCriterion("ContractorName not between", value1, value2, "contractorname");
            return (Criteria) this;
        }

        public Criteria andContractoridIsNull() {
            addCriterion("ContractorID is null");
            return (Criteria) this;
        }

        public Criteria andContractoridIsNotNull() {
            addCriterion("ContractorID is not null");
            return (Criteria) this;
        }

        public Criteria andContractoridEqualTo(String value) {
            addCriterion("ContractorID =", value, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridNotEqualTo(String value) {
            addCriterion("ContractorID <>", value, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridGreaterThan(String value) {
            addCriterion("ContractorID >", value, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorID >=", value, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridLessThan(String value) {
            addCriterion("ContractorID <", value, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridLessThanOrEqualTo(String value) {
            addCriterion("ContractorID <=", value, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridLike(String value) {
            addCriterion("ContractorID like", value, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridNotLike(String value) {
            addCriterion("ContractorID not like", value, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridIn(List<String> values) {
            addCriterion("ContractorID in", values, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridNotIn(List<String> values) {
            addCriterion("ContractorID not in", values, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridBetween(String value1, String value2) {
            addCriterion("ContractorID between", value1, value2, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridNotBetween(String value1, String value2) {
            addCriterion("ContractorID not between", value1, value2, "contractorid");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeIsNull() {
            addCriterion("ContractorIDType is null");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeIsNotNull() {
            addCriterion("ContractorIDType is not null");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeEqualTo(String value) {
            addCriterion("ContractorIDType =", value, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeNotEqualTo(String value) {
            addCriterion("ContractorIDType <>", value, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeGreaterThan(String value) {
            addCriterion("ContractorIDType >", value, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorIDType >=", value, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeLessThan(String value) {
            addCriterion("ContractorIDType <", value, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeLessThanOrEqualTo(String value) {
            addCriterion("ContractorIDType <=", value, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeLike(String value) {
            addCriterion("ContractorIDType like", value, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeNotLike(String value) {
            addCriterion("ContractorIDType not like", value, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeIn(List<String> values) {
            addCriterion("ContractorIDType in", values, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeNotIn(List<String> values) {
            addCriterion("ContractorIDType not in", values, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeBetween(String value1, String value2) {
            addCriterion("ContractorIDType between", value1, value2, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractoridtypeNotBetween(String value1, String value2) {
            addCriterion("ContractorIDType not between", value1, value2, "contractoridtype");
            return (Criteria) this;
        }

        public Criteria andContractorageIsNull() {
            addCriterion("ContractorAge is null");
            return (Criteria) this;
        }

        public Criteria andContractorageIsNotNull() {
            addCriterion("ContractorAge is not null");
            return (Criteria) this;
        }

        public Criteria andContractorageEqualTo(Integer value) {
            addCriterion("ContractorAge =", value, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageNotEqualTo(Integer value) {
            addCriterion("ContractorAge <>", value, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageGreaterThan(Integer value) {
            addCriterion("ContractorAge >", value, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageGreaterThanOrEqualTo(Integer value) {
            addCriterion("ContractorAge >=", value, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageLessThan(Integer value) {
            addCriterion("ContractorAge <", value, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageLessThanOrEqualTo(Integer value) {
            addCriterion("ContractorAge <=", value, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageIn(List<Integer> values) {
            addCriterion("ContractorAge in", values, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageNotIn(List<Integer> values) {
            addCriterion("ContractorAge not in", values, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageBetween(Integer value1, Integer value2) {
            addCriterion("ContractorAge between", value1, value2, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorageNotBetween(Integer value1, Integer value2) {
            addCriterion("ContractorAge not between", value1, value2, "contractorage");
            return (Criteria) this;
        }

        public Criteria andContractorsexIsNull() {
            addCriterion("ContractorSex is null");
            return (Criteria) this;
        }

        public Criteria andContractorsexIsNotNull() {
            addCriterion("ContractorSex is not null");
            return (Criteria) this;
        }

        public Criteria andContractorsexEqualTo(String value) {
            addCriterion("ContractorSex =", value, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexNotEqualTo(String value) {
            addCriterion("ContractorSex <>", value, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexGreaterThan(String value) {
            addCriterion("ContractorSex >", value, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorSex >=", value, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexLessThan(String value) {
            addCriterion("ContractorSex <", value, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexLessThanOrEqualTo(String value) {
            addCriterion("ContractorSex <=", value, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexLike(String value) {
            addCriterion("ContractorSex like", value, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexNotLike(String value) {
            addCriterion("ContractorSex not like", value, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexIn(List<String> values) {
            addCriterion("ContractorSex in", values, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexNotIn(List<String> values) {
            addCriterion("ContractorSex not in", values, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexBetween(String value1, String value2) {
            addCriterion("ContractorSex between", value1, value2, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorsexNotBetween(String value1, String value2) {
            addCriterion("ContractorSex not between", value1, value2, "contractorsex");
            return (Criteria) this;
        }

        public Criteria andContractorbirthIsNull() {
            addCriterion("ContractorBirth is null");
            return (Criteria) this;
        }

        public Criteria andContractorbirthIsNotNull() {
            addCriterion("ContractorBirth is not null");
            return (Criteria) this;
        }

        public Criteria andContractorbirthEqualTo(String value) {
            addCriterion("ContractorBirth =", value, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthNotEqualTo(String value) {
            addCriterion("ContractorBirth <>", value, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthGreaterThan(String value) {
            addCriterion("ContractorBirth >", value, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorBirth >=", value, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthLessThan(String value) {
            addCriterion("ContractorBirth <", value, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthLessThanOrEqualTo(String value) {
            addCriterion("ContractorBirth <=", value, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthLike(String value) {
            addCriterion("ContractorBirth like", value, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthNotLike(String value) {
            addCriterion("ContractorBirth not like", value, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthIn(List<String> values) {
            addCriterion("ContractorBirth in", values, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthNotIn(List<String> values) {
            addCriterion("ContractorBirth not in", values, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthBetween(String value1, String value2) {
            addCriterion("ContractorBirth between", value1, value2, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractorbirthNotBetween(String value1, String value2) {
            addCriterion("ContractorBirth not between", value1, value2, "contractorbirth");
            return (Criteria) this;
        }

        public Criteria andContractortelIsNull() {
            addCriterion("ContractorTel is null");
            return (Criteria) this;
        }

        public Criteria andContractortelIsNotNull() {
            addCriterion("ContractorTel is not null");
            return (Criteria) this;
        }

        public Criteria andContractortelEqualTo(String value) {
            addCriterion("ContractorTel =", value, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelNotEqualTo(String value) {
            addCriterion("ContractorTel <>", value, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelGreaterThan(String value) {
            addCriterion("ContractorTel >", value, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorTel >=", value, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelLessThan(String value) {
            addCriterion("ContractorTel <", value, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelLessThanOrEqualTo(String value) {
            addCriterion("ContractorTel <=", value, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelLike(String value) {
            addCriterion("ContractorTel like", value, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelNotLike(String value) {
            addCriterion("ContractorTel not like", value, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelIn(List<String> values) {
            addCriterion("ContractorTel in", values, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelNotIn(List<String> values) {
            addCriterion("ContractorTel not in", values, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelBetween(String value1, String value2) {
            addCriterion("ContractorTel between", value1, value2, "contractortel");
            return (Criteria) this;
        }

        public Criteria andContractortelNotBetween(String value1, String value2) {
            addCriterion("ContractorTel not between", value1, value2, "contractortel");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("CityCode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("CityCode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("CityCode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("CityCode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("CityCode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CityCode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("CityCode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("CityCode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("CityCode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("CityCode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("CityCode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("CityCode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("CityCode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("CityCode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andTowncodeIsNull() {
            addCriterion("TownCode is null");
            return (Criteria) this;
        }

        public Criteria andTowncodeIsNotNull() {
            addCriterion("TownCode is not null");
            return (Criteria) this;
        }

        public Criteria andTowncodeEqualTo(String value) {
            addCriterion("TownCode =", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeNotEqualTo(String value) {
            addCriterion("TownCode <>", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeGreaterThan(String value) {
            addCriterion("TownCode >", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeGreaterThanOrEqualTo(String value) {
            addCriterion("TownCode >=", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeLessThan(String value) {
            addCriterion("TownCode <", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeLessThanOrEqualTo(String value) {
            addCriterion("TownCode <=", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeLike(String value) {
            addCriterion("TownCode like", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeNotLike(String value) {
            addCriterion("TownCode not like", value, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeIn(List<String> values) {
            addCriterion("TownCode in", values, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeNotIn(List<String> values) {
            addCriterion("TownCode not in", values, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeBetween(String value1, String value2) {
            addCriterion("TownCode between", value1, value2, "towncode");
            return (Criteria) this;
        }

        public Criteria andTowncodeNotBetween(String value1, String value2) {
            addCriterion("TownCode not between", value1, value2, "towncode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIsNull() {
            addCriterion("CountryCode is null");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIsNotNull() {
            addCriterion("CountryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountrycodeEqualTo(String value) {
            addCriterion("CountryCode =", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotEqualTo(String value) {
            addCriterion("CountryCode <>", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeGreaterThan(String value) {
            addCriterion("CountryCode >", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CountryCode >=", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLessThan(String value) {
            addCriterion("CountryCode <", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLessThanOrEqualTo(String value) {
            addCriterion("CountryCode <=", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeLike(String value) {
            addCriterion("CountryCode like", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotLike(String value) {
            addCriterion("CountryCode not like", value, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeIn(List<String> values) {
            addCriterion("CountryCode in", values, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotIn(List<String> values) {
            addCriterion("CountryCode not in", values, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeBetween(String value1, String value2) {
            addCriterion("CountryCode between", value1, value2, "countrycode");
            return (Criteria) this;
        }

        public Criteria andCountrycodeNotBetween(String value1, String value2) {
            addCriterion("CountryCode not between", value1, value2, "countrycode");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("GroupName is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("GroupName is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("GroupName =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("GroupName <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("GroupName >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("GroupName >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("GroupName <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("GroupName <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("GroupName like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("GroupName not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("GroupName in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("GroupName not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("GroupName between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("GroupName not between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeIsNull() {
            addCriterion("ContractorZipcode is null");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeIsNotNull() {
            addCriterion("ContractorZipcode is not null");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeEqualTo(String value) {
            addCriterion("ContractorZipcode =", value, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeNotEqualTo(String value) {
            addCriterion("ContractorZipcode <>", value, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeGreaterThan(String value) {
            addCriterion("ContractorZipcode >", value, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorZipcode >=", value, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeLessThan(String value) {
            addCriterion("ContractorZipcode <", value, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeLessThanOrEqualTo(String value) {
            addCriterion("ContractorZipcode <=", value, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeLike(String value) {
            addCriterion("ContractorZipcode like", value, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeNotLike(String value) {
            addCriterion("ContractorZipcode not like", value, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeIn(List<String> values) {
            addCriterion("ContractorZipcode in", values, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeNotIn(List<String> values) {
            addCriterion("ContractorZipcode not in", values, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeBetween(String value1, String value2) {
            addCriterion("ContractorZipcode between", value1, value2, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorzipcodeNotBetween(String value1, String value2) {
            addCriterion("ContractorZipcode not between", value1, value2, "contractorzipcode");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeIsNull() {
            addCriterion("ContractorhouseholdType is null");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeIsNotNull() {
            addCriterion("ContractorhouseholdType is not null");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeEqualTo(String value) {
            addCriterion("ContractorhouseholdType =", value, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeNotEqualTo(String value) {
            addCriterion("ContractorhouseholdType <>", value, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeGreaterThan(String value) {
            addCriterion("ContractorhouseholdType >", value, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorhouseholdType >=", value, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeLessThan(String value) {
            addCriterion("ContractorhouseholdType <", value, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeLessThanOrEqualTo(String value) {
            addCriterion("ContractorhouseholdType <=", value, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeLike(String value) {
            addCriterion("ContractorhouseholdType like", value, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeNotLike(String value) {
            addCriterion("ContractorhouseholdType not like", value, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeIn(List<String> values) {
            addCriterion("ContractorhouseholdType in", values, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeNotIn(List<String> values) {
            addCriterion("ContractorhouseholdType not in", values, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeBetween(String value1, String value2) {
            addCriterion("ContractorhouseholdType between", value1, value2, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractorhouseholdtypeNotBetween(String value1, String value2) {
            addCriterion("ContractorhouseholdType not between", value1, value2, "contractorhouseholdtype");
            return (Criteria) this;
        }

        public Criteria andContractortypeIsNull() {
            addCriterion("ContractorType is null");
            return (Criteria) this;
        }

        public Criteria andContractortypeIsNotNull() {
            addCriterion("ContractorType is not null");
            return (Criteria) this;
        }

        public Criteria andContractortypeEqualTo(String value) {
            addCriterion("ContractorType =", value, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeNotEqualTo(String value) {
            addCriterion("ContractorType <>", value, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeGreaterThan(String value) {
            addCriterion("ContractorType >", value, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorType >=", value, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeLessThan(String value) {
            addCriterion("ContractorType <", value, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeLessThanOrEqualTo(String value) {
            addCriterion("ContractorType <=", value, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeLike(String value) {
            addCriterion("ContractorType like", value, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeNotLike(String value) {
            addCriterion("ContractorType not like", value, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeIn(List<String> values) {
            addCriterion("ContractorType in", values, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeNotIn(List<String> values) {
            addCriterion("ContractorType not in", values, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeBetween(String value1, String value2) {
            addCriterion("ContractorType between", value1, value2, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractortypeNotBetween(String value1, String value2) {
            addCriterion("ContractorType not between", value1, value2, "contractortype");
            return (Criteria) this;
        }

        public Criteria andContractidIsNull() {
            addCriterion("ContractId is null");
            return (Criteria) this;
        }

        public Criteria andContractidIsNotNull() {
            addCriterion("ContractId is not null");
            return (Criteria) this;
        }

        public Criteria andContractidEqualTo(String value) {
            addCriterion("ContractId =", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotEqualTo(String value) {
            addCriterion("ContractId <>", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThan(String value) {
            addCriterion("ContractId >", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidGreaterThanOrEqualTo(String value) {
            addCriterion("ContractId >=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThan(String value) {
            addCriterion("ContractId <", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLessThanOrEqualTo(String value) {
            addCriterion("ContractId <=", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidLike(String value) {
            addCriterion("ContractId like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotLike(String value) {
            addCriterion("ContractId not like", value, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidIn(List<String> values) {
            addCriterion("ContractId in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotIn(List<String> values) {
            addCriterion("ContractId not in", values, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidBetween(String value1, String value2) {
            addCriterion("ContractId between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractidNotBetween(String value1, String value2) {
            addCriterion("ContractId not between", value1, value2, "contractid");
            return (Criteria) this;
        }

        public Criteria andContractornationIsNull() {
            addCriterion("ContractorNation is null");
            return (Criteria) this;
        }

        public Criteria andContractornationIsNotNull() {
            addCriterion("ContractorNation is not null");
            return (Criteria) this;
        }

        public Criteria andContractornationEqualTo(String value) {
            addCriterion("ContractorNation =", value, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationNotEqualTo(String value) {
            addCriterion("ContractorNation <>", value, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationGreaterThan(String value) {
            addCriterion("ContractorNation >", value, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationGreaterThanOrEqualTo(String value) {
            addCriterion("ContractorNation >=", value, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationLessThan(String value) {
            addCriterion("ContractorNation <", value, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationLessThanOrEqualTo(String value) {
            addCriterion("ContractorNation <=", value, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationLike(String value) {
            addCriterion("ContractorNation like", value, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationNotLike(String value) {
            addCriterion("ContractorNation not like", value, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationIn(List<String> values) {
            addCriterion("ContractorNation in", values, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationNotIn(List<String> values) {
            addCriterion("ContractorNation not in", values, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationBetween(String value1, String value2) {
            addCriterion("ContractorNation between", value1, value2, "contractornation");
            return (Criteria) this;
        }

        public Criteria andContractornationNotBetween(String value1, String value2) {
            addCriterion("ContractorNation not between", value1, value2, "contractornation");
            return (Criteria) this;
        }

        public Criteria andRightidIsNull() {
            addCriterion("RightId is null");
            return (Criteria) this;
        }

        public Criteria andRightidIsNotNull() {
            addCriterion("RightId is not null");
            return (Criteria) this;
        }

        public Criteria andRightidEqualTo(String value) {
            addCriterion("RightId =", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotEqualTo(String value) {
            addCriterion("RightId <>", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThan(String value) {
            addCriterion("RightId >", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidGreaterThanOrEqualTo(String value) {
            addCriterion("RightId >=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThan(String value) {
            addCriterion("RightId <", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLessThanOrEqualTo(String value) {
            addCriterion("RightId <=", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidLike(String value) {
            addCriterion("RightId like", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotLike(String value) {
            addCriterion("RightId not like", value, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidIn(List<String> values) {
            addCriterion("RightId in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotIn(List<String> values) {
            addCriterion("RightId not in", values, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidBetween(String value1, String value2) {
            addCriterion("RightId between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andRightidNotBetween(String value1, String value2) {
            addCriterion("RightId not between", value1, value2, "rightid");
            return (Criteria) this;
        }

        public Criteria andAttestorIsNull() {
            addCriterion("Attestor is null");
            return (Criteria) this;
        }

        public Criteria andAttestorIsNotNull() {
            addCriterion("Attestor is not null");
            return (Criteria) this;
        }

        public Criteria andAttestorEqualTo(String value) {
            addCriterion("Attestor =", value, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorNotEqualTo(String value) {
            addCriterion("Attestor <>", value, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorGreaterThan(String value) {
            addCriterion("Attestor >", value, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorGreaterThanOrEqualTo(String value) {
            addCriterion("Attestor >=", value, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorLessThan(String value) {
            addCriterion("Attestor <", value, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorLessThanOrEqualTo(String value) {
            addCriterion("Attestor <=", value, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorLike(String value) {
            addCriterion("Attestor like", value, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorNotLike(String value) {
            addCriterion("Attestor not like", value, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorIn(List<String> values) {
            addCriterion("Attestor in", values, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorNotIn(List<String> values) {
            addCriterion("Attestor not in", values, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorBetween(String value1, String value2) {
            addCriterion("Attestor between", value1, value2, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestorNotBetween(String value1, String value2) {
            addCriterion("Attestor not between", value1, value2, "attestor");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismIsNull() {
            addCriterion("AttestMechanism is null");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismIsNotNull() {
            addCriterion("AttestMechanism is not null");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismEqualTo(String value) {
            addCriterion("AttestMechanism =", value, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismNotEqualTo(String value) {
            addCriterion("AttestMechanism <>", value, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismGreaterThan(String value) {
            addCriterion("AttestMechanism >", value, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismGreaterThanOrEqualTo(String value) {
            addCriterion("AttestMechanism >=", value, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismLessThan(String value) {
            addCriterion("AttestMechanism <", value, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismLessThanOrEqualTo(String value) {
            addCriterion("AttestMechanism <=", value, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismLike(String value) {
            addCriterion("AttestMechanism like", value, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismNotLike(String value) {
            addCriterion("AttestMechanism not like", value, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismIn(List<String> values) {
            addCriterion("AttestMechanism in", values, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismNotIn(List<String> values) {
            addCriterion("AttestMechanism not in", values, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismBetween(String value1, String value2) {
            addCriterion("AttestMechanism between", value1, value2, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestmechanismNotBetween(String value1, String value2) {
            addCriterion("AttestMechanism not between", value1, value2, "attestmechanism");
            return (Criteria) this;
        }

        public Criteria andAttestdateIsNull() {
            addCriterion("AttestDate is null");
            return (Criteria) this;
        }

        public Criteria andAttestdateIsNotNull() {
            addCriterion("AttestDate is not null");
            return (Criteria) this;
        }

        public Criteria andAttestdateEqualTo(Date value) {
            addCriterionForJDBCDate("AttestDate =", value, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("AttestDate <>", value, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateGreaterThan(Date value) {
            addCriterionForJDBCDate("AttestDate >", value, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AttestDate >=", value, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateLessThan(Date value) {
            addCriterionForJDBCDate("AttestDate <", value, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("AttestDate <=", value, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateIn(List<Date> values) {
            addCriterionForJDBCDate("AttestDate in", values, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("AttestDate not in", values, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AttestDate between", value1, value2, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("AttestDate not between", value1, value2, "attestdate");
            return (Criteria) this;
        }

        public Criteria andAttestnoIsNull() {
            addCriterion("AttestNo is null");
            return (Criteria) this;
        }

        public Criteria andAttestnoIsNotNull() {
            addCriterion("AttestNo is not null");
            return (Criteria) this;
        }

        public Criteria andAttestnoEqualTo(String value) {
            addCriterion("AttestNo =", value, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoNotEqualTo(String value) {
            addCriterion("AttestNo <>", value, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoGreaterThan(String value) {
            addCriterion("AttestNo >", value, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoGreaterThanOrEqualTo(String value) {
            addCriterion("AttestNo >=", value, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoLessThan(String value) {
            addCriterion("AttestNo <", value, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoLessThanOrEqualTo(String value) {
            addCriterion("AttestNo <=", value, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoLike(String value) {
            addCriterion("AttestNo like", value, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoNotLike(String value) {
            addCriterion("AttestNo not like", value, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoIn(List<String> values) {
            addCriterion("AttestNo in", values, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoNotIn(List<String> values) {
            addCriterion("AttestNo not in", values, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoBetween(String value1, String value2) {
            addCriterion("AttestNo between", value1, value2, "attestno");
            return (Criteria) this;
        }

        public Criteria andAttestnoNotBetween(String value1, String value2) {
            addCriterion("AttestNo not between", value1, value2, "attestno");
            return (Criteria) this;
        }

        public Criteria andLandpurposeIsNull() {
            addCriterion("LandPurpose is null");
            return (Criteria) this;
        }

        public Criteria andLandpurposeIsNotNull() {
            addCriterion("LandPurpose is not null");
            return (Criteria) this;
        }

        public Criteria andLandpurposeEqualTo(String value) {
            addCriterion("LandPurpose =", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeNotEqualTo(String value) {
            addCriterion("LandPurpose <>", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeGreaterThan(String value) {
            addCriterion("LandPurpose >", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeGreaterThanOrEqualTo(String value) {
            addCriterion("LandPurpose >=", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeLessThan(String value) {
            addCriterion("LandPurpose <", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeLessThanOrEqualTo(String value) {
            addCriterion("LandPurpose <=", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeLike(String value) {
            addCriterion("LandPurpose like", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeNotLike(String value) {
            addCriterion("LandPurpose not like", value, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeIn(List<String> values) {
            addCriterion("LandPurpose in", values, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeNotIn(List<String> values) {
            addCriterion("LandPurpose not in", values, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeBetween(String value1, String value2) {
            addCriterion("LandPurpose between", value1, value2, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andLandpurposeNotBetween(String value1, String value2) {
            addCriterion("LandPurpose not between", value1, value2, "landpurpose");
            return (Criteria) this;
        }

        public Criteria andRightgetwayIsNull() {
            addCriterion("RightGetWay is null");
            return (Criteria) this;
        }

        public Criteria andRightgetwayIsNotNull() {
            addCriterion("RightGetWay is not null");
            return (Criteria) this;
        }

        public Criteria andRightgetwayEqualTo(String value) {
            addCriterion("RightGetWay =", value, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayNotEqualTo(String value) {
            addCriterion("RightGetWay <>", value, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayGreaterThan(String value) {
            addCriterion("RightGetWay >", value, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayGreaterThanOrEqualTo(String value) {
            addCriterion("RightGetWay >=", value, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayLessThan(String value) {
            addCriterion("RightGetWay <", value, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayLessThanOrEqualTo(String value) {
            addCriterion("RightGetWay <=", value, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayLike(String value) {
            addCriterion("RightGetWay like", value, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayNotLike(String value) {
            addCriterion("RightGetWay not like", value, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayIn(List<String> values) {
            addCriterion("RightGetWay in", values, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayNotIn(List<String> values) {
            addCriterion("RightGetWay not in", values, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayBetween(String value1, String value2) {
            addCriterion("RightGetWay between", value1, value2, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andRightgetwayNotBetween(String value1, String value2) {
            addCriterion("RightGetWay not between", value1, value2, "rightgetway");
            return (Criteria) this;
        }

        public Criteria andContractstartdateIsNull() {
            addCriterion("ContractStartDate is null");
            return (Criteria) this;
        }

        public Criteria andContractstartdateIsNotNull() {
            addCriterion("ContractStartDate is not null");
            return (Criteria) this;
        }

        public Criteria andContractstartdateEqualTo(Date value) {
            addCriterion("ContractStartDate =", value, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateNotEqualTo(Date value) {
            addCriterion("ContractStartDate <>", value, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateGreaterThan(Date value) {
            addCriterion("ContractStartDate >", value, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ContractStartDate >=", value, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateLessThan(Date value) {
            addCriterion("ContractStartDate <", value, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateLessThanOrEqualTo(Date value) {
            addCriterion("ContractStartDate <=", value, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateIn(List<Date> values) {
            addCriterion("ContractStartDate in", values, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateNotIn(List<Date> values) {
            addCriterion("ContractStartDate not in", values, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateBetween(Date value1, Date value2) {
            addCriterion("ContractStartDate between", value1, value2, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractstartdateNotBetween(Date value1, Date value2) {
            addCriterion("ContractStartDate not between", value1, value2, "contractstartdate");
            return (Criteria) this;
        }

        public Criteria andContractyearIsNull() {
            addCriterion("ContractYear is null");
            return (Criteria) this;
        }

        public Criteria andContractyearIsNotNull() {
            addCriterion("ContractYear is not null");
            return (Criteria) this;
        }

        public Criteria andContractyearEqualTo(Integer value) {
            addCriterion("ContractYear =", value, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearNotEqualTo(Integer value) {
            addCriterion("ContractYear <>", value, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearGreaterThan(Integer value) {
            addCriterion("ContractYear >", value, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("ContractYear >=", value, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearLessThan(Integer value) {
            addCriterion("ContractYear <", value, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearLessThanOrEqualTo(Integer value) {
            addCriterion("ContractYear <=", value, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearIn(List<Integer> values) {
            addCriterion("ContractYear in", values, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearNotIn(List<Integer> values) {
            addCriterion("ContractYear not in", values, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearBetween(Integer value1, Integer value2) {
            addCriterion("ContractYear between", value1, value2, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractyearNotBetween(Integer value1, Integer value2) {
            addCriterion("ContractYear not between", value1, value2, "contractyear");
            return (Criteria) this;
        }

        public Criteria andContractenddateIsNull() {
            addCriterion("ContractEndDate is null");
            return (Criteria) this;
        }

        public Criteria andContractenddateIsNotNull() {
            addCriterion("ContractEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andContractenddateEqualTo(Date value) {
            addCriterion("ContractEndDate =", value, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateNotEqualTo(Date value) {
            addCriterion("ContractEndDate <>", value, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateGreaterThan(Date value) {
            addCriterion("ContractEndDate >", value, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ContractEndDate >=", value, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateLessThan(Date value) {
            addCriterion("ContractEndDate <", value, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateLessThanOrEqualTo(Date value) {
            addCriterion("ContractEndDate <=", value, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateIn(List<Date> values) {
            addCriterion("ContractEndDate in", values, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateNotIn(List<Date> values) {
            addCriterion("ContractEndDate not in", values, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateBetween(Date value1, Date value2) {
            addCriterion("ContractEndDate between", value1, value2, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andContractenddateNotBetween(Date value1, Date value2) {
            addCriterion("ContractEndDate not between", value1, value2, "contractenddate");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountIsNull() {
            addCriterion("GetLandPersonCount is null");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountIsNotNull() {
            addCriterion("GetLandPersonCount is not null");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountEqualTo(Integer value) {
            addCriterion("GetLandPersonCount =", value, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountNotEqualTo(Integer value) {
            addCriterion("GetLandPersonCount <>", value, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountGreaterThan(Integer value) {
            addCriterion("GetLandPersonCount >", value, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("GetLandPersonCount >=", value, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountLessThan(Integer value) {
            addCriterion("GetLandPersonCount <", value, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountLessThanOrEqualTo(Integer value) {
            addCriterion("GetLandPersonCount <=", value, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountIn(List<Integer> values) {
            addCriterion("GetLandPersonCount in", values, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountNotIn(List<Integer> values) {
            addCriterion("GetLandPersonCount not in", values, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountBetween(Integer value1, Integer value2) {
            addCriterion("GetLandPersonCount between", value1, value2, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andGetlandpersoncountNotBetween(Integer value1, Integer value2) {
            addCriterion("GetLandPersonCount not between", value1, value2, "getlandpersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountIsNull() {
            addCriterion("FamilyPersonCount is null");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountIsNotNull() {
            addCriterion("FamilyPersonCount is not null");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountEqualTo(Integer value) {
            addCriterion("FamilyPersonCount =", value, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountNotEqualTo(Integer value) {
            addCriterion("FamilyPersonCount <>", value, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountGreaterThan(Integer value) {
            addCriterion("FamilyPersonCount >", value, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FamilyPersonCount >=", value, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountLessThan(Integer value) {
            addCriterion("FamilyPersonCount <", value, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountLessThanOrEqualTo(Integer value) {
            addCriterion("FamilyPersonCount <=", value, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountIn(List<Integer> values) {
            addCriterion("FamilyPersonCount in", values, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountNotIn(List<Integer> values) {
            addCriterion("FamilyPersonCount not in", values, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountBetween(Integer value1, Integer value2) {
            addCriterion("FamilyPersonCount between", value1, value2, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andFamilypersoncountNotBetween(Integer value1, Integer value2) {
            addCriterion("FamilyPersonCount not between", value1, value2, "familypersoncount");
            return (Criteria) this;
        }

        public Criteria andSurveydateIsNull() {
            addCriterion("SurveyDate is null");
            return (Criteria) this;
        }

        public Criteria andSurveydateIsNotNull() {
            addCriterion("SurveyDate is not null");
            return (Criteria) this;
        }

        public Criteria andSurveydateEqualTo(Date value) {
            addCriterion("SurveyDate =", value, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateNotEqualTo(Date value) {
            addCriterion("SurveyDate <>", value, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateGreaterThan(Date value) {
            addCriterion("SurveyDate >", value, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateGreaterThanOrEqualTo(Date value) {
            addCriterion("SurveyDate >=", value, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateLessThan(Date value) {
            addCriterion("SurveyDate <", value, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateLessThanOrEqualTo(Date value) {
            addCriterion("SurveyDate <=", value, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateIn(List<Date> values) {
            addCriterion("SurveyDate in", values, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateNotIn(List<Date> values) {
            addCriterion("SurveyDate not in", values, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateBetween(Date value1, Date value2) {
            addCriterion("SurveyDate between", value1, value2, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveydateNotBetween(Date value1, Date value2) {
            addCriterion("SurveyDate not between", value1, value2, "surveydate");
            return (Criteria) this;
        }

        public Criteria andSurveymemoIsNull() {
            addCriterion("SurveyMemo is null");
            return (Criteria) this;
        }

        public Criteria andSurveymemoIsNotNull() {
            addCriterion("SurveyMemo is not null");
            return (Criteria) this;
        }

        public Criteria andSurveymemoEqualTo(String value) {
            addCriterion("SurveyMemo =", value, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoNotEqualTo(String value) {
            addCriterion("SurveyMemo <>", value, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoGreaterThan(String value) {
            addCriterion("SurveyMemo >", value, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoGreaterThanOrEqualTo(String value) {
            addCriterion("SurveyMemo >=", value, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoLessThan(String value) {
            addCriterion("SurveyMemo <", value, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoLessThanOrEqualTo(String value) {
            addCriterion("SurveyMemo <=", value, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoLike(String value) {
            addCriterion("SurveyMemo like", value, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoNotLike(String value) {
            addCriterion("SurveyMemo not like", value, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoIn(List<String> values) {
            addCriterion("SurveyMemo in", values, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoNotIn(List<String> values) {
            addCriterion("SurveyMemo not in", values, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoBetween(String value1, String value2) {
            addCriterion("SurveyMemo between", value1, value2, "surveymemo");
            return (Criteria) this;
        }

        public Criteria andSurveymemoNotBetween(String value1, String value2) {
            addCriterion("SurveyMemo not between", value1, value2, "surveymemo");
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