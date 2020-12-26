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

        public Criteria andOfferRegularSalaryIsNull() {
            addCriterion("offer_regular_salary is null");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryIsNotNull() {
            addCriterion("offer_regular_salary is not null");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryEqualTo(String value) {
            addCriterion("offer_regular_salary =", value, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryNotEqualTo(String value) {
            addCriterion("offer_regular_salary <>", value, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryGreaterThan(String value) {
            addCriterion("offer_regular_salary >", value, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("offer_regular_salary >=", value, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryLessThan(String value) {
            addCriterion("offer_regular_salary <", value, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryLessThanOrEqualTo(String value) {
            addCriterion("offer_regular_salary <=", value, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryLike(String value) {
            addCriterion("offer_regular_salary like", value, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryNotLike(String value) {
            addCriterion("offer_regular_salary not like", value, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryIn(List<String> values) {
            addCriterion("offer_regular_salary in", values, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryNotIn(List<String> values) {
            addCriterion("offer_regular_salary not in", values, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryBetween(String value1, String value2) {
            addCriterion("offer_regular_salary between", value1, value2, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferRegularSalaryNotBetween(String value1, String value2) {
            addCriterion("offer_regular_salary not between", value1, value2, "offerRegularSalary");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeIsNull() {
            addCriterion("offer_responsetime is null");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeIsNotNull() {
            addCriterion("offer_responsetime is not null");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeEqualTo(Date value) {
            addCriterion("offer_responsetime =", value, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeNotEqualTo(Date value) {
            addCriterion("offer_responsetime <>", value, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeGreaterThan(Date value) {
            addCriterion("offer_responsetime >", value, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_responsetime >=", value, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeLessThan(Date value) {
            addCriterion("offer_responsetime <", value, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_responsetime <=", value, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeIn(List<Date> values) {
            addCriterion("offer_responsetime in", values, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeNotIn(List<Date> values) {
            addCriterion("offer_responsetime not in", values, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeBetween(Date value1, Date value2) {
            addCriterion("offer_responsetime between", value1, value2, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferResponsetimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_responsetime not between", value1, value2, "offerResponsetime");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataIsNull() {
            addCriterion("offer_hiredata is null");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataIsNotNull() {
            addCriterion("offer_hiredata is not null");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataEqualTo(Date value) {
            addCriterion("offer_hiredata =", value, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataNotEqualTo(Date value) {
            addCriterion("offer_hiredata <>", value, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataGreaterThan(Date value) {
            addCriterion("offer_hiredata >", value, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_hiredata >=", value, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataLessThan(Date value) {
            addCriterion("offer_hiredata <", value, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataLessThanOrEqualTo(Date value) {
            addCriterion("offer_hiredata <=", value, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataIn(List<Date> values) {
            addCriterion("offer_hiredata in", values, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataNotIn(List<Date> values) {
            addCriterion("offer_hiredata not in", values, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataBetween(Date value1, Date value2) {
            addCriterion("offer_hiredata between", value1, value2, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferHiredataNotBetween(Date value1, Date value2) {
            addCriterion("offer_hiredata not between", value1, value2, "offerHiredata");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeIsNull() {
            addCriterion("offer_practice_endtime is null");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeIsNotNull() {
            addCriterion("offer_practice_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeEqualTo(Date value) {
            addCriterion("offer_practice_endtime =", value, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeNotEqualTo(Date value) {
            addCriterion("offer_practice_endtime <>", value, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeGreaterThan(Date value) {
            addCriterion("offer_practice_endtime >", value, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("offer_practice_endtime >=", value, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeLessThan(Date value) {
            addCriterion("offer_practice_endtime <", value, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("offer_practice_endtime <=", value, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeIn(List<Date> values) {
            addCriterion("offer_practice_endtime in", values, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeNotIn(List<Date> values) {
            addCriterion("offer_practice_endtime not in", values, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeBetween(Date value1, Date value2) {
            addCriterion("offer_practice_endtime between", value1, value2, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPracticeEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("offer_practice_endtime not between", value1, value2, "offerPracticeEndtime");
            return (Criteria) this;
        }

        public Criteria andOfferPictureIsNull() {
            addCriterion("offer_picture is null");
            return (Criteria) this;
        }

        public Criteria andOfferPictureIsNotNull() {
            addCriterion("offer_picture is not null");
            return (Criteria) this;
        }

        public Criteria andOfferPictureEqualTo(String value) {
            addCriterion("offer_picture =", value, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureNotEqualTo(String value) {
            addCriterion("offer_picture <>", value, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureGreaterThan(String value) {
            addCriterion("offer_picture >", value, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureGreaterThanOrEqualTo(String value) {
            addCriterion("offer_picture >=", value, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureLessThan(String value) {
            addCriterion("offer_picture <", value, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureLessThanOrEqualTo(String value) {
            addCriterion("offer_picture <=", value, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureLike(String value) {
            addCriterion("offer_picture like", value, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureNotLike(String value) {
            addCriterion("offer_picture not like", value, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureIn(List<String> values) {
            addCriterion("offer_picture in", values, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureNotIn(List<String> values) {
            addCriterion("offer_picture not in", values, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureBetween(String value1, String value2) {
            addCriterion("offer_picture between", value1, value2, "offerPicture");
            return (Criteria) this;
        }

        public Criteria andOfferPictureNotBetween(String value1, String value2) {
            addCriterion("offer_picture not between", value1, value2, "offerPicture");
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

        public Criteria andOfferIsexistIsNull() {
            addCriterion("offer_isexist is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistIsNotNull() {
            addCriterion("offer_isexist is not null");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistEqualTo(Byte value) {
            addCriterion("offer_isexist =", value, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistNotEqualTo(Byte value) {
            addCriterion("offer_isexist <>", value, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistGreaterThan(Byte value) {
            addCriterion("offer_isexist >", value, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistGreaterThanOrEqualTo(Byte value) {
            addCriterion("offer_isexist >=", value, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistLessThan(Byte value) {
            addCriterion("offer_isexist <", value, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistLessThanOrEqualTo(Byte value) {
            addCriterion("offer_isexist <=", value, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistIn(List<Byte> values) {
            addCriterion("offer_isexist in", values, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistNotIn(List<Byte> values) {
            addCriterion("offer_isexist not in", values, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistBetween(Byte value1, Byte value2) {
            addCriterion("offer_isexist between", value1, value2, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferIsexistNotBetween(Byte value1, Byte value2) {
            addCriterion("offer_isexist not between", value1, value2, "offerIsexist");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobIsNull() {
            addCriterion("offer_personisjob is null");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobIsNotNull() {
            addCriterion("offer_personisjob is not null");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobEqualTo(Byte value) {
            addCriterion("offer_personisjob =", value, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobNotEqualTo(Byte value) {
            addCriterion("offer_personisjob <>", value, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobGreaterThan(Byte value) {
            addCriterion("offer_personisjob >", value, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobGreaterThanOrEqualTo(Byte value) {
            addCriterion("offer_personisjob >=", value, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobLessThan(Byte value) {
            addCriterion("offer_personisjob <", value, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobLessThanOrEqualTo(Byte value) {
            addCriterion("offer_personisjob <=", value, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobIn(List<Byte> values) {
            addCriterion("offer_personisjob in", values, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobNotIn(List<Byte> values) {
            addCriterion("offer_personisjob not in", values, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobBetween(Byte value1, Byte value2) {
            addCriterion("offer_personisjob between", value1, value2, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferPersonisjobNotBetween(Byte value1, Byte value2) {
            addCriterion("offer_personisjob not between", value1, value2, "offerPersonisjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobIsNull() {
            addCriterion("offer_isjob is null");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobIsNotNull() {
            addCriterion("offer_isjob is not null");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobEqualTo(Byte value) {
            addCriterion("offer_isjob =", value, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobNotEqualTo(Byte value) {
            addCriterion("offer_isjob <>", value, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobGreaterThan(Byte value) {
            addCriterion("offer_isjob >", value, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobGreaterThanOrEqualTo(Byte value) {
            addCriterion("offer_isjob >=", value, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobLessThan(Byte value) {
            addCriterion("offer_isjob <", value, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobLessThanOrEqualTo(Byte value) {
            addCriterion("offer_isjob <=", value, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobIn(List<Byte> values) {
            addCriterion("offer_isjob in", values, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobNotIn(List<Byte> values) {
            addCriterion("offer_isjob not in", values, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobBetween(Byte value1, Byte value2) {
            addCriterion("offer_isjob between", value1, value2, "offerIsjob");
            return (Criteria) this;
        }

        public Criteria andOfferIsjobNotBetween(Byte value1, Byte value2) {
            addCriterion("offer_isjob not between", value1, value2, "offerIsjob");
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

        public Criteria andOfferNull3IsNull() {
            addCriterion("offer_null3 is null");
            return (Criteria) this;
        }

        public Criteria andOfferNull3IsNotNull() {
            addCriterion("offer_null3 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNull3EqualTo(String value) {
            addCriterion("offer_null3 =", value, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3NotEqualTo(String value) {
            addCriterion("offer_null3 <>", value, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3GreaterThan(String value) {
            addCriterion("offer_null3 >", value, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3GreaterThanOrEqualTo(String value) {
            addCriterion("offer_null3 >=", value, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3LessThan(String value) {
            addCriterion("offer_null3 <", value, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3LessThanOrEqualTo(String value) {
            addCriterion("offer_null3 <=", value, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3Like(String value) {
            addCriterion("offer_null3 like", value, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3NotLike(String value) {
            addCriterion("offer_null3 not like", value, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3In(List<String> values) {
            addCriterion("offer_null3 in", values, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3NotIn(List<String> values) {
            addCriterion("offer_null3 not in", values, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3Between(String value1, String value2) {
            addCriterion("offer_null3 between", value1, value2, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull3NotBetween(String value1, String value2) {
            addCriterion("offer_null3 not between", value1, value2, "offerNull3");
            return (Criteria) this;
        }

        public Criteria andOfferNull4IsNull() {
            addCriterion("offer_null4 is null");
            return (Criteria) this;
        }

        public Criteria andOfferNull4IsNotNull() {
            addCriterion("offer_null4 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNull4EqualTo(String value) {
            addCriterion("offer_null4 =", value, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4NotEqualTo(String value) {
            addCriterion("offer_null4 <>", value, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4GreaterThan(String value) {
            addCriterion("offer_null4 >", value, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4GreaterThanOrEqualTo(String value) {
            addCriterion("offer_null4 >=", value, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4LessThan(String value) {
            addCriterion("offer_null4 <", value, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4LessThanOrEqualTo(String value) {
            addCriterion("offer_null4 <=", value, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4Like(String value) {
            addCriterion("offer_null4 like", value, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4NotLike(String value) {
            addCriterion("offer_null4 not like", value, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4In(List<String> values) {
            addCriterion("offer_null4 in", values, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4NotIn(List<String> values) {
            addCriterion("offer_null4 not in", values, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4Between(String value1, String value2) {
            addCriterion("offer_null4 between", value1, value2, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull4NotBetween(String value1, String value2) {
            addCriterion("offer_null4 not between", value1, value2, "offerNull4");
            return (Criteria) this;
        }

        public Criteria andOfferNull5IsNull() {
            addCriterion("offer_null5 is null");
            return (Criteria) this;
        }

        public Criteria andOfferNull5IsNotNull() {
            addCriterion("offer_null5 is not null");
            return (Criteria) this;
        }

        public Criteria andOfferNull5EqualTo(String value) {
            addCriterion("offer_null5 =", value, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5NotEqualTo(String value) {
            addCriterion("offer_null5 <>", value, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5GreaterThan(String value) {
            addCriterion("offer_null5 >", value, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5GreaterThanOrEqualTo(String value) {
            addCriterion("offer_null5 >=", value, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5LessThan(String value) {
            addCriterion("offer_null5 <", value, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5LessThanOrEqualTo(String value) {
            addCriterion("offer_null5 <=", value, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5Like(String value) {
            addCriterion("offer_null5 like", value, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5NotLike(String value) {
            addCriterion("offer_null5 not like", value, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5In(List<String> values) {
            addCriterion("offer_null5 in", values, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5NotIn(List<String> values) {
            addCriterion("offer_null5 not in", values, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5Between(String value1, String value2) {
            addCriterion("offer_null5 between", value1, value2, "offerNull5");
            return (Criteria) this;
        }

        public Criteria andOfferNull5NotBetween(String value1, String value2) {
            addCriterion("offer_null5 not between", value1, value2, "offerNull5");
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