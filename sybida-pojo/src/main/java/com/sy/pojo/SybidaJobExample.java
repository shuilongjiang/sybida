package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaJobExample() {
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdIsNull() {
            addCriterion("job_student_id is null");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdIsNotNull() {
            addCriterion("job_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdEqualTo(Integer value) {
            addCriterion("job_student_id =", value, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdNotEqualTo(Integer value) {
            addCriterion("job_student_id <>", value, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdGreaterThan(Integer value) {
            addCriterion("job_student_id >", value, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_student_id >=", value, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdLessThan(Integer value) {
            addCriterion("job_student_id <", value, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_student_id <=", value, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdIn(List<Integer> values) {
            addCriterion("job_student_id in", values, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdNotIn(List<Integer> values) {
            addCriterion("job_student_id not in", values, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("job_student_id between", value1, value2, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_student_id not between", value1, value2, "jobStudentId");
            return (Criteria) this;
        }

        public Criteria andJobFirmIsNull() {
            addCriterion("job_firm is null");
            return (Criteria) this;
        }

        public Criteria andJobFirmIsNotNull() {
            addCriterion("job_firm is not null");
            return (Criteria) this;
        }

        public Criteria andJobFirmEqualTo(String value) {
            addCriterion("job_firm =", value, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmNotEqualTo(String value) {
            addCriterion("job_firm <>", value, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmGreaterThan(String value) {
            addCriterion("job_firm >", value, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmGreaterThanOrEqualTo(String value) {
            addCriterion("job_firm >=", value, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmLessThan(String value) {
            addCriterion("job_firm <", value, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmLessThanOrEqualTo(String value) {
            addCriterion("job_firm <=", value, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmLike(String value) {
            addCriterion("job_firm like", value, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmNotLike(String value) {
            addCriterion("job_firm not like", value, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmIn(List<String> values) {
            addCriterion("job_firm in", values, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmNotIn(List<String> values) {
            addCriterion("job_firm not in", values, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmBetween(String value1, String value2) {
            addCriterion("job_firm between", value1, value2, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobFirmNotBetween(String value1, String value2) {
            addCriterion("job_firm not between", value1, value2, "jobFirm");
            return (Criteria) this;
        }

        public Criteria andJobContactIsNull() {
            addCriterion("job_contact is null");
            return (Criteria) this;
        }

        public Criteria andJobContactIsNotNull() {
            addCriterion("job_contact is not null");
            return (Criteria) this;
        }

        public Criteria andJobContactEqualTo(String value) {
            addCriterion("job_contact =", value, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactNotEqualTo(String value) {
            addCriterion("job_contact <>", value, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactGreaterThan(String value) {
            addCriterion("job_contact >", value, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactGreaterThanOrEqualTo(String value) {
            addCriterion("job_contact >=", value, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactLessThan(String value) {
            addCriterion("job_contact <", value, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactLessThanOrEqualTo(String value) {
            addCriterion("job_contact <=", value, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactLike(String value) {
            addCriterion("job_contact like", value, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactNotLike(String value) {
            addCriterion("job_contact not like", value, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactIn(List<String> values) {
            addCriterion("job_contact in", values, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactNotIn(List<String> values) {
            addCriterion("job_contact not in", values, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactBetween(String value1, String value2) {
            addCriterion("job_contact between", value1, value2, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobContactNotBetween(String value1, String value2) {
            addCriterion("job_contact not between", value1, value2, "jobContact");
            return (Criteria) this;
        }

        public Criteria andJobWealIsNull() {
            addCriterion("job_weal is null");
            return (Criteria) this;
        }

        public Criteria andJobWealIsNotNull() {
            addCriterion("job_weal is not null");
            return (Criteria) this;
        }

        public Criteria andJobWealEqualTo(String value) {
            addCriterion("job_weal =", value, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealNotEqualTo(String value) {
            addCriterion("job_weal <>", value, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealGreaterThan(String value) {
            addCriterion("job_weal >", value, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealGreaterThanOrEqualTo(String value) {
            addCriterion("job_weal >=", value, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealLessThan(String value) {
            addCriterion("job_weal <", value, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealLessThanOrEqualTo(String value) {
            addCriterion("job_weal <=", value, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealLike(String value) {
            addCriterion("job_weal like", value, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealNotLike(String value) {
            addCriterion("job_weal not like", value, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealIn(List<String> values) {
            addCriterion("job_weal in", values, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealNotIn(List<String> values) {
            addCriterion("job_weal not in", values, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealBetween(String value1, String value2) {
            addCriterion("job_weal between", value1, value2, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobWealNotBetween(String value1, String value2) {
            addCriterion("job_weal not between", value1, value2, "jobWeal");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIsNull() {
            addCriterion("job_end_time is null");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIsNotNull() {
            addCriterion("job_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeEqualTo(Date value) {
            addCriterion("job_end_time =", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotEqualTo(Date value) {
            addCriterion("job_end_time <>", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeGreaterThan(Date value) {
            addCriterion("job_end_time >", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("job_end_time >=", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeLessThan(Date value) {
            addCriterion("job_end_time <", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("job_end_time <=", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIn(List<Date> values) {
            addCriterion("job_end_time in", values, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotIn(List<Date> values) {
            addCriterion("job_end_time not in", values, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeBetween(Date value1, Date value2) {
            addCriterion("job_end_time between", value1, value2, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("job_end_time not between", value1, value2, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdIsNull() {
            addCriterion("job_study_id is null");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdIsNotNull() {
            addCriterion("job_study_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdEqualTo(Integer value) {
            addCriterion("job_study_id =", value, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdNotEqualTo(Integer value) {
            addCriterion("job_study_id <>", value, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdGreaterThan(Integer value) {
            addCriterion("job_study_id >", value, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_study_id >=", value, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdLessThan(Integer value) {
            addCriterion("job_study_id <", value, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_study_id <=", value, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdIn(List<Integer> values) {
            addCriterion("job_study_id in", values, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdNotIn(List<Integer> values) {
            addCriterion("job_study_id not in", values, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("job_study_id between", value1, value2, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_study_id not between", value1, value2, "jobStudyId");
            return (Criteria) this;
        }

        public Criteria andJobPictureIsNull() {
            addCriterion("job_picture is null");
            return (Criteria) this;
        }

        public Criteria andJobPictureIsNotNull() {
            addCriterion("job_picture is not null");
            return (Criteria) this;
        }

        public Criteria andJobPictureEqualTo(String value) {
            addCriterion("job_picture =", value, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureNotEqualTo(String value) {
            addCriterion("job_picture <>", value, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureGreaterThan(String value) {
            addCriterion("job_picture >", value, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureGreaterThanOrEqualTo(String value) {
            addCriterion("job_picture >=", value, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureLessThan(String value) {
            addCriterion("job_picture <", value, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureLessThanOrEqualTo(String value) {
            addCriterion("job_picture <=", value, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureLike(String value) {
            addCriterion("job_picture like", value, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureNotLike(String value) {
            addCriterion("job_picture not like", value, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureIn(List<String> values) {
            addCriterion("job_picture in", values, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureNotIn(List<String> values) {
            addCriterion("job_picture not in", values, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureBetween(String value1, String value2) {
            addCriterion("job_picture between", value1, value2, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobPictureNotBetween(String value1, String value2) {
            addCriterion("job_picture not between", value1, value2, "jobPicture");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeIsNull() {
            addCriterion("job_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeIsNotNull() {
            addCriterion("job_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeEqualTo(Date value) {
            addCriterion("job_alter_time =", value, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeNotEqualTo(Date value) {
            addCriterion("job_alter_time <>", value, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeGreaterThan(Date value) {
            addCriterion("job_alter_time >", value, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("job_alter_time >=", value, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeLessThan(Date value) {
            addCriterion("job_alter_time <", value, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("job_alter_time <=", value, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeIn(List<Date> values) {
            addCriterion("job_alter_time in", values, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeNotIn(List<Date> values) {
            addCriterion("job_alter_time not in", values, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeBetween(Date value1, Date value2) {
            addCriterion("job_alter_time between", value1, value2, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("job_alter_time not between", value1, value2, "jobAlterTime");
            return (Criteria) this;
        }

        public Criteria andJobNull1IsNull() {
            addCriterion("job_null1 is null");
            return (Criteria) this;
        }

        public Criteria andJobNull1IsNotNull() {
            addCriterion("job_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andJobNull1EqualTo(String value) {
            addCriterion("job_null1 =", value, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1NotEqualTo(String value) {
            addCriterion("job_null1 <>", value, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1GreaterThan(String value) {
            addCriterion("job_null1 >", value, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1GreaterThanOrEqualTo(String value) {
            addCriterion("job_null1 >=", value, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1LessThan(String value) {
            addCriterion("job_null1 <", value, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1LessThanOrEqualTo(String value) {
            addCriterion("job_null1 <=", value, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1Like(String value) {
            addCriterion("job_null1 like", value, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1NotLike(String value) {
            addCriterion("job_null1 not like", value, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1In(List<String> values) {
            addCriterion("job_null1 in", values, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1NotIn(List<String> values) {
            addCriterion("job_null1 not in", values, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1Between(String value1, String value2) {
            addCriterion("job_null1 between", value1, value2, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull1NotBetween(String value1, String value2) {
            addCriterion("job_null1 not between", value1, value2, "jobNull1");
            return (Criteria) this;
        }

        public Criteria andJobNull2IsNull() {
            addCriterion("job_null2 is null");
            return (Criteria) this;
        }

        public Criteria andJobNull2IsNotNull() {
            addCriterion("job_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andJobNull2EqualTo(String value) {
            addCriterion("job_null2 =", value, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2NotEqualTo(String value) {
            addCriterion("job_null2 <>", value, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2GreaterThan(String value) {
            addCriterion("job_null2 >", value, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2GreaterThanOrEqualTo(String value) {
            addCriterion("job_null2 >=", value, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2LessThan(String value) {
            addCriterion("job_null2 <", value, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2LessThanOrEqualTo(String value) {
            addCriterion("job_null2 <=", value, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2Like(String value) {
            addCriterion("job_null2 like", value, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2NotLike(String value) {
            addCriterion("job_null2 not like", value, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2In(List<String> values) {
            addCriterion("job_null2 in", values, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2NotIn(List<String> values) {
            addCriterion("job_null2 not in", values, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2Between(String value1, String value2) {
            addCriterion("job_null2 between", value1, value2, "jobNull2");
            return (Criteria) this;
        }

        public Criteria andJobNull2NotBetween(String value1, String value2) {
            addCriterion("job_null2 not between", value1, value2, "jobNull2");
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