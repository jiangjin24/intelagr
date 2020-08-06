package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BGenerallandregdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BGenerallandregdExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("HID is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("HID is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("HID =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("HID <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("HID >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("HID >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("HID <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("HID <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("HID in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("HID not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("HID between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("HID not between", value1, value2, "hid");
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

        public Criteria andIdtypeIsNull() {
            addCriterion("IDType is null");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNotNull() {
            addCriterion("IDType is not null");
            return (Criteria) this;
        }

        public Criteria andIdtypeEqualTo(String value) {
            addCriterion("IDType =", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotEqualTo(String value) {
            addCriterion("IDType <>", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThan(String value) {
            addCriterion("IDType >", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDType >=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThan(String value) {
            addCriterion("IDType <", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThanOrEqualTo(String value) {
            addCriterion("IDType <=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLike(String value) {
            addCriterion("IDType like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotLike(String value) {
            addCriterion("IDType not like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeIn(List<String> values) {
            addCriterion("IDType in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotIn(List<String> values) {
            addCriterion("IDType not in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeBetween(String value1, String value2) {
            addCriterion("IDType between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotBetween(String value1, String value2) {
            addCriterion("IDType not between", value1, value2, "idtype");
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

        public Criteria andArchiveacreageIsNull() {
            addCriterion("ArchiveAcreage is null");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageIsNotNull() {
            addCriterion("ArchiveAcreage is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageEqualTo(Float value) {
            addCriterion("ArchiveAcreage =", value, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageNotEqualTo(Float value) {
            addCriterion("ArchiveAcreage <>", value, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageGreaterThan(Float value) {
            addCriterion("ArchiveAcreage >", value, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageGreaterThanOrEqualTo(Float value) {
            addCriterion("ArchiveAcreage >=", value, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageLessThan(Float value) {
            addCriterion("ArchiveAcreage <", value, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageLessThanOrEqualTo(Float value) {
            addCriterion("ArchiveAcreage <=", value, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageIn(List<Float> values) {
            addCriterion("ArchiveAcreage in", values, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageNotIn(List<Float> values) {
            addCriterion("ArchiveAcreage not in", values, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageBetween(Float value1, Float value2) {
            addCriterion("ArchiveAcreage between", value1, value2, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andArchiveacreageNotBetween(Float value1, Float value2) {
            addCriterion("ArchiveAcreage not between", value1, value2, "archiveacreage");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldIsNull() {
            addCriterion("ContractTotalYield is null");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldIsNotNull() {
            addCriterion("ContractTotalYield is not null");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldEqualTo(Float value) {
            addCriterion("ContractTotalYield =", value, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldNotEqualTo(Float value) {
            addCriterion("ContractTotalYield <>", value, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldGreaterThan(Float value) {
            addCriterion("ContractTotalYield >", value, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldGreaterThanOrEqualTo(Float value) {
            addCriterion("ContractTotalYield >=", value, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldLessThan(Float value) {
            addCriterion("ContractTotalYield <", value, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldLessThanOrEqualTo(Float value) {
            addCriterion("ContractTotalYield <=", value, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldIn(List<Float> values) {
            addCriterion("ContractTotalYield in", values, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldNotIn(List<Float> values) {
            addCriterion("ContractTotalYield not in", values, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldBetween(Float value1, Float value2) {
            addCriterion("ContractTotalYield between", value1, value2, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andContracttotalyieldNotBetween(Float value1, Float value2) {
            addCriterion("ContractTotalYield not between", value1, value2, "contracttotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldIsNull() {
            addCriterion("RegisteredTotalYield is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldIsNotNull() {
            addCriterion("RegisteredTotalYield is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldEqualTo(Float value) {
            addCriterion("RegisteredTotalYield =", value, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldNotEqualTo(Float value) {
            addCriterion("RegisteredTotalYield <>", value, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldGreaterThan(Float value) {
            addCriterion("RegisteredTotalYield >", value, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldGreaterThanOrEqualTo(Float value) {
            addCriterion("RegisteredTotalYield >=", value, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldLessThan(Float value) {
            addCriterion("RegisteredTotalYield <", value, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldLessThanOrEqualTo(Float value) {
            addCriterion("RegisteredTotalYield <=", value, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldIn(List<Float> values) {
            addCriterion("RegisteredTotalYield in", values, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldNotIn(List<Float> values) {
            addCriterion("RegisteredTotalYield not in", values, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldBetween(Float value1, Float value2) {
            addCriterion("RegisteredTotalYield between", value1, value2, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalyieldNotBetween(Float value1, Float value2) {
            addCriterion("RegisteredTotalYield not between", value1, value2, "registeredtotalyield");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNull() {
            addCriterion("OperatorName is null");
            return (Criteria) this;
        }

        public Criteria andOperatornameIsNotNull() {
            addCriterion("OperatorName is not null");
            return (Criteria) this;
        }

        public Criteria andOperatornameEqualTo(String value) {
            addCriterion("OperatorName =", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotEqualTo(String value) {
            addCriterion("OperatorName <>", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThan(String value) {
            addCriterion("OperatorName >", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("OperatorName >=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThan(String value) {
            addCriterion("OperatorName <", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLessThanOrEqualTo(String value) {
            addCriterion("OperatorName <=", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameLike(String value) {
            addCriterion("OperatorName like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotLike(String value) {
            addCriterion("OperatorName not like", value, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameIn(List<String> values) {
            addCriterion("OperatorName in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotIn(List<String> values) {
            addCriterion("OperatorName not in", values, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameBetween(String value1, String value2) {
            addCriterion("OperatorName between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatornameNotBetween(String value1, String value2) {
            addCriterion("OperatorName not between", value1, value2, "operatorname");
            return (Criteria) this;
        }

        public Criteria andOperatordateIsNull() {
            addCriterion("OperatorDate is null");
            return (Criteria) this;
        }

        public Criteria andOperatordateIsNotNull() {
            addCriterion("OperatorDate is not null");
            return (Criteria) this;
        }

        public Criteria andOperatordateEqualTo(Date value) {
            addCriterion("OperatorDate =", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateNotEqualTo(Date value) {
            addCriterion("OperatorDate <>", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateGreaterThan(Date value) {
            addCriterion("OperatorDate >", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateGreaterThanOrEqualTo(Date value) {
            addCriterion("OperatorDate >=", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateLessThan(Date value) {
            addCriterion("OperatorDate <", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateLessThanOrEqualTo(Date value) {
            addCriterion("OperatorDate <=", value, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateIn(List<Date> values) {
            addCriterion("OperatorDate in", values, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateNotIn(List<Date> values) {
            addCriterion("OperatorDate not in", values, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateBetween(Date value1, Date value2) {
            addCriterion("OperatorDate between", value1, value2, "operatordate");
            return (Criteria) this;
        }

        public Criteria andOperatordateNotBetween(Date value1, Date value2) {
            addCriterion("OperatorDate not between", value1, value2, "operatordate");
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