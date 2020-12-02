package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaStudyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaStudyExample() {
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

        public Criteria andStudyIdIsNull() {
            addCriterion("study_id is null");
            return (Criteria) this;
        }

        public Criteria andStudyIdIsNotNull() {
            addCriterion("study_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudyIdEqualTo(Integer value) {
            addCriterion("study_id =", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotEqualTo(Integer value) {
            addCriterion("study_id <>", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThan(Integer value) {
            addCriterion("study_id >", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("study_id >=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThan(Integer value) {
            addCriterion("study_id <", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("study_id <=", value, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdIn(List<Integer> values) {
            addCriterion("study_id in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotIn(List<Integer> values) {
            addCriterion("study_id not in", values, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("study_id between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("study_id not between", value1, value2, "studyId");
            return (Criteria) this;
        }

        public Criteria andStudyAspectIsNull() {
            addCriterion("study_aspect is null");
            return (Criteria) this;
        }

        public Criteria andStudyAspectIsNotNull() {
            addCriterion("study_aspect is not null");
            return (Criteria) this;
        }

        public Criteria andStudyAspectEqualTo(String value) {
            addCriterion("study_aspect =", value, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectNotEqualTo(String value) {
            addCriterion("study_aspect <>", value, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectGreaterThan(String value) {
            addCriterion("study_aspect >", value, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectGreaterThanOrEqualTo(String value) {
            addCriterion("study_aspect >=", value, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectLessThan(String value) {
            addCriterion("study_aspect <", value, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectLessThanOrEqualTo(String value) {
            addCriterion("study_aspect <=", value, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectLike(String value) {
            addCriterion("study_aspect like", value, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectNotLike(String value) {
            addCriterion("study_aspect not like", value, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectIn(List<String> values) {
            addCriterion("study_aspect in", values, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectNotIn(List<String> values) {
            addCriterion("study_aspect not in", values, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectBetween(String value1, String value2) {
            addCriterion("study_aspect between", value1, value2, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyAspectNotBetween(String value1, String value2) {
            addCriterion("study_aspect not between", value1, value2, "studyAspect");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceIsNull() {
            addCriterion("study_introduce is null");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceIsNotNull() {
            addCriterion("study_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceEqualTo(String value) {
            addCriterion("study_introduce =", value, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceNotEqualTo(String value) {
            addCriterion("study_introduce <>", value, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceGreaterThan(String value) {
            addCriterion("study_introduce >", value, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("study_introduce >=", value, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceLessThan(String value) {
            addCriterion("study_introduce <", value, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceLessThanOrEqualTo(String value) {
            addCriterion("study_introduce <=", value, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceLike(String value) {
            addCriterion("study_introduce like", value, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceNotLike(String value) {
            addCriterion("study_introduce not like", value, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceIn(List<String> values) {
            addCriterion("study_introduce in", values, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceNotIn(List<String> values) {
            addCriterion("study_introduce not in", values, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceBetween(String value1, String value2) {
            addCriterion("study_introduce between", value1, value2, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andStudyIntroduceNotBetween(String value1, String value2) {
            addCriterion("study_introduce not between", value1, value2, "studyIntroduce");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIsNull() {
            addCriterion("user_authority is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIsNotNull() {
            addCriterion("user_authority is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityEqualTo(Byte value) {
            addCriterion("user_authority =", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotEqualTo(Byte value) {
            addCriterion("user_authority <>", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityGreaterThan(Byte value) {
            addCriterion("user_authority >", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_authority >=", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLessThan(Byte value) {
            addCriterion("user_authority <", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityLessThanOrEqualTo(Byte value) {
            addCriterion("user_authority <=", value, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityIn(List<Byte> values) {
            addCriterion("user_authority in", values, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotIn(List<Byte> values) {
            addCriterion("user_authority not in", values, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityBetween(Byte value1, Byte value2) {
            addCriterion("user_authority between", value1, value2, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andUserAuthorityNotBetween(Byte value1, Byte value2) {
            addCriterion("user_authority not between", value1, value2, "userAuthority");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeIsNull() {
            addCriterion("study_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeIsNotNull() {
            addCriterion("study_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeEqualTo(Date value) {
            addCriterion("study_alter_time =", value, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeNotEqualTo(Date value) {
            addCriterion("study_alter_time <>", value, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeGreaterThan(Date value) {
            addCriterion("study_alter_time >", value, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("study_alter_time >=", value, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeLessThan(Date value) {
            addCriterion("study_alter_time <", value, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("study_alter_time <=", value, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeIn(List<Date> values) {
            addCriterion("study_alter_time in", values, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeNotIn(List<Date> values) {
            addCriterion("study_alter_time not in", values, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeBetween(Date value1, Date value2) {
            addCriterion("study_alter_time between", value1, value2, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("study_alter_time not between", value1, value2, "studyAlterTime");
            return (Criteria) this;
        }

        public Criteria andStudyNull1IsNull() {
            addCriterion("study_null1 is null");
            return (Criteria) this;
        }

        public Criteria andStudyNull1IsNotNull() {
            addCriterion("study_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andStudyNull1EqualTo(String value) {
            addCriterion("study_null1 =", value, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1NotEqualTo(String value) {
            addCriterion("study_null1 <>", value, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1GreaterThan(String value) {
            addCriterion("study_null1 >", value, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1GreaterThanOrEqualTo(String value) {
            addCriterion("study_null1 >=", value, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1LessThan(String value) {
            addCriterion("study_null1 <", value, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1LessThanOrEqualTo(String value) {
            addCriterion("study_null1 <=", value, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1Like(String value) {
            addCriterion("study_null1 like", value, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1NotLike(String value) {
            addCriterion("study_null1 not like", value, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1In(List<String> values) {
            addCriterion("study_null1 in", values, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1NotIn(List<String> values) {
            addCriterion("study_null1 not in", values, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1Between(String value1, String value2) {
            addCriterion("study_null1 between", value1, value2, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull1NotBetween(String value1, String value2) {
            addCriterion("study_null1 not between", value1, value2, "studyNull1");
            return (Criteria) this;
        }

        public Criteria andStudyNull2IsNull() {
            addCriterion("study_null2 is null");
            return (Criteria) this;
        }

        public Criteria andStudyNull2IsNotNull() {
            addCriterion("study_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andStudyNull2EqualTo(String value) {
            addCriterion("study_null2 =", value, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2NotEqualTo(String value) {
            addCriterion("study_null2 <>", value, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2GreaterThan(String value) {
            addCriterion("study_null2 >", value, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2GreaterThanOrEqualTo(String value) {
            addCriterion("study_null2 >=", value, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2LessThan(String value) {
            addCriterion("study_null2 <", value, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2LessThanOrEqualTo(String value) {
            addCriterion("study_null2 <=", value, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2Like(String value) {
            addCriterion("study_null2 like", value, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2NotLike(String value) {
            addCriterion("study_null2 not like", value, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2In(List<String> values) {
            addCriterion("study_null2 in", values, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2NotIn(List<String> values) {
            addCriterion("study_null2 not in", values, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2Between(String value1, String value2) {
            addCriterion("study_null2 between", value1, value2, "studyNull2");
            return (Criteria) this;
        }

        public Criteria andStudyNull2NotBetween(String value1, String value2) {
            addCriterion("study_null2 not between", value1, value2, "studyNull2");
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