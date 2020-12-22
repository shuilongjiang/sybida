package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaOfferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaOfferExample() {
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

        public Criteria andOfferIdIsNull() {
            addCriterion("offer_id is null");
            return (Criteria) this;
        }

        public Criteria andOfferIdIsNotNull() {
            addCriterion("offer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfferIdEqualTo(Integer value) {
            addCriterion("offer_id =", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotEqualTo(Integer value) {
            addCriterion("offer_id <>", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdGreaterThan(Integer value) {
            addCriterion("offer_id >", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_id >=", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdLessThan(Integer value) {
            addCriterion("offer_id <", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdLessThanOrEqualTo(Integer value) {
            addCriterion("offer_id <=", value, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdIn(List<Integer> values) {
            addCriterion("offer_id in", values, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotIn(List<Integer> values) {
            addCriterion("offer_id not in", values, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdBetween(Integer value1, Integer value2) {
            addCriterion("offer_id between", value1, value2, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferIdNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_id not between", value1, value2, "offerId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdIsNull() {
            addCriterion("offer_student_id is null");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdIsNotNull() {
            addCriterion("offer_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdEqualTo(Integer value) {
            addCriterion("offer_student_id =", value, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdNotEqualTo(Integer value) {
            addCriterion("offer_student_id <>", value, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdGreaterThan(Integer value) {
            addCriterion("offer_student_id >", value, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_student_id >=", value, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdLessThan(Integer value) {
            addCriterion("offer_student_id <", value, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("offer_student_id <=", value, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdIn(List<Integer> values) {
            addCriterion("offer_student_id in", values, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdNotIn(List<Integer> values) {
            addCriterion("offer_student_id not in", values, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("offer_student_id between", value1, value2, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_student_id not between", value1, value2, "offerStudentId");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyIsNull() {
            addCriterion("offer_company is null");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyIsNotNull() {
            addCriterion("offer_company is not null");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyEqualTo(String value) {
            addCriterion("offer_company =", value, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyNotEqualTo(String value) {
            addCriterion("offer_company <>", value, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyGreaterThan(String value) {
            addCriterion("offer_company >", value, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("offer_company >=", value, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyLessThan(String value) {
            addCriterion("offer_company <", value, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyLessThanOrEqualTo(String value) {
            addCriterion("offer_company <=", value, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyLike(String value) {
            addCriterion("offer_company like", value, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyNotLike(String value) {
            addCriterion("offer_company not like", value, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyIn(List<String> values) {
            addCriterion("offer_company in", values, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyNotIn(List<String> values) {
            addCriterion("offer_company not in", values, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyBetween(String value1, String value2) {
            addCriterion("offer_company between", value1, value2, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferCompanyNotBetween(String value1, String value2) {
            addCriterion("offer_company not between", value1, value2, "offerCompany");
            return (Criteria) this;
        }

        public Criteria andOfferContactIsNull() {
            addCriterion("offer_contact is null");
            return (Criteria) this;
        }

        public Criteria andOfferContactIsNotNull() {
            addCriterion("offer_contact is not null");
            return (Criteria) this;
        }

        public Criteria andOfferContactEqualTo(String value) {
            addCriterion("offer_contact =", value, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactNotEqualTo(String value) {
            addCriterion("offer_contact <>", value, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactGreaterThan(String value) {
            addCriterion("offer_contact >", value, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactGreaterThanOrEqualTo(String value) {
            addCriterion("offer_contact >=", value, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactLessThan(String value) {
            addCriterion("offer_contact <", value, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactLessThanOrEqualTo(String value) {
            addCriterion("offer_contact <=", value, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactLike(String value) {
            addCriterion("offer_contact like", value, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactNotLike(String value) {
            addCriterion("offer_contact not like", value, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactIn(List<String> values) {
            addCriterion("offer_contact in", values, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactNotIn(List<String> values) {
            addCriterion("offer_contact not in", values, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactBetween(String value1, String value2) {
            addCriterion("offer_contact between", value1, value2, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferContactNotBetween(String value1, String value2) {
            addCriterion("offer_contact not between", value1, value2, "offerContact");
            return (Criteria) this;
        }

        public Criteria andOfferAddressIsNull() {
            addCriterion("offer_address is null");
            return (Criteria) this;
        }

        public Criteria andOfferAddressIsNotNull() {
            addCriterion("offer_address is not null");
            return (Criteria) this;
        }

        public Criteria andOfferAddressEqualTo(String value) {
            addCriterion("offer_address =", value, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressNotEqualTo(String value) {
            addCriterion("offer_address <>", value, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressGreaterThan(String value) {
            addCriterion("offer_address >", value, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressGreaterThanOrEqualTo(String value) {
            addCriterion("offer_address >=", value, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressLessThan(String value) {
            addCriterion("offer_address <", value, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressLessThanOrEqualTo(String value) {
            addCriterion("offer_address <=", value, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressLike(String value) {
            addCriterion("offer_address like", value, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressNotLike(String value) {
            addCriterion("offer_address not like", value, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressIn(List<String> values) {
            addCriterion("offer_address in", values, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressNotIn(List<String> values) {
            addCriterion("offer_address not in", values, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressBetween(String value1, String value2) {
            addCriterion("offer_address between", value1, value2, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferAddressNotBetween(String value1, String value2) {
            addCriterion("offer_address not between", value1, value2, "offerAddress");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdIsNull() {
            addCriterion("offer_study_id is null");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdIsNotNull() {
            addCriterion("offer_study_id is not null");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdEqualTo(Integer value) {
            addCriterion("offer_study_id =", value, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdNotEqualTo(Integer value) {
            addCriterion("offer_study_id <>", value, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdGreaterThan(Integer value) {
            addCriterion("offer_study_id >", value, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("offer_study_id >=", value, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdLessThan(Integer value) {
            addCriterion("offer_study_id <", value, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("offer_study_id <=", value, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdIn(List<Integer> values) {
            addCriterion("offer_study_id in", values, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdNotIn(List<Integer> values) {
            addCriterion("offer_study_id not in", values, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("offer_study_id between", value1, value2, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("offer_study_id not between", value1, value2, "offerStudyId");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeIsNull() {
            addCriterion("offer_datetime is null");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeIsNotNull() {
            addCriterion("offer_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeEqualTo(Date value) {
            addCriterion("offer_datetime =", value, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeNotEqualTo(Date value) {
            addCriterion("offer_datetime <>", value, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeGreaterThan(Date value) {
            addCriterion("offer_datetime >", value, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_datetime >=", value, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeLessThan(Date value) {
            addCriterion("offer_datetime <", value, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_datetime <=", value, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeIn(List<Date> values) {
            addCriterion("offer_datetime in", values, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeNotIn(List<Date> values) {
            addCriterion("offer_datetime not in", values, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeBetween(Date value1, Date value2) {
            addCriterion("offer_datetime between", value1, value2, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_datetime not between", value1, value2, "offerDatetime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryIsNull() {
            addCriterion("offer_practice_salary is null");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryIsNotNull() {
            addCriterion("offer_practice_salary is not null");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryEqualTo(String value) {
            addCriterion("offer_practice_salary =", value, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryNotEqualTo(String value) {
            addCriterion("offer_practice_salary <>", value, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryGreaterThan(String value) {
            addCriterion("offer_practice_salary >", value, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("offer_practice_salary >=", value, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryLessThan(String value) {
            addCriterion("offer_practice_salary <", value, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryLessThanOrEqualTo(String value) {
            addCriterion("offer_practice_salary <=", value, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryLike(String value) {
            addCriterion("offer_practice_salary like", value, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryNotLike(String value) {
            addCriterion("offer_practice_salary not like", value, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryIn(List<String> values) {
            addCriterion("offer_practice_salary in", values, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryNotIn(List<String> values) {
            addCriterion("offer_practice_salary not in", values, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryBetween(String value1, String value2) {
            addCriterion("offer_practice_salary between", value1, value2, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeSalaryNotBetween(String value1, String value2) {
            addCriterion("offer_practice_salary not between", value1, value2, "offerPracticeSalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryIsNull() {
            addCriterion("offer_really_salary is null");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryIsNotNull() {
            addCriterion("offer_really_salary is not null");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryEqualTo(String value) {
            addCriterion("offer_really_salary =", value, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryNotEqualTo(String value) {
            addCriterion("offer_really_salary <>", value, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryGreaterThan(String value) {
            addCriterion("offer_really_salary >", value, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryGreaterThanOrEqualTo(String value) {
            addCriterion("offer_really_salary >=", value, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryLessThan(String value) {
            addCriterion("offer_really_salary <", value, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryLessThanOrEqualTo(String value) {
            addCriterion("offer_really_salary <=", value, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryLike(String value) {
            addCriterion("offer_really_salary like", value, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryNotLike(String value) {
            addCriterion("offer_really_salary not like", value, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryIn(List<String> values) {
            addCriterion("offer_really_salary in", values, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryNotIn(List<String> values) {
            addCriterion("offer_really_salary not in", values, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryBetween(String value1, String value2) {
            addCriterion("offer_really_salary between", value1, value2, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferReallySalaryNotBetween(String value1, String value2) {
            addCriterion("offer_really_salary not between", value1, value2, "offerReallySalary");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateIsNull() {
            addCriterion("offer_hiredate is null");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateIsNotNull() {
            addCriterion("offer_hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateEqualTo(Date value) {
            addCriterion("offer_hiredate =", value, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateNotEqualTo(Date value) {
            addCriterion("offer_hiredate <>", value, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateGreaterThan(Date value) {
            addCriterion("offer_hiredate >", value, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_hiredate >=", value, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateLessThan(Date value) {
            addCriterion("offer_hiredate <", value, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateLessThanOrEqualTo(Date value) {
            addCriterion("offer_hiredate <=", value, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateIn(List<Date> values) {
            addCriterion("offer_hiredate in", values, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateNotIn(List<Date> values) {
            addCriterion("offer_hiredate not in", values, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateBetween(Date value1, Date value2) {
            addCriterion("offer_hiredate between", value1, value2, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferHiredateNotBetween(Date value1, Date value2) {
            addCriterion("offer_hiredate not between", value1, value2, "offerHiredate");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeIsNull() {
            addCriterion("offer_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeIsNotNull() {
            addCriterion("offer_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeEqualTo(Date value) {
            addCriterion("offer_alter_time =", value, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeNotEqualTo(Date value) {
            addCriterion("offer_alter_time <>", value, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeGreaterThan(Date value) {
            addCriterion("offer_alter_time >", value, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_alter_time >=", value, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeLessThan(Date value) {
            addCriterion("offer_alter_time <", value, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_alter_time <=", value, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeIn(List<Date> values) {
            addCriterion("offer_alter_time in", values, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeNotIn(List<Date> values) {
            addCriterion("offer_alter_time not in", values, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeBetween(Date value1, Date value2) {
            addCriterion("offer_alter_time between", value1, value2, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_alter_time not between", value1, value2, "offerAlterTime");
            return (Criteria) this;
        }

        public Criteria andOfferNull1IsNull() {
            addCriterion("offer_null1 is null");
            return (Criteria) this;
        }

        public Criteria andOfferNull1IsNotNull() {
            addCriterion("offer_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNull1EqualTo(String value) {
            addCriterion("offer_null1 =", value, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1NotEqualTo(String value) {
            addCriterion("offer_null1 <>", value, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1GreaterThan(String value) {
            addCriterion("offer_null1 >", value, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1GreaterThanOrEqualTo(String value) {
            addCriterion("offer_null1 >=", value, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1LessThan(String value) {
            addCriterion("offer_null1 <", value, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1LessThanOrEqualTo(String value) {
            addCriterion("offer_null1 <=", value, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1Like(String value) {
            addCriterion("offer_null1 like", value, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1NotLike(String value) {
            addCriterion("offer_null1 not like", value, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1In(List<String> values) {
            addCriterion("offer_null1 in", values, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1NotIn(List<String> values) {
            addCriterion("offer_null1 not in", values, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1Between(String value1, String value2) {
            addCriterion("offer_null1 between", value1, value2, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull1NotBetween(String value1, String value2) {
            addCriterion("offer_null1 not between", value1, value2, "offerNull1");
            return (Criteria) this;
        }

        public Criteria andOfferNull2IsNull() {
            addCriterion("offer_null2 is null");
            return (Criteria) this;
        }

        public Criteria andOfferNull2IsNotNull() {
            addCriterion("offer_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNull2EqualTo(String value) {
            addCriterion("offer_null2 =", value, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2NotEqualTo(String value) {
            addCriterion("offer_null2 <>", value, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2GreaterThan(String value) {
            addCriterion("offer_null2 >", value, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2GreaterThanOrEqualTo(String value) {
            addCriterion("offer_null2 >=", value, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2LessThan(String value) {
            addCriterion("offer_null2 <", value, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2LessThanOrEqualTo(String value) {
            addCriterion("offer_null2 <=", value, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2Like(String value) {
            addCriterion("offer_null2 like", value, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2NotLike(String value) {
            addCriterion("offer_null2 not like", value, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2In(List<String> values) {
            addCriterion("offer_null2 in", values, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2NotIn(List<String> values) {
            addCriterion("offer_null2 not in", values, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2Between(String value1, String value2) {
            addCriterion("offer_null2 between", value1, value2, "offerNull2");
            return (Criteria) this;
        }

        public Criteria andOfferNull2NotBetween(String value1, String value2) {
            addCriterion("offer_null2 not between", value1, value2, "offerNull2");
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