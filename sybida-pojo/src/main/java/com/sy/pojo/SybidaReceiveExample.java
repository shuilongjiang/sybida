package com.sy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SybidaReceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaReceiveExample() {
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

        public Criteria andReceiveIdIsNull() {
            addCriterion("receive_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIsNotNull() {
            addCriterion("receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdEqualTo(Integer value) {
            addCriterion("receive_id =", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotEqualTo(Integer value) {
            addCriterion("receive_id <>", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThan(Integer value) {
            addCriterion("receive_id >", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_id >=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThan(Integer value) {
            addCriterion("receive_id <", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_id <=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIn(List<Integer> values) {
            addCriterion("receive_id in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotIn(List<Integer> values) {
            addCriterion("receive_id not in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_id between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_id not between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIsNull() {
            addCriterion("receive_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIsNotNull() {
            addCriterion("receive_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdEqualTo(Integer value) {
            addCriterion("receive_user_id =", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotEqualTo(Integer value) {
            addCriterion("receive_user_id <>", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdGreaterThan(Integer value) {
            addCriterion("receive_user_id >", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receive_user_id >=", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdLessThan(Integer value) {
            addCriterion("receive_user_id <", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("receive_user_id <=", value, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdIn(List<Integer> values) {
            addCriterion("receive_user_id in", values, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotIn(List<Integer> values) {
            addCriterion("receive_user_id not in", values, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdBetween(Integer value1, Integer value2) {
            addCriterion("receive_user_id between", value1, value2, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receive_user_id not between", value1, value2, "receiveUserId");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadIsNull() {
            addCriterion("receive_is_read is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadIsNotNull() {
            addCriterion("receive_is_read is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadEqualTo(Byte value) {
            addCriterion("receive_is_read =", value, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadNotEqualTo(Byte value) {
            addCriterion("receive_is_read <>", value, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadGreaterThan(Byte value) {
            addCriterion("receive_is_read >", value, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadGreaterThanOrEqualTo(Byte value) {
            addCriterion("receive_is_read >=", value, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadLessThan(Byte value) {
            addCriterion("receive_is_read <", value, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadLessThanOrEqualTo(Byte value) {
            addCriterion("receive_is_read <=", value, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadIn(List<Byte> values) {
            addCriterion("receive_is_read in", values, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadNotIn(List<Byte> values) {
            addCriterion("receive_is_read not in", values, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadBetween(Byte value1, Byte value2) {
            addCriterion("receive_is_read between", value1, value2, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveIsReadNotBetween(Byte value1, Byte value2) {
            addCriterion("receive_is_read not between", value1, value2, "receiveIsRead");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeIsNull() {
            addCriterion("receive_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeIsNotNull() {
            addCriterion("receive_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeEqualTo(Date value) {
            addCriterion("receive_alter_time =", value, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeNotEqualTo(Date value) {
            addCriterion("receive_alter_time <>", value, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeGreaterThan(Date value) {
            addCriterion("receive_alter_time >", value, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_alter_time >=", value, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeLessThan(Date value) {
            addCriterion("receive_alter_time <", value, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_alter_time <=", value, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeIn(List<Date> values) {
            addCriterion("receive_alter_time in", values, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeNotIn(List<Date> values) {
            addCriterion("receive_alter_time not in", values, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeBetween(Date value1, Date value2) {
            addCriterion("receive_alter_time between", value1, value2, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_alter_time not between", value1, value2, "receiveAlterTime");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1IsNull() {
            addCriterion("receive_null1 is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1IsNotNull() {
            addCriterion("receive_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1EqualTo(String value) {
            addCriterion("receive_null1 =", value, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1NotEqualTo(String value) {
            addCriterion("receive_null1 <>", value, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1GreaterThan(String value) {
            addCriterion("receive_null1 >", value, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1GreaterThanOrEqualTo(String value) {
            addCriterion("receive_null1 >=", value, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1LessThan(String value) {
            addCriterion("receive_null1 <", value, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1LessThanOrEqualTo(String value) {
            addCriterion("receive_null1 <=", value, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1Like(String value) {
            addCriterion("receive_null1 like", value, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1NotLike(String value) {
            addCriterion("receive_null1 not like", value, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1In(List<String> values) {
            addCriterion("receive_null1 in", values, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1NotIn(List<String> values) {
            addCriterion("receive_null1 not in", values, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1Between(String value1, String value2) {
            addCriterion("receive_null1 between", value1, value2, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull1NotBetween(String value1, String value2) {
            addCriterion("receive_null1 not between", value1, value2, "receiveNull1");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2IsNull() {
            addCriterion("receive_null2 is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2IsNotNull() {
            addCriterion("receive_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2EqualTo(String value) {
            addCriterion("receive_null2 =", value, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2NotEqualTo(String value) {
            addCriterion("receive_null2 <>", value, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2GreaterThan(String value) {
            addCriterion("receive_null2 >", value, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2GreaterThanOrEqualTo(String value) {
            addCriterion("receive_null2 >=", value, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2LessThan(String value) {
            addCriterion("receive_null2 <", value, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2LessThanOrEqualTo(String value) {
            addCriterion("receive_null2 <=", value, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2Like(String value) {
            addCriterion("receive_null2 like", value, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2NotLike(String value) {
            addCriterion("receive_null2 not like", value, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2In(List<String> values) {
            addCriterion("receive_null2 in", values, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2NotIn(List<String> values) {
            addCriterion("receive_null2 not in", values, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2Between(String value1, String value2) {
            addCriterion("receive_null2 between", value1, value2, "receiveNull2");
            return (Criteria) this;
        }

        public Criteria andReceiveNull2NotBetween(String value1, String value2) {
            addCriterion("receive_null2 not between", value1, value2, "receiveNull2");
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