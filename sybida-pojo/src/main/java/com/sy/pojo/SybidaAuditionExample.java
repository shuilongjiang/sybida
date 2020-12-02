package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaAuditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaAuditionExample() {
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

        public Criteria andAuditionIdIsNull() {
            addCriterion("audition_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditionIdIsNotNull() {
            addCriterion("audition_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionIdEqualTo(Integer value) {
            addCriterion("audition_id =", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdNotEqualTo(Integer value) {
            addCriterion("audition_id <>", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdGreaterThan(Integer value) {
            addCriterion("audition_id >", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audition_id >=", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdLessThan(Integer value) {
            addCriterion("audition_id <", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdLessThanOrEqualTo(Integer value) {
            addCriterion("audition_id <=", value, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdIn(List<Integer> values) {
            addCriterion("audition_id in", values, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdNotIn(List<Integer> values) {
            addCriterion("audition_id not in", values, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdBetween(Integer value1, Integer value2) {
            addCriterion("audition_id between", value1, value2, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audition_id not between", value1, value2, "auditionId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdIsNull() {
            addCriterion("audition_student_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdIsNotNull() {
            addCriterion("audition_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdEqualTo(Integer value) {
            addCriterion("audition_student_id =", value, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdNotEqualTo(Integer value) {
            addCriterion("audition_student_id <>", value, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdGreaterThan(Integer value) {
            addCriterion("audition_student_id >", value, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audition_student_id >=", value, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdLessThan(Integer value) {
            addCriterion("audition_student_id <", value, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("audition_student_id <=", value, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdIn(List<Integer> values) {
            addCriterion("audition_student_id in", values, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdNotIn(List<Integer> values) {
            addCriterion("audition_student_id not in", values, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("audition_student_id between", value1, value2, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audition_student_id not between", value1, value2, "auditionStudentId");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteIsNull() {
            addCriterion("audition_site is null");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteIsNotNull() {
            addCriterion("audition_site is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteEqualTo(String value) {
            addCriterion("audition_site =", value, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteNotEqualTo(String value) {
            addCriterion("audition_site <>", value, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteGreaterThan(String value) {
            addCriterion("audition_site >", value, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteGreaterThanOrEqualTo(String value) {
            addCriterion("audition_site >=", value, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteLessThan(String value) {
            addCriterion("audition_site <", value, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteLessThanOrEqualTo(String value) {
            addCriterion("audition_site <=", value, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteLike(String value) {
            addCriterion("audition_site like", value, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteNotLike(String value) {
            addCriterion("audition_site not like", value, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteIn(List<String> values) {
            addCriterion("audition_site in", values, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteNotIn(List<String> values) {
            addCriterion("audition_site not in", values, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteBetween(String value1, String value2) {
            addCriterion("audition_site between", value1, value2, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionSiteNotBetween(String value1, String value2) {
            addCriterion("audition_site not between", value1, value2, "auditionSite");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeIsNull() {
            addCriterion("audition_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeIsNotNull() {
            addCriterion("audition_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeEqualTo(Date value) {
            addCriterion("audition_time =", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeNotEqualTo(Date value) {
            addCriterion("audition_time <>", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeGreaterThan(Date value) {
            addCriterion("audition_time >", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audition_time >=", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeLessThan(Date value) {
            addCriterion("audition_time <", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeLessThanOrEqualTo(Date value) {
            addCriterion("audition_time <=", value, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeIn(List<Date> values) {
            addCriterion("audition_time in", values, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeNotIn(List<Date> values) {
            addCriterion("audition_time not in", values, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeBetween(Date value1, Date value2) {
            addCriterion("audition_time between", value1, value2, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionTimeNotBetween(Date value1, Date value2) {
            addCriterion("audition_time not between", value1, value2, "auditionTime");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationIsNull() {
            addCriterion("audition_situation is null");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationIsNotNull() {
            addCriterion("audition_situation is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationEqualTo(String value) {
            addCriterion("audition_situation =", value, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationNotEqualTo(String value) {
            addCriterion("audition_situation <>", value, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationGreaterThan(String value) {
            addCriterion("audition_situation >", value, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationGreaterThanOrEqualTo(String value) {
            addCriterion("audition_situation >=", value, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationLessThan(String value) {
            addCriterion("audition_situation <", value, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationLessThanOrEqualTo(String value) {
            addCriterion("audition_situation <=", value, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationLike(String value) {
            addCriterion("audition_situation like", value, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationNotLike(String value) {
            addCriterion("audition_situation not like", value, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationIn(List<String> values) {
            addCriterion("audition_situation in", values, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationNotIn(List<String> values) {
            addCriterion("audition_situation not in", values, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationBetween(String value1, String value2) {
            addCriterion("audition_situation between", value1, value2, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionSituationNotBetween(String value1, String value2) {
            addCriterion("audition_situation not between", value1, value2, "auditionSituation");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdIsNull() {
            addCriterion("audition_study_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdIsNotNull() {
            addCriterion("audition_study_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdEqualTo(Integer value) {
            addCriterion("audition_study_id =", value, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdNotEqualTo(Integer value) {
            addCriterion("audition_study_id <>", value, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdGreaterThan(Integer value) {
            addCriterion("audition_study_id >", value, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audition_study_id >=", value, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdLessThan(Integer value) {
            addCriterion("audition_study_id <", value, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("audition_study_id <=", value, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdIn(List<Integer> values) {
            addCriterion("audition_study_id in", values, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdNotIn(List<Integer> values) {
            addCriterion("audition_study_id not in", values, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("audition_study_id between", value1, value2, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audition_study_id not between", value1, value2, "auditionStudyId");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishIsNull() {
            addCriterion("audition_finish is null");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishIsNotNull() {
            addCriterion("audition_finish is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishEqualTo(String value) {
            addCriterion("audition_finish =", value, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishNotEqualTo(String value) {
            addCriterion("audition_finish <>", value, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishGreaterThan(String value) {
            addCriterion("audition_finish >", value, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishGreaterThanOrEqualTo(String value) {
            addCriterion("audition_finish >=", value, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishLessThan(String value) {
            addCriterion("audition_finish <", value, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishLessThanOrEqualTo(String value) {
            addCriterion("audition_finish <=", value, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishLike(String value) {
            addCriterion("audition_finish like", value, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishNotLike(String value) {
            addCriterion("audition_finish not like", value, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishIn(List<String> values) {
            addCriterion("audition_finish in", values, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishNotIn(List<String> values) {
            addCriterion("audition_finish not in", values, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishBetween(String value1, String value2) {
            addCriterion("audition_finish between", value1, value2, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFinishNotBetween(String value1, String value2) {
            addCriterion("audition_finish not between", value1, value2, "auditionFinish");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmIsNull() {
            addCriterion("audition_firm is null");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmIsNotNull() {
            addCriterion("audition_firm is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmEqualTo(String value) {
            addCriterion("audition_firm =", value, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmNotEqualTo(String value) {
            addCriterion("audition_firm <>", value, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmGreaterThan(String value) {
            addCriterion("audition_firm >", value, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmGreaterThanOrEqualTo(String value) {
            addCriterion("audition_firm >=", value, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmLessThan(String value) {
            addCriterion("audition_firm <", value, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmLessThanOrEqualTo(String value) {
            addCriterion("audition_firm <=", value, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmLike(String value) {
            addCriterion("audition_firm like", value, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmNotLike(String value) {
            addCriterion("audition_firm not like", value, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmIn(List<String> values) {
            addCriterion("audition_firm in", values, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmNotIn(List<String> values) {
            addCriterion("audition_firm not in", values, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmBetween(String value1, String value2) {
            addCriterion("audition_firm between", value1, value2, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionFirmNotBetween(String value1, String value2) {
            addCriterion("audition_firm not between", value1, value2, "auditionFirm");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeIsNull() {
            addCriterion("audition_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeIsNotNull() {
            addCriterion("audition_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeEqualTo(Date value) {
            addCriterion("audition_alter_time =", value, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeNotEqualTo(Date value) {
            addCriterion("audition_alter_time <>", value, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeGreaterThan(Date value) {
            addCriterion("audition_alter_time >", value, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audition_alter_time >=", value, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeLessThan(Date value) {
            addCriterion("audition_alter_time <", value, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("audition_alter_time <=", value, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeIn(List<Date> values) {
            addCriterion("audition_alter_time in", values, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeNotIn(List<Date> values) {
            addCriterion("audition_alter_time not in", values, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeBetween(Date value1, Date value2) {
            addCriterion("audition_alter_time between", value1, value2, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("audition_alter_time not between", value1, value2, "auditionAlterTime");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1IsNull() {
            addCriterion("audition_null1 is null");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1IsNotNull() {
            addCriterion("audition_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1EqualTo(String value) {
            addCriterion("audition_null1 =", value, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1NotEqualTo(String value) {
            addCriterion("audition_null1 <>", value, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1GreaterThan(String value) {
            addCriterion("audition_null1 >", value, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1GreaterThanOrEqualTo(String value) {
            addCriterion("audition_null1 >=", value, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1LessThan(String value) {
            addCriterion("audition_null1 <", value, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1LessThanOrEqualTo(String value) {
            addCriterion("audition_null1 <=", value, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1Like(String value) {
            addCriterion("audition_null1 like", value, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1NotLike(String value) {
            addCriterion("audition_null1 not like", value, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1In(List<String> values) {
            addCriterion("audition_null1 in", values, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1NotIn(List<String> values) {
            addCriterion("audition_null1 not in", values, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1Between(String value1, String value2) {
            addCriterion("audition_null1 between", value1, value2, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull1NotBetween(String value1, String value2) {
            addCriterion("audition_null1 not between", value1, value2, "auditionNull1");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2IsNull() {
            addCriterion("audition_null2 is null");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2IsNotNull() {
            addCriterion("audition_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2EqualTo(String value) {
            addCriterion("audition_null2 =", value, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2NotEqualTo(String value) {
            addCriterion("audition_null2 <>", value, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2GreaterThan(String value) {
            addCriterion("audition_null2 >", value, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2GreaterThanOrEqualTo(String value) {
            addCriterion("audition_null2 >=", value, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2LessThan(String value) {
            addCriterion("audition_null2 <", value, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2LessThanOrEqualTo(String value) {
            addCriterion("audition_null2 <=", value, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2Like(String value) {
            addCriterion("audition_null2 like", value, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2NotLike(String value) {
            addCriterion("audition_null2 not like", value, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2In(List<String> values) {
            addCriterion("audition_null2 in", values, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2NotIn(List<String> values) {
            addCriterion("audition_null2 not in", values, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2Between(String value1, String value2) {
            addCriterion("audition_null2 between", value1, value2, "auditionNull2");
            return (Criteria) this;
        }

        public Criteria andAuditionNull2NotBetween(String value1, String value2) {
            addCriterion("audition_null2 not between", value1, value2, "auditionNull2");
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