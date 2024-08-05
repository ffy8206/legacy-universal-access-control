package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuthOrgUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthOrgUserExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeIsNull() {
            addCriterion("USER_ORGWORK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeIsNotNull() {
            addCriterion("USER_ORGWORK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeEqualTo(String value) {
            addCriterion("USER_ORGWORK_TYPE =", value, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeNotEqualTo(String value) {
            addCriterion("USER_ORGWORK_TYPE <>", value, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeGreaterThan(String value) {
            addCriterion("USER_ORGWORK_TYPE >", value, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ORGWORK_TYPE >=", value, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeLessThan(String value) {
            addCriterion("USER_ORGWORK_TYPE <", value, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_ORGWORK_TYPE <=", value, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeLike(String value) {
            addCriterion("USER_ORGWORK_TYPE like", value, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeNotLike(String value) {
            addCriterion("USER_ORGWORK_TYPE not like", value, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeIn(List<String> values) {
            addCriterion("USER_ORGWORK_TYPE in", values, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeNotIn(List<String> values) {
            addCriterion("USER_ORGWORK_TYPE not in", values, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeBetween(String value1, String value2) {
            addCriterion("USER_ORGWORK_TYPE between", value1, value2, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserOrgworkTypeNotBetween(String value1, String value2) {
            addCriterion("USER_ORGWORK_TYPE not between", value1, value2, "userOrgworkType");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderIsNull() {
            addCriterion("USER_DISPLAY_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderIsNotNull() {
            addCriterion("USER_DISPLAY_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderEqualTo(Integer value) {
            addCriterion("USER_DISPLAY_ORDER =", value, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderNotEqualTo(Integer value) {
            addCriterion("USER_DISPLAY_ORDER <>", value, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderGreaterThan(Integer value) {
            addCriterion("USER_DISPLAY_ORDER >", value, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_DISPLAY_ORDER >=", value, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderLessThan(Integer value) {
            addCriterion("USER_DISPLAY_ORDER <", value, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("USER_DISPLAY_ORDER <=", value, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderIn(List<Integer> values) {
            addCriterion("USER_DISPLAY_ORDER in", values, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderNotIn(List<Integer> values) {
            addCriterion("USER_DISPLAY_ORDER not in", values, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("USER_DISPLAY_ORDER between", value1, value2, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_DISPLAY_ORDER not between", value1, value2, "userDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictIsNull() {
            addCriterion("USER_ORGDUTY_DICT is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictIsNotNull() {
            addCriterion("USER_ORGDUTY_DICT is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictEqualTo(Integer value) {
            addCriterion("USER_ORGDUTY_DICT =", value, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictNotEqualTo(Integer value) {
            addCriterion("USER_ORGDUTY_DICT <>", value, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictGreaterThan(Integer value) {
            addCriterion("USER_ORGDUTY_DICT >", value, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ORGDUTY_DICT >=", value, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictLessThan(Integer value) {
            addCriterion("USER_ORGDUTY_DICT <", value, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ORGDUTY_DICT <=", value, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictIn(List<Integer> values) {
            addCriterion("USER_ORGDUTY_DICT in", values, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictNotIn(List<Integer> values) {
            addCriterion("USER_ORGDUTY_DICT not in", values, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictBetween(Integer value1, Integer value2) {
            addCriterion("USER_ORGDUTY_DICT between", value1, value2, "userOrgdutyDict");
            return (Criteria) this;
        }

        public Criteria andUserOrgdutyDictNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ORGDUTY_DICT not between", value1, value2, "userOrgdutyDict");
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

        public Criteria andUserOrgworkTypeLikeInsensitive(String value) {
            addCriterion("upper(USER_ORGWORK_TYPE) like", value.toUpperCase(), "userOrgworkType");
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