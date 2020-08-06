package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BWatermonitoringExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BWatermonitoringExample() {
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

        public Criteria andPhIsNull() {
            addCriterion("PH is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("PH is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(Float value) {
            addCriterion("PH =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(Float value) {
            addCriterion("PH <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(Float value) {
            addCriterion("PH >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(Float value) {
            addCriterion("PH >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(Float value) {
            addCriterion("PH <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(Float value) {
            addCriterion("PH <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<Float> values) {
            addCriterion("PH in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<Float> values) {
            addCriterion("PH not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(Float value1, Float value2) {
            addCriterion("PH between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(Float value1, Float value2) {
            addCriterion("PH not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andDovalueIsNull() {
            addCriterion("DOValue is null");
            return (Criteria) this;
        }

        public Criteria andDovalueIsNotNull() {
            addCriterion("DOValue is not null");
            return (Criteria) this;
        }

        public Criteria andDovalueEqualTo(Float value) {
            addCriterion("DOValue =", value, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueNotEqualTo(Float value) {
            addCriterion("DOValue <>", value, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueGreaterThan(Float value) {
            addCriterion("DOValue >", value, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueGreaterThanOrEqualTo(Float value) {
            addCriterion("DOValue >=", value, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueLessThan(Float value) {
            addCriterion("DOValue <", value, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueLessThanOrEqualTo(Float value) {
            addCriterion("DOValue <=", value, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueIn(List<Float> values) {
            addCriterion("DOValue in", values, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueNotIn(List<Float> values) {
            addCriterion("DOValue not in", values, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueBetween(Float value1, Float value2) {
            addCriterion("DOValue between", value1, value2, "dovalue");
            return (Criteria) this;
        }

        public Criteria andDovalueNotBetween(Float value1, Float value2) {
            addCriterion("DOValue not between", value1, value2, "dovalue");
            return (Criteria) this;
        }

        public Criteria andCodmnIsNull() {
            addCriterion("CODMn is null");
            return (Criteria) this;
        }

        public Criteria andCodmnIsNotNull() {
            addCriterion("CODMn is not null");
            return (Criteria) this;
        }

        public Criteria andCodmnEqualTo(Float value) {
            addCriterion("CODMn =", value, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnNotEqualTo(Float value) {
            addCriterion("CODMn <>", value, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnGreaterThan(Float value) {
            addCriterion("CODMn >", value, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnGreaterThanOrEqualTo(Float value) {
            addCriterion("CODMn >=", value, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnLessThan(Float value) {
            addCriterion("CODMn <", value, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnLessThanOrEqualTo(Float value) {
            addCriterion("CODMn <=", value, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnIn(List<Float> values) {
            addCriterion("CODMn in", values, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnNotIn(List<Float> values) {
            addCriterion("CODMn not in", values, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnBetween(Float value1, Float value2) {
            addCriterion("CODMn between", value1, value2, "codmn");
            return (Criteria) this;
        }

        public Criteria andCodmnNotBetween(Float value1, Float value2) {
            addCriterion("CODMn not between", value1, value2, "codmn");
            return (Criteria) this;
        }

        public Criteria andBod5IsNull() {
            addCriterion("BOD5 is null");
            return (Criteria) this;
        }

        public Criteria andBod5IsNotNull() {
            addCriterion("BOD5 is not null");
            return (Criteria) this;
        }

        public Criteria andBod5EqualTo(Float value) {
            addCriterion("BOD5 =", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5NotEqualTo(Float value) {
            addCriterion("BOD5 <>", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5GreaterThan(Float value) {
            addCriterion("BOD5 >", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5GreaterThanOrEqualTo(Float value) {
            addCriterion("BOD5 >=", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5LessThan(Float value) {
            addCriterion("BOD5 <", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5LessThanOrEqualTo(Float value) {
            addCriterion("BOD5 <=", value, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5In(List<Float> values) {
            addCriterion("BOD5 in", values, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5NotIn(List<Float> values) {
            addCriterion("BOD5 not in", values, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5Between(Float value1, Float value2) {
            addCriterion("BOD5 between", value1, value2, "bod5");
            return (Criteria) this;
        }

        public Criteria andBod5NotBetween(Float value1, Float value2) {
            addCriterion("BOD5 not between", value1, value2, "bod5");
            return (Criteria) this;
        }

        public Criteria andNh3nIsNull() {
            addCriterion("NH3N is null");
            return (Criteria) this;
        }

        public Criteria andNh3nIsNotNull() {
            addCriterion("NH3N is not null");
            return (Criteria) this;
        }

        public Criteria andNh3nEqualTo(Float value) {
            addCriterion("NH3N =", value, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nNotEqualTo(Float value) {
            addCriterion("NH3N <>", value, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nGreaterThan(Float value) {
            addCriterion("NH3N >", value, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nGreaterThanOrEqualTo(Float value) {
            addCriterion("NH3N >=", value, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nLessThan(Float value) {
            addCriterion("NH3N <", value, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nLessThanOrEqualTo(Float value) {
            addCriterion("NH3N <=", value, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nIn(List<Float> values) {
            addCriterion("NH3N in", values, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nNotIn(List<Float> values) {
            addCriterion("NH3N not in", values, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nBetween(Float value1, Float value2) {
            addCriterion("NH3N between", value1, value2, "nh3n");
            return (Criteria) this;
        }

        public Criteria andNh3nNotBetween(Float value1, Float value2) {
            addCriterion("NH3N not between", value1, value2, "nh3n");
            return (Criteria) this;
        }

        public Criteria andTpIsNull() {
            addCriterion("TP is null");
            return (Criteria) this;
        }

        public Criteria andTpIsNotNull() {
            addCriterion("TP is not null");
            return (Criteria) this;
        }

        public Criteria andTpEqualTo(Float value) {
            addCriterion("TP =", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotEqualTo(Float value) {
            addCriterion("TP <>", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThan(Float value) {
            addCriterion("TP >", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpGreaterThanOrEqualTo(Float value) {
            addCriterion("TP >=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThan(Float value) {
            addCriterion("TP <", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpLessThanOrEqualTo(Float value) {
            addCriterion("TP <=", value, "tp");
            return (Criteria) this;
        }

        public Criteria andTpIn(List<Float> values) {
            addCriterion("TP in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotIn(List<Float> values) {
            addCriterion("TP not in", values, "tp");
            return (Criteria) this;
        }

        public Criteria andTpBetween(Float value1, Float value2) {
            addCriterion("TP between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andTpNotBetween(Float value1, Float value2) {
            addCriterion("TP not between", value1, value2, "tp");
            return (Criteria) this;
        }

        public Criteria andCodcrIsNull() {
            addCriterion("CODCr is null");
            return (Criteria) this;
        }

        public Criteria andCodcrIsNotNull() {
            addCriterion("CODCr is not null");
            return (Criteria) this;
        }

        public Criteria andCodcrEqualTo(Float value) {
            addCriterion("CODCr =", value, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrNotEqualTo(Float value) {
            addCriterion("CODCr <>", value, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrGreaterThan(Float value) {
            addCriterion("CODCr >", value, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrGreaterThanOrEqualTo(Float value) {
            addCriterion("CODCr >=", value, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrLessThan(Float value) {
            addCriterion("CODCr <", value, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrLessThanOrEqualTo(Float value) {
            addCriterion("CODCr <=", value, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrIn(List<Float> values) {
            addCriterion("CODCr in", values, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrNotIn(List<Float> values) {
            addCriterion("CODCr not in", values, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrBetween(Float value1, Float value2) {
            addCriterion("CODCr between", value1, value2, "codcr");
            return (Criteria) this;
        }

        public Criteria andCodcrNotBetween(Float value1, Float value2) {
            addCriterion("CODCr not between", value1, value2, "codcr");
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