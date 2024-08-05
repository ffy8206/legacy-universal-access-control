package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.List;

public class SysParameterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysParameterExample() {
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

        public Criteria andParameterNameIsNull() {
            addCriterion("PARAMETER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNotNull() {
            addCriterion("PARAMETER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParameterNameEqualTo(String value) {
            addCriterion("PARAMETER_NAME =", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotEqualTo(String value) {
            addCriterion("PARAMETER_NAME <>", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThan(String value) {
            addCriterion("PARAMETER_NAME >", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME >=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThan(String value) {
            addCriterion("PARAMETER_NAME <", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME <=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLike(String value) {
            addCriterion("PARAMETER_NAME like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotLike(String value) {
            addCriterion("PARAMETER_NAME not like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameIn(List<String> values) {
            addCriterion("PARAMETER_NAME in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotIn(List<String> values) {
            addCriterion("PARAMETER_NAME not in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME not between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterValueIsNull() {
            addCriterion("PARAMETER_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andParameterValueIsNotNull() {
            addCriterion("PARAMETER_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParameterValueEqualTo(String value) {
            addCriterion("PARAMETER_VALUE =", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueNotEqualTo(String value) {
            addCriterion("PARAMETER_VALUE <>", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueGreaterThan(String value) {
            addCriterion("PARAMETER_VALUE >", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_VALUE >=", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueLessThan(String value) {
            addCriterion("PARAMETER_VALUE <", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_VALUE <=", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueLike(String value) {
            addCriterion("PARAMETER_VALUE like", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueNotLike(String value) {
            addCriterion("PARAMETER_VALUE not like", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueIn(List<String> values) {
            addCriterion("PARAMETER_VALUE in", values, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueNotIn(List<String> values) {
            addCriterion("PARAMETER_VALUE not in", values, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueBetween(String value1, String value2) {
            addCriterion("PARAMETER_VALUE between", value1, value2, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_VALUE not between", value1, value2, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterOrderIsNull() {
            addCriterion("PARAMETER_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andParameterOrderIsNotNull() {
            addCriterion("PARAMETER_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andParameterOrderEqualTo(Integer value) {
            addCriterion("PARAMETER_ORDER =", value, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderNotEqualTo(Integer value) {
            addCriterion("PARAMETER_ORDER <>", value, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderGreaterThan(Integer value) {
            addCriterion("PARAMETER_ORDER >", value, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PARAMETER_ORDER >=", value, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderLessThan(Integer value) {
            addCriterion("PARAMETER_ORDER <", value, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderLessThanOrEqualTo(Integer value) {
            addCriterion("PARAMETER_ORDER <=", value, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderIn(List<Integer> values) {
            addCriterion("PARAMETER_ORDER in", values, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderNotIn(List<Integer> values) {
            addCriterion("PARAMETER_ORDER not in", values, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderBetween(Integer value1, Integer value2) {
            addCriterion("PARAMETER_ORDER between", value1, value2, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("PARAMETER_ORDER not between", value1, value2, "parameterOrder");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionIsNull() {
            addCriterion("PARAMETER_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionIsNotNull() {
            addCriterion("PARAMETER_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionEqualTo(String value) {
            addCriterion("PARAMETER_DESCRIPTION =", value, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionNotEqualTo(String value) {
            addCriterion("PARAMETER_DESCRIPTION <>", value, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionGreaterThan(String value) {
            addCriterion("PARAMETER_DESCRIPTION >", value, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_DESCRIPTION >=", value, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionLessThan(String value) {
            addCriterion("PARAMETER_DESCRIPTION <", value, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_DESCRIPTION <=", value, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionLike(String value) {
            addCriterion("PARAMETER_DESCRIPTION like", value, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionNotLike(String value) {
            addCriterion("PARAMETER_DESCRIPTION not like", value, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionIn(List<String> values) {
            addCriterion("PARAMETER_DESCRIPTION in", values, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionNotIn(List<String> values) {
            addCriterion("PARAMETER_DESCRIPTION not in", values, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionBetween(String value1, String value2) {
            addCriterion("PARAMETER_DESCRIPTION between", value1, value2, "parameterDescription");
            return (Criteria) this;
        }

        public Criteria andParameterDescriptionNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_DESCRIPTION not between", value1, value2, "parameterDescription");
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