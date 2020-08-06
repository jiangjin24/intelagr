package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MPackingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPackingExample() {
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

        public Criteria andTypecodeIsNull() {
            addCriterion("TypeCode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("TypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("TypeCode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("TypeCode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("TypeCode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("TypeCode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("TypeCode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("TypeCode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("TypeCode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("TypeCode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("TypeCode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("TypeCode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("TypeCode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("TypeCode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("TypeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("TypeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("TypeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("TypeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("TypeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("TypeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("TypeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("TypeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("TypeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("TypeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("TypeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("TypeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("TypeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("TypeName not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andClasscodeIsNull() {
            addCriterion("ClassCode is null");
            return (Criteria) this;
        }

        public Criteria andClasscodeIsNotNull() {
            addCriterion("ClassCode is not null");
            return (Criteria) this;
        }

        public Criteria andClasscodeEqualTo(String value) {
            addCriterion("ClassCode =", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeNotEqualTo(String value) {
            addCriterion("ClassCode <>", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeGreaterThan(String value) {
            addCriterion("ClassCode >", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeGreaterThanOrEqualTo(String value) {
            addCriterion("ClassCode >=", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeLessThan(String value) {
            addCriterion("ClassCode <", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeLessThanOrEqualTo(String value) {
            addCriterion("ClassCode <=", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeLike(String value) {
            addCriterion("ClassCode like", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeNotLike(String value) {
            addCriterion("ClassCode not like", value, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeIn(List<String> values) {
            addCriterion("ClassCode in", values, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeNotIn(List<String> values) {
            addCriterion("ClassCode not in", values, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeBetween(String value1, String value2) {
            addCriterion("ClassCode between", value1, value2, "classcode");
            return (Criteria) this;
        }

        public Criteria andClasscodeNotBetween(String value1, String value2) {
            addCriterion("ClassCode not between", value1, value2, "classcode");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNull() {
            addCriterion("ClassName is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("ClassName is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("ClassName =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("ClassName <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("ClassName >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("ClassName >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("ClassName <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("ClassName <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("ClassName like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("ClassName not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("ClassName in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("ClassName not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("ClassName between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("ClassName not between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andSpeccodeIsNull() {
            addCriterion("SpecCode is null");
            return (Criteria) this;
        }

        public Criteria andSpeccodeIsNotNull() {
            addCriterion("SpecCode is not null");
            return (Criteria) this;
        }

        public Criteria andSpeccodeEqualTo(String value) {
            addCriterion("SpecCode =", value, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeNotEqualTo(String value) {
            addCriterion("SpecCode <>", value, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeGreaterThan(String value) {
            addCriterion("SpecCode >", value, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeGreaterThanOrEqualTo(String value) {
            addCriterion("SpecCode >=", value, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeLessThan(String value) {
            addCriterion("SpecCode <", value, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeLessThanOrEqualTo(String value) {
            addCriterion("SpecCode <=", value, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeLike(String value) {
            addCriterion("SpecCode like", value, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeNotLike(String value) {
            addCriterion("SpecCode not like", value, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeIn(List<String> values) {
            addCriterion("SpecCode in", values, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeNotIn(List<String> values) {
            addCriterion("SpecCode not in", values, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeBetween(String value1, String value2) {
            addCriterion("SpecCode between", value1, value2, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpeccodeNotBetween(String value1, String value2) {
            addCriterion("SpecCode not between", value1, value2, "speccode");
            return (Criteria) this;
        }

        public Criteria andSpecnameIsNull() {
            addCriterion("SpecName is null");
            return (Criteria) this;
        }

        public Criteria andSpecnameIsNotNull() {
            addCriterion("SpecName is not null");
            return (Criteria) this;
        }

        public Criteria andSpecnameEqualTo(String value) {
            addCriterion("SpecName =", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameNotEqualTo(String value) {
            addCriterion("SpecName <>", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameGreaterThan(String value) {
            addCriterion("SpecName >", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameGreaterThanOrEqualTo(String value) {
            addCriterion("SpecName >=", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameLessThan(String value) {
            addCriterion("SpecName <", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameLessThanOrEqualTo(String value) {
            addCriterion("SpecName <=", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameLike(String value) {
            addCriterion("SpecName like", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameNotLike(String value) {
            addCriterion("SpecName not like", value, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameIn(List<String> values) {
            addCriterion("SpecName in", values, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameNotIn(List<String> values) {
            addCriterion("SpecName not in", values, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameBetween(String value1, String value2) {
            addCriterion("SpecName between", value1, value2, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecnameNotBetween(String value1, String value2) {
            addCriterion("SpecName not between", value1, value2, "specname");
            return (Criteria) this;
        }

        public Criteria andSpecweightIsNull() {
            addCriterion("SpecWeight is null");
            return (Criteria) this;
        }

        public Criteria andSpecweightIsNotNull() {
            addCriterion("SpecWeight is not null");
            return (Criteria) this;
        }

        public Criteria andSpecweightEqualTo(Float value) {
            addCriterion("SpecWeight =", value, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightNotEqualTo(Float value) {
            addCriterion("SpecWeight <>", value, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightGreaterThan(Float value) {
            addCriterion("SpecWeight >", value, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightGreaterThanOrEqualTo(Float value) {
            addCriterion("SpecWeight >=", value, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightLessThan(Float value) {
            addCriterion("SpecWeight <", value, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightLessThanOrEqualTo(Float value) {
            addCriterion("SpecWeight <=", value, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightIn(List<Float> values) {
            addCriterion("SpecWeight in", values, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightNotIn(List<Float> values) {
            addCriterion("SpecWeight not in", values, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightBetween(Float value1, Float value2) {
            addCriterion("SpecWeight between", value1, value2, "specweight");
            return (Criteria) this;
        }

        public Criteria andSpecweightNotBetween(Float value1, Float value2) {
            addCriterion("SpecWeight not between", value1, value2, "specweight");
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