package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExtendDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtendDataExample() {
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

        public Criteria andExtendDataIdIsNull() {
            addCriterion("EXTEND_DATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdIsNotNull() {
            addCriterion("EXTEND_DATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdEqualTo(Long value) {
            addCriterion("EXTEND_DATA_ID =", value, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdNotEqualTo(Long value) {
            addCriterion("EXTEND_DATA_ID <>", value, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdGreaterThan(Long value) {
            addCriterion("EXTEND_DATA_ID >", value, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EXTEND_DATA_ID >=", value, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdLessThan(Long value) {
            addCriterion("EXTEND_DATA_ID <", value, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdLessThanOrEqualTo(Long value) {
            addCriterion("EXTEND_DATA_ID <=", value, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdIn(List<Long> values) {
            addCriterion("EXTEND_DATA_ID in", values, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdNotIn(List<Long> values) {
            addCriterion("EXTEND_DATA_ID not in", values, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdBetween(Long value1, Long value2) {
            addCriterion("EXTEND_DATA_ID between", value1, value2, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataIdNotBetween(Long value1, Long value2) {
            addCriterion("EXTEND_DATA_ID not between", value1, value2, "extendDataId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdIsNull() {
            addCriterion("EXTEND_DATA_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdIsNotNull() {
            addCriterion("EXTEND_DATA_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdEqualTo(Long value) {
            addCriterion("EXTEND_DATA_TYPE_ID =", value, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdNotEqualTo(Long value) {
            addCriterion("EXTEND_DATA_TYPE_ID <>", value, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdGreaterThan(Long value) {
            addCriterion("EXTEND_DATA_TYPE_ID >", value, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EXTEND_DATA_TYPE_ID >=", value, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdLessThan(Long value) {
            addCriterion("EXTEND_DATA_TYPE_ID <", value, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("EXTEND_DATA_TYPE_ID <=", value, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdIn(List<Long> values) {
            addCriterion("EXTEND_DATA_TYPE_ID in", values, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdNotIn(List<Long> values) {
            addCriterion("EXTEND_DATA_TYPE_ID not in", values, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdBetween(Long value1, Long value2) {
            addCriterion("EXTEND_DATA_TYPE_ID between", value1, value2, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("EXTEND_DATA_TYPE_ID not between", value1, value2, "extendDataTypeId");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidIsNull() {
            addCriterion("EXTEND_DATA_SOURCEID is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidIsNotNull() {
            addCriterion("EXTEND_DATA_SOURCEID is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidEqualTo(Long value) {
            addCriterion("EXTEND_DATA_SOURCEID =", value, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidNotEqualTo(Long value) {
            addCriterion("EXTEND_DATA_SOURCEID <>", value, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidGreaterThan(Long value) {
            addCriterion("EXTEND_DATA_SOURCEID >", value, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidGreaterThanOrEqualTo(Long value) {
            addCriterion("EXTEND_DATA_SOURCEID >=", value, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidLessThan(Long value) {
            addCriterion("EXTEND_DATA_SOURCEID <", value, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidLessThanOrEqualTo(Long value) {
            addCriterion("EXTEND_DATA_SOURCEID <=", value, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidIn(List<Long> values) {
            addCriterion("EXTEND_DATA_SOURCEID in", values, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidNotIn(List<Long> values) {
            addCriterion("EXTEND_DATA_SOURCEID not in", values, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidBetween(Long value1, Long value2) {
            addCriterion("EXTEND_DATA_SOURCEID between", value1, value2, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataSourceidNotBetween(Long value1, Long value2) {
            addCriterion("EXTEND_DATA_SOURCEID not between", value1, value2, "extendDataSourceid");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueIsNull() {
            addCriterion("EXTEND_DATA_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueIsNotNull() {
            addCriterion("EXTEND_DATA_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueEqualTo(String value) {
            addCriterion("EXTEND_DATA_VALUE =", value, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueNotEqualTo(String value) {
            addCriterion("EXTEND_DATA_VALUE <>", value, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueGreaterThan(String value) {
            addCriterion("EXTEND_DATA_VALUE >", value, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_VALUE >=", value, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueLessThan(String value) {
            addCriterion("EXTEND_DATA_VALUE <", value, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_VALUE <=", value, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueLike(String value) {
            addCriterion("EXTEND_DATA_VALUE like", value, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueNotLike(String value) {
            addCriterion("EXTEND_DATA_VALUE not like", value, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueIn(List<String> values) {
            addCriterion("EXTEND_DATA_VALUE in", values, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueNotIn(List<String> values) {
            addCriterion("EXTEND_DATA_VALUE not in", values, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_VALUE between", value1, value2, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataValueNotBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_VALUE not between", value1, value2, "extendDataValue");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderIsNull() {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderIsNotNull() {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderEqualTo(Integer value) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER =", value, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderNotEqualTo(Integer value) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER <>", value, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderGreaterThan(Integer value) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER >", value, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER >=", value, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderLessThan(Integer value) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER <", value, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER <=", value, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderIn(List<Integer> values) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER in", values, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderNotIn(List<Integer> values) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER not in", values, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER between", value1, value2, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("EXTEND_DATA_DISPLAY_ORDER not between", value1, value2, "extendDataDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkIsNull() {
            addCriterion("EXTEND_DATA_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkIsNotNull() {
            addCriterion("EXTEND_DATA_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkEqualTo(String value) {
            addCriterion("EXTEND_DATA_REMARK =", value, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkNotEqualTo(String value) {
            addCriterion("EXTEND_DATA_REMARK <>", value, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkGreaterThan(String value) {
            addCriterion("EXTEND_DATA_REMARK >", value, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_REMARK >=", value, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkLessThan(String value) {
            addCriterion("EXTEND_DATA_REMARK <", value, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_REMARK <=", value, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkLike(String value) {
            addCriterion("EXTEND_DATA_REMARK like", value, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkNotLike(String value) {
            addCriterion("EXTEND_DATA_REMARK not like", value, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkIn(List<String> values) {
            addCriterion("EXTEND_DATA_REMARK in", values, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkNotIn(List<String> values) {
            addCriterion("EXTEND_DATA_REMARK not in", values, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_REMARK between", value1, value2, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andExtendDataRemarkNotBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_REMARK not between", value1, value2, "extendDataRemark");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("UPDATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("UPDATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("UPDATE_USER_ID =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("UPDATE_USER_ID >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("UPDATE_USER_ID <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("UPDATE_USER_ID in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andExtendDataValueLikeInsensitive(String value) {
            addCriterion("upper(EXTEND_DATA_VALUE) like", value.toUpperCase(), "extendDataValue");
            return this;
        }

        public Criteria andExtendDataRemarkLikeInsensitive(String value) {
            addCriterion("upper(EXTEND_DATA_REMARK) like", value.toUpperCase(), "extendDataRemark");
            return this;
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