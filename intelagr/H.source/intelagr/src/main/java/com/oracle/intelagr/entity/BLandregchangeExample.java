package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BLandregchangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BLandregchangeExample() {
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

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("Year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("Year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNull() {
            addCriterion("CompanyCode is null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNotNull() {
            addCriterion("CompanyCode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeEqualTo(String value) {
            addCriterion("CompanyCode =", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotEqualTo(String value) {
            addCriterion("CompanyCode <>", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThan(String value) {
            addCriterion("CompanyCode >", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyCode >=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThan(String value) {
            addCriterion("CompanyCode <", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThanOrEqualTo(String value) {
            addCriterion("CompanyCode <=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLike(String value) {
            addCriterion("CompanyCode like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotLike(String value) {
            addCriterion("CompanyCode not like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIn(List<String> values) {
            addCriterion("CompanyCode in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotIn(List<String> values) {
            addCriterion("CompanyCode not in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeBetween(String value1, String value2) {
            addCriterion("CompanyCode between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotBetween(String value1, String value2) {
            addCriterion("CompanyCode not between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("CompanyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("CompanyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("CompanyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("CompanyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("CompanyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("CompanyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("CompanyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("CompanyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("CompanyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("CompanyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("CompanyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("CompanyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("CompanyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("CompanyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoIsNull() {
            addCriterion("ApplyBatchNo is null");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoIsNotNull() {
            addCriterion("ApplyBatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoEqualTo(String value) {
            addCriterion("ApplyBatchNo =", value, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoNotEqualTo(String value) {
            addCriterion("ApplyBatchNo <>", value, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoGreaterThan(String value) {
            addCriterion("ApplyBatchNo >", value, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("ApplyBatchNo >=", value, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoLessThan(String value) {
            addCriterion("ApplyBatchNo <", value, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoLessThanOrEqualTo(String value) {
            addCriterion("ApplyBatchNo <=", value, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoLike(String value) {
            addCriterion("ApplyBatchNo like", value, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoNotLike(String value) {
            addCriterion("ApplyBatchNo not like", value, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoIn(List<String> values) {
            addCriterion("ApplyBatchNo in", values, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoNotIn(List<String> values) {
            addCriterion("ApplyBatchNo not in", values, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoBetween(String value1, String value2) {
            addCriterion("ApplyBatchNo between", value1, value2, "applybatchno");
            return (Criteria) this;
        }

        public Criteria andApplybatchnoNotBetween(String value1, String value2) {
            addCriterion("ApplyBatchNo not between", value1, value2, "applybatchno");
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

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeIsNull() {
            addCriterion("GeneRegistType is null");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeIsNotNull() {
            addCriterion("GeneRegistType is not null");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeEqualTo(String value) {
            addCriterion("GeneRegistType =", value, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeNotEqualTo(String value) {
            addCriterion("GeneRegistType <>", value, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeGreaterThan(String value) {
            addCriterion("GeneRegistType >", value, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeGreaterThanOrEqualTo(String value) {
            addCriterion("GeneRegistType >=", value, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeLessThan(String value) {
            addCriterion("GeneRegistType <", value, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeLessThanOrEqualTo(String value) {
            addCriterion("GeneRegistType <=", value, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeLike(String value) {
            addCriterion("GeneRegistType like", value, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeNotLike(String value) {
            addCriterion("GeneRegistType not like", value, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeIn(List<String> values) {
            addCriterion("GeneRegistType in", values, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeNotIn(List<String> values) {
            addCriterion("GeneRegistType not in", values, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeBetween(String value1, String value2) {
            addCriterion("GeneRegistType between", value1, value2, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andGeneregisttypeNotBetween(String value1, String value2) {
            addCriterion("GeneRegistType not between", value1, value2, "generegisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeIsNull() {
            addCriterion("SpecRegistType is null");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeIsNotNull() {
            addCriterion("SpecRegistType is not null");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeEqualTo(String value) {
            addCriterion("SpecRegistType =", value, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeNotEqualTo(String value) {
            addCriterion("SpecRegistType <>", value, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeGreaterThan(String value) {
            addCriterion("SpecRegistType >", value, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeGreaterThanOrEqualTo(String value) {
            addCriterion("SpecRegistType >=", value, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeLessThan(String value) {
            addCriterion("SpecRegistType <", value, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeLessThanOrEqualTo(String value) {
            addCriterion("SpecRegistType <=", value, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeLike(String value) {
            addCriterion("SpecRegistType like", value, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeNotLike(String value) {
            addCriterion("SpecRegistType not like", value, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeIn(List<String> values) {
            addCriterion("SpecRegistType in", values, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeNotIn(List<String> values) {
            addCriterion("SpecRegistType not in", values, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeBetween(String value1, String value2) {
            addCriterion("SpecRegistType between", value1, value2, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andSpecregisttypeNotBetween(String value1, String value2) {
            addCriterion("SpecRegistType not between", value1, value2, "specregisttype");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("Applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("Applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("Applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("Applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("Applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("Applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("Applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("Applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("Applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("Applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("Applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("Applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("Applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("Applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantdateIsNull() {
            addCriterion("ApplicantDate is null");
            return (Criteria) this;
        }

        public Criteria andApplicantdateIsNotNull() {
            addCriterion("ApplicantDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantdateEqualTo(Date value) {
            addCriterion("ApplicantDate =", value, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateNotEqualTo(Date value) {
            addCriterion("ApplicantDate <>", value, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateGreaterThan(Date value) {
            addCriterion("ApplicantDate >", value, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ApplicantDate >=", value, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateLessThan(Date value) {
            addCriterion("ApplicantDate <", value, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateLessThanOrEqualTo(Date value) {
            addCriterion("ApplicantDate <=", value, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateIn(List<Date> values) {
            addCriterion("ApplicantDate in", values, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateNotIn(List<Date> values) {
            addCriterion("ApplicantDate not in", values, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateBetween(Date value1, Date value2) {
            addCriterion("ApplicantDate between", value1, value2, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicantdateNotBetween(Date value1, Date value2) {
            addCriterion("ApplicantDate not between", value1, value2, "applicantdate");
            return (Criteria) this;
        }

        public Criteria andApplicanttelIsNull() {
            addCriterion("ApplicantTel is null");
            return (Criteria) this;
        }

        public Criteria andApplicanttelIsNotNull() {
            addCriterion("ApplicantTel is not null");
            return (Criteria) this;
        }

        public Criteria andApplicanttelEqualTo(String value) {
            addCriterion("ApplicantTel =", value, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelNotEqualTo(String value) {
            addCriterion("ApplicantTel <>", value, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelGreaterThan(String value) {
            addCriterion("ApplicantTel >", value, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelGreaterThanOrEqualTo(String value) {
            addCriterion("ApplicantTel >=", value, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelLessThan(String value) {
            addCriterion("ApplicantTel <", value, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelLessThanOrEqualTo(String value) {
            addCriterion("ApplicantTel <=", value, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelLike(String value) {
            addCriterion("ApplicantTel like", value, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelNotLike(String value) {
            addCriterion("ApplicantTel not like", value, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelIn(List<String> values) {
            addCriterion("ApplicantTel in", values, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelNotIn(List<String> values) {
            addCriterion("ApplicantTel not in", values, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelBetween(String value1, String value2) {
            addCriterion("ApplicantTel between", value1, value2, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andApplicanttelNotBetween(String value1, String value2) {
            addCriterion("ApplicantTel not between", value1, value2, "applicanttel");
            return (Criteria) this;
        }

        public Criteria andChangereasonIsNull() {
            addCriterion("ChangeReason is null");
            return (Criteria) this;
        }

        public Criteria andChangereasonIsNotNull() {
            addCriterion("ChangeReason is not null");
            return (Criteria) this;
        }

        public Criteria andChangereasonEqualTo(String value) {
            addCriterion("ChangeReason =", value, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonNotEqualTo(String value) {
            addCriterion("ChangeReason <>", value, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonGreaterThan(String value) {
            addCriterion("ChangeReason >", value, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonGreaterThanOrEqualTo(String value) {
            addCriterion("ChangeReason >=", value, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonLessThan(String value) {
            addCriterion("ChangeReason <", value, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonLessThanOrEqualTo(String value) {
            addCriterion("ChangeReason <=", value, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonLike(String value) {
            addCriterion("ChangeReason like", value, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonNotLike(String value) {
            addCriterion("ChangeReason not like", value, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonIn(List<String> values) {
            addCriterion("ChangeReason in", values, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonNotIn(List<String> values) {
            addCriterion("ChangeReason not in", values, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonBetween(String value1, String value2) {
            addCriterion("ChangeReason between", value1, value2, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangereasonNotBetween(String value1, String value2) {
            addCriterion("ChangeReason not between", value1, value2, "changereason");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusIsNull() {
            addCriterion("ChangeRegistStatus is null");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusIsNotNull() {
            addCriterion("ChangeRegistStatus is not null");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusEqualTo(String value) {
            addCriterion("ChangeRegistStatus =", value, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusNotEqualTo(String value) {
            addCriterion("ChangeRegistStatus <>", value, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusGreaterThan(String value) {
            addCriterion("ChangeRegistStatus >", value, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusGreaterThanOrEqualTo(String value) {
            addCriterion("ChangeRegistStatus >=", value, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusLessThan(String value) {
            addCriterion("ChangeRegistStatus <", value, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusLessThanOrEqualTo(String value) {
            addCriterion("ChangeRegistStatus <=", value, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusLike(String value) {
            addCriterion("ChangeRegistStatus like", value, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusNotLike(String value) {
            addCriterion("ChangeRegistStatus not like", value, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusIn(List<String> values) {
            addCriterion("ChangeRegistStatus in", values, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusNotIn(List<String> values) {
            addCriterion("ChangeRegistStatus not in", values, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusBetween(String value1, String value2) {
            addCriterion("ChangeRegistStatus between", value1, value2, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andChangeregiststatusNotBetween(String value1, String value2) {
            addCriterion("ChangeRegistStatus not between", value1, value2, "changeregiststatus");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("Auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("Auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("Auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("Auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("Auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("Auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("Auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("Auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("Auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("Auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("Auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("Auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("Auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("Auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNull() {
            addCriterion("AuditDate is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("AuditDate is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(Date value) {
            addCriterion("AuditDate =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(Date value) {
            addCriterion("AuditDate <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(Date value) {
            addCriterion("AuditDate >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(Date value) {
            addCriterion("AuditDate >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(Date value) {
            addCriterion("AuditDate <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(Date value) {
            addCriterion("AuditDate <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<Date> values) {
            addCriterion("AuditDate in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<Date> values) {
            addCriterion("AuditDate not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(Date value1, Date value2) {
            addCriterion("AuditDate between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(Date value1, Date value2) {
            addCriterion("AuditDate not between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("Status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("Status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIsNull() {
            addCriterion("RejectReason is null");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIsNotNull() {
            addCriterion("RejectReason is not null");
            return (Criteria) this;
        }

        public Criteria andRejectreasonEqualTo(String value) {
            addCriterion("RejectReason =", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotEqualTo(String value) {
            addCriterion("RejectReason <>", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThan(String value) {
            addCriterion("RejectReason >", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonGreaterThanOrEqualTo(String value) {
            addCriterion("RejectReason >=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThan(String value) {
            addCriterion("RejectReason <", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLessThanOrEqualTo(String value) {
            addCriterion("RejectReason <=", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonLike(String value) {
            addCriterion("RejectReason like", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotLike(String value) {
            addCriterion("RejectReason not like", value, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonIn(List<String> values) {
            addCriterion("RejectReason in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotIn(List<String> values) {
            addCriterion("RejectReason not in", values, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonBetween(String value1, String value2) {
            addCriterion("RejectReason between", value1, value2, "rejectreason");
            return (Criteria) this;
        }

        public Criteria andRejectreasonNotBetween(String value1, String value2) {
            addCriterion("RejectReason not between", value1, value2, "rejectreason");
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