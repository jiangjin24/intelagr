package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BSeedcomplaintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BSeedcomplaintExample() {
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

        public Criteria andComplaintdateIsNull() {
            addCriterion("ComplaintDate is null");
            return (Criteria) this;
        }

        public Criteria andComplaintdateIsNotNull() {
            addCriterion("ComplaintDate is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintdateEqualTo(Date value) {
            addCriterion("ComplaintDate =", value, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateNotEqualTo(Date value) {
            addCriterion("ComplaintDate <>", value, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateGreaterThan(Date value) {
            addCriterion("ComplaintDate >", value, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateGreaterThanOrEqualTo(Date value) {
            addCriterion("ComplaintDate >=", value, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateLessThan(Date value) {
            addCriterion("ComplaintDate <", value, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateLessThanOrEqualTo(Date value) {
            addCriterion("ComplaintDate <=", value, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateIn(List<Date> values) {
            addCriterion("ComplaintDate in", values, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateNotIn(List<Date> values) {
            addCriterion("ComplaintDate not in", values, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateBetween(Date value1, Date value2) {
            addCriterion("ComplaintDate between", value1, value2, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andComplaintdateNotBetween(Date value1, Date value2) {
            addCriterion("ComplaintDate not between", value1, value2, "complaintdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateIsNull() {
            addCriterion("BuySeedsDate is null");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateIsNotNull() {
            addCriterion("BuySeedsDate is not null");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateEqualTo(Date value) {
            addCriterion("BuySeedsDate =", value, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateNotEqualTo(Date value) {
            addCriterion("BuySeedsDate <>", value, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateGreaterThan(Date value) {
            addCriterion("BuySeedsDate >", value, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateGreaterThanOrEqualTo(Date value) {
            addCriterion("BuySeedsDate >=", value, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateLessThan(Date value) {
            addCriterion("BuySeedsDate <", value, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateLessThanOrEqualTo(Date value) {
            addCriterion("BuySeedsDate <=", value, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateIn(List<Date> values) {
            addCriterion("BuySeedsDate in", values, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateNotIn(List<Date> values) {
            addCriterion("BuySeedsDate not in", values, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateBetween(Date value1, Date value2) {
            addCriterion("BuySeedsDate between", value1, value2, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andBuyseedsdateNotBetween(Date value1, Date value2) {
            addCriterion("BuySeedsDate not between", value1, value2, "buyseedsdate");
            return (Criteria) this;
        }

        public Criteria andComplainantIsNull() {
            addCriterion("Complainant is null");
            return (Criteria) this;
        }

        public Criteria andComplainantIsNotNull() {
            addCriterion("Complainant is not null");
            return (Criteria) this;
        }

        public Criteria andComplainantEqualTo(String value) {
            addCriterion("Complainant =", value, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantNotEqualTo(String value) {
            addCriterion("Complainant <>", value, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantGreaterThan(String value) {
            addCriterion("Complainant >", value, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantGreaterThanOrEqualTo(String value) {
            addCriterion("Complainant >=", value, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantLessThan(String value) {
            addCriterion("Complainant <", value, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantLessThanOrEqualTo(String value) {
            addCriterion("Complainant <=", value, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantLike(String value) {
            addCriterion("Complainant like", value, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantNotLike(String value) {
            addCriterion("Complainant not like", value, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantIn(List<String> values) {
            addCriterion("Complainant in", values, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantNotIn(List<String> values) {
            addCriterion("Complainant not in", values, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantBetween(String value1, String value2) {
            addCriterion("Complainant between", value1, value2, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantNotBetween(String value1, String value2) {
            addCriterion("Complainant not between", value1, value2, "complainant");
            return (Criteria) this;
        }

        public Criteria andComplainantsexIsNull() {
            addCriterion("ComplainantSex is null");
            return (Criteria) this;
        }

        public Criteria andComplainantsexIsNotNull() {
            addCriterion("ComplainantSex is not null");
            return (Criteria) this;
        }

        public Criteria andComplainantsexEqualTo(String value) {
            addCriterion("ComplainantSex =", value, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexNotEqualTo(String value) {
            addCriterion("ComplainantSex <>", value, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexGreaterThan(String value) {
            addCriterion("ComplainantSex >", value, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexGreaterThanOrEqualTo(String value) {
            addCriterion("ComplainantSex >=", value, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexLessThan(String value) {
            addCriterion("ComplainantSex <", value, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexLessThanOrEqualTo(String value) {
            addCriterion("ComplainantSex <=", value, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexLike(String value) {
            addCriterion("ComplainantSex like", value, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexNotLike(String value) {
            addCriterion("ComplainantSex not like", value, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexIn(List<String> values) {
            addCriterion("ComplainantSex in", values, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexNotIn(List<String> values) {
            addCriterion("ComplainantSex not in", values, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexBetween(String value1, String value2) {
            addCriterion("ComplainantSex between", value1, value2, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainantsexNotBetween(String value1, String value2) {
            addCriterion("ComplainantSex not between", value1, value2, "complainantsex");
            return (Criteria) this;
        }

        public Criteria andComplainanttelIsNull() {
            addCriterion("ComplainantTel is null");
            return (Criteria) this;
        }

        public Criteria andComplainanttelIsNotNull() {
            addCriterion("ComplainantTel is not null");
            return (Criteria) this;
        }

        public Criteria andComplainanttelEqualTo(String value) {
            addCriterion("ComplainantTel =", value, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelNotEqualTo(String value) {
            addCriterion("ComplainantTel <>", value, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelGreaterThan(String value) {
            addCriterion("ComplainantTel >", value, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelGreaterThanOrEqualTo(String value) {
            addCriterion("ComplainantTel >=", value, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelLessThan(String value) {
            addCriterion("ComplainantTel <", value, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelLessThanOrEqualTo(String value) {
            addCriterion("ComplainantTel <=", value, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelLike(String value) {
            addCriterion("ComplainantTel like", value, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelNotLike(String value) {
            addCriterion("ComplainantTel not like", value, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelIn(List<String> values) {
            addCriterion("ComplainantTel in", values, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelNotIn(List<String> values) {
            addCriterion("ComplainantTel not in", values, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelBetween(String value1, String value2) {
            addCriterion("ComplainantTel between", value1, value2, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainanttelNotBetween(String value1, String value2) {
            addCriterion("ComplainantTel not between", value1, value2, "complainanttel");
            return (Criteria) this;
        }

        public Criteria andComplainantmailIsNull() {
            addCriterion("ComplainantMail is null");
            return (Criteria) this;
        }

        public Criteria andComplainantmailIsNotNull() {
            addCriterion("ComplainantMail is not null");
            return (Criteria) this;
        }

        public Criteria andComplainantmailEqualTo(String value) {
            addCriterion("ComplainantMail =", value, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailNotEqualTo(String value) {
            addCriterion("ComplainantMail <>", value, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailGreaterThan(String value) {
            addCriterion("ComplainantMail >", value, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailGreaterThanOrEqualTo(String value) {
            addCriterion("ComplainantMail >=", value, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailLessThan(String value) {
            addCriterion("ComplainantMail <", value, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailLessThanOrEqualTo(String value) {
            addCriterion("ComplainantMail <=", value, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailLike(String value) {
            addCriterion("ComplainantMail like", value, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailNotLike(String value) {
            addCriterion("ComplainantMail not like", value, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailIn(List<String> values) {
            addCriterion("ComplainantMail in", values, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailNotIn(List<String> values) {
            addCriterion("ComplainantMail not in", values, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailBetween(String value1, String value2) {
            addCriterion("ComplainantMail between", value1, value2, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplainantmailNotBetween(String value1, String value2) {
            addCriterion("ComplainantMail not between", value1, value2, "complainantmail");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentIsNull() {
            addCriterion("ComplaintContent is null");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentIsNotNull() {
            addCriterion("ComplaintContent is not null");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentEqualTo(String value) {
            addCriterion("ComplaintContent =", value, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentNotEqualTo(String value) {
            addCriterion("ComplaintContent <>", value, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentGreaterThan(String value) {
            addCriterion("ComplaintContent >", value, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ComplaintContent >=", value, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentLessThan(String value) {
            addCriterion("ComplaintContent <", value, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentLessThanOrEqualTo(String value) {
            addCriterion("ComplaintContent <=", value, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentLike(String value) {
            addCriterion("ComplaintContent like", value, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentNotLike(String value) {
            addCriterion("ComplaintContent not like", value, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentIn(List<String> values) {
            addCriterion("ComplaintContent in", values, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentNotIn(List<String> values) {
            addCriterion("ComplaintContent not in", values, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentBetween(String value1, String value2) {
            addCriterion("ComplaintContent between", value1, value2, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andComplaintcontentNotBetween(String value1, String value2) {
            addCriterion("ComplaintContent not between", value1, value2, "complaintcontent");
            return (Criteria) this;
        }

        public Criteria andSettlestatusIsNull() {
            addCriterion("SettleStatus is null");
            return (Criteria) this;
        }

        public Criteria andSettlestatusIsNotNull() {
            addCriterion("SettleStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSettlestatusEqualTo(String value) {
            addCriterion("SettleStatus =", value, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusNotEqualTo(String value) {
            addCriterion("SettleStatus <>", value, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusGreaterThan(String value) {
            addCriterion("SettleStatus >", value, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusGreaterThanOrEqualTo(String value) {
            addCriterion("SettleStatus >=", value, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusLessThan(String value) {
            addCriterion("SettleStatus <", value, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusLessThanOrEqualTo(String value) {
            addCriterion("SettleStatus <=", value, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusLike(String value) {
            addCriterion("SettleStatus like", value, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusNotLike(String value) {
            addCriterion("SettleStatus not like", value, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusIn(List<String> values) {
            addCriterion("SettleStatus in", values, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusNotIn(List<String> values) {
            addCriterion("SettleStatus not in", values, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusBetween(String value1, String value2) {
            addCriterion("SettleStatus between", value1, value2, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andSettlestatusNotBetween(String value1, String value2) {
            addCriterion("SettleStatus not between", value1, value2, "settlestatus");
            return (Criteria) this;
        }

        public Criteria andProcessmodeIsNull() {
            addCriterion("ProcessMode is null");
            return (Criteria) this;
        }

        public Criteria andProcessmodeIsNotNull() {
            addCriterion("ProcessMode is not null");
            return (Criteria) this;
        }

        public Criteria andProcessmodeEqualTo(String value) {
            addCriterion("ProcessMode =", value, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeNotEqualTo(String value) {
            addCriterion("ProcessMode <>", value, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeGreaterThan(String value) {
            addCriterion("ProcessMode >", value, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeGreaterThanOrEqualTo(String value) {
            addCriterion("ProcessMode >=", value, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeLessThan(String value) {
            addCriterion("ProcessMode <", value, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeLessThanOrEqualTo(String value) {
            addCriterion("ProcessMode <=", value, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeLike(String value) {
            addCriterion("ProcessMode like", value, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeNotLike(String value) {
            addCriterion("ProcessMode not like", value, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeIn(List<String> values) {
            addCriterion("ProcessMode in", values, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeNotIn(List<String> values) {
            addCriterion("ProcessMode not in", values, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeBetween(String value1, String value2) {
            addCriterion("ProcessMode between", value1, value2, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessmodeNotBetween(String value1, String value2) {
            addCriterion("ProcessMode not between", value1, value2, "processmode");
            return (Criteria) this;
        }

        public Criteria andProcessresultIsNull() {
            addCriterion("ProcessResult is null");
            return (Criteria) this;
        }

        public Criteria andProcessresultIsNotNull() {
            addCriterion("ProcessResult is not null");
            return (Criteria) this;
        }

        public Criteria andProcessresultEqualTo(String value) {
            addCriterion("ProcessResult =", value, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultNotEqualTo(String value) {
            addCriterion("ProcessResult <>", value, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultGreaterThan(String value) {
            addCriterion("ProcessResult >", value, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultGreaterThanOrEqualTo(String value) {
            addCriterion("ProcessResult >=", value, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultLessThan(String value) {
            addCriterion("ProcessResult <", value, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultLessThanOrEqualTo(String value) {
            addCriterion("ProcessResult <=", value, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultLike(String value) {
            addCriterion("ProcessResult like", value, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultNotLike(String value) {
            addCriterion("ProcessResult not like", value, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultIn(List<String> values) {
            addCriterion("ProcessResult in", values, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultNotIn(List<String> values) {
            addCriterion("ProcessResult not in", values, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultBetween(String value1, String value2) {
            addCriterion("ProcessResult between", value1, value2, "processresult");
            return (Criteria) this;
        }

        public Criteria andProcessresultNotBetween(String value1, String value2) {
            addCriterion("ProcessResult not between", value1, value2, "processresult");
            return (Criteria) this;
        }

        public Criteria andProductionweightIsNull() {
            addCriterion("ProductionWeight is null");
            return (Criteria) this;
        }

        public Criteria andProductionweightIsNotNull() {
            addCriterion("ProductionWeight is not null");
            return (Criteria) this;
        }

        public Criteria andProductionweightEqualTo(Float value) {
            addCriterion("ProductionWeight =", value, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightNotEqualTo(Float value) {
            addCriterion("ProductionWeight <>", value, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightGreaterThan(Float value) {
            addCriterion("ProductionWeight >", value, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightGreaterThanOrEqualTo(Float value) {
            addCriterion("ProductionWeight >=", value, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightLessThan(Float value) {
            addCriterion("ProductionWeight <", value, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightLessThanOrEqualTo(Float value) {
            addCriterion("ProductionWeight <=", value, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightIn(List<Float> values) {
            addCriterion("ProductionWeight in", values, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightNotIn(List<Float> values) {
            addCriterion("ProductionWeight not in", values, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightBetween(Float value1, Float value2) {
            addCriterion("ProductionWeight between", value1, value2, "productionweight");
            return (Criteria) this;
        }

        public Criteria andProductionweightNotBetween(Float value1, Float value2) {
            addCriterion("ProductionWeight not between", value1, value2, "productionweight");
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

        public Criteria andProcessorstelIsNull() {
            addCriterion("ProcessorsTel is null");
            return (Criteria) this;
        }

        public Criteria andProcessorstelIsNotNull() {
            addCriterion("ProcessorsTel is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorstelEqualTo(String value) {
            addCriterion("ProcessorsTel =", value, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelNotEqualTo(String value) {
            addCriterion("ProcessorsTel <>", value, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelGreaterThan(String value) {
            addCriterion("ProcessorsTel >", value, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelGreaterThanOrEqualTo(String value) {
            addCriterion("ProcessorsTel >=", value, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelLessThan(String value) {
            addCriterion("ProcessorsTel <", value, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelLessThanOrEqualTo(String value) {
            addCriterion("ProcessorsTel <=", value, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelLike(String value) {
            addCriterion("ProcessorsTel like", value, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelNotLike(String value) {
            addCriterion("ProcessorsTel not like", value, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelIn(List<String> values) {
            addCriterion("ProcessorsTel in", values, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelNotIn(List<String> values) {
            addCriterion("ProcessorsTel not in", values, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelBetween(String value1, String value2) {
            addCriterion("ProcessorsTel between", value1, value2, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorstelNotBetween(String value1, String value2) {
            addCriterion("ProcessorsTel not between", value1, value2, "processorstel");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailIsNull() {
            addCriterion("ProcessorsMail is null");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailIsNotNull() {
            addCriterion("ProcessorsMail is not null");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailEqualTo(String value) {
            addCriterion("ProcessorsMail =", value, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailNotEqualTo(String value) {
            addCriterion("ProcessorsMail <>", value, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailGreaterThan(String value) {
            addCriterion("ProcessorsMail >", value, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailGreaterThanOrEqualTo(String value) {
            addCriterion("ProcessorsMail >=", value, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailLessThan(String value) {
            addCriterion("ProcessorsMail <", value, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailLessThanOrEqualTo(String value) {
            addCriterion("ProcessorsMail <=", value, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailLike(String value) {
            addCriterion("ProcessorsMail like", value, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailNotLike(String value) {
            addCriterion("ProcessorsMail not like", value, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailIn(List<String> values) {
            addCriterion("ProcessorsMail in", values, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailNotIn(List<String> values) {
            addCriterion("ProcessorsMail not in", values, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailBetween(String value1, String value2) {
            addCriterion("ProcessorsMail between", value1, value2, "processorsmail");
            return (Criteria) this;
        }

        public Criteria andProcessorsmailNotBetween(String value1, String value2) {
            addCriterion("ProcessorsMail not between", value1, value2, "processorsmail");
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