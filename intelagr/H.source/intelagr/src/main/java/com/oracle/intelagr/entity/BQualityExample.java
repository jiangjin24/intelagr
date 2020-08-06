package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BQualityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BQualityExample() {
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

        public Criteria andInspectdateIsNull() {
            addCriterion("InspectDate is null");
            return (Criteria) this;
        }

        public Criteria andInspectdateIsNotNull() {
            addCriterion("InspectDate is not null");
            return (Criteria) this;
        }

        public Criteria andInspectdateEqualTo(Date value) {
            addCriterion("InspectDate =", value, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateNotEqualTo(Date value) {
            addCriterion("InspectDate <>", value, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateGreaterThan(Date value) {
            addCriterion("InspectDate >", value, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateGreaterThanOrEqualTo(Date value) {
            addCriterion("InspectDate >=", value, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateLessThan(Date value) {
            addCriterion("InspectDate <", value, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateLessThanOrEqualTo(Date value) {
            addCriterion("InspectDate <=", value, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateIn(List<Date> values) {
            addCriterion("InspectDate in", values, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateNotIn(List<Date> values) {
            addCriterion("InspectDate not in", values, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateBetween(Date value1, Date value2) {
            addCriterion("InspectDate between", value1, value2, "inspectdate");
            return (Criteria) this;
        }

        public Criteria andInspectdateNotBetween(Date value1, Date value2) {
            addCriterion("InspectDate not between", value1, value2, "inspectdate");
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

        public Criteria andHandoverpersonIsNull() {
            addCriterion("HandoverPerson is null");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonIsNotNull() {
            addCriterion("HandoverPerson is not null");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonEqualTo(String value) {
            addCriterion("HandoverPerson =", value, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonNotEqualTo(String value) {
            addCriterion("HandoverPerson <>", value, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonGreaterThan(String value) {
            addCriterion("HandoverPerson >", value, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonGreaterThanOrEqualTo(String value) {
            addCriterion("HandoverPerson >=", value, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonLessThan(String value) {
            addCriterion("HandoverPerson <", value, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonLessThanOrEqualTo(String value) {
            addCriterion("HandoverPerson <=", value, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonLike(String value) {
            addCriterion("HandoverPerson like", value, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonNotLike(String value) {
            addCriterion("HandoverPerson not like", value, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonIn(List<String> values) {
            addCriterion("HandoverPerson in", values, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonNotIn(List<String> values) {
            addCriterion("HandoverPerson not in", values, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonBetween(String value1, String value2) {
            addCriterion("HandoverPerson between", value1, value2, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandoverpersonNotBetween(String value1, String value2) {
            addCriterion("HandoverPerson not between", value1, value2, "handoverperson");
            return (Criteria) this;
        }

        public Criteria andHandovertimeIsNull() {
            addCriterion("HandoverTime is null");
            return (Criteria) this;
        }

        public Criteria andHandovertimeIsNotNull() {
            addCriterion("HandoverTime is not null");
            return (Criteria) this;
        }

        public Criteria andHandovertimeEqualTo(Date value) {
            addCriterion("HandoverTime =", value, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeNotEqualTo(Date value) {
            addCriterion("HandoverTime <>", value, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeGreaterThan(Date value) {
            addCriterion("HandoverTime >", value, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("HandoverTime >=", value, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeLessThan(Date value) {
            addCriterion("HandoverTime <", value, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeLessThanOrEqualTo(Date value) {
            addCriterion("HandoverTime <=", value, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeIn(List<Date> values) {
            addCriterion("HandoverTime in", values, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeNotIn(List<Date> values) {
            addCriterion("HandoverTime not in", values, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeBetween(Date value1, Date value2) {
            addCriterion("HandoverTime between", value1, value2, "handovertime");
            return (Criteria) this;
        }

        public Criteria andHandovertimeNotBetween(Date value1, Date value2) {
            addCriterion("HandoverTime not between", value1, value2, "handovertime");
            return (Criteria) this;
        }

        public Criteria andInspectpersonIsNull() {
            addCriterion("InspectPerson is null");
            return (Criteria) this;
        }

        public Criteria andInspectpersonIsNotNull() {
            addCriterion("InspectPerson is not null");
            return (Criteria) this;
        }

        public Criteria andInspectpersonEqualTo(String value) {
            addCriterion("InspectPerson =", value, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonNotEqualTo(String value) {
            addCriterion("InspectPerson <>", value, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonGreaterThan(String value) {
            addCriterion("InspectPerson >", value, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonGreaterThanOrEqualTo(String value) {
            addCriterion("InspectPerson >=", value, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonLessThan(String value) {
            addCriterion("InspectPerson <", value, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonLessThanOrEqualTo(String value) {
            addCriterion("InspectPerson <=", value, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonLike(String value) {
            addCriterion("InspectPerson like", value, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonNotLike(String value) {
            addCriterion("InspectPerson not like", value, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonIn(List<String> values) {
            addCriterion("InspectPerson in", values, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonNotIn(List<String> values) {
            addCriterion("InspectPerson not in", values, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonBetween(String value1, String value2) {
            addCriterion("InspectPerson between", value1, value2, "inspectperson");
            return (Criteria) this;
        }

        public Criteria andInspectpersonNotBetween(String value1, String value2) {
            addCriterion("InspectPerson not between", value1, value2, "inspectperson");
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

        public Criteria andPathIsNull() {
            addCriterion("Path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("Path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("Path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("Path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("Path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("Path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("Path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("Path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("Path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("Path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("Path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("Path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("Path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("Path not between", value1, value2, "path");
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