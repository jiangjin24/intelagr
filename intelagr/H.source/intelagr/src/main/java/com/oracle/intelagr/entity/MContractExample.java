package com.oracle.intelagr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MContractExample() {
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

        public Criteria andGraphcodeIsNull() {
            addCriterion("GraphCode is null");
            return (Criteria) this;
        }

        public Criteria andGraphcodeIsNotNull() {
            addCriterion("GraphCode is not null");
            return (Criteria) this;
        }

        public Criteria andGraphcodeEqualTo(String value) {
            addCriterion("GraphCode =", value, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeNotEqualTo(String value) {
            addCriterion("GraphCode <>", value, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeGreaterThan(String value) {
            addCriterion("GraphCode >", value, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeGreaterThanOrEqualTo(String value) {
            addCriterion("GraphCode >=", value, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeLessThan(String value) {
            addCriterion("GraphCode <", value, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeLessThanOrEqualTo(String value) {
            addCriterion("GraphCode <=", value, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeLike(String value) {
            addCriterion("GraphCode like", value, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeNotLike(String value) {
            addCriterion("GraphCode not like", value, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeIn(List<String> values) {
            addCriterion("GraphCode in", values, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeNotIn(List<String> values) {
            addCriterion("GraphCode not in", values, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeBetween(String value1, String value2) {
            addCriterion("GraphCode between", value1, value2, "graphcode");
            return (Criteria) this;
        }

        public Criteria andGraphcodeNotBetween(String value1, String value2) {
            addCriterion("GraphCode not between", value1, value2, "graphcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeIsNull() {
            addCriterion("LandCode is null");
            return (Criteria) this;
        }

        public Criteria andLandcodeIsNotNull() {
            addCriterion("LandCode is not null");
            return (Criteria) this;
        }

        public Criteria andLandcodeEqualTo(String value) {
            addCriterion("LandCode =", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeNotEqualTo(String value) {
            addCriterion("LandCode <>", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeGreaterThan(String value) {
            addCriterion("LandCode >", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LandCode >=", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeLessThan(String value) {
            addCriterion("LandCode <", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeLessThanOrEqualTo(String value) {
            addCriterion("LandCode <=", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeLike(String value) {
            addCriterion("LandCode like", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeNotLike(String value) {
            addCriterion("LandCode not like", value, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeIn(List<String> values) {
            addCriterion("LandCode in", values, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeNotIn(List<String> values) {
            addCriterion("LandCode not in", values, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeBetween(String value1, String value2) {
            addCriterion("LandCode between", value1, value2, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandcodeNotBetween(String value1, String value2) {
            addCriterion("LandCode not between", value1, value2, "landcode");
            return (Criteria) this;
        }

        public Criteria andLandnameIsNull() {
            addCriterion("LandName is null");
            return (Criteria) this;
        }

        public Criteria andLandnameIsNotNull() {
            addCriterion("LandName is not null");
            return (Criteria) this;
        }

        public Criteria andLandnameEqualTo(String value) {
            addCriterion("LandName =", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotEqualTo(String value) {
            addCriterion("LandName <>", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameGreaterThan(String value) {
            addCriterion("LandName >", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameGreaterThanOrEqualTo(String value) {
            addCriterion("LandName >=", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLessThan(String value) {
            addCriterion("LandName <", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLessThanOrEqualTo(String value) {
            addCriterion("LandName <=", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameLike(String value) {
            addCriterion("LandName like", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotLike(String value) {
            addCriterion("LandName not like", value, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameIn(List<String> values) {
            addCriterion("LandName in", values, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotIn(List<String> values) {
            addCriterion("LandName not in", values, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameBetween(String value1, String value2) {
            addCriterion("LandName between", value1, value2, "landname");
            return (Criteria) this;
        }

        public Criteria andLandnameNotBetween(String value1, String value2) {
            addCriterion("LandName not between", value1, value2, "landname");
            return (Criteria) this;
        }

        public Criteria andEasttoIsNull() {
            addCriterion("EastTo is null");
            return (Criteria) this;
        }

        public Criteria andEasttoIsNotNull() {
            addCriterion("EastTo is not null");
            return (Criteria) this;
        }

        public Criteria andEasttoEqualTo(String value) {
            addCriterion("EastTo =", value, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoNotEqualTo(String value) {
            addCriterion("EastTo <>", value, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoGreaterThan(String value) {
            addCriterion("EastTo >", value, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoGreaterThanOrEqualTo(String value) {
            addCriterion("EastTo >=", value, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoLessThan(String value) {
            addCriterion("EastTo <", value, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoLessThanOrEqualTo(String value) {
            addCriterion("EastTo <=", value, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoLike(String value) {
            addCriterion("EastTo like", value, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoNotLike(String value) {
            addCriterion("EastTo not like", value, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoIn(List<String> values) {
            addCriterion("EastTo in", values, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoNotIn(List<String> values) {
            addCriterion("EastTo not in", values, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoBetween(String value1, String value2) {
            addCriterion("EastTo between", value1, value2, "eastto");
            return (Criteria) this;
        }

        public Criteria andEasttoNotBetween(String value1, String value2) {
            addCriterion("EastTo not between", value1, value2, "eastto");
            return (Criteria) this;
        }

        public Criteria andContractareaIsNull() {
            addCriterion("ContractArea is null");
            return (Criteria) this;
        }

        public Criteria andContractareaIsNotNull() {
            addCriterion("ContractArea is not null");
            return (Criteria) this;
        }

        public Criteria andContractareaEqualTo(Float value) {
            addCriterion("ContractArea =", value, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaNotEqualTo(Float value) {
            addCriterion("ContractArea <>", value, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaGreaterThan(Float value) {
            addCriterion("ContractArea >", value, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaGreaterThanOrEqualTo(Float value) {
            addCriterion("ContractArea >=", value, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaLessThan(Float value) {
            addCriterion("ContractArea <", value, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaLessThanOrEqualTo(Float value) {
            addCriterion("ContractArea <=", value, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaIn(List<Float> values) {
            addCriterion("ContractArea in", values, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaNotIn(List<Float> values) {
            addCriterion("ContractArea not in", values, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaBetween(Float value1, Float value2) {
            addCriterion("ContractArea between", value1, value2, "contractarea");
            return (Criteria) this;
        }

        public Criteria andContractareaNotBetween(Float value1, Float value2) {
            addCriterion("ContractArea not between", value1, value2, "contractarea");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuIsNull() {
            addCriterion("MeasurementMu is null");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuIsNotNull() {
            addCriterion("MeasurementMu is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuEqualTo(Float value) {
            addCriterion("MeasurementMu =", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuNotEqualTo(Float value) {
            addCriterion("MeasurementMu <>", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuGreaterThan(Float value) {
            addCriterion("MeasurementMu >", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuGreaterThanOrEqualTo(Float value) {
            addCriterion("MeasurementMu >=", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuLessThan(Float value) {
            addCriterion("MeasurementMu <", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuLessThanOrEqualTo(Float value) {
            addCriterion("MeasurementMu <=", value, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuIn(List<Float> values) {
            addCriterion("MeasurementMu in", values, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuNotIn(List<Float> values) {
            addCriterion("MeasurementMu not in", values, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuBetween(Float value1, Float value2) {
            addCriterion("MeasurementMu between", value1, value2, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andMeasurementmuNotBetween(Float value1, Float value2) {
            addCriterion("MeasurementMu not between", value1, value2, "measurementmu");
            return (Criteria) this;
        }

        public Criteria andWesttoIsNull() {
            addCriterion("WestTo is null");
            return (Criteria) this;
        }

        public Criteria andWesttoIsNotNull() {
            addCriterion("WestTo is not null");
            return (Criteria) this;
        }

        public Criteria andWesttoEqualTo(String value) {
            addCriterion("WestTo =", value, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoNotEqualTo(String value) {
            addCriterion("WestTo <>", value, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoGreaterThan(String value) {
            addCriterion("WestTo >", value, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoGreaterThanOrEqualTo(String value) {
            addCriterion("WestTo >=", value, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoLessThan(String value) {
            addCriterion("WestTo <", value, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoLessThanOrEqualTo(String value) {
            addCriterion("WestTo <=", value, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoLike(String value) {
            addCriterion("WestTo like", value, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoNotLike(String value) {
            addCriterion("WestTo not like", value, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoIn(List<String> values) {
            addCriterion("WestTo in", values, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoNotIn(List<String> values) {
            addCriterion("WestTo not in", values, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoBetween(String value1, String value2) {
            addCriterion("WestTo between", value1, value2, "westto");
            return (Criteria) this;
        }

        public Criteria andWesttoNotBetween(String value1, String value2) {
            addCriterion("WestTo not between", value1, value2, "westto");
            return (Criteria) this;
        }

        public Criteria andSouthtoIsNull() {
            addCriterion("SouthTo is null");
            return (Criteria) this;
        }

        public Criteria andSouthtoIsNotNull() {
            addCriterion("SouthTo is not null");
            return (Criteria) this;
        }

        public Criteria andSouthtoEqualTo(String value) {
            addCriterion("SouthTo =", value, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoNotEqualTo(String value) {
            addCriterion("SouthTo <>", value, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoGreaterThan(String value) {
            addCriterion("SouthTo >", value, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoGreaterThanOrEqualTo(String value) {
            addCriterion("SouthTo >=", value, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoLessThan(String value) {
            addCriterion("SouthTo <", value, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoLessThanOrEqualTo(String value) {
            addCriterion("SouthTo <=", value, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoLike(String value) {
            addCriterion("SouthTo like", value, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoNotLike(String value) {
            addCriterion("SouthTo not like", value, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoIn(List<String> values) {
            addCriterion("SouthTo in", values, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoNotIn(List<String> values) {
            addCriterion("SouthTo not in", values, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoBetween(String value1, String value2) {
            addCriterion("SouthTo between", value1, value2, "southto");
            return (Criteria) this;
        }

        public Criteria andSouthtoNotBetween(String value1, String value2) {
            addCriterion("SouthTo not between", value1, value2, "southto");
            return (Criteria) this;
        }

        public Criteria andNorthtoIsNull() {
            addCriterion("NorthTo is null");
            return (Criteria) this;
        }

        public Criteria andNorthtoIsNotNull() {
            addCriterion("NorthTo is not null");
            return (Criteria) this;
        }

        public Criteria andNorthtoEqualTo(String value) {
            addCriterion("NorthTo =", value, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoNotEqualTo(String value) {
            addCriterion("NorthTo <>", value, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoGreaterThan(String value) {
            addCriterion("NorthTo >", value, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoGreaterThanOrEqualTo(String value) {
            addCriterion("NorthTo >=", value, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoLessThan(String value) {
            addCriterion("NorthTo <", value, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoLessThanOrEqualTo(String value) {
            addCriterion("NorthTo <=", value, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoLike(String value) {
            addCriterion("NorthTo like", value, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoNotLike(String value) {
            addCriterion("NorthTo not like", value, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoIn(List<String> values) {
            addCriterion("NorthTo in", values, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoNotIn(List<String> values) {
            addCriterion("NorthTo not in", values, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoBetween(String value1, String value2) {
            addCriterion("NorthTo between", value1, value2, "northto");
            return (Criteria) this;
        }

        public Criteria andNorthtoNotBetween(String value1, String value2) {
            addCriterion("NorthTo not between", value1, value2, "northto");
            return (Criteria) this;
        }

        public Criteria andLandlevelIsNull() {
            addCriterion("LandLevel is null");
            return (Criteria) this;
        }

        public Criteria andLandlevelIsNotNull() {
            addCriterion("LandLevel is not null");
            return (Criteria) this;
        }

        public Criteria andLandlevelEqualTo(String value) {
            addCriterion("LandLevel =", value, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelNotEqualTo(String value) {
            addCriterion("LandLevel <>", value, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelGreaterThan(String value) {
            addCriterion("LandLevel >", value, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelGreaterThanOrEqualTo(String value) {
            addCriterion("LandLevel >=", value, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelLessThan(String value) {
            addCriterion("LandLevel <", value, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelLessThanOrEqualTo(String value) {
            addCriterion("LandLevel <=", value, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelLike(String value) {
            addCriterion("LandLevel like", value, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelNotLike(String value) {
            addCriterion("LandLevel not like", value, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelIn(List<String> values) {
            addCriterion("LandLevel in", values, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelNotIn(List<String> values) {
            addCriterion("LandLevel not in", values, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelBetween(String value1, String value2) {
            addCriterion("LandLevel between", value1, value2, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandlevelNotBetween(String value1, String value2) {
            addCriterion("LandLevel not between", value1, value2, "landlevel");
            return (Criteria) this;
        }

        public Criteria andLandtypeIsNull() {
            addCriterion("LandType is null");
            return (Criteria) this;
        }

        public Criteria andLandtypeIsNotNull() {
            addCriterion("LandType is not null");
            return (Criteria) this;
        }

        public Criteria andLandtypeEqualTo(String value) {
            addCriterion("LandType =", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeNotEqualTo(String value) {
            addCriterion("LandType <>", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeGreaterThan(String value) {
            addCriterion("LandType >", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeGreaterThanOrEqualTo(String value) {
            addCriterion("LandType >=", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeLessThan(String value) {
            addCriterion("LandType <", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeLessThanOrEqualTo(String value) {
            addCriterion("LandType <=", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeLike(String value) {
            addCriterion("LandType like", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeNotLike(String value) {
            addCriterion("LandType not like", value, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeIn(List<String> values) {
            addCriterion("LandType in", values, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeNotIn(List<String> values) {
            addCriterion("LandType not in", values, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeBetween(String value1, String value2) {
            addCriterion("LandType between", value1, value2, "landtype");
            return (Criteria) this;
        }

        public Criteria andLandtypeNotBetween(String value1, String value2) {
            addCriterion("LandType not between", value1, value2, "landtype");
            return (Criteria) this;
        }

        public Criteria andIsbaselandIsNull() {
            addCriterion("IsBaseLand is null");
            return (Criteria) this;
        }

        public Criteria andIsbaselandIsNotNull() {
            addCriterion("IsBaseLand is not null");
            return (Criteria) this;
        }

        public Criteria andIsbaselandEqualTo(String value) {
            addCriterion("IsBaseLand =", value, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandNotEqualTo(String value) {
            addCriterion("IsBaseLand <>", value, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandGreaterThan(String value) {
            addCriterion("IsBaseLand >", value, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandGreaterThanOrEqualTo(String value) {
            addCriterion("IsBaseLand >=", value, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandLessThan(String value) {
            addCriterion("IsBaseLand <", value, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandLessThanOrEqualTo(String value) {
            addCriterion("IsBaseLand <=", value, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandLike(String value) {
            addCriterion("IsBaseLand like", value, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandNotLike(String value) {
            addCriterion("IsBaseLand not like", value, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandIn(List<String> values) {
            addCriterion("IsBaseLand in", values, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandNotIn(List<String> values) {
            addCriterion("IsBaseLand not in", values, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandBetween(String value1, String value2) {
            addCriterion("IsBaseLand between", value1, value2, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andIsbaselandNotBetween(String value1, String value2) {
            addCriterion("IsBaseLand not between", value1, value2, "isbaseland");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNull() {
            addCriterion("Ownership is null");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNotNull() {
            addCriterion("Ownership is not null");
            return (Criteria) this;
        }

        public Criteria andOwnershipEqualTo(String value) {
            addCriterion("Ownership =", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotEqualTo(String value) {
            addCriterion("Ownership <>", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThan(String value) {
            addCriterion("Ownership >", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThanOrEqualTo(String value) {
            addCriterion("Ownership >=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThan(String value) {
            addCriterion("Ownership <", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThanOrEqualTo(String value) {
            addCriterion("Ownership <=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLike(String value) {
            addCriterion("Ownership like", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotLike(String value) {
            addCriterion("Ownership not like", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipIn(List<String> values) {
            addCriterion("Ownership in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotIn(List<String> values) {
            addCriterion("Ownership not in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipBetween(String value1, String value2) {
            addCriterion("Ownership between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotBetween(String value1, String value2) {
            addCriterion("Ownership not between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andLandclassIsNull() {
            addCriterion("LandClass is null");
            return (Criteria) this;
        }

        public Criteria andLandclassIsNotNull() {
            addCriterion("LandClass is not null");
            return (Criteria) this;
        }

        public Criteria andLandclassEqualTo(String value) {
            addCriterion("LandClass =", value, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassNotEqualTo(String value) {
            addCriterion("LandClass <>", value, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassGreaterThan(String value) {
            addCriterion("LandClass >", value, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassGreaterThanOrEqualTo(String value) {
            addCriterion("LandClass >=", value, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassLessThan(String value) {
            addCriterion("LandClass <", value, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassLessThanOrEqualTo(String value) {
            addCriterion("LandClass <=", value, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassLike(String value) {
            addCriterion("LandClass like", value, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassNotLike(String value) {
            addCriterion("LandClass not like", value, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassIn(List<String> values) {
            addCriterion("LandClass in", values, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassNotIn(List<String> values) {
            addCriterion("LandClass not in", values, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassBetween(String value1, String value2) {
            addCriterion("LandClass between", value1, value2, "landclass");
            return (Criteria) this;
        }

        public Criteria andLandclassNotBetween(String value1, String value2) {
            addCriterion("LandClass not between", value1, value2, "landclass");
            return (Criteria) this;
        }

        public Criteria andDisputereasonIsNull() {
            addCriterion("DisputeReason is null");
            return (Criteria) this;
        }

        public Criteria andDisputereasonIsNotNull() {
            addCriterion("DisputeReason is not null");
            return (Criteria) this;
        }

        public Criteria andDisputereasonEqualTo(String value) {
            addCriterion("DisputeReason =", value, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonNotEqualTo(String value) {
            addCriterion("DisputeReason <>", value, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonGreaterThan(String value) {
            addCriterion("DisputeReason >", value, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonGreaterThanOrEqualTo(String value) {
            addCriterion("DisputeReason >=", value, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonLessThan(String value) {
            addCriterion("DisputeReason <", value, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonLessThanOrEqualTo(String value) {
            addCriterion("DisputeReason <=", value, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonLike(String value) {
            addCriterion("DisputeReason like", value, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonNotLike(String value) {
            addCriterion("DisputeReason not like", value, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonIn(List<String> values) {
            addCriterion("DisputeReason in", values, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonNotIn(List<String> values) {
            addCriterion("DisputeReason not in", values, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonBetween(String value1, String value2) {
            addCriterion("DisputeReason between", value1, value2, "disputereason");
            return (Criteria) this;
        }

        public Criteria andDisputereasonNotBetween(String value1, String value2) {
            addCriterion("DisputeReason not between", value1, value2, "disputereason");
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