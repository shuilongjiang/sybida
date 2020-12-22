package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaCompanyMarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaCompanyMarkExample() {
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

        public Criteria andMarkIdIsNull() {
            addCriterion("\" mark_id\" is null");
            return (Criteria) this;
        }

        public Criteria andMarkIdIsNotNull() {
            addCriterion("\" mark_id\" is not null");
            return (Criteria) this;
        }

        public Criteria andMarkIdEqualTo(Integer value) {
            addCriterion("\" mark_id\" =", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotEqualTo(Integer value) {
            addCriterion("\" mark_id\" <>", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdGreaterThan(Integer value) {
            addCriterion("\" mark_id\" >", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("\" mark_id\" >=", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdLessThan(Integer value) {
            addCriterion("\" mark_id\" <", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdLessThanOrEqualTo(Integer value) {
            addCriterion("\" mark_id\" <=", value, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdIn(List<Integer> values) {
            addCriterion("\" mark_id\" in", values, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotIn(List<Integer> values) {
            addCriterion("\" mark_id\" not in", values, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdBetween(Integer value1, Integer value2) {
            addCriterion("\" mark_id\" between", value1, value2, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("\" mark_id\" not between", value1, value2, "markId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdIsNull() {
            addCriterion("mark_teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdIsNotNull() {
            addCriterion("mark_teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdEqualTo(String value) {
            addCriterion("mark_teacher_id =", value, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdNotEqualTo(String value) {
            addCriterion("mark_teacher_id <>", value, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdGreaterThan(String value) {
            addCriterion("mark_teacher_id >", value, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdGreaterThanOrEqualTo(String value) {
            addCriterion("mark_teacher_id >=", value, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdLessThan(String value) {
            addCriterion("mark_teacher_id <", value, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdLessThanOrEqualTo(String value) {
            addCriterion("mark_teacher_id <=", value, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdLike(String value) {
            addCriterion("mark_teacher_id like", value, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdNotLike(String value) {
            addCriterion("mark_teacher_id not like", value, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdIn(List<String> values) {
            addCriterion("mark_teacher_id in", values, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdNotIn(List<String> values) {
            addCriterion("mark_teacher_id not in", values, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdBetween(String value1, String value2) {
            addCriterion("mark_teacher_id between", value1, value2, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkTeacherIdNotBetween(String value1, String value2) {
            addCriterion("mark_teacher_id not between", value1, value2, "markTeacherId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdIsNull() {
            addCriterion("mark_ercode_id is null");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdIsNotNull() {
            addCriterion("mark_ercode_id is not null");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdEqualTo(String value) {
            addCriterion("mark_ercode_id =", value, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdNotEqualTo(String value) {
            addCriterion("mark_ercode_id <>", value, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdGreaterThan(String value) {
            addCriterion("mark_ercode_id >", value, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("mark_ercode_id >=", value, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdLessThan(String value) {
            addCriterion("mark_ercode_id <", value, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdLessThanOrEqualTo(String value) {
            addCriterion("mark_ercode_id <=", value, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdLike(String value) {
            addCriterion("mark_ercode_id like", value, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdNotLike(String value) {
            addCriterion("mark_ercode_id not like", value, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdIn(List<String> values) {
            addCriterion("mark_ercode_id in", values, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdNotIn(List<String> values) {
            addCriterion("mark_ercode_id not in", values, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdBetween(String value1, String value2) {
            addCriterion("mark_ercode_id between", value1, value2, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkErcodeIdNotBetween(String value1, String value2) {
            addCriterion("mark_ercode_id not between", value1, value2, "markErcodeId");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateIsNull() {
            addCriterion("mark_alter_date is null");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateIsNotNull() {
            addCriterion("mark_alter_date is not null");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateEqualTo(Date value) {
            addCriterion("mark_alter_date =", value, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateNotEqualTo(Date value) {
            addCriterion("mark_alter_date <>", value, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateGreaterThan(Date value) {
            addCriterion("mark_alter_date >", value, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mark_alter_date >=", value, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateLessThan(Date value) {
            addCriterion("mark_alter_date <", value, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateLessThanOrEqualTo(Date value) {
            addCriterion("mark_alter_date <=", value, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateIn(List<Date> values) {
            addCriterion("mark_alter_date in", values, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateNotIn(List<Date> values) {
            addCriterion("mark_alter_date not in", values, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateBetween(Date value1, Date value2) {
            addCriterion("mark_alter_date between", value1, value2, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkAlterDateNotBetween(Date value1, Date value2) {
            addCriterion("mark_alter_date not between", value1, value2, "markAlterDate");
            return (Criteria) this;
        }

        public Criteria andMarkNull1IsNull() {
            addCriterion("mark_null1 is null");
            return (Criteria) this;
        }

        public Criteria andMarkNull1IsNotNull() {
            addCriterion("mark_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andMarkNull1EqualTo(String value) {
            addCriterion("mark_null1 =", value, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1NotEqualTo(String value) {
            addCriterion("mark_null1 <>", value, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1GreaterThan(String value) {
            addCriterion("mark_null1 >", value, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1GreaterThanOrEqualTo(String value) {
            addCriterion("mark_null1 >=", value, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1LessThan(String value) {
            addCriterion("mark_null1 <", value, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1LessThanOrEqualTo(String value) {
            addCriterion("mark_null1 <=", value, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1Like(String value) {
            addCriterion("mark_null1 like", value, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1NotLike(String value) {
            addCriterion("mark_null1 not like", value, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1In(List<String> values) {
            addCriterion("mark_null1 in", values, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1NotIn(List<String> values) {
            addCriterion("mark_null1 not in", values, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1Between(String value1, String value2) {
            addCriterion("mark_null1 between", value1, value2, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull1NotBetween(String value1, String value2) {
            addCriterion("mark_null1 not between", value1, value2, "markNull1");
            return (Criteria) this;
        }

        public Criteria andMarkNull2IsNull() {
            addCriterion("mark_null2 is null");
            return (Criteria) this;
        }

        public Criteria andMarkNull2IsNotNull() {
            addCriterion("mark_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andMarkNull2EqualTo(String value) {
            addCriterion("mark_null2 =", value, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2NotEqualTo(String value) {
            addCriterion("mark_null2 <>", value, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2GreaterThan(String value) {
            addCriterion("mark_null2 >", value, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2GreaterThanOrEqualTo(String value) {
            addCriterion("mark_null2 >=", value, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2LessThan(String value) {
            addCriterion("mark_null2 <", value, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2LessThanOrEqualTo(String value) {
            addCriterion("mark_null2 <=", value, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2Like(String value) {
            addCriterion("mark_null2 like", value, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2NotLike(String value) {
            addCriterion("mark_null2 not like", value, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2In(List<String> values) {
            addCriterion("mark_null2 in", values, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2NotIn(List<String> values) {
            addCriterion("mark_null2 not in", values, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2Between(String value1, String value2) {
            addCriterion("mark_null2 between", value1, value2, "markNull2");
            return (Criteria) this;
        }

        public Criteria andMarkNull2NotBetween(String value1, String value2) {
            addCriterion("mark_null2 not between", value1, value2, "markNull2");
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