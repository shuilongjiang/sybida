package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaNewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdIsNull() {
            addCriterion("news_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdIsNotNull() {
            addCriterion("news_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdEqualTo(Integer value) {
            addCriterion("news_user_id =", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdNotEqualTo(Integer value) {
            addCriterion("news_user_id <>", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdGreaterThan(Integer value) {
            addCriterion("news_user_id >", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_user_id >=", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdLessThan(Integer value) {
            addCriterion("news_user_id <", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_user_id <=", value, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdIn(List<Integer> values) {
            addCriterion("news_user_id in", values, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdNotIn(List<Integer> values) {
            addCriterion("news_user_id not in", values, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdBetween(Integer value1, Integer value2) {
            addCriterion("news_user_id between", value1, value2, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_user_id not between", value1, value2, "newsUserId");
            return (Criteria) this;
        }

        public Criteria andNewsTestIsNull() {
            addCriterion("news_test is null");
            return (Criteria) this;
        }

        public Criteria andNewsTestIsNotNull() {
            addCriterion("news_test is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTestEqualTo(String value) {
            addCriterion("news_test =", value, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestNotEqualTo(String value) {
            addCriterion("news_test <>", value, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestGreaterThan(String value) {
            addCriterion("news_test >", value, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestGreaterThanOrEqualTo(String value) {
            addCriterion("news_test >=", value, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestLessThan(String value) {
            addCriterion("news_test <", value, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestLessThanOrEqualTo(String value) {
            addCriterion("news_test <=", value, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestLike(String value) {
            addCriterion("news_test like", value, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestNotLike(String value) {
            addCriterion("news_test not like", value, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestIn(List<String> values) {
            addCriterion("news_test in", values, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestNotIn(List<String> values) {
            addCriterion("news_test not in", values, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestBetween(String value1, String value2) {
            addCriterion("news_test between", value1, value2, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsTestNotBetween(String value1, String value2) {
            addCriterion("news_test not between", value1, value2, "newsTest");
            return (Criteria) this;
        }

        public Criteria andNewsPictureIsNull() {
            addCriterion("news_picture is null");
            return (Criteria) this;
        }

        public Criteria andNewsPictureIsNotNull() {
            addCriterion("news_picture is not null");
            return (Criteria) this;
        }

        public Criteria andNewsPictureEqualTo(String value) {
            addCriterion("news_picture =", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureNotEqualTo(String value) {
            addCriterion("news_picture <>", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureGreaterThan(String value) {
            addCriterion("news_picture >", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureGreaterThanOrEqualTo(String value) {
            addCriterion("news_picture >=", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureLessThan(String value) {
            addCriterion("news_picture <", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureLessThanOrEqualTo(String value) {
            addCriterion("news_picture <=", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureLike(String value) {
            addCriterion("news_picture like", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureNotLike(String value) {
            addCriterion("news_picture not like", value, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureIn(List<String> values) {
            addCriterion("news_picture in", values, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureNotIn(List<String> values) {
            addCriterion("news_picture not in", values, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureBetween(String value1, String value2) {
            addCriterion("news_picture between", value1, value2, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsPictureNotBetween(String value1, String value2) {
            addCriterion("news_picture not between", value1, value2, "newsPicture");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeIsNull() {
            addCriterion("news_send_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeIsNotNull() {
            addCriterion("news_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeEqualTo(Date value) {
            addCriterion("news_send_time =", value, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeNotEqualTo(Date value) {
            addCriterion("news_send_time <>", value, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeGreaterThan(Date value) {
            addCriterion("news_send_time >", value, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("news_send_time >=", value, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeLessThan(Date value) {
            addCriterion("news_send_time <", value, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("news_send_time <=", value, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeIn(List<Date> values) {
            addCriterion("news_send_time in", values, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeNotIn(List<Date> values) {
            addCriterion("news_send_time not in", values, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeBetween(Date value1, Date value2) {
            addCriterion("news_send_time between", value1, value2, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("news_send_time not between", value1, value2, "newsSendTime");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleIsNull() {
            addCriterion("news_read_people is null");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleIsNotNull() {
            addCriterion("news_read_people is not null");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleEqualTo(Integer value) {
            addCriterion("news_read_people =", value, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleNotEqualTo(Integer value) {
            addCriterion("news_read_people <>", value, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleGreaterThan(Integer value) {
            addCriterion("news_read_people >", value, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_read_people >=", value, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleLessThan(Integer value) {
            addCriterion("news_read_people <", value, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("news_read_people <=", value, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleIn(List<Integer> values) {
            addCriterion("news_read_people in", values, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleNotIn(List<Integer> values) {
            addCriterion("news_read_people not in", values, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleBetween(Integer value1, Integer value2) {
            addCriterion("news_read_people between", value1, value2, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsReadPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("news_read_people not between", value1, value2, "newsReadPeople");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeIsNull() {
            addCriterion("news_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeIsNotNull() {
            addCriterion("news_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeEqualTo(Date value) {
            addCriterion("news_alter_time =", value, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeNotEqualTo(Date value) {
            addCriterion("news_alter_time <>", value, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeGreaterThan(Date value) {
            addCriterion("news_alter_time >", value, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("news_alter_time >=", value, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeLessThan(Date value) {
            addCriterion("news_alter_time <", value, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("news_alter_time <=", value, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeIn(List<Date> values) {
            addCriterion("news_alter_time in", values, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeNotIn(List<Date> values) {
            addCriterion("news_alter_time not in", values, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeBetween(Date value1, Date value2) {
            addCriterion("news_alter_time between", value1, value2, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("news_alter_time not between", value1, value2, "newsAlterTime");
            return (Criteria) this;
        }

        public Criteria andNewsNull1IsNull() {
            addCriterion("news_null1 is null");
            return (Criteria) this;
        }

        public Criteria andNewsNull1IsNotNull() {
            addCriterion("news_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsNull1EqualTo(String value) {
            addCriterion("news_null1 =", value, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1NotEqualTo(String value) {
            addCriterion("news_null1 <>", value, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1GreaterThan(String value) {
            addCriterion("news_null1 >", value, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1GreaterThanOrEqualTo(String value) {
            addCriterion("news_null1 >=", value, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1LessThan(String value) {
            addCriterion("news_null1 <", value, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1LessThanOrEqualTo(String value) {
            addCriterion("news_null1 <=", value, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1Like(String value) {
            addCriterion("news_null1 like", value, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1NotLike(String value) {
            addCriterion("news_null1 not like", value, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1In(List<String> values) {
            addCriterion("news_null1 in", values, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1NotIn(List<String> values) {
            addCriterion("news_null1 not in", values, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1Between(String value1, String value2) {
            addCriterion("news_null1 between", value1, value2, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull1NotBetween(String value1, String value2) {
            addCriterion("news_null1 not between", value1, value2, "newsNull1");
            return (Criteria) this;
        }

        public Criteria andNewsNull2IsNull() {
            addCriterion("news_null2 is null");
            return (Criteria) this;
        }

        public Criteria andNewsNull2IsNotNull() {
            addCriterion("news_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsNull2EqualTo(String value) {
            addCriterion("news_null2 =", value, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2NotEqualTo(String value) {
            addCriterion("news_null2 <>", value, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2GreaterThan(String value) {
            addCriterion("news_null2 >", value, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2GreaterThanOrEqualTo(String value) {
            addCriterion("news_null2 >=", value, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2LessThan(String value) {
            addCriterion("news_null2 <", value, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2LessThanOrEqualTo(String value) {
            addCriterion("news_null2 <=", value, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2Like(String value) {
            addCriterion("news_null2 like", value, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2NotLike(String value) {
            addCriterion("news_null2 not like", value, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2In(List<String> values) {
            addCriterion("news_null2 in", values, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2NotIn(List<String> values) {
            addCriterion("news_null2 not in", values, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2Between(String value1, String value2) {
            addCriterion("news_null2 between", value1, value2, "newsNull2");
            return (Criteria) this;
        }

        public Criteria andNewsNull2NotBetween(String value1, String value2) {
            addCriterion("news_null2 not between", value1, value2, "newsNull2");
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