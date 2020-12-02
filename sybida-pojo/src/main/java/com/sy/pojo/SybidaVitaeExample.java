package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaVitaeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaVitaeExample() {
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

        public Criteria andVitaeIdIsNull() {
            addCriterion("vitae_id is null");
            return (Criteria) this;
        }

        public Criteria andVitaeIdIsNotNull() {
            addCriterion("vitae_id is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeIdEqualTo(Integer value) {
            addCriterion("vitae_id =", value, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdNotEqualTo(Integer value) {
            addCriterion("vitae_id <>", value, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdGreaterThan(Integer value) {
            addCriterion("vitae_id >", value, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitae_id >=", value, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdLessThan(Integer value) {
            addCriterion("vitae_id <", value, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdLessThanOrEqualTo(Integer value) {
            addCriterion("vitae_id <=", value, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdIn(List<Integer> values) {
            addCriterion("vitae_id in", values, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdNotIn(List<Integer> values) {
            addCriterion("vitae_id not in", values, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdBetween(Integer value1, Integer value2) {
            addCriterion("vitae_id between", value1, value2, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vitae_id not between", value1, value2, "vitaeId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdIsNull() {
            addCriterion("vitae_student_id is null");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdIsNotNull() {
            addCriterion("vitae_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdEqualTo(Integer value) {
            addCriterion("vitae_student_id =", value, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdNotEqualTo(Integer value) {
            addCriterion("vitae_student_id <>", value, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdGreaterThan(Integer value) {
            addCriterion("vitae_student_id >", value, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitae_student_id >=", value, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdLessThan(Integer value) {
            addCriterion("vitae_student_id <", value, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("vitae_student_id <=", value, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdIn(List<Integer> values) {
            addCriterion("vitae_student_id in", values, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdNotIn(List<Integer> values) {
            addCriterion("vitae_student_id not in", values, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("vitae_student_id between", value1, value2, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vitae_student_id not between", value1, value2, "vitaeStudentId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdIsNull() {
            addCriterion("vitae_study_id is null");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdIsNotNull() {
            addCriterion("vitae_study_id is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdEqualTo(Integer value) {
            addCriterion("vitae_study_id =", value, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdNotEqualTo(Integer value) {
            addCriterion("vitae_study_id <>", value, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdGreaterThan(Integer value) {
            addCriterion("vitae_study_id >", value, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitae_study_id >=", value, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdLessThan(Integer value) {
            addCriterion("vitae_study_id <", value, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("vitae_study_id <=", value, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdIn(List<Integer> values) {
            addCriterion("vitae_study_id in", values, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdNotIn(List<Integer> values) {
            addCriterion("vitae_study_id not in", values, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("vitae_study_id between", value1, value2, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vitae_study_id not between", value1, value2, "vitaeStudyId");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelIsNull() {
            addCriterion("vitae_level is null");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelIsNotNull() {
            addCriterion("vitae_level is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelEqualTo(String value) {
            addCriterion("vitae_level =", value, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelNotEqualTo(String value) {
            addCriterion("vitae_level <>", value, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelGreaterThan(String value) {
            addCriterion("vitae_level >", value, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelGreaterThanOrEqualTo(String value) {
            addCriterion("vitae_level >=", value, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelLessThan(String value) {
            addCriterion("vitae_level <", value, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelLessThanOrEqualTo(String value) {
            addCriterion("vitae_level <=", value, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelLike(String value) {
            addCriterion("vitae_level like", value, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelNotLike(String value) {
            addCriterion("vitae_level not like", value, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelIn(List<String> values) {
            addCriterion("vitae_level in", values, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelNotIn(List<String> values) {
            addCriterion("vitae_level not in", values, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelBetween(String value1, String value2) {
            addCriterion("vitae_level between", value1, value2, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeLevelNotBetween(String value1, String value2) {
            addCriterion("vitae_level not between", value1, value2, "vitaeLevel");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewIsNull() {
            addCriterion("vitae_is_new is null");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewIsNotNull() {
            addCriterion("vitae_is_new is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewEqualTo(Integer value) {
            addCriterion("vitae_is_new =", value, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewNotEqualTo(Integer value) {
            addCriterion("vitae_is_new <>", value, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewGreaterThan(Integer value) {
            addCriterion("vitae_is_new >", value, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitae_is_new >=", value, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewLessThan(Integer value) {
            addCriterion("vitae_is_new <", value, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewLessThanOrEqualTo(Integer value) {
            addCriterion("vitae_is_new <=", value, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewIn(List<Integer> values) {
            addCriterion("vitae_is_new in", values, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewNotIn(List<Integer> values) {
            addCriterion("vitae_is_new not in", values, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewBetween(Integer value1, Integer value2) {
            addCriterion("vitae_is_new between", value1, value2, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeIsNewNotBetween(Integer value1, Integer value2) {
            addCriterion("vitae_is_new not between", value1, value2, "vitaeIsNew");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlIsNull() {
            addCriterion("vitae_url is null");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlIsNotNull() {
            addCriterion("vitae_url is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlEqualTo(String value) {
            addCriterion("vitae_url =", value, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlNotEqualTo(String value) {
            addCriterion("vitae_url <>", value, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlGreaterThan(String value) {
            addCriterion("vitae_url >", value, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("vitae_url >=", value, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlLessThan(String value) {
            addCriterion("vitae_url <", value, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlLessThanOrEqualTo(String value) {
            addCriterion("vitae_url <=", value, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlLike(String value) {
            addCriterion("vitae_url like", value, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlNotLike(String value) {
            addCriterion("vitae_url not like", value, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlIn(List<String> values) {
            addCriterion("vitae_url in", values, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlNotIn(List<String> values) {
            addCriterion("vitae_url not in", values, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlBetween(String value1, String value2) {
            addCriterion("vitae_url between", value1, value2, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeUrlNotBetween(String value1, String value2) {
            addCriterion("vitae_url not between", value1, value2, "vitaeUrl");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadIsNull() {
            addCriterion("vitae_is_read is null");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadIsNotNull() {
            addCriterion("vitae_is_read is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadEqualTo(Byte value) {
            addCriterion("vitae_is_read =", value, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadNotEqualTo(Byte value) {
            addCriterion("vitae_is_read <>", value, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadGreaterThan(Byte value) {
            addCriterion("vitae_is_read >", value, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadGreaterThanOrEqualTo(Byte value) {
            addCriterion("vitae_is_read >=", value, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadLessThan(Byte value) {
            addCriterion("vitae_is_read <", value, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadLessThanOrEqualTo(Byte value) {
            addCriterion("vitae_is_read <=", value, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadIn(List<Byte> values) {
            addCriterion("vitae_is_read in", values, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadNotIn(List<Byte> values) {
            addCriterion("vitae_is_read not in", values, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadBetween(Byte value1, Byte value2) {
            addCriterion("vitae_is_read between", value1, value2, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeIsReadNotBetween(Byte value1, Byte value2) {
            addCriterion("vitae_is_read not between", value1, value2, "vitaeIsRead");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyIsNull() {
            addCriterion("vitae_download_frequency is null");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyIsNotNull() {
            addCriterion("vitae_download_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyEqualTo(Integer value) {
            addCriterion("vitae_download_frequency =", value, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyNotEqualTo(Integer value) {
            addCriterion("vitae_download_frequency <>", value, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyGreaterThan(Integer value) {
            addCriterion("vitae_download_frequency >", value, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitae_download_frequency >=", value, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyLessThan(Integer value) {
            addCriterion("vitae_download_frequency <", value, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("vitae_download_frequency <=", value, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyIn(List<Integer> values) {
            addCriterion("vitae_download_frequency in", values, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyNotIn(List<Integer> values) {
            addCriterion("vitae_download_frequency not in", values, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("vitae_download_frequency between", value1, value2, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeDownloadFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("vitae_download_frequency not between", value1, value2, "vitaeDownloadFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyIsNull() {
            addCriterion("vitae_history_frequency is null");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyIsNotNull() {
            addCriterion("vitae_history_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyEqualTo(Integer value) {
            addCriterion("vitae_history_frequency =", value, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyNotEqualTo(Integer value) {
            addCriterion("vitae_history_frequency <>", value, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyGreaterThan(Integer value) {
            addCriterion("vitae_history_frequency >", value, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitae_history_frequency >=", value, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyLessThan(Integer value) {
            addCriterion("vitae_history_frequency <", value, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("vitae_history_frequency <=", value, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyIn(List<Integer> values) {
            addCriterion("vitae_history_frequency in", values, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyNotIn(List<Integer> values) {
            addCriterion("vitae_history_frequency not in", values, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("vitae_history_frequency between", value1, value2, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeHistoryFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("vitae_history_frequency not between", value1, value2, "vitaeHistoryFrequency");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeIsNull() {
            addCriterion("vitae_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeIsNotNull() {
            addCriterion("vitae_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeEqualTo(Date value) {
            addCriterion("vitae_alter_time =", value, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeNotEqualTo(Date value) {
            addCriterion("vitae_alter_time <>", value, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeGreaterThan(Date value) {
            addCriterion("vitae_alter_time >", value, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vitae_alter_time >=", value, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeLessThan(Date value) {
            addCriterion("vitae_alter_time <", value, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("vitae_alter_time <=", value, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeIn(List<Date> values) {
            addCriterion("vitae_alter_time in", values, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeNotIn(List<Date> values) {
            addCriterion("vitae_alter_time not in", values, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeBetween(Date value1, Date value2) {
            addCriterion("vitae_alter_time between", value1, value2, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("vitae_alter_time not between", value1, value2, "vitaeAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1IsNull() {
            addCriterion("vitae_null1 is null");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1IsNotNull() {
            addCriterion("vitae_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1EqualTo(String value) {
            addCriterion("vitae_null1 =", value, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1NotEqualTo(String value) {
            addCriterion("vitae_null1 <>", value, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1GreaterThan(String value) {
            addCriterion("vitae_null1 >", value, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1GreaterThanOrEqualTo(String value) {
            addCriterion("vitae_null1 >=", value, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1LessThan(String value) {
            addCriterion("vitae_null1 <", value, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1LessThanOrEqualTo(String value) {
            addCriterion("vitae_null1 <=", value, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1Like(String value) {
            addCriterion("vitae_null1 like", value, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1NotLike(String value) {
            addCriterion("vitae_null1 not like", value, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1In(List<String> values) {
            addCriterion("vitae_null1 in", values, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1NotIn(List<String> values) {
            addCriterion("vitae_null1 not in", values, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1Between(String value1, String value2) {
            addCriterion("vitae_null1 between", value1, value2, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull1NotBetween(String value1, String value2) {
            addCriterion("vitae_null1 not between", value1, value2, "vitaeNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2IsNull() {
            addCriterion("vitae_null2 is null");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2IsNotNull() {
            addCriterion("vitae_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2EqualTo(String value) {
            addCriterion("vitae_null2 =", value, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2NotEqualTo(String value) {
            addCriterion("vitae_null2 <>", value, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2GreaterThan(String value) {
            addCriterion("vitae_null2 >", value, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2GreaterThanOrEqualTo(String value) {
            addCriterion("vitae_null2 >=", value, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2LessThan(String value) {
            addCriterion("vitae_null2 <", value, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2LessThanOrEqualTo(String value) {
            addCriterion("vitae_null2 <=", value, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2Like(String value) {
            addCriterion("vitae_null2 like", value, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2NotLike(String value) {
            addCriterion("vitae_null2 not like", value, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2In(List<String> values) {
            addCriterion("vitae_null2 in", values, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2NotIn(List<String> values) {
            addCriterion("vitae_null2 not in", values, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2Between(String value1, String value2) {
            addCriterion("vitae_null2 between", value1, value2, "vitaeNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeNull2NotBetween(String value1, String value2) {
            addCriterion("vitae_null2 not between", value1, value2, "vitaeNull2");
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