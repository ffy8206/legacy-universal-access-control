package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExtendDataTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtendDataTypeExample() {
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

        public Criteria andExtendDataTypeNameIsNull() {
            addCriterion("EXTEND_DATA_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameIsNotNull() {
            addCriterion("EXTEND_DATA_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_NAME =", value, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameNotEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_NAME <>", value, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameGreaterThan(String value) {
            addCriterion("EXTEND_DATA_TYPE_NAME >", value, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_NAME >=", value, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameLessThan(String value) {
            addCriterion("EXTEND_DATA_TYPE_NAME <", value, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_NAME <=", value, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameLike(String value) {
            addCriterion("EXTEND_DATA_TYPE_NAME like", value, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameNotLike(String value) {
            addCriterion("EXTEND_DATA_TYPE_NAME not like", value, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameIn(List<String> values) {
            addCriterion("EXTEND_DATA_TYPE_NAME in", values, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameNotIn(List<String> values) {
            addCriterion("EXTEND_DATA_TYPE_NAME not in", values, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_TYPE_NAME between", value1, value2, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeNameNotBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_TYPE_NAME not between", value1, value2, "extendDataTypeName");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceIsNull() {
            addCriterion("EXTEND_DATA_TYPE_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceIsNotNull() {
            addCriterion("EXTEND_DATA_TYPE_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE =", value, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceNotEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE <>", value, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceGreaterThan(String value) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE >", value, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE >=", value, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceLessThan(String value) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE <", value, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE <=", value, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceLike(String value) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE like", value, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceNotLike(String value) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE not like", value, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceIn(List<String> values) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE in", values, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceNotIn(List<String> values) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE not in", values, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE between", value1, value2, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeSourceNotBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_TYPE_SOURCE not between", value1, value2, "extendDataTypeSource");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeIsNull() {
            addCriterion("EXTEND_DATA_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeIsNotNull() {
            addCriterion("EXTEND_DATA_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_CODE =", value, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeNotEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_CODE <>", value, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeGreaterThan(String value) {
            addCriterion("EXTEND_DATA_TYPE_CODE >", value, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_CODE >=", value, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeLessThan(String value) {
            addCriterion("EXTEND_DATA_TYPE_CODE <", value, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_CODE <=", value, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeLike(String value) {
            addCriterion("EXTEND_DATA_TYPE_CODE like", value, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeNotLike(String value) {
            addCriterion("EXTEND_DATA_TYPE_CODE not like", value, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeIn(List<String> values) {
            addCriterion("EXTEND_DATA_TYPE_CODE in", values, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeNotIn(List<String> values) {
            addCriterion("EXTEND_DATA_TYPE_CODE not in", values, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_TYPE_CODE between", value1, value2, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeCodeNotBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_TYPE_CODE not between", value1, value2, "extendDataTypeCode");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleIsNull() {
            addCriterion("EXTEND_DATA_TYPE_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleIsNotNull() {
            addCriterion("EXTEND_DATA_TYPE_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleEqualTo(Integer value) {
            addCriterion("EXTEND_DATA_TYPE_STYLE =", value, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleNotEqualTo(Integer value) {
            addCriterion("EXTEND_DATA_TYPE_STYLE <>", value, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleGreaterThan(Integer value) {
            addCriterion("EXTEND_DATA_TYPE_STYLE >", value, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXTEND_DATA_TYPE_STYLE >=", value, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleLessThan(Integer value) {
            addCriterion("EXTEND_DATA_TYPE_STYLE <", value, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleLessThanOrEqualTo(Integer value) {
            addCriterion("EXTEND_DATA_TYPE_STYLE <=", value, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleIn(List<Integer> values) {
            addCriterion("EXTEND_DATA_TYPE_STYLE in", values, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleNotIn(List<Integer> values) {
            addCriterion("EXTEND_DATA_TYPE_STYLE not in", values, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleBetween(Integer value1, Integer value2) {
            addCriterion("EXTEND_DATA_TYPE_STYLE between", value1, value2, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("EXTEND_DATA_TYPE_STYLE not between", value1, value2, "extendDataTypeStyle");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionIsNull() {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionIsNotNull() {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION =", value, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionNotEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION <>", value, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionGreaterThan(String value) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION >", value, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION >=", value, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionLessThan(String value) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION <", value, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionLessThanOrEqualTo(String value) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION <=", value, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionLike(String value) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION like", value, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionNotLike(String value) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION not like", value, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionIn(List<String> values) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION in", values, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionNotIn(List<String> values) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION not in", values, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION between", value1, value2, "extendDataTypeDescription");
            return (Criteria) this;
        }

        public Criteria andExtendDataTypeDescriptionNotBetween(String value1, String value2) {
            addCriterion("EXTEND_DATA_TYPE_DESCRIPTION not between", value1, value2, "extendDataTypeDescription");
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

        public Criteria andExtendDataTypeNameLikeInsensitive(String value) {
            addCriterion("upper(EXTEND_DATA_TYPE_NAME) like", value.toUpperCase(), "extendDataTypeName");
            return this;
        }

        public Criteria andExtendDataTypeSourceLikeInsensitive(String value) {
            addCriterion("upper(EXTEND_DATA_TYPE_SOURCE) like", value.toUpperCase(), "extendDataTypeSource");
            return this;
        }

        public Criteria andExtendDataTypeCodeLikeInsensitive(String value) {
            addCriterion("upper(EXTEND_DATA_TYPE_CODE) like", value.toUpperCase(), "extendDataTypeCode");
            return this;
        }

        public Criteria andExtendDataTypeDescriptionLikeInsensitive(String value) {
            addCriterion("upper(EXTEND_DATA_TYPE_DESCRIPTION) like", value.toUpperCase(), "extendDataTypeDescription");
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