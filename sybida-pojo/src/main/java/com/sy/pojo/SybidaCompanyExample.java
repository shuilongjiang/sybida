package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaCompanyExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdIsNull() {
            addCriterion("company_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdIsNotNull() {
            addCriterion("company_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdEqualTo(Integer value) {
            addCriterion("company_user_id =", value, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdNotEqualTo(Integer value) {
            addCriterion("company_user_id <>", value, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdGreaterThan(Integer value) {
            addCriterion("company_user_id >", value, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_user_id >=", value, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdLessThan(Integer value) {
            addCriterion("company_user_id <", value, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_user_id <=", value, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdIn(List<Integer> values) {
            addCriterion("company_user_id in", values, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdNotIn(List<Integer> values) {
            addCriterion("company_user_id not in", values, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("company_user_id between", value1, value2, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_user_id not between", value1, value2, "companyUserId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdIsNull() {
            addCriterion("company_mark_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdIsNotNull() {
            addCriterion("company_mark_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdEqualTo(Integer value) {
            addCriterion("company_mark_id =", value, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdNotEqualTo(Integer value) {
            addCriterion("company_mark_id <>", value, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdGreaterThan(Integer value) {
            addCriterion("company_mark_id >", value, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_mark_id >=", value, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdLessThan(Integer value) {
            addCriterion("company_mark_id <", value, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_mark_id <=", value, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdIn(List<Integer> values) {
            addCriterion("company_mark_id in", values, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdNotIn(List<Integer> values) {
            addCriterion("company_mark_id not in", values, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdBetween(Integer value1, Integer value2) {
            addCriterion("company_mark_id between", value1, value2, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyMarkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_mark_id not between", value1, value2, "companyMarkId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeIsNull() {
            addCriterion("company_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeIsNotNull() {
            addCriterion("company_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeEqualTo(Date value) {
            addCriterion("company_end_time =", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeNotEqualTo(Date value) {
            addCriterion("company_end_time <>", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeGreaterThan(Date value) {
            addCriterion("company_end_time >", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("company_end_time >=", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeLessThan(Date value) {
            addCriterion("company_end_time <", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("company_end_time <=", value, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeIn(List<Date> values) {
            addCriterion("company_end_time in", values, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeNotIn(List<Date> values) {
            addCriterion("company_end_time not in", values, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeBetween(Date value1, Date value2) {
            addCriterion("company_end_time between", value1, value2, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("company_end_time not between", value1, value2, "companyEndTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeIsNull() {
            addCriterion("company_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeIsNotNull() {
            addCriterion("company_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeEqualTo(Date value) {
            addCriterion("company_start_time =", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeNotEqualTo(Date value) {
            addCriterion("company_start_time <>", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeGreaterThan(Date value) {
            addCriterion("company_start_time >", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("company_start_time >=", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeLessThan(Date value) {
            addCriterion("company_start_time <", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("company_start_time <=", value, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeIn(List<Date> values) {
            addCriterion("company_start_time in", values, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeNotIn(List<Date> values) {
            addCriterion("company_start_time not in", values, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeBetween(Date value1, Date value2) {
            addCriterion("company_start_time between", value1, value2, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("company_start_time not between", value1, value2, "companyStartTime");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdIsNull() {
            addCriterion("company_study_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdIsNotNull() {
            addCriterion("company_study_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdEqualTo(Integer value) {
            addCriterion("company_study_id =", value, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdNotEqualTo(Integer value) {
            addCriterion("company_study_id <>", value, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdGreaterThan(Integer value) {
            addCriterion("company_study_id >", value, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_study_id >=", value, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdLessThan(Integer value) {
            addCriterion("company_study_id <", value, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_study_id <=", value, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdIn(List<Integer> values) {
            addCriterion("company_study_id in", values, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdNotIn(List<Integer> values) {
            addCriterion("company_study_id not in", values, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_study_id between", value1, value2, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_study_id not between", value1, value2, "companyStudyId");
            return (Criteria) this;
        }

        public Criteria andCompanyWebIsNull() {
            addCriterion("company_web is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebIsNotNull() {
            addCriterion("company_web is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebEqualTo(String value) {
            addCriterion("company_web =", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebNotEqualTo(String value) {
            addCriterion("company_web <>", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebGreaterThan(String value) {
            addCriterion("company_web >", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebGreaterThanOrEqualTo(String value) {
            addCriterion("company_web >=", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebLessThan(String value) {
            addCriterion("company_web <", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebLessThanOrEqualTo(String value) {
            addCriterion("company_web <=", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebLike(String value) {
            addCriterion("company_web like", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebNotLike(String value) {
            addCriterion("company_web not like", value, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebIn(List<String> values) {
            addCriterion("company_web in", values, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebNotIn(List<String> values) {
            addCriterion("company_web not in", values, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebBetween(String value1, String value2) {
            addCriterion("company_web between", value1, value2, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyWebNotBetween(String value1, String value2) {
            addCriterion("company_web not between", value1, value2, "companyWeb");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireIsNull() {
            addCriterion("company_require is null");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireIsNotNull() {
            addCriterion("company_require is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireEqualTo(String value) {
            addCriterion("company_require =", value, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireNotEqualTo(String value) {
            addCriterion("company_require <>", value, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireGreaterThan(String value) {
            addCriterion("company_require >", value, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireGreaterThanOrEqualTo(String value) {
            addCriterion("company_require >=", value, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireLessThan(String value) {
            addCriterion("company_require <", value, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireLessThanOrEqualTo(String value) {
            addCriterion("company_require <=", value, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireLike(String value) {
            addCriterion("company_require like", value, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireNotLike(String value) {
            addCriterion("company_require not like", value, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireIn(List<String> values) {
            addCriterion("company_require in", values, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireNotIn(List<String> values) {
            addCriterion("company_require not in", values, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireBetween(String value1, String value2) {
            addCriterion("company_require between", value1, value2, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanyRequireNotBetween(String value1, String value2) {
            addCriterion("company_require not between", value1, value2, "companyRequire");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryIsNull() {
            addCriterion("company_salary is null");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryIsNotNull() {
            addCriterion("company_salary is not null");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryEqualTo(Integer value) {
            addCriterion("company_salary =", value, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryNotEqualTo(Integer value) {
            addCriterion("company_salary <>", value, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryGreaterThan(Integer value) {
            addCriterion("company_salary >", value, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_salary >=", value, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryLessThan(Integer value) {
            addCriterion("company_salary <", value, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryLessThanOrEqualTo(Integer value) {
            addCriterion("company_salary <=", value, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryIn(List<Integer> values) {
            addCriterion("company_salary in", values, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryNotIn(List<Integer> values) {
            addCriterion("company_salary not in", values, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryBetween(Integer value1, Integer value2) {
            addCriterion("company_salary between", value1, value2, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanySalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("company_salary not between", value1, value2, "companySalary");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxIsNull() {
            addCriterion("company_mailbox is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxIsNotNull() {
            addCriterion("company_mailbox is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxEqualTo(String value) {
            addCriterion("company_mailbox =", value, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxNotEqualTo(String value) {
            addCriterion("company_mailbox <>", value, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxGreaterThan(String value) {
            addCriterion("company_mailbox >", value, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxGreaterThanOrEqualTo(String value) {
            addCriterion("company_mailbox >=", value, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxLessThan(String value) {
            addCriterion("company_mailbox <", value, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxLessThanOrEqualTo(String value) {
            addCriterion("company_mailbox <=", value, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxLike(String value) {
            addCriterion("company_mailbox like", value, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxNotLike(String value) {
            addCriterion("company_mailbox not like", value, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxIn(List<String> values) {
            addCriterion("company_mailbox in", values, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxNotIn(List<String> values) {
            addCriterion("company_mailbox not in", values, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxBetween(String value1, String value2) {
            addCriterion("company_mailbox between", value1, value2, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyMailboxNotBetween(String value1, String value2) {
            addCriterion("company_mailbox not between", value1, value2, "companyMailbox");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatIsNull() {
            addCriterion("company_wechat is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatIsNotNull() {
            addCriterion("company_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatEqualTo(String value) {
            addCriterion("company_wechat =", value, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatNotEqualTo(String value) {
            addCriterion("company_wechat <>", value, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatGreaterThan(String value) {
            addCriterion("company_wechat >", value, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatGreaterThanOrEqualTo(String value) {
            addCriterion("company_wechat >=", value, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatLessThan(String value) {
            addCriterion("company_wechat <", value, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatLessThanOrEqualTo(String value) {
            addCriterion("company_wechat <=", value, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatLike(String value) {
            addCriterion("company_wechat like", value, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatNotLike(String value) {
            addCriterion("company_wechat not like", value, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatIn(List<String> values) {
            addCriterion("company_wechat in", values, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatNotIn(List<String> values) {
            addCriterion("company_wechat not in", values, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatBetween(String value1, String value2) {
            addCriterion("company_wechat between", value1, value2, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyWechatNotBetween(String value1, String value2) {
            addCriterion("company_wechat not between", value1, value2, "companyWechat");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceIsNull() {
            addCriterion("company_introduce is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceIsNotNull() {
            addCriterion("company_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceEqualTo(String value) {
            addCriterion("company_introduce =", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceNotEqualTo(String value) {
            addCriterion("company_introduce <>", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceGreaterThan(String value) {
            addCriterion("company_introduce >", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("company_introduce >=", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceLessThan(String value) {
            addCriterion("company_introduce <", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceLessThanOrEqualTo(String value) {
            addCriterion("company_introduce <=", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceLike(String value) {
            addCriterion("company_introduce like", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceNotLike(String value) {
            addCriterion("company_introduce not like", value, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceIn(List<String> values) {
            addCriterion("company_introduce in", values, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceNotIn(List<String> values) {
            addCriterion("company_introduce not in", values, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceBetween(String value1, String value2) {
            addCriterion("company_introduce between", value1, value2, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyIntroduceNotBetween(String value1, String value2) {
            addCriterion("company_introduce not between", value1, value2, "companyIntroduce");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureIsNull() {
            addCriterion("company_picture is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureIsNotNull() {
            addCriterion("company_picture is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureEqualTo(String value) {
            addCriterion("company_picture =", value, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureNotEqualTo(String value) {
            addCriterion("company_picture <>", value, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureGreaterThan(String value) {
            addCriterion("company_picture >", value, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureGreaterThanOrEqualTo(String value) {
            addCriterion("company_picture >=", value, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureLessThan(String value) {
            addCriterion("company_picture <", value, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureLessThanOrEqualTo(String value) {
            addCriterion("company_picture <=", value, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureLike(String value) {
            addCriterion("company_picture like", value, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureNotLike(String value) {
            addCriterion("company_picture not like", value, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureIn(List<String> values) {
            addCriterion("company_picture in", values, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureNotIn(List<String> values) {
            addCriterion("company_picture not in", values, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureBetween(String value1, String value2) {
            addCriterion("company_picture between", value1, value2, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyPictureNotBetween(String value1, String value2) {
            addCriterion("company_picture not between", value1, value2, "companyPicture");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewIsNull() {
            addCriterion("company_is_view is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewIsNotNull() {
            addCriterion("company_is_view is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewEqualTo(Byte value) {
            addCriterion("company_is_view =", value, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewNotEqualTo(Byte value) {
            addCriterion("company_is_view <>", value, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewGreaterThan(Byte value) {
            addCriterion("company_is_view >", value, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewGreaterThanOrEqualTo(Byte value) {
            addCriterion("company_is_view >=", value, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewLessThan(Byte value) {
            addCriterion("company_is_view <", value, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewLessThanOrEqualTo(Byte value) {
            addCriterion("company_is_view <=", value, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewIn(List<Byte> values) {
            addCriterion("company_is_view in", values, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewNotIn(List<Byte> values) {
            addCriterion("company_is_view not in", values, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewBetween(Byte value1, Byte value2) {
            addCriterion("company_is_view between", value1, value2, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyIsViewNotBetween(Byte value1, Byte value2) {
            addCriterion("company_is_view not between", value1, value2, "companyIsView");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeIsNull() {
            addCriterion("company_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeIsNotNull() {
            addCriterion("company_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeEqualTo(Date value) {
            addCriterion("company_alter_time =", value, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeNotEqualTo(Date value) {
            addCriterion("company_alter_time <>", value, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeGreaterThan(Date value) {
            addCriterion("company_alter_time >", value, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("company_alter_time >=", value, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeLessThan(Date value) {
            addCriterion("company_alter_time <", value, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("company_alter_time <=", value, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeIn(List<Date> values) {
            addCriterion("company_alter_time in", values, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeNotIn(List<Date> values) {
            addCriterion("company_alter_time not in", values, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeBetween(Date value1, Date value2) {
            addCriterion("company_alter_time between", value1, value2, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("company_alter_time not between", value1, value2, "companyAlterTime");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1IsNull() {
            addCriterion("company_null1 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1IsNotNull() {
            addCriterion("company_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1EqualTo(String value) {
            addCriterion("company_null1 =", value, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1NotEqualTo(String value) {
            addCriterion("company_null1 <>", value, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1GreaterThan(String value) {
            addCriterion("company_null1 >", value, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1GreaterThanOrEqualTo(String value) {
            addCriterion("company_null1 >=", value, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1LessThan(String value) {
            addCriterion("company_null1 <", value, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1LessThanOrEqualTo(String value) {
            addCriterion("company_null1 <=", value, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1Like(String value) {
            addCriterion("company_null1 like", value, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1NotLike(String value) {
            addCriterion("company_null1 not like", value, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1In(List<String> values) {
            addCriterion("company_null1 in", values, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1NotIn(List<String> values) {
            addCriterion("company_null1 not in", values, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1Between(String value1, String value2) {
            addCriterion("company_null1 between", value1, value2, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull1NotBetween(String value1, String value2) {
            addCriterion("company_null1 not between", value1, value2, "companyNull1");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2IsNull() {
            addCriterion("company_null2 is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2IsNotNull() {
            addCriterion("company_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2EqualTo(String value) {
            addCriterion("company_null2 =", value, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2NotEqualTo(String value) {
            addCriterion("company_null2 <>", value, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2GreaterThan(String value) {
            addCriterion("company_null2 >", value, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2GreaterThanOrEqualTo(String value) {
            addCriterion("company_null2 >=", value, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2LessThan(String value) {
            addCriterion("company_null2 <", value, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2LessThanOrEqualTo(String value) {
            addCriterion("company_null2 <=", value, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2Like(String value) {
            addCriterion("company_null2 like", value, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2NotLike(String value) {
            addCriterion("company_null2 not like", value, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2In(List<String> values) {
            addCriterion("company_null2 in", values, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2NotIn(List<String> values) {
            addCriterion("company_null2 not in", values, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2Between(String value1, String value2) {
            addCriterion("company_null2 between", value1, value2, "companyNull2");
            return (Criteria) this;
        }

        public Criteria andCompanyNull2NotBetween(String value1, String value2) {
            addCriterion("company_null2 not between", value1, value2, "companyNull2");
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
}