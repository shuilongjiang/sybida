package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaVitaeEvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaVitaeEvaluateExample() {
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

        public Criteria andVitaeEvaluateIdIsNull() {
            addCriterion("vitae_evaluate_id is null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdIsNotNull() {
            addCriterion("vitae_evaluate_id is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdEqualTo(Integer value) {
            addCriterion("vitae_evaluate_id =", value, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdNotEqualTo(Integer value) {
            addCriterion("vitae_evaluate_id <>", value, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdGreaterThan(Integer value) {
            addCriterion("vitae_evaluate_id >", value, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitae_evaluate_id >=", value, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdLessThan(Integer value) {
            addCriterion("vitae_evaluate_id <", value, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdLessThanOrEqualTo(Integer value) {
            addCriterion("vitae_evaluate_id <=", value, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdIn(List<Integer> values) {
            addCriterion("vitae_evaluate_id in", values, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdNotIn(List<Integer> values) {
            addCriterion("vitae_evaluate_id not in", values, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdBetween(Integer value1, Integer value2) {
            addCriterion("vitae_evaluate_id between", value1, value2, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vitae_evaluate_id not between", value1, value2, "vitaeEvaluateId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentIsNull() {
            addCriterion("vitae_evaluate_comment is null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentIsNotNull() {
            addCriterion("vitae_evaluate_comment is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentEqualTo(String value) {
            addCriterion("vitae_evaluate_comment =", value, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentNotEqualTo(String value) {
            addCriterion("vitae_evaluate_comment <>", value, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentGreaterThan(String value) {
            addCriterion("vitae_evaluate_comment >", value, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentGreaterThanOrEqualTo(String value) {
            addCriterion("vitae_evaluate_comment >=", value, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentLessThan(String value) {
            addCriterion("vitae_evaluate_comment <", value, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentLessThanOrEqualTo(String value) {
            addCriterion("vitae_evaluate_comment <=", value, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentLike(String value) {
            addCriterion("vitae_evaluate_comment like", value, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentNotLike(String value) {
            addCriterion("vitae_evaluate_comment not like", value, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentIn(List<String> values) {
            addCriterion("vitae_evaluate_comment in", values, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentNotIn(List<String> values) {
            addCriterion("vitae_evaluate_comment not in", values, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentBetween(String value1, String value2) {
            addCriterion("vitae_evaluate_comment between", value1, value2, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateCommentNotBetween(String value1, String value2) {
            addCriterion("vitae_evaluate_comment not between", value1, value2, "vitaeEvaluateComment");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdIsNull() {
            addCriterion("vitae_evaluate_user_id is null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdIsNotNull() {
            addCriterion("vitae_evaluate_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdEqualTo(Integer value) {
            addCriterion("vitae_evaluate_user_id =", value, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdNotEqualTo(Integer value) {
            addCriterion("vitae_evaluate_user_id <>", value, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdGreaterThan(Integer value) {
            addCriterion("vitae_evaluate_user_id >", value, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("vitae_evaluate_user_id >=", value, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdLessThan(Integer value) {
            addCriterion("vitae_evaluate_user_id <", value, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("vitae_evaluate_user_id <=", value, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdIn(List<Integer> values) {
            addCriterion("vitae_evaluate_user_id in", values, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdNotIn(List<Integer> values) {
            addCriterion("vitae_evaluate_user_id not in", values, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("vitae_evaluate_user_id between", value1, value2, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("vitae_evaluate_user_id not between", value1, value2, "vitaeEvaluateUserId");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureIsNull() {
            addCriterion("vitae_evaluate_picture is null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureIsNotNull() {
            addCriterion("vitae_evaluate_picture is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureEqualTo(String value) {
            addCriterion("vitae_evaluate_picture =", value, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureNotEqualTo(String value) {
            addCriterion("vitae_evaluate_picture <>", value, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureGreaterThan(String value) {
            addCriterion("vitae_evaluate_picture >", value, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureGreaterThanOrEqualTo(String value) {
            addCriterion("vitae_evaluate_picture >=", value, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureLessThan(String value) {
            addCriterion("vitae_evaluate_picture <", value, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureLessThanOrEqualTo(String value) {
            addCriterion("vitae_evaluate_picture <=", value, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureLike(String value) {
            addCriterion("vitae_evaluate_picture like", value, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureNotLike(String value) {
            addCriterion("vitae_evaluate_picture not like", value, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureIn(List<String> values) {
            addCriterion("vitae_evaluate_picture in", values, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureNotIn(List<String> values) {
            addCriterion("vitae_evaluate_picture not in", values, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureBetween(String value1, String value2) {
            addCriterion("vitae_evaluate_picture between", value1, value2, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluatePictureNotBetween(String value1, String value2) {
            addCriterion("vitae_evaluate_picture not between", value1, value2, "vitaeEvaluatePicture");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeIsNull() {
            addCriterion("vitae_evaluate_time is null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeIsNotNull() {
            addCriterion("vitae_evaluate_time is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeEqualTo(Date value) {
            addCriterion("vitae_evaluate_time =", value, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeNotEqualTo(Date value) {
            addCriterion("vitae_evaluate_time <>", value, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeGreaterThan(Date value) {
            addCriterion("vitae_evaluate_time >", value, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vitae_evaluate_time >=", value, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeLessThan(Date value) {
            addCriterion("vitae_evaluate_time <", value, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeLessThanOrEqualTo(Date value) {
            addCriterion("vitae_evaluate_time <=", value, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeIn(List<Date> values) {
            addCriterion("vitae_evaluate_time in", values, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeNotIn(List<Date> values) {
            addCriterion("vitae_evaluate_time not in", values, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeBetween(Date value1, Date value2) {
            addCriterion("vitae_evaluate_time between", value1, value2, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateTimeNotBetween(Date value1, Date value2) {
            addCriterion("vitae_evaluate_time not between", value1, value2, "vitaeEvaluateTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeIsNull() {
            addCriterion("vitae_evaluate_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeIsNotNull() {
            addCriterion("vitae_evaluate_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeEqualTo(Date value) {
            addCriterion("vitae_evaluate_alter_time =", value, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeNotEqualTo(Date value) {
            addCriterion("vitae_evaluate_alter_time <>", value, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeGreaterThan(Date value) {
            addCriterion("vitae_evaluate_alter_time >", value, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vitae_evaluate_alter_time >=", value, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeLessThan(Date value) {
            addCriterion("vitae_evaluate_alter_time <", value, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("vitae_evaluate_alter_time <=", value, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeIn(List<Date> values) {
            addCriterion("vitae_evaluate_alter_time in", values, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeNotIn(List<Date> values) {
            addCriterion("vitae_evaluate_alter_time not in", values, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeBetween(Date value1, Date value2) {
            addCriterion("vitae_evaluate_alter_time between", value1, value2, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("vitae_evaluate_alter_time not between", value1, value2, "vitaeEvaluateAlterTime");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1IsNull() {
            addCriterion("vitae_evaluate_null1 is null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1IsNotNull() {
            addCriterion("vitae_evaluate_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1EqualTo(String value) {
            addCriterion("vitae_evaluate_null1 =", value, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1NotEqualTo(String value) {
            addCriterion("vitae_evaluate_null1 <>", value, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1GreaterThan(String value) {
            addCriterion("vitae_evaluate_null1 >", value, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1GreaterThanOrEqualTo(String value) {
            addCriterion("vitae_evaluate_null1 >=", value, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1LessThan(String value) {
            addCriterion("vitae_evaluate_null1 <", value, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1LessThanOrEqualTo(String value) {
            addCriterion("vitae_evaluate_null1 <=", value, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1Like(String value) {
            addCriterion("vitae_evaluate_null1 like", value, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1NotLike(String value) {
            addCriterion("vitae_evaluate_null1 not like", value, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1In(List<String> values) {
            addCriterion("vitae_evaluate_null1 in", values, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1NotIn(List<String> values) {
            addCriterion("vitae_evaluate_null1 not in", values, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1Between(String value1, String value2) {
            addCriterion("vitae_evaluate_null1 between", value1, value2, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull1NotBetween(String value1, String value2) {
            addCriterion("vitae_evaluate_null1 not between", value1, value2, "vitaeEvaluateNull1");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2IsNull() {
            addCriterion("vitae_evaluate_null2 is null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2IsNotNull() {
            addCriterion("vitae_evaluate_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2EqualTo(String value) {
            addCriterion("vitae_evaluate_null2 =", value, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2NotEqualTo(String value) {
            addCriterion("vitae_evaluate_null2 <>", value, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2GreaterThan(String value) {
            addCriterion("vitae_evaluate_null2 >", value, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2GreaterThanOrEqualTo(String value) {
            addCriterion("vitae_evaluate_null2 >=", value, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2LessThan(String value) {
            addCriterion("vitae_evaluate_null2 <", value, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2LessThanOrEqualTo(String value) {
            addCriterion("vitae_evaluate_null2 <=", value, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2Like(String value) {
            addCriterion("vitae_evaluate_null2 like", value, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2NotLike(String value) {
            addCriterion("vitae_evaluate_null2 not like", value, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2In(List<String> values) {
            addCriterion("vitae_evaluate_null2 in", values, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2NotIn(List<String> values) {
            addCriterion("vitae_evaluate_null2 not in", values, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2Between(String value1, String value2) {
            addCriterion("vitae_evaluate_null2 between", value1, value2, "vitaeEvaluateNull2");
            return (Criteria) this;
        }

        public Criteria andVitaeEvaluateNull2NotBetween(String value1, String value2) {
            addCriterion("vitae_evaluate_null2 not between", value1, value2, "vitaeEvaluateNull2");
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