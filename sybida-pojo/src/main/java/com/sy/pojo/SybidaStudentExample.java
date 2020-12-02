package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaStudentExample() {
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(String value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(String value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(String value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(String value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(String value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLike(String value) {
            addCriterion("student_sex like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotLike(String value) {
            addCriterion("student_sex not like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<String> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<String> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(String value1, String value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(String value1, String value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityIsNull() {
            addCriterion("student_identity is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityIsNotNull() {
            addCriterion("student_identity is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityEqualTo(String value) {
            addCriterion("student_identity =", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityNotEqualTo(String value) {
            addCriterion("student_identity <>", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityGreaterThan(String value) {
            addCriterion("student_identity >", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("student_identity >=", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityLessThan(String value) {
            addCriterion("student_identity <", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityLessThanOrEqualTo(String value) {
            addCriterion("student_identity <=", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityLike(String value) {
            addCriterion("student_identity like", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityNotLike(String value) {
            addCriterion("student_identity not like", value, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityIn(List<String> values) {
            addCriterion("student_identity in", values, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityNotIn(List<String> values) {
            addCriterion("student_identity not in", values, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityBetween(String value1, String value2) {
            addCriterion("student_identity between", value1, value2, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIdentityNotBetween(String value1, String value2) {
            addCriterion("student_identity not between", value1, value2, "studentIdentity");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationIsNull() {
            addCriterion("student_is_graduation is null");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationIsNotNull() {
            addCriterion("student_is_graduation is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationEqualTo(Byte value) {
            addCriterion("student_is_graduation =", value, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationNotEqualTo(Byte value) {
            addCriterion("student_is_graduation <>", value, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationGreaterThan(Byte value) {
            addCriterion("student_is_graduation >", value, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationGreaterThanOrEqualTo(Byte value) {
            addCriterion("student_is_graduation >=", value, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationLessThan(Byte value) {
            addCriterion("student_is_graduation <", value, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationLessThanOrEqualTo(Byte value) {
            addCriterion("student_is_graduation <=", value, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationIn(List<Byte> values) {
            addCriterion("student_is_graduation in", values, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationNotIn(List<Byte> values) {
            addCriterion("student_is_graduation not in", values, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationBetween(Byte value1, Byte value2) {
            addCriterion("student_is_graduation between", value1, value2, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentIsGraduationNotBetween(Byte value1, Byte value2) {
            addCriterion("student_is_graduation not between", value1, value2, "studentIsGraduation");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIsNull() {
            addCriterion("student_school is null");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIsNotNull() {
            addCriterion("student_school is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolEqualTo(String value) {
            addCriterion("student_school =", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotEqualTo(String value) {
            addCriterion("student_school <>", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolGreaterThan(String value) {
            addCriterion("student_school >", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("student_school >=", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLessThan(String value) {
            addCriterion("student_school <", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLessThanOrEqualTo(String value) {
            addCriterion("student_school <=", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolLike(String value) {
            addCriterion("student_school like", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotLike(String value) {
            addCriterion("student_school not like", value, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolIn(List<String> values) {
            addCriterion("student_school in", values, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotIn(List<String> values) {
            addCriterion("student_school not in", values, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolBetween(String value1, String value2) {
            addCriterion("student_school between", value1, value2, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSchoolNotBetween(String value1, String value2) {
            addCriterion("student_school not between", value1, value2, "studentSchool");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyIsNull() {
            addCriterion("student_specialty is null");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyIsNotNull() {
            addCriterion("student_specialty is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyEqualTo(String value) {
            addCriterion("student_specialty =", value, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyNotEqualTo(String value) {
            addCriterion("student_specialty <>", value, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyGreaterThan(String value) {
            addCriterion("student_specialty >", value, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("student_specialty >=", value, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyLessThan(String value) {
            addCriterion("student_specialty <", value, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("student_specialty <=", value, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyLike(String value) {
            addCriterion("student_specialty like", value, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyNotLike(String value) {
            addCriterion("student_specialty not like", value, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyIn(List<String> values) {
            addCriterion("student_specialty in", values, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyNotIn(List<String> values) {
            addCriterion("student_specialty not in", values, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyBetween(String value1, String value2) {
            addCriterion("student_specialty between", value1, value2, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentSpecialtyNotBetween(String value1, String value2) {
            addCriterion("student_specialty not between", value1, value2, "studentSpecialty");
            return (Criteria) this;
        }

        public Criteria andStudentWechatIsNull() {
            addCriterion("student_wechat is null");
            return (Criteria) this;
        }

        public Criteria andStudentWechatIsNotNull() {
            addCriterion("student_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andStudentWechatEqualTo(String value) {
            addCriterion("student_wechat =", value, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatNotEqualTo(String value) {
            addCriterion("student_wechat <>", value, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatGreaterThan(String value) {
            addCriterion("student_wechat >", value, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatGreaterThanOrEqualTo(String value) {
            addCriterion("student_wechat >=", value, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatLessThan(String value) {
            addCriterion("student_wechat <", value, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatLessThanOrEqualTo(String value) {
            addCriterion("student_wechat <=", value, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatLike(String value) {
            addCriterion("student_wechat like", value, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatNotLike(String value) {
            addCriterion("student_wechat not like", value, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatIn(List<String> values) {
            addCriterion("student_wechat in", values, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatNotIn(List<String> values) {
            addCriterion("student_wechat not in", values, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatBetween(String value1, String value2) {
            addCriterion("student_wechat between", value1, value2, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentWechatNotBetween(String value1, String value2) {
            addCriterion("student_wechat not between", value1, value2, "studentWechat");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxIsNull() {
            addCriterion("student_mailbox is null");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxIsNotNull() {
            addCriterion("student_mailbox is not null");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxEqualTo(String value) {
            addCriterion("student_mailbox =", value, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxNotEqualTo(String value) {
            addCriterion("student_mailbox <>", value, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxGreaterThan(String value) {
            addCriterion("student_mailbox >", value, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxGreaterThanOrEqualTo(String value) {
            addCriterion("student_mailbox >=", value, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxLessThan(String value) {
            addCriterion("student_mailbox <", value, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxLessThanOrEqualTo(String value) {
            addCriterion("student_mailbox <=", value, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxLike(String value) {
            addCriterion("student_mailbox like", value, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxNotLike(String value) {
            addCriterion("student_mailbox not like", value, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxIn(List<String> values) {
            addCriterion("student_mailbox in", values, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxNotIn(List<String> values) {
            addCriterion("student_mailbox not in", values, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxBetween(String value1, String value2) {
            addCriterion("student_mailbox between", value1, value2, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentMailboxNotBetween(String value1, String value2) {
            addCriterion("student_mailbox not between", value1, value2, "studentMailbox");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdIsNull() {
            addCriterion("student_study_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdIsNotNull() {
            addCriterion("student_study_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdEqualTo(Integer value) {
            addCriterion("student_study_id =", value, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdNotEqualTo(Integer value) {
            addCriterion("student_study_id <>", value, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdGreaterThan(Integer value) {
            addCriterion("student_study_id >", value, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_study_id >=", value, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdLessThan(Integer value) {
            addCriterion("student_study_id <", value, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_study_id <=", value, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdIn(List<Integer> values) {
            addCriterion("student_study_id in", values, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdNotIn(List<Integer> values) {
            addCriterion("student_study_id not in", values, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("student_study_id between", value1, value2, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_study_id not between", value1, value2, "studentStudyId");
            return (Criteria) this;
        }

        public Criteria andStudentCityIsNull() {
            addCriterion("student_city is null");
            return (Criteria) this;
        }

        public Criteria andStudentCityIsNotNull() {
            addCriterion("student_city is not null");
            return (Criteria) this;
        }

        public Criteria andStudentCityEqualTo(String value) {
            addCriterion("student_city =", value, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityNotEqualTo(String value) {
            addCriterion("student_city <>", value, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityGreaterThan(String value) {
            addCriterion("student_city >", value, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityGreaterThanOrEqualTo(String value) {
            addCriterion("student_city >=", value, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityLessThan(String value) {
            addCriterion("student_city <", value, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityLessThanOrEqualTo(String value) {
            addCriterion("student_city <=", value, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityLike(String value) {
            addCriterion("student_city like", value, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityNotLike(String value) {
            addCriterion("student_city not like", value, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityIn(List<String> values) {
            addCriterion("student_city in", values, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityNotIn(List<String> values) {
            addCriterion("student_city not in", values, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityBetween(String value1, String value2) {
            addCriterion("student_city between", value1, value2, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentCityNotBetween(String value1, String value2) {
            addCriterion("student_city not between", value1, value2, "studentCity");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNull() {
            addCriterion("student_address is null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIsNotNull() {
            addCriterion("student_address is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAddressEqualTo(String value) {
            addCriterion("student_address =", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotEqualTo(String value) {
            addCriterion("student_address <>", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThan(String value) {
            addCriterion("student_address >", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("student_address >=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThan(String value) {
            addCriterion("student_address <", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLessThanOrEqualTo(String value) {
            addCriterion("student_address <=", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressLike(String value) {
            addCriterion("student_address like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotLike(String value) {
            addCriterion("student_address not like", value, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressIn(List<String> values) {
            addCriterion("student_address in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotIn(List<String> values) {
            addCriterion("student_address not in", values, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressBetween(String value1, String value2) {
            addCriterion("student_address between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentAddressNotBetween(String value1, String value2) {
            addCriterion("student_address not between", value1, value2, "studentAddress");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneIsNull() {
            addCriterion("student_parent_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneIsNotNull() {
            addCriterion("student_parent_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneEqualTo(String value) {
            addCriterion("student_parent_phone =", value, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneNotEqualTo(String value) {
            addCriterion("student_parent_phone <>", value, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneGreaterThan(String value) {
            addCriterion("student_parent_phone >", value, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_parent_phone >=", value, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneLessThan(String value) {
            addCriterion("student_parent_phone <", value, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_parent_phone <=", value, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneLike(String value) {
            addCriterion("student_parent_phone like", value, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneNotLike(String value) {
            addCriterion("student_parent_phone not like", value, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneIn(List<String> values) {
            addCriterion("student_parent_phone in", values, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneNotIn(List<String> values) {
            addCriterion("student_parent_phone not in", values, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneBetween(String value1, String value2) {
            addCriterion("student_parent_phone between", value1, value2, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentPhoneNotBetween(String value1, String value2) {
            addCriterion("student_parent_phone not between", value1, value2, "studentParentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameIsNull() {
            addCriterion("student_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameIsNotNull() {
            addCriterion("student_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameEqualTo(String value) {
            addCriterion("student_parent_name =", value, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameNotEqualTo(String value) {
            addCriterion("student_parent_name <>", value, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameGreaterThan(String value) {
            addCriterion("student_parent_name >", value, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_parent_name >=", value, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameLessThan(String value) {
            addCriterion("student_parent_name <", value, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameLessThanOrEqualTo(String value) {
            addCriterion("student_parent_name <=", value, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameLike(String value) {
            addCriterion("student_parent_name like", value, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameNotLike(String value) {
            addCriterion("student_parent_name not like", value, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameIn(List<String> values) {
            addCriterion("student_parent_name in", values, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameNotIn(List<String> values) {
            addCriterion("student_parent_name not in", values, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameBetween(String value1, String value2) {
            addCriterion("student_parent_name between", value1, value2, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentParentNameNotBetween(String value1, String value2) {
            addCriterion("student_parent_name not between", value1, value2, "studentParentName");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentIsNull() {
            addCriterion("student_urgent is null");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentIsNotNull() {
            addCriterion("student_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentEqualTo(String value) {
            addCriterion("student_urgent =", value, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentNotEqualTo(String value) {
            addCriterion("student_urgent <>", value, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentGreaterThan(String value) {
            addCriterion("student_urgent >", value, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("student_urgent >=", value, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentLessThan(String value) {
            addCriterion("student_urgent <", value, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentLessThanOrEqualTo(String value) {
            addCriterion("student_urgent <=", value, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentLike(String value) {
            addCriterion("student_urgent like", value, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentNotLike(String value) {
            addCriterion("student_urgent not like", value, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentIn(List<String> values) {
            addCriterion("student_urgent in", values, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentNotIn(List<String> values) {
            addCriterion("student_urgent not in", values, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentBetween(String value1, String value2) {
            addCriterion("student_urgent between", value1, value2, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentUrgentNotBetween(String value1, String value2) {
            addCriterion("student_urgent not between", value1, value2, "studentUrgent");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("student_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("student_phone =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("student_phone <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("student_phone >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_phone >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("student_phone <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_phone <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("student_phone like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("student_phone not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("student_phone in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("student_phone not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("student_phone between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("student_phone not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdIsNull() {
            addCriterion("student_class_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdIsNotNull() {
            addCriterion("student_class_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdEqualTo(Integer value) {
            addCriterion("student_class_id =", value, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdNotEqualTo(Integer value) {
            addCriterion("student_class_id <>", value, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdGreaterThan(Integer value) {
            addCriterion("student_class_id >", value, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_class_id >=", value, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdLessThan(Integer value) {
            addCriterion("student_class_id <", value, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_class_id <=", value, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdIn(List<Integer> values) {
            addCriterion("student_class_id in", values, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdNotIn(List<Integer> values) {
            addCriterion("student_class_id not in", values, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdBetween(Integer value1, Integer value2) {
            addCriterion("student_class_id between", value1, value2, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_class_id not between", value1, value2, "studentClassId");
            return (Criteria) this;
        }

        public Criteria andStudentRoomIsNull() {
            addCriterion("student_room is null");
            return (Criteria) this;
        }

        public Criteria andStudentRoomIsNotNull() {
            addCriterion("student_room is not null");
            return (Criteria) this;
        }

        public Criteria andStudentRoomEqualTo(String value) {
            addCriterion("student_room =", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomNotEqualTo(String value) {
            addCriterion("student_room <>", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomGreaterThan(String value) {
            addCriterion("student_room >", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomGreaterThanOrEqualTo(String value) {
            addCriterion("student_room >=", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomLessThan(String value) {
            addCriterion("student_room <", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomLessThanOrEqualTo(String value) {
            addCriterion("student_room <=", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomLike(String value) {
            addCriterion("student_room like", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomNotLike(String value) {
            addCriterion("student_room not like", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomIn(List<String> values) {
            addCriterion("student_room in", values, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomNotIn(List<String> values) {
            addCriterion("student_room not in", values, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomBetween(String value1, String value2) {
            addCriterion("student_room between", value1, value2, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomNotBetween(String value1, String value2) {
            addCriterion("student_room not between", value1, value2, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoIsNull() {
            addCriterion("student_photo is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoIsNotNull() {
            addCriterion("student_photo is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoEqualTo(String value) {
            addCriterion("student_photo =", value, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoNotEqualTo(String value) {
            addCriterion("student_photo <>", value, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoGreaterThan(String value) {
            addCriterion("student_photo >", value, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("student_photo >=", value, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoLessThan(String value) {
            addCriterion("student_photo <", value, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoLessThanOrEqualTo(String value) {
            addCriterion("student_photo <=", value, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoLike(String value) {
            addCriterion("student_photo like", value, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoNotLike(String value) {
            addCriterion("student_photo not like", value, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoIn(List<String> values) {
            addCriterion("student_photo in", values, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoNotIn(List<String> values) {
            addCriterion("student_photo not in", values, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoBetween(String value1, String value2) {
            addCriterion("student_photo between", value1, value2, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentPhotoNotBetween(String value1, String value2) {
            addCriterion("student_photo not between", value1, value2, "studentPhoto");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeIsNull() {
            addCriterion("student_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeIsNotNull() {
            addCriterion("student_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeEqualTo(Date value) {
            addCriterion("student_alter_time =", value, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeNotEqualTo(Date value) {
            addCriterion("student_alter_time <>", value, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeGreaterThan(Date value) {
            addCriterion("student_alter_time >", value, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("student_alter_time >=", value, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeLessThan(Date value) {
            addCriterion("student_alter_time <", value, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("student_alter_time <=", value, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeIn(List<Date> values) {
            addCriterion("student_alter_time in", values, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeNotIn(List<Date> values) {
            addCriterion("student_alter_time not in", values, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeBetween(Date value1, Date value2) {
            addCriterion("student_alter_time between", value1, value2, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("student_alter_time not between", value1, value2, "studentAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudentNull1IsNull() {
            addCriterion("student_null1 is null");
            return (Criteria) this;
        }

        public Criteria andStudentNull1IsNotNull() {
            addCriterion("student_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNull1EqualTo(String value) {
            addCriterion("student_null1 =", value, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1NotEqualTo(String value) {
            addCriterion("student_null1 <>", value, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1GreaterThan(String value) {
            addCriterion("student_null1 >", value, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1GreaterThanOrEqualTo(String value) {
            addCriterion("student_null1 >=", value, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1LessThan(String value) {
            addCriterion("student_null1 <", value, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1LessThanOrEqualTo(String value) {
            addCriterion("student_null1 <=", value, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1Like(String value) {
            addCriterion("student_null1 like", value, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1NotLike(String value) {
            addCriterion("student_null1 not like", value, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1In(List<String> values) {
            addCriterion("student_null1 in", values, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1NotIn(List<String> values) {
            addCriterion("student_null1 not in", values, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1Between(String value1, String value2) {
            addCriterion("student_null1 between", value1, value2, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull1NotBetween(String value1, String value2) {
            addCriterion("student_null1 not between", value1, value2, "studentNull1");
            return (Criteria) this;
        }

        public Criteria andStudentNull2IsNull() {
            addCriterion("student_null2 is null");
            return (Criteria) this;
        }

        public Criteria andStudentNull2IsNotNull() {
            addCriterion("student_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNull2EqualTo(String value) {
            addCriterion("student_null2 =", value, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2NotEqualTo(String value) {
            addCriterion("student_null2 <>", value, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2GreaterThan(String value) {
            addCriterion("student_null2 >", value, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2GreaterThanOrEqualTo(String value) {
            addCriterion("student_null2 >=", value, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2LessThan(String value) {
            addCriterion("student_null2 <", value, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2LessThanOrEqualTo(String value) {
            addCriterion("student_null2 <=", value, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2Like(String value) {
            addCriterion("student_null2 like", value, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2NotLike(String value) {
            addCriterion("student_null2 not like", value, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2In(List<String> values) {
            addCriterion("student_null2 in", values, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2NotIn(List<String> values) {
            addCriterion("student_null2 not in", values, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2Between(String value1, String value2) {
            addCriterion("student_null2 between", value1, value2, "studentNull2");
            return (Criteria) this;
        }

        public Criteria andStudentNull2NotBetween(String value1, String value2) {
            addCriterion("student_null2 not between", value1, value2, "studentNull2");
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