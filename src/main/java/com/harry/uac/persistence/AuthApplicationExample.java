package com.harry.uac.persistence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.harry.uac.common.util.Page;

public class AuthApplicationExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected Page page;

	public AuthApplicationExample() {
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
			addCriterion("APPLICATION_ID between", value1, value2,
					"applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationIdNotBetween(Long value1, Long value2) {
			addCriterion("APPLICATION_ID not between", value1, value2,
					"applicationId");
			return (Criteria) this;
		}

		public Criteria andApplicationNameIsNull() {
			addCriterion("APPLICATION_NAME is null");
			return (Criteria) this;
		}

		public Criteria andApplicationNameIsNotNull() {
			addCriterion("APPLICATION_NAME is not null");
			return (Criteria) this;
		}

		public Criteria andApplicationNameEqualTo(String value) {
			addCriterion("APPLICATION_NAME =", value, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameNotEqualTo(String value) {
			addCriterion("APPLICATION_NAME <>", value, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameGreaterThan(String value) {
			addCriterion("APPLICATION_NAME >", value, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameGreaterThanOrEqualTo(String value) {
			addCriterion("APPLICATION_NAME >=", value, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameLessThan(String value) {
			addCriterion("APPLICATION_NAME <", value, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameLessThanOrEqualTo(String value) {
			addCriterion("APPLICATION_NAME <=", value, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameLike(String value) {
			addCriterion("APPLICATION_NAME like", value, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameNotLike(String value) {
			addCriterion("APPLICATION_NAME not like", value, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameIn(List<String> values) {
			addCriterion("APPLICATION_NAME in", values, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameNotIn(List<String> values) {
			addCriterion("APPLICATION_NAME not in", values, "applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameBetween(String value1, String value2) {
			addCriterion("APPLICATION_NAME between", value1, value2,
					"applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationNameNotBetween(String value1,
				String value2) {
			addCriterion("APPLICATION_NAME not between", value1, value2,
					"applicationName");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlIsNull() {
			addCriterion("APPLICATION_URL is null");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlIsNotNull() {
			addCriterion("APPLICATION_URL is not null");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlEqualTo(String value) {
			addCriterion("APPLICATION_URL =", value, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlNotEqualTo(String value) {
			addCriterion("APPLICATION_URL <>", value, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlGreaterThan(String value) {
			addCriterion("APPLICATION_URL >", value, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlGreaterThanOrEqualTo(String value) {
			addCriterion("APPLICATION_URL >=", value, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlLessThan(String value) {
			addCriterion("APPLICATION_URL <", value, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlLessThanOrEqualTo(String value) {
			addCriterion("APPLICATION_URL <=", value, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlLike(String value) {
			addCriterion("APPLICATION_URL like", value, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlNotLike(String value) {
			addCriterion("APPLICATION_URL not like", value, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlIn(List<String> values) {
			addCriterion("APPLICATION_URL in", values, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlNotIn(List<String> values) {
			addCriterion("APPLICATION_URL not in", values, "applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlBetween(String value1, String value2) {
			addCriterion("APPLICATION_URL between", value1, value2,
					"applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationUrlNotBetween(String value1, String value2) {
			addCriterion("APPLICATION_URL not between", value1, value2,
					"applicationUrl");
			return (Criteria) this;
		}

		public Criteria andApplicationContactIsNull() {
			addCriterion("APPLICATION_CONTACT is null");
			return (Criteria) this;
		}

		public Criteria andApplicationContactIsNotNull() {
			addCriterion("APPLICATION_CONTACT is not null");
			return (Criteria) this;
		}

		public Criteria andApplicationContactEqualTo(String value) {
			addCriterion("APPLICATION_CONTACT =", value, "applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactNotEqualTo(String value) {
			addCriterion("APPLICATION_CONTACT <>", value, "applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactGreaterThan(String value) {
			addCriterion("APPLICATION_CONTACT >", value, "applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactGreaterThanOrEqualTo(String value) {
			addCriterion("APPLICATION_CONTACT >=", value, "applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactLessThan(String value) {
			addCriterion("APPLICATION_CONTACT <", value, "applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactLessThanOrEqualTo(String value) {
			addCriterion("APPLICATION_CONTACT <=", value, "applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactLike(String value) {
			addCriterion("APPLICATION_CONTACT like", value,
					"applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactNotLike(String value) {
			addCriterion("APPLICATION_CONTACT not like", value,
					"applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactIn(List<String> values) {
			addCriterion("APPLICATION_CONTACT in", values, "applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactNotIn(List<String> values) {
			addCriterion("APPLICATION_CONTACT not in", values,
					"applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactBetween(String value1,
				String value2) {
			addCriterion("APPLICATION_CONTACT between", value1, value2,
					"applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactNotBetween(String value1,
				String value2) {
			addCriterion("APPLICATION_CONTACT not between", value1, value2,
					"applicationContact");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneIsNull() {
			addCriterion("APPLICATION_CONTACT_PHONE is null");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneIsNotNull() {
			addCriterion("APPLICATION_CONTACT_PHONE is not null");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneEqualTo(String value) {
			addCriterion("APPLICATION_CONTACT_PHONE =", value,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneNotEqualTo(String value) {
			addCriterion("APPLICATION_CONTACT_PHONE <>", value,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneGreaterThan(String value) {
			addCriterion("APPLICATION_CONTACT_PHONE >", value,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneGreaterThanOrEqualTo(
				String value) {
			addCriterion("APPLICATION_CONTACT_PHONE >=", value,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneLessThan(String value) {
			addCriterion("APPLICATION_CONTACT_PHONE <", value,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneLessThanOrEqualTo(String value) {
			addCriterion("APPLICATION_CONTACT_PHONE <=", value,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneLike(String value) {
			addCriterion("APPLICATION_CONTACT_PHONE like", value,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneNotLike(String value) {
			addCriterion("APPLICATION_CONTACT_PHONE not like", value,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneIn(List<String> values) {
			addCriterion("APPLICATION_CONTACT_PHONE in", values,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneNotIn(List<String> values) {
			addCriterion("APPLICATION_CONTACT_PHONE not in", values,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneBetween(String value1,
				String value2) {
			addCriterion("APPLICATION_CONTACT_PHONE between", value1, value2,
					"applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationContactPhoneNotBetween(String value1,
				String value2) {
			addCriterion("APPLICATION_CONTACT_PHONE not between", value1,
					value2, "applicationContactPhone");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsIsNull() {
			addCriterion("APPLICATION_SYNC_FIELDS is null");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsIsNotNull() {
			addCriterion("APPLICATION_SYNC_FIELDS is not null");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsEqualTo(Long value) {
			addCriterion("APPLICATION_SYNC_FIELDS =", value,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsNotEqualTo(Long value) {
			addCriterion("APPLICATION_SYNC_FIELDS <>", value,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsGreaterThan(Long value) {
			addCriterion("APPLICATION_SYNC_FIELDS >", value,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsGreaterThanOrEqualTo(Long value) {
			addCriterion("APPLICATION_SYNC_FIELDS >=", value,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsLessThan(Long value) {
			addCriterion("APPLICATION_SYNC_FIELDS <", value,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsLessThanOrEqualTo(Long value) {
			addCriterion("APPLICATION_SYNC_FIELDS <=", value,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsIn(List<Long> values) {
			addCriterion("APPLICATION_SYNC_FIELDS in", values,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsNotIn(List<Long> values) {
			addCriterion("APPLICATION_SYNC_FIELDS not in", values,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsBetween(Long value1, Long value2) {
			addCriterion("APPLICATION_SYNC_FIELDS between", value1, value2,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationSyncFieldsNotBetween(Long value1,
				Long value2) {
			addCriterion("APPLICATION_SYNC_FIELDS not between", value1, value2,
					"applicationSyncFields");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkIsNull() {
			addCriterion("APPLICATION_REMARK is null");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkIsNotNull() {
			addCriterion("APPLICATION_REMARK is not null");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkEqualTo(String value) {
			addCriterion("APPLICATION_REMARK =", value, "applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkNotEqualTo(String value) {
			addCriterion("APPLICATION_REMARK <>", value, "applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkGreaterThan(String value) {
			addCriterion("APPLICATION_REMARK >", value, "applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("APPLICATION_REMARK >=", value, "applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkLessThan(String value) {
			addCriterion("APPLICATION_REMARK <", value, "applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkLessThanOrEqualTo(String value) {
			addCriterion("APPLICATION_REMARK <=", value, "applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkLike(String value) {
			addCriterion("APPLICATION_REMARK like", value, "applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkNotLike(String value) {
			addCriterion("APPLICATION_REMARK not like", value,
					"applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkIn(List<String> values) {
			addCriterion("APPLICATION_REMARK in", values, "applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkNotIn(List<String> values) {
			addCriterion("APPLICATION_REMARK not in", values,
					"applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkBetween(String value1, String value2) {
			addCriterion("APPLICATION_REMARK between", value1, value2,
					"applicationRemark");
			return (Criteria) this;
		}

		public Criteria andApplicationRemarkNotBetween(String value1,
				String value2) {
			addCriterion("APPLICATION_REMARK not between", value1, value2,
					"applicationRemark");
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
			addCriterion("CREATE_USER_ID between", value1, value2,
					"createUserId");
			return (Criteria) this;
		}

		public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
			addCriterion("CREATE_USER_ID not between", value1, value2,
					"createUserId");
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
			addCriterion("CREATE_TIME not between", value1, value2,
					"createTime");
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
			addCriterion("UPDATE_USER_ID between", value1, value2,
					"updateUserId");
			return (Criteria) this;
		}

		public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
			addCriterion("UPDATE_USER_ID not between", value1, value2,
					"updateUserId");
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
			addCriterion("UPDATE_TIME not between", value1, value2,
					"updateTime");
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
}