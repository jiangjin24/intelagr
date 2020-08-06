package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YySyncLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YySyncLogExample() {
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

        public Criteria andBiztypeIsNull() {
            addCriterion("BizType is null");
            return (Criteria) this;
        }

        public Criteria andBiztypeIsNotNull() {
            addCriterion("BizType is not null");
            return (Criteria) this;
        }

        public Criteria andBiztypeEqualTo(String value) {
            addCriterion("BizType =", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotEqualTo(String value) {
            addCriterion("BizType <>", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeGreaterThan(String value) {
            addCriterion("BizType >", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeGreaterThanOrEqualTo(String value) {
            addCriterion("BizType >=", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLessThan(String value) {
            addCriterion("BizType <", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLessThanOrEqualTo(String value) {
            addCriterion("BizType <=", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeLike(String value) {
            addCriterion("BizType like", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotLike(String value) {
            addCriterion("BizType not like", value, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeIn(List<String> values) {
            addCriterion("BizType in", values, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotIn(List<String> values) {
            addCriterion("BizType not in", values, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeBetween(String value1, String value2) {
            addCriterion("BizType between", value1, value2, "biztype");
            return (Criteria) this;
        }

        public Criteria andBiztypeNotBetween(String value1, String value2) {
            addCriterion("BizType not between", value1, value2, "biztype");
            return (Criteria) this;
        }

        public Criteria andSyncdateIsNull() {
            addCriterion("SyncDate is null");
            return (Criteria) this;
        }

        public Criteria andSyncdateIsNotNull() {
            addCriterion("SyncDate is not null");
            return (Criteria) this;
        }

        public Criteria andSyncdateEqualTo(Date value) {
            addCriterion("SyncDate =", value, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateNotEqualTo(Date value) {
            addCriterion("SyncDate <>", value, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateGreaterThan(Date value) {
            addCriterion("SyncDate >", value, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SyncDate >=", value, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateLessThan(Date value) {
            addCriterion("SyncDate <", value, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateLessThanOrEqualTo(Date value) {
            addCriterion("SyncDate <=", value, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateIn(List<Date> values) {
            addCriterion("SyncDate in", values, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateNotIn(List<Date> values) {
            addCriterion("SyncDate not in", values, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateBetween(Date value1, Date value2) {
            addCriterion("SyncDate between", value1, value2, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncdateNotBetween(Date value1, Date value2) {
            addCriterion("SyncDate not between", value1, value2, "syncdate");
            return (Criteria) this;
        }

        public Criteria andSyncstatusIsNull() {
            addCriterion("SyncStatus is null");
            return (Criteria) this;
        }

        public Criteria andSyncstatusIsNotNull() {
            addCriterion("SyncStatus is not null");
            return (Criteria) this;
        }

        public Criteria andSyncstatusEqualTo(Integer value) {
            addCriterion("SyncStatus =", value, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusNotEqualTo(Integer value) {
            addCriterion("SyncStatus <>", value, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusGreaterThan(Integer value) {
            addCriterion("SyncStatus >", value, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SyncStatus >=", value, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusLessThan(Integer value) {
            addCriterion("SyncStatus <", value, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusLessThanOrEqualTo(Integer value) {
            addCriterion("SyncStatus <=", value, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusIn(List<Integer> values) {
            addCriterion("SyncStatus in", values, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusNotIn(List<Integer> values) {
            addCriterion("SyncStatus not in", values, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusBetween(Integer value1, Integer value2) {
            addCriterion("SyncStatus between", value1, value2, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSyncstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SyncStatus not between", value1, value2, "syncstatus");
            return (Criteria) this;
        }

        public Criteria andSynccountIsNull() {
            addCriterion("SyncCount is null");
            return (Criteria) this;
        }

        public Criteria andSynccountIsNotNull() {
            addCriterion("SyncCount is not null");
            return (Criteria) this;
        }

        public Criteria andSynccountEqualTo(Integer value) {
            addCriterion("SyncCount =", value, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountNotEqualTo(Integer value) {
            addCriterion("SyncCount <>", value, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountGreaterThan(Integer value) {
            addCriterion("SyncCount >", value, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SyncCount >=", value, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountLessThan(Integer value) {
            addCriterion("SyncCount <", value, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountLessThanOrEqualTo(Integer value) {
            addCriterion("SyncCount <=", value, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountIn(List<Integer> values) {
            addCriterion("SyncCount in", values, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountNotIn(List<Integer> values) {
            addCriterion("SyncCount not in", values, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountBetween(Integer value1, Integer value2) {
            addCriterion("SyncCount between", value1, value2, "synccount");
            return (Criteria) this;
        }

        public Criteria andSynccountNotBetween(Integer value1, Integer value2) {
            addCriterion("SyncCount not between", value1, value2, "synccount");
            return (Criteria) this;
        }

        public Criteria andDatapathIsNull() {
            addCriterion("DataPath is null");
            return (Criteria) this;
        }

        public Criteria andDatapathIsNotNull() {
            addCriterion("DataPath is not null");
            return (Criteria) this;
        }

        public Criteria andDatapathEqualTo(Integer value) {
            addCriterion("DataPath =", value, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathNotEqualTo(Integer value) {
            addCriterion("DataPath <>", value, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathGreaterThan(Integer value) {
            addCriterion("DataPath >", value, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathGreaterThanOrEqualTo(Integer value) {
            addCriterion("DataPath >=", value, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathLessThan(Integer value) {
            addCriterion("DataPath <", value, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathLessThanOrEqualTo(Integer value) {
            addCriterion("DataPath <=", value, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathIn(List<Integer> values) {
            addCriterion("DataPath in", values, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathNotIn(List<Integer> values) {
            addCriterion("DataPath not in", values, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathBetween(Integer value1, Integer value2) {
            addCriterion("DataPath between", value1, value2, "datapath");
            return (Criteria) this;
        }

        public Criteria andDatapathNotBetween(Integer value1, Integer value2) {
            addCriterion("DataPath not between", value1, value2, "datapath");
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