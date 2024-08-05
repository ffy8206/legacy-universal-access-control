package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.Page;

public class AuthRoleExample {
    protected String orderByClause;

    protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected Page page;

    public AuthRoleExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
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

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderIsNull() {
            addCriterion("ROLE_DISPLAY_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderIsNotNull() {
            addCriterion("ROLE_DISPLAY_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderEqualTo(Integer value) {
            addCriterion("ROLE_DISPLAY_ORDER =", value, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderNotEqualTo(Integer value) {
            addCriterion("ROLE_DISPLAY_ORDER <>", value, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderGreaterThan(Integer value) {
            addCriterion("ROLE_DISPLAY_ORDER >", value, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLE_DISPLAY_ORDER >=", value, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderLessThan(Integer value) {
            addCriterion("ROLE_DISPLAY_ORDER <", value, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("ROLE_DISPLAY_ORDER <=", value, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderIn(List<Integer> values) {
            addCriterion("ROLE_DISPLAY_ORDER in", values, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderNotIn(List<Integer> values) {
            addCriterion("ROLE_DISPLAY_ORDER not in", values, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_DISPLAY_ORDER between", value1, value2, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLE_DISPLAY_ORDER not between", value1, value2, "roleDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIsNull() {
            addCriterion("ROLE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIsNotNull() {
            addCriterion("ROLE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION =", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION <>", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionGreaterThan(String value) {
            addCriterion("ROLE_DESCRIPTION >", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION >=", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLessThan(String value) {
            addCriterion("ROLE_DESCRIPTION <", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ROLE_DESCRIPTION <=", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionLike(String value) {
            addCriterion("ROLE_DESCRIPTION like", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotLike(String value) {
            addCriterion("ROLE_DESCRIPTION not like", value, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionIn(List<String> values) {
            addCriterion("ROLE_DESCRIPTION in", values, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotIn(List<String> values) {
            addCriterion("ROLE_DESCRIPTION not in", values, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionBetween(String value1, String value2) {
            addCriterion("ROLE_DESCRIPTION between", value1, value2, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleDescriptionNotBetween(String value1, String value2) {
            addCriterion("ROLE_DESCRIPTION not between", value1, value2, "roleDescription");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkIsNull() {
            addCriterion("ROLE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkIsNotNull() {
            addCriterion("ROLE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkEqualTo(String value) {
            addCriterion("ROLE_REMARK =", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotEqualTo(String value) {
            addCriterion("ROLE_REMARK <>", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkGreaterThan(String value) {
            addCriterion("ROLE_REMARK >", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_REMARK >=", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLessThan(String value) {
            addCriterion("ROLE_REMARK <", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLessThanOrEqualTo(String value) {
            addCriterion("ROLE_REMARK <=", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkLike(String value) {
            addCriterion("ROLE_REMARK like", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotLike(String value) {
            addCriterion("ROLE_REMARK not like", value, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkIn(List<String> values) {
            addCriterion("ROLE_REMARK in", values, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotIn(List<String> values) {
            addCriterion("ROLE_REMARK not in", values, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkBetween(String value1, String value2) {
            addCriterion("ROLE_REMARK between", value1, value2, "roleRemark");
            return (Criteria) this;
        }

        public Criteria andRoleRemarkNotBetween(String value1, String value2) {
            addCriterion("ROLE_REMARK not between", value1, value2, "roleRemark");
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