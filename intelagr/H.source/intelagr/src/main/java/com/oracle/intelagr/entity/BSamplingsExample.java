package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BSamplingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BSamplingsExample() {
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

        public Criteria andCheckcodeIsNull() {
            addCriterion("CheckCode is null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIsNotNull() {
            addCriterion("CheckCode is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcodeEqualTo(String value) {
            addCriterion("CheckCode =", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotEqualTo(String value) {
            addCriterion("CheckCode <>", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThan(String value) {
            addCriterion("CheckCode >", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CheckCode >=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThan(String value) {
            addCriterion("CheckCode <", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLessThanOrEqualTo(String value) {
            addCriterion("CheckCode <=", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeLike(String value) {
            addCriterion("CheckCode like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotLike(String value) {
            addCriterion("CheckCode not like", value, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeIn(List<String> values) {
            addCriterion("CheckCode in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotIn(List<String> values) {
            addCriterion("CheckCode not in", values, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeBetween(String value1, String value2) {
            addCriterion("CheckCode between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andCheckcodeNotBetween(String value1, String value2) {
            addCriterion("CheckCode not between", value1, value2, "checkcode");
            return (Criteria) this;
        }

        public Criteria andSampledateIsNull() {
            addCriterion("SampleDate is null");
            return (Criteria) this;
        }

        public Criteria andSampledateIsNotNull() {
            addCriterion("SampleDate is not null");
            return (Criteria) this;
        }

        public Criteria andSampledateEqualTo(Date value) {
            addCriterion("SampleDate =", value, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateNotEqualTo(Date value) {
            addCriterion("SampleDate <>", value, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateGreaterThan(Date value) {
            addCriterion("SampleDate >", value, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateGreaterThanOrEqualTo(Date value) {
            addCriterion("SampleDate >=", value, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateLessThan(Date value) {
            addCriterion("SampleDate <", value, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateLessThanOrEqualTo(Date value) {
            addCriterion("SampleDate <=", value, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateIn(List<Date> values) {
            addCriterion("SampleDate in", values, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateNotIn(List<Date> values) {
            addCriterion("SampleDate not in", values, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateBetween(Date value1, Date value2) {
            addCriterion("SampleDate between", value1, value2, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSampledateNotBetween(Date value1, Date value2) {
            addCriterion("SampleDate not between", value1, value2, "sampledate");
            return (Criteria) this;
        }

        public Criteria andSamplepersonIsNull() {
            addCriterion("SamplePerson is null");
            return (Criteria) this;
        }

        public Criteria andSamplepersonIsNotNull() {
            addCriterion("SamplePerson is not null");
            return (Criteria) this;
        }

        public Criteria andSamplepersonEqualTo(String value) {
            addCriterion("SamplePerson =", value, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonNotEqualTo(String value) {
            addCriterion("SamplePerson <>", value, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonGreaterThan(String value) {
            addCriterion("SamplePerson >", value, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonGreaterThanOrEqualTo(String value) {
            addCriterion("SamplePerson >=", value, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonLessThan(String value) {
            addCriterion("SamplePerson <", value, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonLessThanOrEqualTo(String value) {
            addCriterion("SamplePerson <=", value, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonLike(String value) {
            addCriterion("SamplePerson like", value, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonNotLike(String value) {
            addCriterion("SamplePerson not like", value, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonIn(List<String> values) {
            addCriterion("SamplePerson in", values, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonNotIn(List<String> values) {
            addCriterion("SamplePerson not in", values, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonBetween(String value1, String value2) {
            addCriterion("SamplePerson between", value1, value2, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andSamplepersonNotBetween(String value1, String value2) {
            addCriterion("SamplePerson not between", value1, value2, "sampleperson");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BatchNo is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BatchNo is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BatchNo =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BatchNo <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BatchNo >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BatchNo >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BatchNo <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BatchNo <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BatchNo like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BatchNo not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BatchNo in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BatchNo not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BatchNo between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BatchNo not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNull() {
            addCriterion("ProductCode is null");
            return (Criteria) this;
        }

        public Criteria andProductcodeIsNotNull() {
            addCriterion("ProductCode is not null");
            return (Criteria) this;
        }

        public Criteria andProductcodeEqualTo(String value) {
            addCriterion("ProductCode =", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotEqualTo(String value) {
            addCriterion("ProductCode <>", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThan(String value) {
            addCriterion("ProductCode >", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ProductCode >=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThan(String value) {
            addCriterion("ProductCode <", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLessThanOrEqualTo(String value) {
            addCriterion("ProductCode <=", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeLike(String value) {
            addCriterion("ProductCode like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotLike(String value) {
            addCriterion("ProductCode not like", value, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeIn(List<String> values) {
            addCriterion("ProductCode in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotIn(List<String> values) {
            addCriterion("ProductCode not in", values, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeBetween(String value1, String value2) {
            addCriterion("ProductCode between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductcodeNotBetween(String value1, String value2) {
            addCriterion("ProductCode not between", value1, value2, "productcode");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNull() {
            addCriterion("ProductNum is null");
            return (Criteria) this;
        }

        public Criteria andProductnumIsNotNull() {
            addCriterion("ProductNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductnumEqualTo(Integer value) {
            addCriterion("ProductNum =", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotEqualTo(Integer value) {
            addCriterion("ProductNum <>", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThan(Integer value) {
            addCriterion("ProductNum >", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ProductNum >=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThan(Integer value) {
            addCriterion("ProductNum <", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumLessThanOrEqualTo(Integer value) {
            addCriterion("ProductNum <=", value, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumIn(List<Integer> values) {
            addCriterion("ProductNum in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotIn(List<Integer> values) {
            addCriterion("ProductNum not in", values, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumBetween(Integer value1, Integer value2) {
            addCriterion("ProductNum between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProductnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ProductNum not between", value1, value2, "productnum");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNull() {
            addCriterion("ProduceDate is null");
            return (Criteria) this;
        }

        public Criteria andProducedateIsNotNull() {
            addCriterion("ProduceDate is not null");
            return (Criteria) this;
        }

        public Criteria andProducedateEqualTo(Date value) {
            addCriterion("ProduceDate =", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotEqualTo(Date value) {
            addCriterion("ProduceDate <>", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThan(Date value) {
            addCriterion("ProduceDate >", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateGreaterThanOrEqualTo(Date value) {
            addCriterion("ProduceDate >=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThan(Date value) {
            addCriterion("ProduceDate <", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateLessThanOrEqualTo(Date value) {
            addCriterion("ProduceDate <=", value, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateIn(List<Date> values) {
            addCriterion("ProduceDate in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotIn(List<Date> values) {
            addCriterion("ProduceDate not in", values, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateBetween(Date value1, Date value2) {
            addCriterion("ProduceDate between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andProducedateNotBetween(Date value1, Date value2) {
            addCriterion("ProduceDate not between", value1, value2, "producedate");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeIsNull() {
            addCriterion("SecurityCode is null");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeIsNotNull() {
            addCriterion("SecurityCode is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeEqualTo(String value) {
            addCriterion("SecurityCode =", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeNotEqualTo(String value) {
            addCriterion("SecurityCode <>", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeGreaterThan(String value) {
            addCriterion("SecurityCode >", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeGreaterThanOrEqualTo(String value) {
            addCriterion("SecurityCode >=", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeLessThan(String value) {
            addCriterion("SecurityCode <", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeLessThanOrEqualTo(String value) {
            addCriterion("SecurityCode <=", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeLike(String value) {
            addCriterion("SecurityCode like", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeNotLike(String value) {
            addCriterion("SecurityCode not like", value, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeIn(List<String> values) {
            addCriterion("SecurityCode in", values, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeNotIn(List<String> values) {
            addCriterion("SecurityCode not in", values, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeBetween(String value1, String value2) {
            addCriterion("SecurityCode between", value1, value2, "securitycode");
            return (Criteria) this;
        }

        public Criteria andSecuritycodeNotBetween(String value1, String value2) {
            addCriterion("SecurityCode not between", value1, value2, "securitycode");
            return (Criteria) this;
        }

        public Criteria andInspectstatusIsNull() {
            addCriterion("InspectStatus is null");
            return (Criteria) this;
        }

        public Criteria andInspectstatusIsNotNull() {
            addCriterion("InspectStatus is not null");
            return (Criteria) this;
        }

        public Criteria andInspectstatusEqualTo(String value) {
            addCriterion("InspectStatus =", value, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusNotEqualTo(String value) {
            addCriterion("InspectStatus <>", value, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusGreaterThan(String value) {
            addCriterion("InspectStatus >", value, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusGreaterThanOrEqualTo(String value) {
            addCriterion("InspectStatus >=", value, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusLessThan(String value) {
            addCriterion("InspectStatus <", value, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusLessThanOrEqualTo(String value) {
            addCriterion("InspectStatus <=", value, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusLike(String value) {
            addCriterion("InspectStatus like", value, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusNotLike(String value) {
            addCriterion("InspectStatus not like", value, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusIn(List<String> values) {
            addCriterion("InspectStatus in", values, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusNotIn(List<String> values) {
            addCriterion("InspectStatus not in", values, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusBetween(String value1, String value2) {
            addCriterion("InspectStatus between", value1, value2, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andInspectstatusNotBetween(String value1, String value2) {
            addCriterion("InspectStatus not between", value1, value2, "inspectstatus");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIsNull() {
            addCriterion("DeliveryPerson is null");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIsNotNull() {
            addCriterion("DeliveryPerson is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonEqualTo(String value) {
            addCriterion("DeliveryPerson =", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotEqualTo(String value) {
            addCriterion("DeliveryPerson <>", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonGreaterThan(String value) {
            addCriterion("DeliveryPerson >", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonGreaterThanOrEqualTo(String value) {
            addCriterion("DeliveryPerson >=", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonLessThan(String value) {
            addCriterion("DeliveryPerson <", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonLessThanOrEqualTo(String value) {
            addCriterion("DeliveryPerson <=", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonLike(String value) {
            addCriterion("DeliveryPerson like", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotLike(String value) {
            addCriterion("DeliveryPerson not like", value, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonIn(List<String> values) {
            addCriterion("DeliveryPerson in", values, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotIn(List<String> values) {
            addCriterion("DeliveryPerson not in", values, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonBetween(String value1, String value2) {
            addCriterion("DeliveryPerson between", value1, value2, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverypersonNotBetween(String value1, String value2) {
            addCriterion("DeliveryPerson not between", value1, value2, "deliveryperson");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("DeliveryDate is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("DeliveryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("DeliveryDate =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("DeliveryDate <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("DeliveryDate >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("DeliveryDate >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("DeliveryDate <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("DeliveryDate <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("DeliveryDate in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("DeliveryDate not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("DeliveryDate between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("DeliveryDate not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andActivationstatusIsNull() {
            addCriterion("ActivationStatus is null");
            return (Criteria) this;
        }

        public Criteria andActivationstatusIsNotNull() {
            addCriterion("ActivationStatus is not null");
            return (Criteria) this;
        }

        public Criteria andActivationstatusEqualTo(String value) {
            addCriterion("ActivationStatus =", value, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusNotEqualTo(String value) {
            addCriterion("ActivationStatus <>", value, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusGreaterThan(String value) {
            addCriterion("ActivationStatus >", value, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ActivationStatus >=", value, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusLessThan(String value) {
            addCriterion("ActivationStatus <", value, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusLessThanOrEqualTo(String value) {
            addCriterion("ActivationStatus <=", value, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusLike(String value) {
            addCriterion("ActivationStatus like", value, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusNotLike(String value) {
            addCriterion("ActivationStatus not like", value, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusIn(List<String> values) {
            addCriterion("ActivationStatus in", values, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusNotIn(List<String> values) {
            addCriterion("ActivationStatus not in", values, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusBetween(String value1, String value2) {
            addCriterion("ActivationStatus between", value1, value2, "activationstatus");
            return (Criteria) this;
        }

        public Criteria andActivationstatusNotBetween(String value1, String value2) {
            addCriterion("ActivationStatus not between", value1, value2, "activationstatus");
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