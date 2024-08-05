package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.Page;

public class TempUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected Page page;

    public TempUserInfoExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("USER_EMAIL =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("USER_EMAIL <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("USER_EMAIL >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("USER_EMAIL <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("USER_EMAIL like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("USER_EMAIL not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("USER_EMAIL in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("USER_EMAIL not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("USER_EMAIL between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("USER_EMAIL not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserNationDictIsNull() {
            addCriterion("USER_NATION_DICT is null");
            return (Criteria) this;
        }

        public Criteria andUserNationDictIsNotNull() {
            addCriterion("USER_NATION_DICT is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationDictEqualTo(Integer value) {
            addCriterion("USER_NATION_DICT =", value, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictNotEqualTo(Integer value) {
            addCriterion("USER_NATION_DICT <>", value, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictGreaterThan(Integer value) {
            addCriterion("USER_NATION_DICT >", value, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_NATION_DICT >=", value, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictLessThan(Integer value) {
            addCriterion("USER_NATION_DICT <", value, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictLessThanOrEqualTo(Integer value) {
            addCriterion("USER_NATION_DICT <=", value, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictIn(List<Integer> values) {
            addCriterion("USER_NATION_DICT in", values, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictNotIn(List<Integer> values) {
            addCriterion("USER_NATION_DICT not in", values, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictBetween(Integer value1, Integer value2) {
            addCriterion("USER_NATION_DICT between", value1, value2, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserNationDictNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_NATION_DICT not between", value1, value2, "userNationDict");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("USER_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("USER_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(Integer value) {
            addCriterion("USER_GENDER =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(Integer value) {
            addCriterion("USER_GENDER <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(Integer value) {
            addCriterion("USER_GENDER >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_GENDER >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(Integer value) {
            addCriterion("USER_GENDER <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(Integer value) {
            addCriterion("USER_GENDER <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<Integer> values) {
            addCriterion("USER_GENDER in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<Integer> values) {
            addCriterion("USER_GENDER not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(Integer value1, Integer value2) {
            addCriterion("USER_GENDER between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_GENDER not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("USER_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("USER_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("USER_BIRTHDAY =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("USER_BIRTHDAY <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("USER_BIRTHDAY >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_BIRTHDAY >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("USER_BIRTHDAY <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("USER_BIRTHDAY <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("USER_BIRTHDAY in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("USER_BIRTHDAY not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("USER_BIRTHDAY between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("USER_BIRTHDAY not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserNationalityIsNull() {
            addCriterion("USER_NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andUserNationalityIsNotNull() {
            addCriterion("USER_NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andUserNationalityEqualTo(String value) {
            addCriterion("USER_NATIONALITY =", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityNotEqualTo(String value) {
            addCriterion("USER_NATIONALITY <>", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityGreaterThan(String value) {
            addCriterion("USER_NATIONALITY >", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NATIONALITY >=", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityLessThan(String value) {
            addCriterion("USER_NATIONALITY <", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityLessThanOrEqualTo(String value) {
            addCriterion("USER_NATIONALITY <=", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityLike(String value) {
            addCriterion("USER_NATIONALITY like", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityNotLike(String value) {
            addCriterion("USER_NATIONALITY not like", value, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityIn(List<String> values) {
            addCriterion("USER_NATIONALITY in", values, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityNotIn(List<String> values) {
            addCriterion("USER_NATIONALITY not in", values, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityBetween(String value1, String value2) {
            addCriterion("USER_NATIONALITY between", value1, value2, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserNationalityNotBetween(String value1, String value2) {
            addCriterion("USER_NATIONALITY not between", value1, value2, "userNationality");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictIsNull() {
            addCriterion("USER_RELIGION_DICT is null");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictIsNotNull() {
            addCriterion("USER_RELIGION_DICT is not null");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictEqualTo(Integer value) {
            addCriterion("USER_RELIGION_DICT =", value, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictNotEqualTo(Integer value) {
            addCriterion("USER_RELIGION_DICT <>", value, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictGreaterThan(Integer value) {
            addCriterion("USER_RELIGION_DICT >", value, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_RELIGION_DICT >=", value, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictLessThan(Integer value) {
            addCriterion("USER_RELIGION_DICT <", value, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictLessThanOrEqualTo(Integer value) {
            addCriterion("USER_RELIGION_DICT <=", value, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictIn(List<Integer> values) {
            addCriterion("USER_RELIGION_DICT in", values, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictNotIn(List<Integer> values) {
            addCriterion("USER_RELIGION_DICT not in", values, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictBetween(Integer value1, Integer value2) {
            addCriterion("USER_RELIGION_DICT between", value1, value2, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserReligionDictNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_RELIGION_DICT not between", value1, value2, "userReligionDict");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberIsNull() {
            addCriterion("USER_TELEPHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberIsNotNull() {
            addCriterion("USER_TELEPHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberEqualTo(String value) {
            addCriterion("USER_TELEPHONE_NUMBER =", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberNotEqualTo(String value) {
            addCriterion("USER_TELEPHONE_NUMBER <>", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberGreaterThan(String value) {
            addCriterion("USER_TELEPHONE_NUMBER >", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TELEPHONE_NUMBER >=", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberLessThan(String value) {
            addCriterion("USER_TELEPHONE_NUMBER <", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberLessThanOrEqualTo(String value) {
            addCriterion("USER_TELEPHONE_NUMBER <=", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberLike(String value) {
            addCriterion("USER_TELEPHONE_NUMBER like", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberNotLike(String value) {
            addCriterion("USER_TELEPHONE_NUMBER not like", value, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberIn(List<String> values) {
            addCriterion("USER_TELEPHONE_NUMBER in", values, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberNotIn(List<String> values) {
            addCriterion("USER_TELEPHONE_NUMBER not in", values, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberBetween(String value1, String value2) {
            addCriterion("USER_TELEPHONE_NUMBER between", value1, value2, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNumberNotBetween(String value1, String value2) {
            addCriterion("USER_TELEPHONE_NUMBER not between", value1, value2, "userTelephoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileIsNull() {
            addCriterion("USER_PREFERRED_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileIsNotNull() {
            addCriterion("USER_PREFERRED_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileEqualTo(String value) {
            addCriterion("USER_PREFERRED_MOBILE =", value, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileNotEqualTo(String value) {
            addCriterion("USER_PREFERRED_MOBILE <>", value, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileGreaterThan(String value) {
            addCriterion("USER_PREFERRED_MOBILE >", value, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PREFERRED_MOBILE >=", value, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileLessThan(String value) {
            addCriterion("USER_PREFERRED_MOBILE <", value, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileLessThanOrEqualTo(String value) {
            addCriterion("USER_PREFERRED_MOBILE <=", value, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileLike(String value) {
            addCriterion("USER_PREFERRED_MOBILE like", value, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileNotLike(String value) {
            addCriterion("USER_PREFERRED_MOBILE not like", value, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileIn(List<String> values) {
            addCriterion("USER_PREFERRED_MOBILE in", values, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileNotIn(List<String> values) {
            addCriterion("USER_PREFERRED_MOBILE not in", values, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileBetween(String value1, String value2) {
            addCriterion("USER_PREFERRED_MOBILE between", value1, value2, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPreferredMobileNotBetween(String value1, String value2) {
            addCriterion("USER_PREFERRED_MOBILE not between", value1, value2, "userPreferredMobile");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressIsNull() {
            addCriterion("USER_POSTAL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressIsNotNull() {
            addCriterion("USER_POSTAL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressEqualTo(String value) {
            addCriterion("USER_POSTAL_ADDRESS =", value, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressNotEqualTo(String value) {
            addCriterion("USER_POSTAL_ADDRESS <>", value, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressGreaterThan(String value) {
            addCriterion("USER_POSTAL_ADDRESS >", value, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressGreaterThanOrEqualTo(String value) {
            addCriterion("USER_POSTAL_ADDRESS >=", value, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressLessThan(String value) {
            addCriterion("USER_POSTAL_ADDRESS <", value, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressLessThanOrEqualTo(String value) {
            addCriterion("USER_POSTAL_ADDRESS <=", value, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressLike(String value) {
            addCriterion("USER_POSTAL_ADDRESS like", value, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressNotLike(String value) {
            addCriterion("USER_POSTAL_ADDRESS not like", value, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressIn(List<String> values) {
            addCriterion("USER_POSTAL_ADDRESS in", values, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressNotIn(List<String> values) {
            addCriterion("USER_POSTAL_ADDRESS not in", values, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressBetween(String value1, String value2) {
            addCriterion("USER_POSTAL_ADDRESS between", value1, value2, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalAddressNotBetween(String value1, String value2) {
            addCriterion("USER_POSTAL_ADDRESS not between", value1, value2, "userPostalAddress");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeIsNull() {
            addCriterion("USER_POSTAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeIsNotNull() {
            addCriterion("USER_POSTAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeEqualTo(String value) {
            addCriterion("USER_POSTAL_CODE =", value, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeNotEqualTo(String value) {
            addCriterion("USER_POSTAL_CODE <>", value, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeGreaterThan(String value) {
            addCriterion("USER_POSTAL_CODE >", value, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_POSTAL_CODE >=", value, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeLessThan(String value) {
            addCriterion("USER_POSTAL_CODE <", value, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_POSTAL_CODE <=", value, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeLike(String value) {
            addCriterion("USER_POSTAL_CODE like", value, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeNotLike(String value) {
            addCriterion("USER_POSTAL_CODE not like", value, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeIn(List<String> values) {
            addCriterion("USER_POSTAL_CODE in", values, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeNotIn(List<String> values) {
            addCriterion("USER_POSTAL_CODE not in", values, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeBetween(String value1, String value2) {
            addCriterion("USER_POSTAL_CODE between", value1, value2, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserPostalCodeNotBetween(String value1, String value2) {
            addCriterion("USER_POSTAL_CODE not between", value1, value2, "userPostalCode");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeIsNull() {
            addCriterion("USER_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeIsNotNull() {
            addCriterion("USER_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeEqualTo(Date value) {
            addCriterion("USER_STARTTIME =", value, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeNotEqualTo(Date value) {
            addCriterion("USER_STARTTIME <>", value, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeGreaterThan(Date value) {
            addCriterion("USER_STARTTIME >", value, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_STARTTIME >=", value, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeLessThan(Date value) {
            addCriterion("USER_STARTTIME <", value, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("USER_STARTTIME <=", value, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeIn(List<Date> values) {
            addCriterion("USER_STARTTIME in", values, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeNotIn(List<Date> values) {
            addCriterion("USER_STARTTIME not in", values, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeBetween(Date value1, Date value2) {
            addCriterion("USER_STARTTIME between", value1, value2, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("USER_STARTTIME not between", value1, value2, "userStarttime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeIsNull() {
            addCriterion("USER_ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeIsNotNull() {
            addCriterion("USER_ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeEqualTo(Date value) {
            addCriterion("USER_ENDTIME =", value, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeNotEqualTo(Date value) {
            addCriterion("USER_ENDTIME <>", value, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeGreaterThan(Date value) {
            addCriterion("USER_ENDTIME >", value, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_ENDTIME >=", value, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeLessThan(Date value) {
            addCriterion("USER_ENDTIME <", value, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("USER_ENDTIME <=", value, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeIn(List<Date> values) {
            addCriterion("USER_ENDTIME in", values, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeNotIn(List<Date> values) {
            addCriterion("USER_ENDTIME not in", values, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeBetween(Date value1, Date value2) {
            addCriterion("USER_ENDTIME between", value1, value2, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("USER_ENDTIME not between", value1, value2, "userEndtime");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberIsNull() {
            addCriterion("USER_ID_CARD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberIsNotNull() {
            addCriterion("USER_ID_CARD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberEqualTo(String value) {
            addCriterion("USER_ID_CARD_NUMBER =", value, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberNotEqualTo(String value) {
            addCriterion("USER_ID_CARD_NUMBER <>", value, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberGreaterThan(String value) {
            addCriterion("USER_ID_CARD_NUMBER >", value, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID_CARD_NUMBER >=", value, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberLessThan(String value) {
            addCriterion("USER_ID_CARD_NUMBER <", value, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberLessThanOrEqualTo(String value) {
            addCriterion("USER_ID_CARD_NUMBER <=", value, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberLike(String value) {
            addCriterion("USER_ID_CARD_NUMBER like", value, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberNotLike(String value) {
            addCriterion("USER_ID_CARD_NUMBER not like", value, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberIn(List<String> values) {
            addCriterion("USER_ID_CARD_NUMBER in", values, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberNotIn(List<String> values) {
            addCriterion("USER_ID_CARD_NUMBER not in", values, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberBetween(String value1, String value2) {
            addCriterion("USER_ID_CARD_NUMBER between", value1, value2, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserIdCardNumberNotBetween(String value1, String value2) {
            addCriterion("USER_ID_CARD_NUMBER not between", value1, value2, "userIdCardNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeIsNull() {
            addCriterion("USER_EMPLOYEETYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeIsNotNull() {
            addCriterion("USER_EMPLOYEETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeEqualTo(String value) {
            addCriterion("USER_EMPLOYEETYPE =", value, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeNotEqualTo(String value) {
            addCriterion("USER_EMPLOYEETYPE <>", value, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeGreaterThan(String value) {
            addCriterion("USER_EMPLOYEETYPE >", value, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMPLOYEETYPE >=", value, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeLessThan(String value) {
            addCriterion("USER_EMPLOYEETYPE <", value, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeLessThanOrEqualTo(String value) {
            addCriterion("USER_EMPLOYEETYPE <=", value, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeLike(String value) {
            addCriterion("USER_EMPLOYEETYPE like", value, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeNotLike(String value) {
            addCriterion("USER_EMPLOYEETYPE not like", value, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeIn(List<String> values) {
            addCriterion("USER_EMPLOYEETYPE in", values, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeNotIn(List<String> values) {
            addCriterion("USER_EMPLOYEETYPE not in", values, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeBetween(String value1, String value2) {
            addCriterion("USER_EMPLOYEETYPE between", value1, value2, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeetypeNotBetween(String value1, String value2) {
            addCriterion("USER_EMPLOYEETYPE not between", value1, value2, "userEmployeetype");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberIsNull() {
            addCriterion("USER_EMPLOYEE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberIsNotNull() {
            addCriterion("USER_EMPLOYEE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberEqualTo(String value) {
            addCriterion("USER_EMPLOYEE_NUMBER =", value, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberNotEqualTo(String value) {
            addCriterion("USER_EMPLOYEE_NUMBER <>", value, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberGreaterThan(String value) {
            addCriterion("USER_EMPLOYEE_NUMBER >", value, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMPLOYEE_NUMBER >=", value, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberLessThan(String value) {
            addCriterion("USER_EMPLOYEE_NUMBER <", value, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberLessThanOrEqualTo(String value) {
            addCriterion("USER_EMPLOYEE_NUMBER <=", value, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberLike(String value) {
            addCriterion("USER_EMPLOYEE_NUMBER like", value, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberNotLike(String value) {
            addCriterion("USER_EMPLOYEE_NUMBER not like", value, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberIn(List<String> values) {
            addCriterion("USER_EMPLOYEE_NUMBER in", values, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberNotIn(List<String> values) {
            addCriterion("USER_EMPLOYEE_NUMBER not in", values, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberBetween(String value1, String value2) {
            addCriterion("USER_EMPLOYEE_NUMBER between", value1, value2, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEmployeeNumberNotBetween(String value1, String value2) {
            addCriterion("USER_EMPLOYEE_NUMBER not between", value1, value2, "userEmployeeNumber");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeIsNull() {
            addCriterion("USER_ENTRYTIME is null");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeIsNotNull() {
            addCriterion("USER_ENTRYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeEqualTo(Date value) {
            addCriterion("USER_ENTRYTIME =", value, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeNotEqualTo(Date value) {
            addCriterion("USER_ENTRYTIME <>", value, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeGreaterThan(Date value) {
            addCriterion("USER_ENTRYTIME >", value, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_ENTRYTIME >=", value, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeLessThan(Date value) {
            addCriterion("USER_ENTRYTIME <", value, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeLessThanOrEqualTo(Date value) {
            addCriterion("USER_ENTRYTIME <=", value, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeIn(List<Date> values) {
            addCriterion("USER_ENTRYTIME in", values, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeNotIn(List<Date> values) {
            addCriterion("USER_ENTRYTIME not in", values, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeBetween(Date value1, Date value2) {
            addCriterion("USER_ENTRYTIME between", value1, value2, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserEntrytimeNotBetween(Date value1, Date value2) {
            addCriterion("USER_ENTRYTIME not between", value1, value2, "userEntrytime");
            return (Criteria) this;
        }

        public Criteria andUserLocationIsNull() {
            addCriterion("USER_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andUserLocationIsNotNull() {
            addCriterion("USER_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andUserLocationEqualTo(String value) {
            addCriterion("USER_LOCATION =", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationNotEqualTo(String value) {
            addCriterion("USER_LOCATION <>", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationGreaterThan(String value) {
            addCriterion("USER_LOCATION >", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LOCATION >=", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationLessThan(String value) {
            addCriterion("USER_LOCATION <", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationLessThanOrEqualTo(String value) {
            addCriterion("USER_LOCATION <=", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationLike(String value) {
            addCriterion("USER_LOCATION like", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationNotLike(String value) {
            addCriterion("USER_LOCATION not like", value, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationIn(List<String> values) {
            addCriterion("USER_LOCATION in", values, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationNotIn(List<String> values) {
            addCriterion("USER_LOCATION not in", values, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationBetween(String value1, String value2) {
            addCriterion("USER_LOCATION between", value1, value2, "userLocation");
            return (Criteria) this;
        }

        public Criteria andUserLocationNotBetween(String value1, String value2) {
            addCriterion("USER_LOCATION not between", value1, value2, "userLocation");
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

        public Criteria andDataSyncTypeIsNull() {
            addCriterion("DATA_SYNC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeIsNotNull() {
            addCriterion("DATA_SYNC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeEqualTo(Short value) {
            addCriterion("DATA_SYNC_TYPE =", value, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeNotEqualTo(Short value) {
            addCriterion("DATA_SYNC_TYPE <>", value, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeGreaterThan(Short value) {
            addCriterion("DATA_SYNC_TYPE >", value, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("DATA_SYNC_TYPE >=", value, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeLessThan(Short value) {
            addCriterion("DATA_SYNC_TYPE <", value, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeLessThanOrEqualTo(Short value) {
            addCriterion("DATA_SYNC_TYPE <=", value, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeIn(List<Short> values) {
            addCriterion("DATA_SYNC_TYPE in", values, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeNotIn(List<Short> values) {
            addCriterion("DATA_SYNC_TYPE not in", values, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeBetween(Short value1, Short value2) {
            addCriterion("DATA_SYNC_TYPE between", value1, value2, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andDataSyncTypeNotBetween(Short value1, Short value2) {
            addCriterion("DATA_SYNC_TYPE not between", value1, value2, "dataSyncType");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusIsNull() {
            addCriterion("USER_SYNC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusIsNotNull() {
            addCriterion("USER_SYNC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusEqualTo(Short value) {
            addCriterion("USER_SYNC_STATUS =", value, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusNotEqualTo(Short value) {
            addCriterion("USER_SYNC_STATUS <>", value, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusGreaterThan(Short value) {
            addCriterion("USER_SYNC_STATUS >", value, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_SYNC_STATUS >=", value, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusLessThan(Short value) {
            addCriterion("USER_SYNC_STATUS <", value, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusLessThanOrEqualTo(Short value) {
            addCriterion("USER_SYNC_STATUS <=", value, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusIn(List<Short> values) {
            addCriterion("USER_SYNC_STATUS in", values, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusNotIn(List<Short> values) {
            addCriterion("USER_SYNC_STATUS not in", values, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusBetween(Short value1, Short value2) {
            addCriterion("USER_SYNC_STATUS between", value1, value2, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andUserSyncStatusNotBetween(Short value1, Short value2) {
            addCriterion("USER_SYNC_STATUS not between", value1, value2, "userSyncStatus");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("DATA_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("DATA_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(Short value) {
            addCriterion("DATA_SOURCE =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(Short value) {
            addCriterion("DATA_SOURCE <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(Short value) {
            addCriterion("DATA_SOURCE >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(Short value) {
            addCriterion("DATA_SOURCE >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(Short value) {
            addCriterion("DATA_SOURCE <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(Short value) {
            addCriterion("DATA_SOURCE <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<Short> values) {
            addCriterion("DATA_SOURCE in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<Short> values) {
            addCriterion("DATA_SOURCE not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(Short value1, Short value2) {
            addCriterion("DATA_SOURCE between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(Short value1, Short value2) {
            addCriterion("DATA_SOURCE not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataFileIsNull() {
            addCriterion("DATA_FILE is null");
            return (Criteria) this;
        }

        public Criteria andDataFileIsNotNull() {
            addCriterion("DATA_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andDataFileEqualTo(String value) {
            addCriterion("DATA_FILE =", value, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileNotEqualTo(String value) {
            addCriterion("DATA_FILE <>", value, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileGreaterThan(String value) {
            addCriterion("DATA_FILE >", value, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_FILE >=", value, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileLessThan(String value) {
            addCriterion("DATA_FILE <", value, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileLessThanOrEqualTo(String value) {
            addCriterion("DATA_FILE <=", value, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileLike(String value) {
            addCriterion("DATA_FILE like", value, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileNotLike(String value) {
            addCriterion("DATA_FILE not like", value, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileIn(List<String> values) {
            addCriterion("DATA_FILE in", values, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileNotIn(List<String> values) {
            addCriterion("DATA_FILE not in", values, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileBetween(String value1, String value2) {
            addCriterion("DATA_FILE between", value1, value2, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataFileNotBetween(String value1, String value2) {
            addCriterion("DATA_FILE not between", value1, value2, "dataFile");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedIsNull() {
            addCriterion("DATA_IS_SYNCED is null");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedIsNotNull() {
            addCriterion("DATA_IS_SYNCED is not null");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedEqualTo(Short value) {
            addCriterion("DATA_IS_SYNCED =", value, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedNotEqualTo(Short value) {
            addCriterion("DATA_IS_SYNCED <>", value, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedGreaterThan(Short value) {
            addCriterion("DATA_IS_SYNCED >", value, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedGreaterThanOrEqualTo(Short value) {
            addCriterion("DATA_IS_SYNCED >=", value, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedLessThan(Short value) {
            addCriterion("DATA_IS_SYNCED <", value, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedLessThanOrEqualTo(Short value) {
            addCriterion("DATA_IS_SYNCED <=", value, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedIn(List<Short> values) {
            addCriterion("DATA_IS_SYNCED in", values, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedNotIn(List<Short> values) {
            addCriterion("DATA_IS_SYNCED not in", values, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedBetween(Short value1, Short value2) {
            addCriterion("DATA_IS_SYNCED between", value1, value2, "dataIsSynced");
            return (Criteria) this;
        }

        public Criteria andDataIsSyncedNotBetween(Short value1, Short value2) {
            addCriterion("DATA_IS_SYNCED not between", value1, value2, "dataIsSynced");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andUserNameLikeInsensitive(String value) {
            addCriterion("upper(USER_NAME) like", value.toUpperCase(), "userName");
            return this;
        }

        public Criteria andUserEmailLikeInsensitive(String value) {
            addCriterion("upper(USER_EMAIL) like", value.toUpperCase(), "userEmail");
            return this;
        }

        public Criteria andUserNationalityLikeInsensitive(String value) {
            addCriterion("upper(USER_NATIONALITY) like", value.toUpperCase(), "userNationality");
            return this;
        }

        public Criteria andUserTelephoneNumberLikeInsensitive(String value) {
            addCriterion("upper(USER_TELEPHONE_NUMBER) like", value.toUpperCase(), "userTelephoneNumber");
            return this;
        }

        public Criteria andUserPreferredMobileLikeInsensitive(String value) {
            addCriterion("upper(USER_PREFERRED_MOBILE) like", value.toUpperCase(), "userPreferredMobile");
            return this;
        }

        public Criteria andUserPostalAddressLikeInsensitive(String value) {
            addCriterion("upper(USER_POSTAL_ADDRESS) like", value.toUpperCase(), "userPostalAddress");
            return this;
        }

        public Criteria andUserPostalCodeLikeInsensitive(String value) {
            addCriterion("upper(USER_POSTAL_CODE) like", value.toUpperCase(), "userPostalCode");
            return this;
        }

        public Criteria andUserIdCardNumberLikeInsensitive(String value) {
            addCriterion("upper(USER_ID_CARD_NUMBER) like", value.toUpperCase(), "userIdCardNumber");
            return this;
        }

        public Criteria andUserEmployeetypeLikeInsensitive(String value) {
            addCriterion("upper(USER_EMPLOYEETYPE) like", value.toUpperCase(), "userEmployeetype");
            return this;
        }

        public Criteria andUserEmployeeNumberLikeInsensitive(String value) {
            addCriterion("upper(USER_EMPLOYEE_NUMBER) like", value.toUpperCase(), "userEmployeeNumber");
            return this;
        }

        public Criteria andUserLocationLikeInsensitive(String value) {
            addCriterion("upper(USER_LOCATION) like", value.toUpperCase(), "userLocation");
            return this;
        }

        public Criteria andDataFileLikeInsensitive(String value) {
            addCriterion("upper(DATA_FILE) like", value.toUpperCase(), "dataFile");
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