package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaClassExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNull() {
            addCriterion("class_num is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("class_num is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(String value) {
            addCriterion("class_num =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(String value) {
            addCriterion("class_num <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(String value) {
            addCriterion("class_num >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(String value) {
            addCriterion("class_num >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(String value) {
            addCriterion("class_num <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(String value) {
            addCriterion("class_num <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLike(String value) {
            addCriterion("class_num like", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotLike(String value) {
            addCriterion("class_num not like", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<String> values) {
            addCriterion("class_num in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<String> values) {
            addCriterion("class_num not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(String value1, String value2) {
            addCriterion("class_num between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(String value1, String value2) {
            addCriterion("class_num not between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdIsNull() {
            addCriterion("class_teach_id is null");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdIsNotNull() {
            addCriterion("class_teach_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdEqualTo(Integer value) {
            addCriterion("class_teach_id =", value, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdNotEqualTo(Integer value) {
            addCriterion("class_teach_id <>", value, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdGreaterThan(Integer value) {
            addCriterion("class_teach_id >", value, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_teach_id >=", value, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdLessThan(Integer value) {
            addCriterion("class_teach_id <", value, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_teach_id <=", value, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdIn(List<Integer> values) {
            addCriterion("class_teach_id in", values, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdNotIn(List<Integer> values) {
            addCriterion("class_teach_id not in", values, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdBetween(Integer value1, Integer value2) {
            addCriterion("class_teach_id between", value1, value2, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassTeachIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_teach_id not between", value1, value2, "classTeachId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdIsNull() {
            addCriterion("class_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdIsNotNull() {
            addCriterion("class_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdEqualTo(Integer value) {
            addCriterion("class_manager_id =", value, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdNotEqualTo(Integer value) {
            addCriterion("class_manager_id <>", value, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdGreaterThan(Integer value) {
            addCriterion("class_manager_id >", value, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_manager_id >=", value, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdLessThan(Integer value) {
            addCriterion("class_manager_id <", value, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_manager_id <=", value, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdIn(List<Integer> values) {
            addCriterion("class_manager_id in", values, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdNotIn(List<Integer> values) {
            addCriterion("class_manager_id not in", values, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("class_manager_id between", value1, value2, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_manager_id not between", value1, value2, "classManagerId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdIsNull() {
            addCriterion("class_study_id is null");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdIsNotNull() {
            addCriterion("class_study_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdEqualTo(Integer value) {
            addCriterion("class_study_id =", value, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdNotEqualTo(Integer value) {
            addCriterion("class_study_id <>", value, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdGreaterThan(Integer value) {
            addCriterion("class_study_id >", value, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_study_id >=", value, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdLessThan(Integer value) {
            addCriterion("class_study_id <", value, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_study_id <=", value, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdIn(List<Integer> values) {
            addCriterion("class_study_id in", values, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdNotIn(List<Integer> values) {
            addCriterion("class_study_id not in", values, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("class_study_id between", value1, value2, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_study_id not between", value1, value2, "classStudyId");
            return (Criteria) this;
        }

        public Criteria andClassTimeIsNull() {
            addCriterion("class_time is null");
            return (Criteria) this;
        }

        public Criteria andClassTimeIsNotNull() {
            addCriterion("class_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassTimeEqualTo(Date value) {
            addCriterion("class_time =", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotEqualTo(Date value) {
            addCriterion("class_time <>", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeGreaterThan(Date value) {
            addCriterion("class_time >", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("class_time >=", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeLessThan(Date value) {
            addCriterion("class_time <", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeLessThanOrEqualTo(Date value) {
            addCriterion("class_time <=", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeIn(List<Date> values) {
            addCriterion("class_time in", values, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotIn(List<Date> values) {
            addCriterion("class_time not in", values, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeBetween(Date value1, Date value2) {
            addCriterion("class_time between", value1, value2, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotBetween(Date value1, Date value2) {
            addCriterion("class_time not between", value1, value2, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateIsNull() {
            addCriterion("class_is_graduate is null");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateIsNotNull() {
            addCriterion("class_is_graduate is not null");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateEqualTo(Byte value) {
            addCriterion("class_is_graduate =", value, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateNotEqualTo(Byte value) {
            addCriterion("class_is_graduate <>", value, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateGreaterThan(Byte value) {
            addCriterion("class_is_graduate >", value, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateGreaterThanOrEqualTo(Byte value) {
            addCriterion("class_is_graduate >=", value, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateLessThan(Byte value) {
            addCriterion("class_is_graduate <", value, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateLessThanOrEqualTo(Byte value) {
            addCriterion("class_is_graduate <=", value, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateIn(List<Byte> values) {
            addCriterion("class_is_graduate in", values, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateNotIn(List<Byte> values) {
            addCriterion("class_is_graduate not in", values, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateBetween(Byte value1, Byte value2) {
            addCriterion("class_is_graduate between", value1, value2, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassIsGraduateNotBetween(Byte value1, Byte value2) {
            addCriterion("class_is_graduate not between", value1, value2, "classIsGraduate");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeIsNull() {
            addCriterion("class_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeIsNotNull() {
            addCriterion("class_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeEqualTo(Date value) {
            addCriterion("class_alter_time =", value, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeNotEqualTo(Date value) {
            addCriterion("class_alter_time <>", value, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeGreaterThan(Date value) {
            addCriterion("class_alter_time >", value, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("class_alter_time >=", value, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeLessThan(Date value) {
            addCriterion("class_alter_time <", value, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("class_alter_time <=", value, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeIn(List<Date> values) {
            addCriterion("class_alter_time in", values, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeNotIn(List<Date> values) {
            addCriterion("class_alter_time not in", values, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeBetween(Date value1, Date value2) {
            addCriterion("class_alter_time between", value1, value2, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("class_alter_time not between", value1, value2, "classAlterTime");
            return (Criteria) this;
        }

        public Criteria andClassNull1IsNull() {
            addCriterion("class_null1 is null");
            return (Criteria) this;
        }

        public Criteria andClassNull1IsNotNull() {
            addCriterion("class_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andClassNull1EqualTo(String value) {
            addCriterion("class_null1 =", value, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1NotEqualTo(String value) {
            addCriterion("class_null1 <>", value, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1GreaterThan(String value) {
            addCriterion("class_null1 >", value, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1GreaterThanOrEqualTo(String value) {
            addCriterion("class_null1 >=", value, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1LessThan(String value) {
            addCriterion("class_null1 <", value, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1LessThanOrEqualTo(String value) {
            addCriterion("class_null1 <=", value, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1Like(String value) {
            addCriterion("class_null1 like", value, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1NotLike(String value) {
            addCriterion("class_null1 not like", value, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1In(List<String> values) {
            addCriterion("class_null1 in", values, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1NotIn(List<String> values) {
            addCriterion("class_null1 not in", values, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1Between(String value1, String value2) {
            addCriterion("class_null1 between", value1, value2, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull1NotBetween(String value1, String value2) {
            addCriterion("class_null1 not between", value1, value2, "classNull1");
            return (Criteria) this;
        }

        public Criteria andClassNull2IsNull() {
            addCriterion("class_null2 is null");
            return (Criteria) this;
        }

        public Criteria andClassNull2IsNotNull() {
            addCriterion("class_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andClassNull2EqualTo(String value) {
            addCriterion("class_null2 =", value, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2NotEqualTo(String value) {
            addCriterion("class_null2 <>", value, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2GreaterThan(String value) {
            addCriterion("class_null2 >", value, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2GreaterThanOrEqualTo(String value) {
            addCriterion("class_null2 >=", value, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2LessThan(String value) {
            addCriterion("class_null2 <", value, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2LessThanOrEqualTo(String value) {
            addCriterion("class_null2 <=", value, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2Like(String value) {
            addCriterion("class_null2 like", value, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2NotLike(String value) {
            addCriterion("class_null2 not like", value, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2In(List<String> values) {
            addCriterion("class_null2 in", values, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2NotIn(List<String> values) {
            addCriterion("class_null2 not in", values, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2Between(String value1, String value2) {
            addCriterion("class_null2 between", value1, value2, "classNull2");
            return (Criteria) this;
        }

        public Criteria andClassNull2NotBetween(String value1, String value2) {
            addCriterion("class_null2 not between", value1, value2, "classNull2");
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