package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.Page;

public class ViewAuthOrgUserExample {
	protected String orderByClause;

	protected boolean distinct;

	protected Page page;

	protected List<Criteria> oredCriteria;

	protected AuthGroup group;

	protected AuthOrg org;

	protected AuthUser user;

	public ViewAuthOrgUserExample() {
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
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

		public Criteria andUserUidIsNull() {
			addCriterion("USER_UID is null");
			return (Criteria) this;
		}

		public Criteria andUserUidIsNotNull() {
			addCriterion("USER_UID is not null");
			return (Criteria) this;
		}

		public Criteria andUserUidEqualTo(String value) {
			addCriterion("USER_UID =", value, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidNotEqualTo(String value) {
			addCriterion("USER_UID <>", value, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidGreaterThan(String value) {
			addCriterion("USER_UID >", value, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidGreaterThanOrEqualTo(String value) {
			addCriterion("USER_UID >=", value, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidLessThan(String value) {
			addCriterion("USER_UID <", value, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidLessThanOrEqualTo(String value) {
			addCriterion("USER_UID <=", value, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidLike(String value) {
			addCriterion("USER_UID like", value, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidNotLike(String value) {
			addCriterion("USER_UID not like", value, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidIn(List<String> values) {
			addCriterion("USER_UID in", values, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidNotIn(List<String> values) {
			addCriterion("USER_UID not in", values, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidBetween(String value1, String value2) {
			addCriterion("USER_UID between", value1, value2, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserUidNotBetween(String value1, String value2) {
			addCriterion("USER_UID not between", value1, value2, "userUid");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIsNull() {
			addCriterion("USER_PASSWORD is null");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIsNotNull() {
			addCriterion("USER_PASSWORD is not null");
			return (Criteria) this;
		}

		public Criteria andUserPasswordEqualTo(String value) {
			addCriterion("USER_PASSWORD =", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotEqualTo(String value) {
			addCriterion("USER_PASSWORD <>", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordGreaterThan(String value) {
			addCriterion("USER_PASSWORD >", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("USER_PASSWORD >=", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLessThan(String value) {
			addCriterion("USER_PASSWORD <", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLessThanOrEqualTo(String value) {
			addCriterion("USER_PASSWORD <=", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLike(String value) {
			addCriterion("USER_PASSWORD like", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotLike(String value) {
			addCriterion("USER_PASSWORD not like", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIn(List<String> values) {
			addCriterion("USER_PASSWORD in", values, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotIn(List<String> values) {
			addCriterion("USER_PASSWORD not in", values, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordBetween(String value1, String value2) {
			addCriterion("USER_PASSWORD between", value1, value2,
					"userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotBetween(String value1, String value2) {
			addCriterion("USER_PASSWORD not between", value1, value2,
					"userPassword");
			return (Criteria) this;
		}

		public Criteria andUserSurnameIsNull() {
			addCriterion("USER_SURNAME is null");
			return (Criteria) this;
		}

		public Criteria andUserSurnameIsNotNull() {
			addCriterion("USER_SURNAME is not null");
			return (Criteria) this;
		}

		public Criteria andUserSurnameEqualTo(String value) {
			addCriterion("USER_SURNAME =", value, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameNotEqualTo(String value) {
			addCriterion("USER_SURNAME <>", value, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameGreaterThan(String value) {
			addCriterion("USER_SURNAME >", value, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameGreaterThanOrEqualTo(String value) {
			addCriterion("USER_SURNAME >=", value, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameLessThan(String value) {
			addCriterion("USER_SURNAME <", value, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameLessThanOrEqualTo(String value) {
			addCriterion("USER_SURNAME <=", value, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameLike(String value) {
			addCriterion("USER_SURNAME like", value, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameNotLike(String value) {
			addCriterion("USER_SURNAME not like", value, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameIn(List<String> values) {
			addCriterion("USER_SURNAME in", values, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameNotIn(List<String> values) {
			addCriterion("USER_SURNAME not in", values, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameBetween(String value1, String value2) {
			addCriterion("USER_SURNAME between", value1, value2, "userSurname");
			return (Criteria) this;
		}

		public Criteria andUserSurnameNotBetween(String value1, String value2) {
			addCriterion("USER_SURNAME not between", value1, value2,
					"userSurname");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionIsNull() {
			addCriterion("USER_DESCRIPTION is null");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionIsNotNull() {
			addCriterion("USER_DESCRIPTION is not null");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionEqualTo(String value) {
			addCriterion("USER_DESCRIPTION =", value, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionNotEqualTo(String value) {
			addCriterion("USER_DESCRIPTION <>", value, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionGreaterThan(String value) {
			addCriterion("USER_DESCRIPTION >", value, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("USER_DESCRIPTION >=", value, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionLessThan(String value) {
			addCriterion("USER_DESCRIPTION <", value, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionLessThanOrEqualTo(String value) {
			addCriterion("USER_DESCRIPTION <=", value, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionLike(String value) {
			addCriterion("USER_DESCRIPTION like", value, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionNotLike(String value) {
			addCriterion("USER_DESCRIPTION not like", value, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionIn(List<String> values) {
			addCriterion("USER_DESCRIPTION in", values, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionNotIn(List<String> values) {
			addCriterion("USER_DESCRIPTION not in", values, "userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionBetween(String value1, String value2) {
			addCriterion("USER_DESCRIPTION between", value1, value2,
					"userDescription");
			return (Criteria) this;
		}

		public Criteria andUserDescriptionNotBetween(String value1,
				String value2) {
			addCriterion("USER_DESCRIPTION not between", value1, value2,
					"userDescription");
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
			addCriterion("USER_NATION_DICT between", value1, value2,
					"userNationDict");
			return (Criteria) this;
		}

		public Criteria andUserNationDictNotBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_NATION_DICT not between", value1, value2,
					"userNationDict");
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
			addCriterion("USER_GENDER not between", value1, value2,
					"userGender");
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
			addCriterion("USER_BIRTHDAY between", value1, value2,
					"userBirthday");
			return (Criteria) this;
		}

		public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
			addCriterion("USER_BIRTHDAY not between", value1, value2,
					"userBirthday");
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
			addCriterion("USER_NATIONALITY between", value1, value2,
					"userNationality");
			return (Criteria) this;
		}

		public Criteria andUserNationalityNotBetween(String value1,
				String value2) {
			addCriterion("USER_NATIONALITY not between", value1, value2,
					"userNationality");
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
			addCriterion("USER_RELIGION_DICT not in", values,
					"userReligionDict");
			return (Criteria) this;
		}

		public Criteria andUserReligionDictBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_RELIGION_DICT between", value1, value2,
					"userReligionDict");
			return (Criteria) this;
		}

		public Criteria andUserReligionDictNotBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_RELIGION_DICT not between", value1, value2,
					"userReligionDict");
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
			addCriterion("USER_TELEPHONE_NUMBER =", value,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberNotEqualTo(String value) {
			addCriterion("USER_TELEPHONE_NUMBER <>", value,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberGreaterThan(String value) {
			addCriterion("USER_TELEPHONE_NUMBER >", value,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberGreaterThanOrEqualTo(String value) {
			addCriterion("USER_TELEPHONE_NUMBER >=", value,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberLessThan(String value) {
			addCriterion("USER_TELEPHONE_NUMBER <", value,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberLessThanOrEqualTo(String value) {
			addCriterion("USER_TELEPHONE_NUMBER <=", value,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberLike(String value) {
			addCriterion("USER_TELEPHONE_NUMBER like", value,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberNotLike(String value) {
			addCriterion("USER_TELEPHONE_NUMBER not like", value,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberIn(List<String> values) {
			addCriterion("USER_TELEPHONE_NUMBER in", values,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberNotIn(List<String> values) {
			addCriterion("USER_TELEPHONE_NUMBER not in", values,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberBetween(String value1,
				String value2) {
			addCriterion("USER_TELEPHONE_NUMBER between", value1, value2,
					"userTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andUserTelephoneNumberNotBetween(String value1,
				String value2) {
			addCriterion("USER_TELEPHONE_NUMBER not between", value1, value2,
					"userTelephoneNumber");
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
			addCriterion("USER_PREFERRED_MOBILE =", value,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileNotEqualTo(String value) {
			addCriterion("USER_PREFERRED_MOBILE <>", value,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileGreaterThan(String value) {
			addCriterion("USER_PREFERRED_MOBILE >", value,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileGreaterThanOrEqualTo(String value) {
			addCriterion("USER_PREFERRED_MOBILE >=", value,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileLessThan(String value) {
			addCriterion("USER_PREFERRED_MOBILE <", value,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileLessThanOrEqualTo(String value) {
			addCriterion("USER_PREFERRED_MOBILE <=", value,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileLike(String value) {
			addCriterion("USER_PREFERRED_MOBILE like", value,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileNotLike(String value) {
			addCriterion("USER_PREFERRED_MOBILE not like", value,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileIn(List<String> values) {
			addCriterion("USER_PREFERRED_MOBILE in", values,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileNotIn(List<String> values) {
			addCriterion("USER_PREFERRED_MOBILE not in", values,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileBetween(String value1,
				String value2) {
			addCriterion("USER_PREFERRED_MOBILE between", value1, value2,
					"userPreferredMobile");
			return (Criteria) this;
		}

		public Criteria andUserPreferredMobileNotBetween(String value1,
				String value2) {
			addCriterion("USER_PREFERRED_MOBILE not between", value1, value2,
					"userPreferredMobile");
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
			addCriterion("USER_POSTAL_ADDRESS not like", value,
					"userPostalAddress");
			return (Criteria) this;
		}

		public Criteria andUserPostalAddressIn(List<String> values) {
			addCriterion("USER_POSTAL_ADDRESS in", values, "userPostalAddress");
			return (Criteria) this;
		}

		public Criteria andUserPostalAddressNotIn(List<String> values) {
			addCriterion("USER_POSTAL_ADDRESS not in", values,
					"userPostalAddress");
			return (Criteria) this;
		}

		public Criteria andUserPostalAddressBetween(String value1, String value2) {
			addCriterion("USER_POSTAL_ADDRESS between", value1, value2,
					"userPostalAddress");
			return (Criteria) this;
		}

		public Criteria andUserPostalAddressNotBetween(String value1,
				String value2) {
			addCriterion("USER_POSTAL_ADDRESS not between", value1, value2,
					"userPostalAddress");
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
			addCriterion("USER_POSTAL_CODE between", value1, value2,
					"userPostalCode");
			return (Criteria) this;
		}

		public Criteria andUserPostalCodeNotBetween(String value1, String value2) {
			addCriterion("USER_POSTAL_CODE not between", value1, value2,
					"userPostalCode");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberIsNull() {
			addCriterion("USER_FAX_NUMBER is null");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberIsNotNull() {
			addCriterion("USER_FAX_NUMBER is not null");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberEqualTo(String value) {
			addCriterion("USER_FAX_NUMBER =", value, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberNotEqualTo(String value) {
			addCriterion("USER_FAX_NUMBER <>", value, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberGreaterThan(String value) {
			addCriterion("USER_FAX_NUMBER >", value, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberGreaterThanOrEqualTo(String value) {
			addCriterion("USER_FAX_NUMBER >=", value, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberLessThan(String value) {
			addCriterion("USER_FAX_NUMBER <", value, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberLessThanOrEqualTo(String value) {
			addCriterion("USER_FAX_NUMBER <=", value, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberLike(String value) {
			addCriterion("USER_FAX_NUMBER like", value, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberNotLike(String value) {
			addCriterion("USER_FAX_NUMBER not like", value, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberIn(List<String> values) {
			addCriterion("USER_FAX_NUMBER in", values, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberNotIn(List<String> values) {
			addCriterion("USER_FAX_NUMBER not in", values, "userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberBetween(String value1, String value2) {
			addCriterion("USER_FAX_NUMBER between", value1, value2,
					"userFaxNumber");
			return (Criteria) this;
		}

		public Criteria andUserFaxNumberNotBetween(String value1, String value2) {
			addCriterion("USER_FAX_NUMBER not between", value1, value2,
					"userFaxNumber");
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
			addCriterion("USER_STARTTIME between", value1, value2,
					"userStarttime");
			return (Criteria) this;
		}

		public Criteria andUserStarttimeNotBetween(Date value1, Date value2) {
			addCriterion("USER_STARTTIME not between", value1, value2,
					"userStarttime");
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
			addCriterion("USER_ENDTIME not between", value1, value2,
					"userEndtime");
			return (Criteria) this;
		}

		public Criteria andUserStatusIsNull() {
			addCriterion("USER_STATUS is null");
			return (Criteria) this;
		}

		public Criteria andUserStatusIsNotNull() {
			addCriterion("USER_STATUS is not null");
			return (Criteria) this;
		}

		public Criteria andUserStatusEqualTo(Integer value) {
			addCriterion("USER_STATUS =", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotEqualTo(Integer value) {
			addCriterion("USER_STATUS <>", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusGreaterThan(Integer value) {
			addCriterion("USER_STATUS >", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("USER_STATUS >=", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLessThan(Integer value) {
			addCriterion("USER_STATUS <", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
			addCriterion("USER_STATUS <=", value, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusIn(List<Integer> values) {
			addCriterion("USER_STATUS in", values, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotIn(List<Integer> values) {
			addCriterion("USER_STATUS not in", values, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusBetween(Integer value1, Integer value2) {
			addCriterion("USER_STATUS between", value1, value2, "userStatus");
			return (Criteria) this;
		}

		public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("USER_STATUS not between", value1, value2,
					"userStatus");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateIsNull() {
			addCriterion("USER_PWD_MODIFIED_DATE is null");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateIsNotNull() {
			addCriterion("USER_PWD_MODIFIED_DATE is not null");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateEqualTo(Date value) {
			addCriterion("USER_PWD_MODIFIED_DATE =", value,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateNotEqualTo(Date value) {
			addCriterion("USER_PWD_MODIFIED_DATE <>", value,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateGreaterThan(Date value) {
			addCriterion("USER_PWD_MODIFIED_DATE >", value,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateGreaterThanOrEqualTo(Date value) {
			addCriterion("USER_PWD_MODIFIED_DATE >=", value,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateLessThan(Date value) {
			addCriterion("USER_PWD_MODIFIED_DATE <", value,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateLessThanOrEqualTo(Date value) {
			addCriterion("USER_PWD_MODIFIED_DATE <=", value,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateIn(List<Date> values) {
			addCriterion("USER_PWD_MODIFIED_DATE in", values,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateNotIn(List<Date> values) {
			addCriterion("USER_PWD_MODIFIED_DATE not in", values,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateBetween(Date value1, Date value2) {
			addCriterion("USER_PWD_MODIFIED_DATE between", value1, value2,
					"userPwdModifiedDate");
			return (Criteria) this;
		}

		public Criteria andUserPwdModifiedDateNotBetween(Date value1,
				Date value2) {
			addCriterion("USER_PWD_MODIFIED_DATE not between", value1, value2,
					"userPwdModifiedDate");
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
			addCriterion("USER_ID_CARD_NUMBER not like", value,
					"userIdCardNumber");
			return (Criteria) this;
		}

		public Criteria andUserIdCardNumberIn(List<String> values) {
			addCriterion("USER_ID_CARD_NUMBER in", values, "userIdCardNumber");
			return (Criteria) this;
		}

		public Criteria andUserIdCardNumberNotIn(List<String> values) {
			addCriterion("USER_ID_CARD_NUMBER not in", values,
					"userIdCardNumber");
			return (Criteria) this;
		}

		public Criteria andUserIdCardNumberBetween(String value1, String value2) {
			addCriterion("USER_ID_CARD_NUMBER between", value1, value2,
					"userIdCardNumber");
			return (Criteria) this;
		}

		public Criteria andUserIdCardNumberNotBetween(String value1,
				String value2) {
			addCriterion("USER_ID_CARD_NUMBER not between", value1, value2,
					"userIdCardNumber");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeIsNull() {
			addCriterion("USER_USERTYPE is null");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeIsNotNull() {
			addCriterion("USER_USERTYPE is not null");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeEqualTo(String value) {
			addCriterion("USER_USERTYPE =", value, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeNotEqualTo(String value) {
			addCriterion("USER_USERTYPE <>", value, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeGreaterThan(String value) {
			addCriterion("USER_USERTYPE >", value, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeGreaterThanOrEqualTo(String value) {
			addCriterion("USER_USERTYPE >=", value, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeLessThan(String value) {
			addCriterion("USER_USERTYPE <", value, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeLessThanOrEqualTo(String value) {
			addCriterion("USER_USERTYPE <=", value, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeLike(String value) {
			addCriterion("USER_USERTYPE like", value, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeNotLike(String value) {
			addCriterion("USER_USERTYPE not like", value, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeIn(List<String> values) {
			addCriterion("USER_USERTYPE in", values, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeNotIn(List<String> values) {
			addCriterion("USER_USERTYPE not in", values, "userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeBetween(String value1, String value2) {
			addCriterion("USER_USERTYPE between", value1, value2,
					"userUsertype");
			return (Criteria) this;
		}

		public Criteria andUserUsertypeNotBetween(String value1, String value2) {
			addCriterion("USER_USERTYPE not between", value1, value2,
					"userUsertype");
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
			addCriterion("USER_EMPLOYEE_NUMBER like", value,
					"userEmployeeNumber");
			return (Criteria) this;
		}

		public Criteria andUserEmployeeNumberNotLike(String value) {
			addCriterion("USER_EMPLOYEE_NUMBER not like", value,
					"userEmployeeNumber");
			return (Criteria) this;
		}

		public Criteria andUserEmployeeNumberIn(List<String> values) {
			addCriterion("USER_EMPLOYEE_NUMBER in", values,
					"userEmployeeNumber");
			return (Criteria) this;
		}

		public Criteria andUserEmployeeNumberNotIn(List<String> values) {
			addCriterion("USER_EMPLOYEE_NUMBER not in", values,
					"userEmployeeNumber");
			return (Criteria) this;
		}

		public Criteria andUserEmployeeNumberBetween(String value1,
				String value2) {
			addCriterion("USER_EMPLOYEE_NUMBER between", value1, value2,
					"userEmployeeNumber");
			return (Criteria) this;
		}

		public Criteria andUserEmployeeNumberNotBetween(String value1,
				String value2) {
			addCriterion("USER_EMPLOYEE_NUMBER not between", value1, value2,
					"userEmployeeNumber");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictIsNull() {
			addCriterion("USER_LEVEL_DICT is null");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictIsNotNull() {
			addCriterion("USER_LEVEL_DICT is not null");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictEqualTo(Integer value) {
			addCriterion("USER_LEVEL_DICT =", value, "userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictNotEqualTo(Integer value) {
			addCriterion("USER_LEVEL_DICT <>", value, "userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictGreaterThan(Integer value) {
			addCriterion("USER_LEVEL_DICT >", value, "userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictGreaterThanOrEqualTo(Integer value) {
			addCriterion("USER_LEVEL_DICT >=", value, "userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictLessThan(Integer value) {
			addCriterion("USER_LEVEL_DICT <", value, "userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictLessThanOrEqualTo(Integer value) {
			addCriterion("USER_LEVEL_DICT <=", value, "userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictIn(List<Integer> values) {
			addCriterion("USER_LEVEL_DICT in", values, "userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictNotIn(List<Integer> values) {
			addCriterion("USER_LEVEL_DICT not in", values, "userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictBetween(Integer value1, Integer value2) {
			addCriterion("USER_LEVEL_DICT between", value1, value2,
					"userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserLevelDictNotBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_LEVEL_DICT not between", value1, value2,
					"userLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserCategoryIsNull() {
			addCriterion("USER_CATEGORY is null");
			return (Criteria) this;
		}

		public Criteria andUserCategoryIsNotNull() {
			addCriterion("USER_CATEGORY is not null");
			return (Criteria) this;
		}

		public Criteria andUserCategoryEqualTo(Integer value) {
			addCriterion("USER_CATEGORY =", value, "userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryNotEqualTo(Integer value) {
			addCriterion("USER_CATEGORY <>", value, "userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryGreaterThan(Integer value) {
			addCriterion("USER_CATEGORY >", value, "userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryGreaterThanOrEqualTo(Integer value) {
			addCriterion("USER_CATEGORY >=", value, "userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryLessThan(Integer value) {
			addCriterion("USER_CATEGORY <", value, "userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryLessThanOrEqualTo(Integer value) {
			addCriterion("USER_CATEGORY <=", value, "userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryIn(List<Integer> values) {
			addCriterion("USER_CATEGORY in", values, "userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryNotIn(List<Integer> values) {
			addCriterion("USER_CATEGORY not in", values, "userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryBetween(Integer value1, Integer value2) {
			addCriterion("USER_CATEGORY between", value1, value2,
					"userCategory");
			return (Criteria) this;
		}

		public Criteria andUserCategoryNotBetween(Integer value1, Integer value2) {
			addCriterion("USER_CATEGORY not between", value1, value2,
					"userCategory");
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
			addCriterion("USER_ENTRYTIME between", value1, value2,
					"userEntrytime");
			return (Criteria) this;
		}

		public Criteria andUserEntrytimeNotBetween(Date value1, Date value2) {
			addCriterion("USER_ENTRYTIME not between", value1, value2,
					"userEntrytime");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictIsNull() {
			addCriterion("USER_POSITION_LEVEL_DICT is null");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictIsNotNull() {
			addCriterion("USER_POSITION_LEVEL_DICT is not null");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictEqualTo(Integer value) {
			addCriterion("USER_POSITION_LEVEL_DICT =", value,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictNotEqualTo(Integer value) {
			addCriterion("USER_POSITION_LEVEL_DICT <>", value,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictGreaterThan(Integer value) {
			addCriterion("USER_POSITION_LEVEL_DICT >", value,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("USER_POSITION_LEVEL_DICT >=", value,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictLessThan(Integer value) {
			addCriterion("USER_POSITION_LEVEL_DICT <", value,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictLessThanOrEqualTo(Integer value) {
			addCriterion("USER_POSITION_LEVEL_DICT <=", value,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictIn(List<Integer> values) {
			addCriterion("USER_POSITION_LEVEL_DICT in", values,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictNotIn(List<Integer> values) {
			addCriterion("USER_POSITION_LEVEL_DICT not in", values,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_POSITION_LEVEL_DICT between", value1, value2,
					"userPositionLevelDict");
			return (Criteria) this;
		}

		public Criteria andUserPositionLevelDictNotBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_POSITION_LEVEL_DICT not between", value1,
					value2, "userPositionLevelDict");
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
			addCriterion("USER_LOCATION between", value1, value2,
					"userLocation");
			return (Criteria) this;
		}

		public Criteria andUserLocationNotBetween(String value1, String value2) {
			addCriterion("USER_LOCATION not between", value1, value2,
					"userLocation");
			return (Criteria) this;
		}

		public Criteria andUserRemarkIsNull() {
			addCriterion("USER_REMARK is null");
			return (Criteria) this;
		}

		public Criteria andUserRemarkIsNotNull() {
			addCriterion("USER_REMARK is not null");
			return (Criteria) this;
		}

		public Criteria andUserRemarkEqualTo(String value) {
			addCriterion("USER_REMARK =", value, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkNotEqualTo(String value) {
			addCriterion("USER_REMARK <>", value, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkGreaterThan(String value) {
			addCriterion("USER_REMARK >", value, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("USER_REMARK >=", value, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkLessThan(String value) {
			addCriterion("USER_REMARK <", value, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkLessThanOrEqualTo(String value) {
			addCriterion("USER_REMARK <=", value, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkLike(String value) {
			addCriterion("USER_REMARK like", value, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkNotLike(String value) {
			addCriterion("USER_REMARK not like", value, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkIn(List<String> values) {
			addCriterion("USER_REMARK in", values, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkNotIn(List<String> values) {
			addCriterion("USER_REMARK not in", values, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkBetween(String value1, String value2) {
			addCriterion("USER_REMARK between", value1, value2, "userRemark");
			return (Criteria) this;
		}

		public Criteria andUserRemarkNotBetween(String value1, String value2) {
			addCriterion("USER_REMARK not between", value1, value2,
					"userRemark");
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
			addCriterion("USER_EMPLOYEETYPE not like", value,
					"userEmployeetype");
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
			addCriterion("USER_EMPLOYEETYPE between", value1, value2,
					"userEmployeetype");
			return (Criteria) this;
		}

		public Criteria andUserEmployeetypeNotBetween(String value1,
				String value2) {
			addCriterion("USER_EMPLOYEETYPE not between", value1, value2,
					"userEmployeetype");
			return (Criteria) this;
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
			addCriterion("ORG_INITIALS not between", value1, value2,
					"orgInitials");
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
			addCriterion("ORG_DESCRIPTION between", value1, value2,
					"orgDescription");
			return (Criteria) this;
		}

		public Criteria andOrgDescriptionNotBetween(String value1, String value2) {
			addCriterion("ORG_DESCRIPTION not between", value1, value2,
					"orgDescription");
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

		public Criteria andOrgParentIdLike(String value) {
			addCriterion("ORG_PARENT_ID like", value, "orgParentId");
			return (Criteria) this;
		}

		public Criteria andOrgParentIdNotLike(String value) {
			addCriterion("ORG_PARENT_ID not like", value, "orgParentId");
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
			addCriterion("ORG_PARENT_ID not between", value1, value2,
					"orgParentId");
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
			addCriterion("ORG_LAYER_CODE between", value1, value2,
					"orgLayerCode");
			return (Criteria) this;
		}

		public Criteria andOrgLayerCodeNotBetween(String value1, String value2) {
			addCriterion("ORG_LAYER_CODE not between", value1, value2,
					"orgLayerCode");
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
			addCriterion("ORG_LEVEL_DICT between", value1, value2,
					"orgLevelDict");
			return (Criteria) this;
		}

		public Criteria andOrgLevelDictNotBetween(Integer value1, Integer value2) {
			addCriterion("ORG_LEVEL_DICT not between", value1, value2,
					"orgLevelDict");
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
			addCriterion("ORG_DISPLAY_ORDER between", value1, value2,
					"orgDisplayOrder");
			return (Criteria) this;
		}

		public Criteria andOrgDisplayOrderNotBetween(Integer value1,
				Integer value2) {
			addCriterion("ORG_DISPLAY_ORDER not between", value1, value2,
					"orgDisplayOrder");
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
			addCriterion("ORG_SUPERVISOR_UID not like", value,
					"orgSupervisorUid");
			return (Criteria) this;
		}

		public Criteria andOrgSupervisorUidIn(List<String> values) {
			addCriterion("ORG_SUPERVISOR_UID in", values, "orgSupervisorUid");
			return (Criteria) this;
		}

		public Criteria andOrgSupervisorUidNotIn(List<String> values) {
			addCriterion("ORG_SUPERVISOR_UID not in", values,
					"orgSupervisorUid");
			return (Criteria) this;
		}

		public Criteria andOrgSupervisorUidBetween(String value1, String value2) {
			addCriterion("ORG_SUPERVISOR_UID between", value1, value2,
					"orgSupervisorUid");
			return (Criteria) this;
		}

		public Criteria andOrgSupervisorUidNotBetween(String value1,
				String value2) {
			addCriterion("ORG_SUPERVISOR_UID not between", value1, value2,
					"orgSupervisorUid");
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
			addCriterion("ORG_MANAGER_UID between", value1, value2,
					"orgManagerUid");
			return (Criteria) this;
		}

		public Criteria andOrgManagerUidNotBetween(String value1, String value2) {
			addCriterion("ORG_MANAGER_UID not between", value1, value2,
					"orgManagerUid");
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
			addCriterion("ORG_VICE_MANAGER_UID like", value,
					"orgViceManagerUid");
			return (Criteria) this;
		}

		public Criteria andOrgViceManagerUidNotLike(String value) {
			addCriterion("ORG_VICE_MANAGER_UID not like", value,
					"orgViceManagerUid");
			return (Criteria) this;
		}

		public Criteria andOrgViceManagerUidIn(List<String> values) {
			addCriterion("ORG_VICE_MANAGER_UID in", values, "orgViceManagerUid");
			return (Criteria) this;
		}

		public Criteria andOrgViceManagerUidNotIn(List<String> values) {
			addCriterion("ORG_VICE_MANAGER_UID not in", values,
					"orgViceManagerUid");
			return (Criteria) this;
		}

		public Criteria andOrgViceManagerUidBetween(String value1, String value2) {
			addCriterion("ORG_VICE_MANAGER_UID between", value1, value2,
					"orgViceManagerUid");
			return (Criteria) this;
		}

		public Criteria andOrgViceManagerUidNotBetween(String value1,
				String value2) {
			addCriterion("ORG_VICE_MANAGER_UID not between", value1, value2,
					"orgViceManagerUid");
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
			addCriterion("ORG_ADMIN_UID not between", value1, value2,
					"orgAdminUid");
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
			addCriterion("ORG_MANAGE_ORG_ID between", value1, value2,
					"orgManageOrgId");
			return (Criteria) this;
		}

		public Criteria andOrgManageOrgIdNotBetween(String value1, String value2) {
			addCriterion("ORG_MANAGE_ORG_ID not between", value1, value2,
					"orgManageOrgId");
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
			addCriterion("ORG_POSTAL_ADDRESS not like", value,
					"orgPostalAddress");
			return (Criteria) this;
		}

		public Criteria andOrgPostalAddressIn(List<String> values) {
			addCriterion("ORG_POSTAL_ADDRESS in", values, "orgPostalAddress");
			return (Criteria) this;
		}

		public Criteria andOrgPostalAddressNotIn(List<String> values) {
			addCriterion("ORG_POSTAL_ADDRESS not in", values,
					"orgPostalAddress");
			return (Criteria) this;
		}

		public Criteria andOrgPostalAddressBetween(String value1, String value2) {
			addCriterion("ORG_POSTAL_ADDRESS between", value1, value2,
					"orgPostalAddress");
			return (Criteria) this;
		}

		public Criteria andOrgPostalAddressNotBetween(String value1,
				String value2) {
			addCriterion("ORG_POSTAL_ADDRESS not between", value1, value2,
					"orgPostalAddress");
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
			addCriterion("ORG_POSTAL_CODE between", value1, value2,
					"orgPostalCode");
			return (Criteria) this;
		}

		public Criteria andOrgPostalCodeNotBetween(String value1, String value2) {
			addCriterion("ORG_POSTAL_CODE not between", value1, value2,
					"orgPostalCode");
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
			addCriterion("ORG_TELEPHONE_NUMBER like", value,
					"orgTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andOrgTelephoneNumberNotLike(String value) {
			addCriterion("ORG_TELEPHONE_NUMBER not like", value,
					"orgTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andOrgTelephoneNumberIn(List<String> values) {
			addCriterion("ORG_TELEPHONE_NUMBER in", values,
					"orgTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andOrgTelephoneNumberNotIn(List<String> values) {
			addCriterion("ORG_TELEPHONE_NUMBER not in", values,
					"orgTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andOrgTelephoneNumberBetween(String value1,
				String value2) {
			addCriterion("ORG_TELEPHONE_NUMBER between", value1, value2,
					"orgTelephoneNumber");
			return (Criteria) this;
		}

		public Criteria andOrgTelephoneNumberNotBetween(String value1,
				String value2) {
			addCriterion("ORG_TELEPHONE_NUMBER not between", value1, value2,
					"orgTelephoneNumber");
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
			addCriterion("ORG_FAX_NUMBER between", value1, value2,
					"orgFaxNumber");
			return (Criteria) this;
		}

		public Criteria andOrgFaxNumberNotBetween(String value1, String value2) {
			addCriterion("ORG_FAX_NUMBER not between", value1, value2,
					"orgFaxNumber");
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
			addCriterion("ORG_STARTTIME between", value1, value2,
					"orgStarttime");
			return (Criteria) this;
		}

		public Criteria andOrgStarttimeNotBetween(Date value1, Date value2) {
			addCriterion("ORG_STARTTIME not between", value1, value2,
					"orgStarttime");
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
			addCriterion("ORG_ENDTIME not between", value1, value2,
					"orgEndtime");
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
			addCriterion("ORG_LOCATION not between", value1, value2,
					"orgLocation");
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
			addCriterion("USER_ORGWORK_TYPE between", value1, value2,
					"userOrgworkType");
			return (Criteria) this;
		}

		public Criteria andUserOrgworkTypeNotBetween(String value1,
				String value2) {
			addCriterion("USER_ORGWORK_TYPE not between", value1, value2,
					"userOrgworkType");
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
			addCriterion("USER_DISPLAY_ORDER not in", values,
					"userDisplayOrder");
			return (Criteria) this;
		}

		public Criteria andUserDisplayOrderBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_DISPLAY_ORDER between", value1, value2,
					"userDisplayOrder");
			return (Criteria) this;
		}

		public Criteria andUserDisplayOrderNotBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_DISPLAY_ORDER not between", value1, value2,
					"userDisplayOrder");
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
			addCriterion("USER_ORGDUTY_DICT between", value1, value2,
					"userOrgdutyDict");
			return (Criteria) this;
		}

		public Criteria andUserOrgdutyDictNotBetween(Integer value1,
				Integer value2) {
			addCriterion("USER_ORGDUTY_DICT not between", value1, value2,
					"userOrgdutyDict");
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	public AuthGroup getGroup() {
		return group;
	}

	public void setGroup(AuthGroup group) {
		this.group = group;
	}

	public AuthOrg getOrg() {
		return org;
	}

	public void setOrg(AuthOrg org) {
		this.org = org;
	}

	public AuthUser getUser() {
		return user;
	}

	public void setUser(AuthUser user) {
		this.user = user;
	}

}