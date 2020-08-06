package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BBlacklistmanagehExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BBlacklistmanagehExample() {
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

        public Criteria andBlacklistcountIsNull() {
            addCriterion("BlackListCount is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountIsNotNull() {
            addCriterion("BlackListCount is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountEqualTo(Integer value) {
            addCriterion("BlackListCount =", value, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountNotEqualTo(Integer value) {
            addCriterion("BlackListCount <>", value, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountGreaterThan(Integer value) {
            addCriterion("BlackListCount >", value, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("BlackListCount >=", value, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountLessThan(Integer value) {
            addCriterion("BlackListCount <", value, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountLessThanOrEqualTo(Integer value) {
            addCriterion("BlackListCount <=", value, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountIn(List<Integer> values) {
            addCriterion("BlackListCount in", values, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountNotIn(List<Integer> values) {
            addCriterion("BlackListCount not in", values, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountBetween(Integer value1, Integer value2) {
            addCriterion("BlackListCount between", value1, value2, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistcountNotBetween(Integer value1, Integer value2) {
            addCriterion("BlackListCount not between", value1, value2, "blacklistcount");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateIsNull() {
            addCriterion("BlackListEndDate is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateIsNotNull() {
            addCriterion("BlackListEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateEqualTo(Date value) {
            addCriterion("BlackListEndDate =", value, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateNotEqualTo(Date value) {
            addCriterion("BlackListEndDate <>", value, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateGreaterThan(Date value) {
            addCriterion("BlackListEndDate >", value, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("BlackListEndDate >=", value, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateLessThan(Date value) {
            addCriterion("BlackListEndDate <", value, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateLessThanOrEqualTo(Date value) {
            addCriterion("BlackListEndDate <=", value, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateIn(List<Date> values) {
            addCriterion("BlackListEndDate in", values, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateNotIn(List<Date> values) {
            addCriterion("BlackListEndDate not in", values, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateBetween(Date value1, Date value2) {
            addCriterion("BlackListEndDate between", value1, value2, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andBlacklistenddateNotBetween(Date value1, Date value2) {
            addCriterion("BlackListEndDate not between", value1, value2, "blacklistenddate");
            return (Criteria) this;
        }

        public Criteria andProcessorIsNull() {
            addCriterion("Processor is null");
            return (Criteria) this;
        }

        public Criteria andProcessorIsNotNull() {
            addCriterion("Processor is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorEqualTo(String value) {
            addCriterion("Processor =", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotEqualTo(String value) {
            addCriterion("Processor <>", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorGreaterThan(String value) {
            addCriterion("Processor >", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorGreaterThanOrEqualTo(String value) {
            addCriterion("Processor >=", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorLessThan(String value) {
            addCriterion("Processor <", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorLessThanOrEqualTo(String value) {
            addCriterion("Processor <=", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorLike(String value) {
            addCriterion("Processor like", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotLike(String value) {
            addCriterion("Processor not like", value, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorIn(List<String> values) {
            addCriterion("Processor in", values, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotIn(List<String> values) {
            addCriterion("Processor not in", values, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorBetween(String value1, String value2) {
            addCriterion("Processor between", value1, value2, "processor");
            return (Criteria) this;
        }

        public Criteria andProcessorNotBetween(String value1, String value2) {
            addCriterion("Processor not between", value1, value2, "processor");
            return (Criteria) this;
        }

        public Criteria andSettledateIsNull() {
            addCriterion("SettleDate is null");
            return (Criteria) this;
        }

        public Criteria andSettledateIsNotNull() {
            addCriterion("SettleDate is not null");
            return (Criteria) this;
        }

        public Criteria andSettledateEqualTo(Date value) {
            addCriterion("SettleDate =", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotEqualTo(Date value) {
            addCriterion("SettleDate <>", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateGreaterThan(Date value) {
            addCriterion("SettleDate >", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateGreaterThanOrEqualTo(Date value) {
            addCriterion("SettleDate >=", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateLessThan(Date value) {
            addCriterion("SettleDate <", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateLessThanOrEqualTo(Date value) {
            addCriterion("SettleDate <=", value, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateIn(List<Date> values) {
            addCriterion("SettleDate in", values, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotIn(List<Date> values) {
            addCriterion("SettleDate not in", values, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateBetween(Date value1, Date value2) {
            addCriterion("SettleDate between", value1, value2, "settledate");
            return (Criteria) this;
        }

        public Criteria andSettledateNotBetween(Date value1, Date value2) {
            addCriterion("SettleDate not between", value1, value2, "settledate");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitIsNull() {
            addCriterion("BlackListTimeLimit is null");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitIsNotNull() {
            addCriterion("BlackListTimeLimit is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitEqualTo(String value) {
            addCriterion("BlackListTimeLimit =", value, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitNotEqualTo(String value) {
            addCriterion("BlackListTimeLimit <>", value, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitGreaterThan(String value) {
            addCriterion("BlackListTimeLimit >", value, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitGreaterThanOrEqualTo(String value) {
            addCriterion("BlackListTimeLimit >=", value, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitLessThan(String value) {
            addCriterion("BlackListTimeLimit <", value, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitLessThanOrEqualTo(String value) {
            addCriterion("BlackListTimeLimit <=", value, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitLike(String value) {
            addCriterion("BlackListTimeLimit like", value, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitNotLike(String value) {
            addCriterion("BlackListTimeLimit not like", value, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitIn(List<String> values) {
            addCriterion("BlackListTimeLimit in", values, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitNotIn(List<String> values) {
            addCriterion("BlackListTimeLimit not in", values, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitBetween(String value1, String value2) {
            addCriterion("BlackListTimeLimit between", value1, value2, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklisttimelimitNotBetween(String value1, String value2) {
            addCriterion("BlackListTimeLimit not between", value1, value2, "blacklisttimelimit");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonIsNull() {
            addCriterion("BlackListReason is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonIsNotNull() {
            addCriterion("BlackListReason is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonEqualTo(String value) {
            addCriterion("BlackListReason =", value, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonNotEqualTo(String value) {
            addCriterion("BlackListReason <>", value, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonGreaterThan(String value) {
            addCriterion("BlackListReason >", value, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonGreaterThanOrEqualTo(String value) {
            addCriterion("BlackListReason >=", value, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonLessThan(String value) {
            addCriterion("BlackListReason <", value, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonLessThanOrEqualTo(String value) {
            addCriterion("BlackListReason <=", value, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonLike(String value) {
            addCriterion("BlackListReason like", value, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonNotLike(String value) {
            addCriterion("BlackListReason not like", value, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonIn(List<String> values) {
            addCriterion("BlackListReason in", values, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonNotIn(List<String> values) {
            addCriterion("BlackListReason not in", values, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonBetween(String value1, String value2) {
            addCriterion("BlackListReason between", value1, value2, "blacklistreason");
            return (Criteria) this;
        }

        public Criteria andBlacklistreasonNotBetween(String value1, String value2) {
            addCriterion("BlackListReason not between", value1, value2, "blacklistreason");
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