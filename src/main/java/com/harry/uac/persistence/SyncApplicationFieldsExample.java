package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SyncApplicationFieldsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyncApplicationFieldsExample() {
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

        public Criteria andApplicationIdIsNull() {
            addCriterion("APPLICATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("APPLICATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(Long value) {
            addCriterion("APPLICATION_ID =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(Long value) {
            addCriterion("APPLICATION_ID <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(Long value) {
            addCriterion("APPLICATION_ID >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLICATION_ID >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(Long value) {
            addCriterion("APPLICATION_ID <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(Long value) {
            addCriterion("APPLICATION_ID <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<Long> values) {
            addCriterion("APPLICATION_ID in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<Long> values) {
            addCriterion("APPLICATION_ID not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(Long value1, Long value2) {
            addCriterion("APPLICATION_ID between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(Long value1, Long value2) {
            addCriterion("APPLICATION_ID not between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andSyncFieldIsNull() {
            addCriterion("SYNC_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andSyncFieldIsNotNull() {
            addCriterion("SYNC_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andSyncFieldEqualTo(String value) {
            addCriterion("SYNC_FIELD =", value, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldNotEqualTo(String value) {
            addCriterion("SYNC_FIELD <>", value, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldGreaterThan(String value) {
            addCriterion("SYNC_FIELD >", value, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_FIELD >=", value, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldLessThan(String value) {
            addCriterion("SYNC_FIELD <", value, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldLessThanOrEqualTo(String value) {
            addCriterion("SYNC_FIELD <=", value, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldLike(String value) {
            addCriterion("SYNC_FIELD like", value, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldNotLike(String value) {
            addCriterion("SYNC_FIELD not like", value, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldIn(List<String> values) {
            addCriterion("SYNC_FIELD in", values, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldNotIn(List<String> values) {
            addCriterion("SYNC_FIELD not in", values, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldBetween(String value1, String value2) {
            addCriterion("SYNC_FIELD between", value1, value2, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncFieldNotBetween(String value1, String value2) {
            addCriterion("SYNC_FIELD not between", value1, value2, "syncField");
            return (Criteria) this;
        }

        public Criteria andSyncTableIsNull() {
            addCriterion("SYNC_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andSyncTableIsNotNull() {
            addCriterion("SYNC_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andSyncTableEqualTo(String value) {
            addCriterion("SYNC_TABLE =", value, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableNotEqualTo(String value) {
            addCriterion("SYNC_TABLE <>", value, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableGreaterThan(String value) {
            addCriterion("SYNC_TABLE >", value, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_TABLE >=", value, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableLessThan(String value) {
            addCriterion("SYNC_TABLE <", value, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableLessThanOrEqualTo(String value) {
            addCriterion("SYNC_TABLE <=", value, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableLike(String value) {
            addCriterion("SYNC_TABLE like", value, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableNotLike(String value) {
            addCriterion("SYNC_TABLE not like", value, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableIn(List<String> values) {
            addCriterion("SYNC_TABLE in", values, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableNotIn(List<String> values) {
            addCriterion("SYNC_TABLE not in", values, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableBetween(String value1, String value2) {
            addCriterion("SYNC_TABLE between", value1, value2, "syncTable");
            return (Criteria) this;
        }

        public Criteria andSyncTableNotBetween(String value1, String value2) {
            addCriterion("SYNC_TABLE not between", value1, value2, "syncTable");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andSyncFieldLikeInsensitive(String value) {
            addCriterion("upper(SYNC_FIELD) like", value.toUpperCase(), "syncField");
            return this;
        }

        public Criteria andSyncTableLikeInsensitive(String value) {
            addCriterion("upper(SYNC_TABLE) like", value.toUpperCase(), "syncTable");
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