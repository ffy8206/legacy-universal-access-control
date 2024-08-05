package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.Page;
public class AuthDatarangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

	protected Page page;
    public AuthDatarangeExample() {
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

        public Criteria andDatarangeIdIsNull() {
            addCriterion("DATARANGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdIsNotNull() {
            addCriterion("DATARANGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdEqualTo(Long value) {
            addCriterion("DATARANGE_ID =", value, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdNotEqualTo(Long value) {
            addCriterion("DATARANGE_ID <>", value, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdGreaterThan(Long value) {
            addCriterion("DATARANGE_ID >", value, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DATARANGE_ID >=", value, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdLessThan(Long value) {
            addCriterion("DATARANGE_ID <", value, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdLessThanOrEqualTo(Long value) {
            addCriterion("DATARANGE_ID <=", value, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdIn(List<Long> values) {
            addCriterion("DATARANGE_ID in", values, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdNotIn(List<Long> values) {
            addCriterion("DATARANGE_ID not in", values, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdBetween(Long value1, Long value2) {
            addCriterion("DATARANGE_ID between", value1, value2, "datarangeId");
            return (Criteria) this;
        }

        public Criteria andDatarangeIdNotBetween(Long value1, Long value2) {
            addCriterion("DATARANGE_ID not between", value1, value2, "datarangeId");
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

        public Criteria andDatarangeCodeIsNull() {
            addCriterion("DATARANGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeIsNotNull() {
            addCriterion("DATARANGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeEqualTo(String value) {
            addCriterion("DATARANGE_CODE =", value, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeNotEqualTo(String value) {
            addCriterion("DATARANGE_CODE <>", value, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeGreaterThan(String value) {
            addCriterion("DATARANGE_CODE >", value, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DATARANGE_CODE >=", value, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeLessThan(String value) {
            addCriterion("DATARANGE_CODE <", value, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeLessThanOrEqualTo(String value) {
            addCriterion("DATARANGE_CODE <=", value, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeLike(String value) {
            addCriterion("DATARANGE_CODE like", value, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeNotLike(String value) {
            addCriterion("DATARANGE_CODE not like", value, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeIn(List<String> values) {
            addCriterion("DATARANGE_CODE in", values, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeNotIn(List<String> values) {
            addCriterion("DATARANGE_CODE not in", values, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeBetween(String value1, String value2) {
            addCriterion("DATARANGE_CODE between", value1, value2, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeCodeNotBetween(String value1, String value2) {
            addCriterion("DATARANGE_CODE not between", value1, value2, "datarangeCode");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameIsNull() {
            addCriterion("DATARANGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameIsNotNull() {
            addCriterion("DATARANGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameEqualTo(String value) {
            addCriterion("DATARANGE_NAME =", value, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameNotEqualTo(String value) {
            addCriterion("DATARANGE_NAME <>", value, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameGreaterThan(String value) {
            addCriterion("DATARANGE_NAME >", value, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameGreaterThanOrEqualTo(String value) {
            addCriterion("DATARANGE_NAME >=", value, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameLessThan(String value) {
            addCriterion("DATARANGE_NAME <", value, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameLessThanOrEqualTo(String value) {
            addCriterion("DATARANGE_NAME <=", value, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameLike(String value) {
            addCriterion("DATARANGE_NAME like", value, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameNotLike(String value) {
            addCriterion("DATARANGE_NAME not like", value, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameIn(List<String> values) {
            addCriterion("DATARANGE_NAME in", values, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameNotIn(List<String> values) {
            addCriterion("DATARANGE_NAME not in", values, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameBetween(String value1, String value2) {
            addCriterion("DATARANGE_NAME between", value1, value2, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeNameNotBetween(String value1, String value2) {
            addCriterion("DATARANGE_NAME not between", value1, value2, "datarangeName");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueIsNull() {
            addCriterion("DATARANGE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueIsNotNull() {
            addCriterion("DATARANGE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueEqualTo(String value) {
            addCriterion("DATARANGE_VALUE =", value, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueNotEqualTo(String value) {
            addCriterion("DATARANGE_VALUE <>", value, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueGreaterThan(String value) {
            addCriterion("DATARANGE_VALUE >", value, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueGreaterThanOrEqualTo(String value) {
            addCriterion("DATARANGE_VALUE >=", value, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueLessThan(String value) {
            addCriterion("DATARANGE_VALUE <", value, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueLessThanOrEqualTo(String value) {
            addCriterion("DATARANGE_VALUE <=", value, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueLike(String value) {
            addCriterion("DATARANGE_VALUE like", value, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueNotLike(String value) {
            addCriterion("DATARANGE_VALUE not like", value, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueIn(List<String> values) {
            addCriterion("DATARANGE_VALUE in", values, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueNotIn(List<String> values) {
            addCriterion("DATARANGE_VALUE not in", values, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueBetween(String value1, String value2) {
            addCriterion("DATARANGE_VALUE between", value1, value2, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeValueNotBetween(String value1, String value2) {
            addCriterion("DATARANGE_VALUE not between", value1, value2, "datarangeValue");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionIsNull() {
            addCriterion("DATARANGE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionIsNotNull() {
            addCriterion("DATARANGE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionEqualTo(String value) {
            addCriterion("DATARANGE_DESCRIPTION =", value, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionNotEqualTo(String value) {
            addCriterion("DATARANGE_DESCRIPTION <>", value, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionGreaterThan(String value) {
            addCriterion("DATARANGE_DESCRIPTION >", value, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DATARANGE_DESCRIPTION >=", value, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionLessThan(String value) {
            addCriterion("DATARANGE_DESCRIPTION <", value, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DATARANGE_DESCRIPTION <=", value, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionLike(String value) {
            addCriterion("DATARANGE_DESCRIPTION like", value, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionNotLike(String value) {
            addCriterion("DATARANGE_DESCRIPTION not like", value, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionIn(List<String> values) {
            addCriterion("DATARANGE_DESCRIPTION in", values, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionNotIn(List<String> values) {
            addCriterion("DATARANGE_DESCRIPTION not in", values, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionBetween(String value1, String value2) {
            addCriterion("DATARANGE_DESCRIPTION between", value1, value2, "datarangeDescription");
            return (Criteria) this;
        }

        public Criteria andDatarangeDescriptionNotBetween(String value1, String value2) {
            addCriterion("DATARANGE_DESCRIPTION not between", value1, value2, "datarangeDescription");
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
	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}