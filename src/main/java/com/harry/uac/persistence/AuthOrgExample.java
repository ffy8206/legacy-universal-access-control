package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.Page;

public class AuthOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected Page page;

    public AuthOrgExample() {
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

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsIsNull() {
            addCriterion("ORG_INITIALS is null");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsIsNotNull() {
            addCriterion("ORG_INITIALS is not null");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsEqualTo(String value) {
            addCriterion("ORG_INITIALS =", value, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsNotEqualTo(String value) {
            addCriterion("ORG_INITIALS <>", value, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsGreaterThan(String value) {
            addCriterion("ORG_INITIALS >", value, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_INITIALS >=", value, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsLessThan(String value) {
            addCriterion("ORG_INITIALS <", value, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsLessThanOrEqualTo(String value) {
            addCriterion("ORG_INITIALS <=", value, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsLike(String value) {
            addCriterion("ORG_INITIALS like", value, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsNotLike(String value) {
            addCriterion("ORG_INITIALS not like", value, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsIn(List<String> values) {
            addCriterion("ORG_INITIALS in", values, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsNotIn(List<String> values) {
            addCriterion("ORG_INITIALS not in", values, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsBetween(String value1, String value2) {
            addCriterion("ORG_INITIALS between", value1, value2, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgInitialsNotBetween(String value1, String value2) {
            addCriterion("ORG_INITIALS not between", value1, value2, "orgInitials");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIsNull() {
            addCriterion("ORG_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIsNotNull() {
            addCriterion("ORG_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionEqualTo(String value) {
            addCriterion("ORG_DESCRIPTION =", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotEqualTo(String value) {
            addCriterion("ORG_DESCRIPTION <>", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionGreaterThan(String value) {
            addCriterion("ORG_DESCRIPTION >", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_DESCRIPTION >=", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLessThan(String value) {
            addCriterion("ORG_DESCRIPTION <", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ORG_DESCRIPTION <=", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLike(String value) {
            addCriterion("ORG_DESCRIPTION like", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotLike(String value) {
            addCriterion("ORG_DESCRIPTION not like", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIn(List<String> values) {
            addCriterion("ORG_DESCRIPTION in", values, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotIn(List<String> values) {
            addCriterion("ORG_DESCRIPTION not in", values, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionBetween(String value1, String value2) {
            addCriterion("ORG_DESCRIPTION between", value1, value2, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotBetween(String value1, String value2) {
            addCriterion("ORG_DESCRIPTION not between", value1, value2, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgStyleIsNull() {
            addCriterion("ORG_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andOrgStyleIsNotNull() {
            addCriterion("ORG_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStyleEqualTo(Integer value) {
            addCriterion("ORG_STYLE =", value, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleNotEqualTo(Integer value) {
            addCriterion("ORG_STYLE <>", value, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleGreaterThan(Integer value) {
            addCriterion("ORG_STYLE >", value, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_STYLE >=", value, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleLessThan(Integer value) {
            addCriterion("ORG_STYLE <", value, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_STYLE <=", value, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleIn(List<Integer> values) {
            addCriterion("ORG_STYLE in", values, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleNotIn(List<Integer> values) {
            addCriterion("ORG_STYLE not in", values, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleBetween(Integer value1, Integer value2) {
            addCriterion("ORG_STYLE between", value1, value2, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_STYLE not between", value1, value2, "orgStyle");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNull() {
            addCriterion("ORG_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIsNotNull() {
            addCriterion("ORG_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStatusEqualTo(Integer value) {
            addCriterion("ORG_STATUS =", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotEqualTo(Integer value) {
            addCriterion("ORG_STATUS <>", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThan(Integer value) {
            addCriterion("ORG_STATUS >", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_STATUS >=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThan(Integer value) {
            addCriterion("ORG_STATUS <", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_STATUS <=", value, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusIn(List<Integer> values) {
            addCriterion("ORG_STATUS in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotIn(List<Integer> values) {
            addCriterion("ORG_STATUS not in", values, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusBetween(Integer value1, Integer value2) {
            addCriterion("ORG_STATUS between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_STATUS not between", value1, value2, "orgStatus");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIsNull() {
            addCriterion("ORG_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIsNotNull() {
            addCriterion("ORG_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdEqualTo(String value) {
            addCriterion("ORG_PARENT_ID =", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotEqualTo(String value) {
            addCriterion("ORG_PARENT_ID <>", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdGreaterThan(String value) {
            addCriterion("ORG_PARENT_ID >", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_PARENT_ID >=", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLessThan(String value) {
            addCriterion("ORG_PARENT_ID <", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_PARENT_ID <=", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdIn(List<String> values) {
            addCriterion("ORG_PARENT_ID in", values, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotIn(List<String> values) {
            addCriterion("ORG_PARENT_ID not in", values, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdBetween(String value1, String value2) {
            addCriterion("ORG_PARENT_ID between", value1, value2, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotBetween(String value1, String value2) {
            addCriterion("ORG_PARENT_ID not between", value1, value2, "orgParentId");
            return (Criteria) this;
        }
        
        public Criteria andOrgParentIdLike(String value) {
            addCriterion("ORG_PARENT_ID like", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgParentIdNotLike(String value) {
            addCriterion("ORG_PARENT_ID not like", value, "orgParentId");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeIsNull() {
            addCriterion("ORG_LAYER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeIsNotNull() {
            addCriterion("ORG_LAYER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeEqualTo(String value) {
            addCriterion("ORG_LAYER_CODE =", value, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeNotEqualTo(String value) {
            addCriterion("ORG_LAYER_CODE <>", value, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeGreaterThan(String value) {
            addCriterion("ORG_LAYER_CODE >", value, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_LAYER_CODE >=", value, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeLessThan(String value) {
            addCriterion("ORG_LAYER_CODE <", value, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_LAYER_CODE <=", value, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeLike(String value) {
            addCriterion("ORG_LAYER_CODE like", value, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeNotLike(String value) {
            addCriterion("ORG_LAYER_CODE not like", value, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeIn(List<String> values) {
            addCriterion("ORG_LAYER_CODE in", values, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeNotIn(List<String> values) {
            addCriterion("ORG_LAYER_CODE not in", values, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeBetween(String value1, String value2) {
            addCriterion("ORG_LAYER_CODE between", value1, value2, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLayerCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_LAYER_CODE not between", value1, value2, "orgLayerCode");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictIsNull() {
            addCriterion("ORG_LEVEL_DICT is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictIsNotNull() {
            addCriterion("ORG_LEVEL_DICT is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictEqualTo(Integer value) {
            addCriterion("ORG_LEVEL_DICT =", value, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictNotEqualTo(Integer value) {
            addCriterion("ORG_LEVEL_DICT <>", value, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictGreaterThan(Integer value) {
            addCriterion("ORG_LEVEL_DICT >", value, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_LEVEL_DICT >=", value, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictLessThan(Integer value) {
            addCriterion("ORG_LEVEL_DICT <", value, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_LEVEL_DICT <=", value, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictIn(List<Integer> values) {
            addCriterion("ORG_LEVEL_DICT in", values, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictNotIn(List<Integer> values) {
            addCriterion("ORG_LEVEL_DICT not in", values, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictBetween(Integer value1, Integer value2) {
            addCriterion("ORG_LEVEL_DICT between", value1, value2, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgLevelDictNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_LEVEL_DICT not between", value1, value2, "orgLevelDict");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderIsNull() {
            addCriterion("ORG_DISPLAY_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderIsNotNull() {
            addCriterion("ORG_DISPLAY_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderEqualTo(Integer value) {
            addCriterion("ORG_DISPLAY_ORDER =", value, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderNotEqualTo(Integer value) {
            addCriterion("ORG_DISPLAY_ORDER <>", value, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderGreaterThan(Integer value) {
            addCriterion("ORG_DISPLAY_ORDER >", value, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_DISPLAY_ORDER >=", value, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderLessThan(Integer value) {
            addCriterion("ORG_DISPLAY_ORDER <", value, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_DISPLAY_ORDER <=", value, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderIn(List<Integer> values) {
            addCriterion("ORG_DISPLAY_ORDER in", values, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderNotIn(List<Integer> values) {
            addCriterion("ORG_DISPLAY_ORDER not in", values, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderBetween(Integer value1, Integer value2) {
            addCriterion("ORG_DISPLAY_ORDER between", value1, value2, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgDisplayOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_DISPLAY_ORDER not between", value1, value2, "orgDisplayOrder");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidIsNull() {
            addCriterion("ORG_SUPERVISOR_UID is null");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidIsNotNull() {
            addCriterion("ORG_SUPERVISOR_UID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidEqualTo(String value) {
            addCriterion("ORG_SUPERVISOR_UID =", value, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidNotEqualTo(String value) {
            addCriterion("ORG_SUPERVISOR_UID <>", value, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidGreaterThan(String value) {
            addCriterion("ORG_SUPERVISOR_UID >", value, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SUPERVISOR_UID >=", value, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidLessThan(String value) {
            addCriterion("ORG_SUPERVISOR_UID <", value, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidLessThanOrEqualTo(String value) {
            addCriterion("ORG_SUPERVISOR_UID <=", value, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidLike(String value) {
            addCriterion("ORG_SUPERVISOR_UID like", value, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidNotLike(String value) {
            addCriterion("ORG_SUPERVISOR_UID not like", value, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidIn(List<String> values) {
            addCriterion("ORG_SUPERVISOR_UID in", values, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidNotIn(List<String> values) {
            addCriterion("ORG_SUPERVISOR_UID not in", values, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidBetween(String value1, String value2) {
            addCriterion("ORG_SUPERVISOR_UID between", value1, value2, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgSupervisorUidNotBetween(String value1, String value2) {
            addCriterion("ORG_SUPERVISOR_UID not between", value1, value2, "orgSupervisorUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidIsNull() {
            addCriterion("ORG_MANAGER_UID is null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidIsNotNull() {
            addCriterion("ORG_MANAGER_UID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidEqualTo(String value) {
            addCriterion("ORG_MANAGER_UID =", value, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidNotEqualTo(String value) {
            addCriterion("ORG_MANAGER_UID <>", value, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidGreaterThan(String value) {
            addCriterion("ORG_MANAGER_UID >", value, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGER_UID >=", value, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidLessThan(String value) {
            addCriterion("ORG_MANAGER_UID <", value, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidLessThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGER_UID <=", value, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidLike(String value) {
            addCriterion("ORG_MANAGER_UID like", value, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidNotLike(String value) {
            addCriterion("ORG_MANAGER_UID not like", value, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidIn(List<String> values) {
            addCriterion("ORG_MANAGER_UID in", values, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidNotIn(List<String> values) {
            addCriterion("ORG_MANAGER_UID not in", values, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidBetween(String value1, String value2) {
            addCriterion("ORG_MANAGER_UID between", value1, value2, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgManagerUidNotBetween(String value1, String value2) {
            addCriterion("ORG_MANAGER_UID not between", value1, value2, "orgManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidIsNull() {
            addCriterion("ORG_VICE_MANAGER_UID is null");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidIsNotNull() {
            addCriterion("ORG_VICE_MANAGER_UID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidEqualTo(String value) {
            addCriterion("ORG_VICE_MANAGER_UID =", value, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidNotEqualTo(String value) {
            addCriterion("ORG_VICE_MANAGER_UID <>", value, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidGreaterThan(String value) {
            addCriterion("ORG_VICE_MANAGER_UID >", value, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_VICE_MANAGER_UID >=", value, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidLessThan(String value) {
            addCriterion("ORG_VICE_MANAGER_UID <", value, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidLessThanOrEqualTo(String value) {
            addCriterion("ORG_VICE_MANAGER_UID <=", value, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidLike(String value) {
            addCriterion("ORG_VICE_MANAGER_UID like", value, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidNotLike(String value) {
            addCriterion("ORG_VICE_MANAGER_UID not like", value, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidIn(List<String> values) {
            addCriterion("ORG_VICE_MANAGER_UID in", values, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidNotIn(List<String> values) {
            addCriterion("ORG_VICE_MANAGER_UID not in", values, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidBetween(String value1, String value2) {
            addCriterion("ORG_VICE_MANAGER_UID between", value1, value2, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgViceManagerUidNotBetween(String value1, String value2) {
            addCriterion("ORG_VICE_MANAGER_UID not between", value1, value2, "orgViceManagerUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidIsNull() {
            addCriterion("ORG_ADMIN_UID is null");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidIsNotNull() {
            addCriterion("ORG_ADMIN_UID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidEqualTo(String value) {
            addCriterion("ORG_ADMIN_UID =", value, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidNotEqualTo(String value) {
            addCriterion("ORG_ADMIN_UID <>", value, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidGreaterThan(String value) {
            addCriterion("ORG_ADMIN_UID >", value, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ADMIN_UID >=", value, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidLessThan(String value) {
            addCriterion("ORG_ADMIN_UID <", value, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidLessThanOrEqualTo(String value) {
            addCriterion("ORG_ADMIN_UID <=", value, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidLike(String value) {
            addCriterion("ORG_ADMIN_UID like", value, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidNotLike(String value) {
            addCriterion("ORG_ADMIN_UID not like", value, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidIn(List<String> values) {
            addCriterion("ORG_ADMIN_UID in", values, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidNotIn(List<String> values) {
            addCriterion("ORG_ADMIN_UID not in", values, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidBetween(String value1, String value2) {
            addCriterion("ORG_ADMIN_UID between", value1, value2, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgAdminUidNotBetween(String value1, String value2) {
            addCriterion("ORG_ADMIN_UID not between", value1, value2, "orgAdminUid");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdIsNull() {
            addCriterion("ORG_MANAGE_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdIsNotNull() {
            addCriterion("ORG_MANAGE_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdEqualTo(String value) {
            addCriterion("ORG_MANAGE_ORG_ID =", value, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdNotEqualTo(String value) {
            addCriterion("ORG_MANAGE_ORG_ID <>", value, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdGreaterThan(String value) {
            addCriterion("ORG_MANAGE_ORG_ID >", value, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGE_ORG_ID >=", value, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdLessThan(String value) {
            addCriterion("ORG_MANAGE_ORG_ID <", value, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_MANAGE_ORG_ID <=", value, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdLike(String value) {
            addCriterion("ORG_MANAGE_ORG_ID like", value, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdNotLike(String value) {
            addCriterion("ORG_MANAGE_ORG_ID not like", value, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdIn(List<String> values) {
            addCriterion("ORG_MANAGE_ORG_ID in", values, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdNotIn(List<String> values) {
            addCriterion("ORG_MANAGE_ORG_ID not in", values, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_MANAGE_ORG_ID between", value1, value2, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgManageOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_MANAGE_ORG_ID not between", value1, value2, "orgManageOrgId");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressIsNull() {
            addCriterion("ORG_POSTAL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressIsNotNull() {
            addCriterion("ORG_POSTAL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressEqualTo(String value) {
            addCriterion("ORG_POSTAL_ADDRESS =", value, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressNotEqualTo(String value) {
            addCriterion("ORG_POSTAL_ADDRESS <>", value, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressGreaterThan(String value) {
            addCriterion("ORG_POSTAL_ADDRESS >", value, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_POSTAL_ADDRESS >=", value, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressLessThan(String value) {
            addCriterion("ORG_POSTAL_ADDRESS <", value, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressLessThanOrEqualTo(String value) {
            addCriterion("ORG_POSTAL_ADDRESS <=", value, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressLike(String value) {
            addCriterion("ORG_POSTAL_ADDRESS like", value, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressNotLike(String value) {
            addCriterion("ORG_POSTAL_ADDRESS not like", value, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressIn(List<String> values) {
            addCriterion("ORG_POSTAL_ADDRESS in", values, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressNotIn(List<String> values) {
            addCriterion("ORG_POSTAL_ADDRESS not in", values, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressBetween(String value1, String value2) {
            addCriterion("ORG_POSTAL_ADDRESS between", value1, value2, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalAddressNotBetween(String value1, String value2) {
            addCriterion("ORG_POSTAL_ADDRESS not between", value1, value2, "orgPostalAddress");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeIsNull() {
            addCriterion("ORG_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeIsNotNull() {
            addCriterion("ORG_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeEqualTo(String value) {
            addCriterion("ORG_POSTAL_CODE =", value, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeNotEqualTo(String value) {
            addCriterion("ORG_POSTAL_CODE <>", value, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeGreaterThan(String value) {
            addCriterion("ORG_POSTAL_CODE >", value, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_POSTAL_CODE >=", value, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeLessThan(String value) {
            addCriterion("ORG_POSTAL_CODE <", value, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_POSTAL_CODE <=", value, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeLike(String value) {
            addCriterion("ORG_POSTAL_CODE like", value, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeNotLike(String value) {
            addCriterion("ORG_POSTAL_CODE not like", value, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeIn(List<String> values) {
            addCriterion("ORG_POSTAL_CODE in", values, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeNotIn(List<String> values) {
            addCriterion("ORG_POSTAL_CODE not in", values, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeBetween(String value1, String value2) {
            addCriterion("ORG_POSTAL_CODE between", value1, value2, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgPostalCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_POSTAL_CODE not between", value1, value2, "orgPostalCode");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberIsNull() {
            addCriterion("ORG_TELEPHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberIsNotNull() {
            addCriterion("ORG_TELEPHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberEqualTo(String value) {
            addCriterion("ORG_TELEPHONE_NUMBER =", value, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberNotEqualTo(String value) {
            addCriterion("ORG_TELEPHONE_NUMBER <>", value, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberGreaterThan(String value) {
            addCriterion("ORG_TELEPHONE_NUMBER >", value, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_TELEPHONE_NUMBER >=", value, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberLessThan(String value) {
            addCriterion("ORG_TELEPHONE_NUMBER <", value, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberLessThanOrEqualTo(String value) {
            addCriterion("ORG_TELEPHONE_NUMBER <=", value, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberLike(String value) {
            addCriterion("ORG_TELEPHONE_NUMBER like", value, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberNotLike(String value) {
            addCriterion("ORG_TELEPHONE_NUMBER not like", value, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberIn(List<String> values) {
            addCriterion("ORG_TELEPHONE_NUMBER in", values, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberNotIn(List<String> values) {
            addCriterion("ORG_TELEPHONE_NUMBER not in", values, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberBetween(String value1, String value2) {
            addCriterion("ORG_TELEPHONE_NUMBER between", value1, value2, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgTelephoneNumberNotBetween(String value1, String value2) {
            addCriterion("ORG_TELEPHONE_NUMBER not between", value1, value2, "orgTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberIsNull() {
            addCriterion("ORG_FAX_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberIsNotNull() {
            addCriterion("ORG_FAX_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberEqualTo(String value) {
            addCriterion("ORG_FAX_NUMBER =", value, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberNotEqualTo(String value) {
            addCriterion("ORG_FAX_NUMBER <>", value, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberGreaterThan(String value) {
            addCriterion("ORG_FAX_NUMBER >", value, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_FAX_NUMBER >=", value, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberLessThan(String value) {
            addCriterion("ORG_FAX_NUMBER <", value, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberLessThanOrEqualTo(String value) {
            addCriterion("ORG_FAX_NUMBER <=", value, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberLike(String value) {
            addCriterion("ORG_FAX_NUMBER like", value, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberNotLike(String value) {
            addCriterion("ORG_FAX_NUMBER not like", value, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberIn(List<String> values) {
            addCriterion("ORG_FAX_NUMBER in", values, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberNotIn(List<String> values) {
            addCriterion("ORG_FAX_NUMBER not in", values, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberBetween(String value1, String value2) {
            addCriterion("ORG_FAX_NUMBER between", value1, value2, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgFaxNumberNotBetween(String value1, String value2) {
            addCriterion("ORG_FAX_NUMBER not between", value1, value2, "orgFaxNumber");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeIsNull() {
            addCriterion("ORG_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeIsNotNull() {
            addCriterion("ORG_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeEqualTo(Date value) {
            addCriterion("ORG_STARTTIME =", value, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeNotEqualTo(Date value) {
            addCriterion("ORG_STARTTIME <>", value, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeGreaterThan(Date value) {
            addCriterion("ORG_STARTTIME >", value, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORG_STARTTIME >=", value, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeLessThan(Date value) {
            addCriterion("ORG_STARTTIME <", value, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("ORG_STARTTIME <=", value, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeIn(List<Date> values) {
            addCriterion("ORG_STARTTIME in", values, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeNotIn(List<Date> values) {
            addCriterion("ORG_STARTTIME not in", values, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeBetween(Date value1, Date value2) {
            addCriterion("ORG_STARTTIME between", value1, value2, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("ORG_STARTTIME not between", value1, value2, "orgStarttime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeIsNull() {
            addCriterion("ORG_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeIsNotNull() {
            addCriterion("ORG_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeEqualTo(Date value) {
            addCriterion("ORG_ENDTIME =", value, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeNotEqualTo(Date value) {
            addCriterion("ORG_ENDTIME <>", value, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeGreaterThan(Date value) {
            addCriterion("ORG_ENDTIME >", value, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORG_ENDTIME >=", value, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeLessThan(Date value) {
            addCriterion("ORG_ENDTIME <", value, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ORG_ENDTIME <=", value, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeIn(List<Date> values) {
            addCriterion("ORG_ENDTIME in", values, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeNotIn(List<Date> values) {
            addCriterion("ORG_ENDTIME not in", values, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeBetween(Date value1, Date value2) {
            addCriterion("ORG_ENDTIME between", value1, value2, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ORG_ENDTIME not between", value1, value2, "orgEndtime");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdIsNull() {
            addCriterion("ORG_ERP_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdIsNotNull() {
            addCriterion("ORG_ERP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdEqualTo(String value) {
            addCriterion("ORG_ERP_ID =", value, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdNotEqualTo(String value) {
            addCriterion("ORG_ERP_ID <>", value, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdGreaterThan(String value) {
            addCriterion("ORG_ERP_ID >", value, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ERP_ID >=", value, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdLessThan(String value) {
            addCriterion("ORG_ERP_ID <", value, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ERP_ID <=", value, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdLike(String value) {
            addCriterion("ORG_ERP_ID like", value, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdNotLike(String value) {
            addCriterion("ORG_ERP_ID not like", value, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdIn(List<String> values) {
            addCriterion("ORG_ERP_ID in", values, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdNotIn(List<String> values) {
            addCriterion("ORG_ERP_ID not in", values, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdBetween(String value1, String value2) {
            addCriterion("ORG_ERP_ID between", value1, value2, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgErpIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ERP_ID not between", value1, value2, "orgErpId");
            return (Criteria) this;
        }

        public Criteria andOrgLocationIsNull() {
            addCriterion("ORG_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andOrgLocationIsNotNull() {
            addCriterion("ORG_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLocationEqualTo(String value) {
            addCriterion("ORG_LOCATION =", value, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationNotEqualTo(String value) {
            addCriterion("ORG_LOCATION <>", value, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationGreaterThan(String value) {
            addCriterion("ORG_LOCATION >", value, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_LOCATION >=", value, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationLessThan(String value) {
            addCriterion("ORG_LOCATION <", value, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationLessThanOrEqualTo(String value) {
            addCriterion("ORG_LOCATION <=", value, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationLike(String value) {
            addCriterion("ORG_LOCATION like", value, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationNotLike(String value) {
            addCriterion("ORG_LOCATION not like", value, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationIn(List<String> values) {
            addCriterion("ORG_LOCATION in", values, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationNotIn(List<String> values) {
            addCriterion("ORG_LOCATION not in", values, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationBetween(String value1, String value2) {
            addCriterion("ORG_LOCATION between", value1, value2, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgLocationNotBetween(String value1, String value2) {
            addCriterion("ORG_LOCATION not between", value1, value2, "orgLocation");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkIsNull() {
            addCriterion("ORG_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkIsNotNull() {
            addCriterion("ORG_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkEqualTo(String value) {
            addCriterion("ORG_REMARK =", value, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkNotEqualTo(String value) {
            addCriterion("ORG_REMARK <>", value, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkGreaterThan(String value) {
            addCriterion("ORG_REMARK >", value, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_REMARK >=", value, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkLessThan(String value) {
            addCriterion("ORG_REMARK <", value, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkLessThanOrEqualTo(String value) {
            addCriterion("ORG_REMARK <=", value, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkLike(String value) {
            addCriterion("ORG_REMARK like", value, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkNotLike(String value) {
            addCriterion("ORG_REMARK not like", value, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkIn(List<String> values) {
            addCriterion("ORG_REMARK in", values, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkNotIn(List<String> values) {
            addCriterion("ORG_REMARK not in", values, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkBetween(String value1, String value2) {
            addCriterion("ORG_REMARK between", value1, value2, "orgRemark");
            return (Criteria) this;
        }

        public Criteria andOrgRemarkNotBetween(String value1, String value2) {
            addCriterion("ORG_REMARK not between", value1, value2, "orgRemark");
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

        public Criteria andOrgNameLikeInsensitive(String value) {
            addCriterion("upper(ORG_NAME) like", value.toUpperCase(), "orgName");
            return this;
        }

        public Criteria andOrgCodeLikeInsensitive(String value) {
            addCriterion("upper(ORG_CODE) like", value.toUpperCase(), "orgCode");
            return this;
        }

        public Criteria andOrgInitialsLikeInsensitive(String value) {
            addCriterion("upper(ORG_INITIALS) like", value.toUpperCase(), "orgInitials");
            return this;
        }

        public Criteria andOrgDescriptionLikeInsensitive(String value) {
            addCriterion("upper(ORG_DESCRIPTION) like", value.toUpperCase(), "orgDescription");
            return this;
        }

        public Criteria andOrgLayerCodeLikeInsensitive(String value) {
            addCriterion("upper(ORG_LAYER_CODE) like", value.toUpperCase(), "orgLayerCode");
            return this;
        }

        public Criteria andOrgSupervisorUidLikeInsensitive(String value) {
            addCriterion("upper(ORG_SUPERVISOR_UID) like", value.toUpperCase(), "orgSupervisorUid");
            return this;
        }

        public Criteria andOrgManagerUidLikeInsensitive(String value) {
            addCriterion("upper(ORG_MANAGER_UID) like", value.toUpperCase(), "orgManagerUid");
            return this;
        }

        public Criteria andOrgViceManagerUidLikeInsensitive(String value) {
            addCriterion("upper(ORG_VICE_MANAGER_UID) like", value.toUpperCase(), "orgViceManagerUid");
            return this;
        }

        public Criteria andOrgAdminUidLikeInsensitive(String value) {
            addCriterion("upper(ORG_ADMIN_UID) like", value.toUpperCase(), "orgAdminUid");
            return this;
        }

        public Criteria andOrgManageOrgIdLikeInsensitive(String value) {
            addCriterion("upper(ORG_MANAGE_ORG_ID) like", value.toUpperCase(), "orgManageOrgId");
            return this;
        }

        public Criteria andOrgPostalAddressLikeInsensitive(String value) {
            addCriterion("upper(ORG_POSTAL_ADDRESS) like", value.toUpperCase(), "orgPostalAddress");
            return this;
        }

        public Criteria andOrgPostalCodeLikeInsensitive(String value) {
            addCriterion("upper(ORG_POSTAL_CODE) like", value.toUpperCase(), "orgPostalCode");
            return this;
        }

        public Criteria andOrgTelephoneNumberLikeInsensitive(String value) {
            addCriterion("upper(ORG_TELEPHONE_NUMBER) like", value.toUpperCase(), "orgTelephoneNumber");
            return this;
        }

        public Criteria andOrgFaxNumberLikeInsensitive(String value) {
            addCriterion("upper(ORG_FAX_NUMBER) like", value.toUpperCase(), "orgFaxNumber");
            return this;
        }

        public Criteria andOrgErpIdLikeInsensitive(String value) {
            addCriterion("upper(ORG_ERP_ID) like", value.toUpperCase(), "orgErpId");
            return this;
        }

        public Criteria andOrgLocationLikeInsensitive(String value) {
            addCriterion("upper(ORG_LOCATION) like", value.toUpperCase(), "orgLocation");
            return this;
        }

        public Criteria andOrgRemarkLikeInsensitive(String value) {
            addCriterion("upper(ORG_REMARK) like", value.toUpperCase(), "orgRemark");
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

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}
}