package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.Page;
public class AuthPrivilegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

	protected Page page;
    public AuthPrivilegeExample() {
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

        public Criteria andPrivilegeIdIsNull() {
            addCriterion("PRIVILEGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdIsNotNull() {
            addCriterion("PRIVILEGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdEqualTo(Long value) {
            addCriterion("PRIVILEGE_ID =", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdNotEqualTo(Long value) {
            addCriterion("PRIVILEGE_ID <>", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdGreaterThan(Long value) {
            addCriterion("PRIVILEGE_ID >", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PRIVILEGE_ID >=", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdLessThan(Long value) {
            addCriterion("PRIVILEGE_ID <", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdLessThanOrEqualTo(Long value) {
            addCriterion("PRIVILEGE_ID <=", value, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdIn(List<Long> values) {
            addCriterion("PRIVILEGE_ID in", values, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdNotIn(List<Long> values) {
            addCriterion("PRIVILEGE_ID not in", values, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdBetween(Long value1, Long value2) {
            addCriterion("PRIVILEGE_ID between", value1, value2, "privilegeId");
            return (Criteria) this;
        }

        public Criteria andPrivilegeIdNotBetween(Long value1, Long value2) {
            addCriterion("PRIVILEGE_ID not between", value1, value2, "privilegeId");
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

        public Criteria andPrivilegeCodeIsNull() {
            addCriterion("PRIVILEGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeIsNotNull() {
            addCriterion("PRIVILEGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeEqualTo(String value) {
            addCriterion("PRIVILEGE_CODE =", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeNotEqualTo(String value) {
            addCriterion("PRIVILEGE_CODE <>", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeGreaterThan(String value) {
            addCriterion("PRIVILEGE_CODE >", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_CODE >=", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeLessThan(String value) {
            addCriterion("PRIVILEGE_CODE <", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeLessThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_CODE <=", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeLike(String value) {
            addCriterion("PRIVILEGE_CODE like", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeNotLike(String value) {
            addCriterion("PRIVILEGE_CODE not like", value, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeIn(List<String> values) {
            addCriterion("PRIVILEGE_CODE in", values, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeNotIn(List<String> values) {
            addCriterion("PRIVILEGE_CODE not in", values, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_CODE between", value1, value2, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeCodeNotBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_CODE not between", value1, value2, "privilegeCode");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameIsNull() {
            addCriterion("PRIVILEGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameIsNotNull() {
            addCriterion("PRIVILEGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameEqualTo(String value) {
            addCriterion("PRIVILEGE_NAME =", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameNotEqualTo(String value) {
            addCriterion("PRIVILEGE_NAME <>", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameGreaterThan(String value) {
            addCriterion("PRIVILEGE_NAME >", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_NAME >=", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameLessThan(String value) {
            addCriterion("PRIVILEGE_NAME <", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameLessThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_NAME <=", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameLike(String value) {
            addCriterion("PRIVILEGE_NAME like", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameNotLike(String value) {
            addCriterion("PRIVILEGE_NAME not like", value, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameIn(List<String> values) {
            addCriterion("PRIVILEGE_NAME in", values, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameNotIn(List<String> values) {
            addCriterion("PRIVILEGE_NAME not in", values, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_NAME between", value1, value2, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeNameNotBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_NAME not between", value1, value2, "privilegeName");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionIsNull() {
            addCriterion("PRIVILEGE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionIsNotNull() {
            addCriterion("PRIVILEGE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionEqualTo(String value) {
            addCriterion("PRIVILEGE_DESCRIPTION =", value, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionNotEqualTo(String value) {
            addCriterion("PRIVILEGE_DESCRIPTION <>", value, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionGreaterThan(String value) {
            addCriterion("PRIVILEGE_DESCRIPTION >", value, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_DESCRIPTION >=", value, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionLessThan(String value) {
            addCriterion("PRIVILEGE_DESCRIPTION <", value, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_DESCRIPTION <=", value, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionLike(String value) {
            addCriterion("PRIVILEGE_DESCRIPTION like", value, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionNotLike(String value) {
            addCriterion("PRIVILEGE_DESCRIPTION not like", value, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionIn(List<String> values) {
            addCriterion("PRIVILEGE_DESCRIPTION in", values, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionNotIn(List<String> values) {
            addCriterion("PRIVILEGE_DESCRIPTION not in", values, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_DESCRIPTION between", value1, value2, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeDescriptionNotBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_DESCRIPTION not between", value1, value2, "privilegeDescription");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkIsNull() {
            addCriterion("PRIVILEGE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkIsNotNull() {
            addCriterion("PRIVILEGE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkEqualTo(String value) {
            addCriterion("PRIVILEGE_REMARK =", value, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkNotEqualTo(String value) {
            addCriterion("PRIVILEGE_REMARK <>", value, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkGreaterThan(String value) {
            addCriterion("PRIVILEGE_REMARK >", value, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_REMARK >=", value, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkLessThan(String value) {
            addCriterion("PRIVILEGE_REMARK <", value, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkLessThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_REMARK <=", value, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkLike(String value) {
            addCriterion("PRIVILEGE_REMARK like", value, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkNotLike(String value) {
            addCriterion("PRIVILEGE_REMARK not like", value, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkIn(List<String> values) {
            addCriterion("PRIVILEGE_REMARK in", values, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkNotIn(List<String> values) {
            addCriterion("PRIVILEGE_REMARK not in", values, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_REMARK between", value1, value2, "privilegeRemark");
            return (Criteria) this;
        }

        public Criteria andPrivilegeRemarkNotBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_REMARK not between", value1, value2, "privilegeRemark");
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