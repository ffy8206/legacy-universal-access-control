package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.Page;


public class SyncIncStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected Page page;

    public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UUM.SYNC_INC_STATUS
     *
     * @mbggenerated Fri Feb 24 13:45:53 CST 2012
     */

    public SyncIncStatusExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andSyncStatusIsNull() {
            addCriterion("SYNC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIsNotNull() {
            addCriterion("SYNC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSyncStatusEqualTo(Short value) {
            addCriterion("SYNC_STATUS =", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotEqualTo(Short value) {
            addCriterion("SYNC_STATUS <>", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThan(Short value) {
            addCriterion("SYNC_STATUS >", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("SYNC_STATUS >=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThan(Short value) {
            addCriterion("SYNC_STATUS <", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusLessThanOrEqualTo(Short value) {
            addCriterion("SYNC_STATUS <=", value, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusIn(List<Short> values) {
            addCriterion("SYNC_STATUS in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotIn(List<Short> values) {
            addCriterion("SYNC_STATUS not in", values, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusBetween(Short value1, Short value2) {
            addCriterion("SYNC_STATUS between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncStatusNotBetween(Short value1, Short value2) {
            addCriterion("SYNC_STATUS not between", value1, value2, "syncStatus");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsIsNull() {
            addCriterion("SYNC_FAIL_DETAILS is null");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsIsNotNull() {
            addCriterion("SYNC_FAIL_DETAILS is not null");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsEqualTo(String value) {
            addCriterion("SYNC_FAIL_DETAILS =", value, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsNotEqualTo(String value) {
            addCriterion("SYNC_FAIL_DETAILS <>", value, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsGreaterThan(String value) {
            addCriterion("SYNC_FAIL_DETAILS >", value, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_FAIL_DETAILS >=", value, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsLessThan(String value) {
            addCriterion("SYNC_FAIL_DETAILS <", value, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsLessThanOrEqualTo(String value) {
            addCriterion("SYNC_FAIL_DETAILS <=", value, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsLike(String value) {
            addCriterion("SYNC_FAIL_DETAILS like", value, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsNotLike(String value) {
            addCriterion("SYNC_FAIL_DETAILS not like", value, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsIn(List<String> values) {
            addCriterion("SYNC_FAIL_DETAILS in", values, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsNotIn(List<String> values) {
            addCriterion("SYNC_FAIL_DETAILS not in", values, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsBetween(String value1, String value2) {
            addCriterion("SYNC_FAIL_DETAILS between", value1, value2, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncFailDetailsNotBetween(String value1, String value2) {
            addCriterion("SYNC_FAIL_DETAILS not between", value1, value2, "syncFailDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsIsNull() {
            addCriterion("SYNC_SUCCESS_DETAILS is null");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsIsNotNull() {
            addCriterion("SYNC_SUCCESS_DETAILS is not null");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsEqualTo(String value) {
            addCriterion("SYNC_SUCCESS_DETAILS =", value, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsNotEqualTo(String value) {
            addCriterion("SYNC_SUCCESS_DETAILS <>", value, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsGreaterThan(String value) {
            addCriterion("SYNC_SUCCESS_DETAILS >", value, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("SYNC_SUCCESS_DETAILS >=", value, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsLessThan(String value) {
            addCriterion("SYNC_SUCCESS_DETAILS <", value, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsLessThanOrEqualTo(String value) {
            addCriterion("SYNC_SUCCESS_DETAILS <=", value, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsLike(String value) {
            addCriterion("SYNC_SUCCESS_DETAILS like", value, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsNotLike(String value) {
            addCriterion("SYNC_SUCCESS_DETAILS not like", value, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsIn(List<String> values) {
            addCriterion("SYNC_SUCCESS_DETAILS in", values, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsNotIn(List<String> values) {
            addCriterion("SYNC_SUCCESS_DETAILS not in", values, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsBetween(String value1, String value2) {
            addCriterion("SYNC_SUCCESS_DETAILS between", value1, value2, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andSyncSuccessDetailsNotBetween(String value1, String value2) {
            addCriterion("SYNC_SUCCESS_DETAILS not between", value1, value2, "syncSuccessDetails");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andSyncFailDetailsLikeInsensitive(String value) {
            addCriterion("upper(SYNC_FAIL_DETAILS) like", value.toUpperCase(), "syncFailDetails");
            return this;
        }

        public Criteria andSyncSuccessDetailsLikeInsensitive(String value) {
            addCriterion("upper(SYNC_SUCCESS_DETAILS) like", value.toUpperCase(), "syncSuccessDetails");
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