package com.sy.pojo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SybidaUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNull() {
            addCriterion("user_note is null");
            return (Criteria) this;
        }

        public Criteria andUserNoteIsNotNull() {
            addCriterion("user_note is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoteEqualTo(Integer value) {
            addCriterion("user_note =", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotEqualTo(Integer value) {
            addCriterion("user_note <>", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThan(Integer value) {
            addCriterion("user_note >", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_note >=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThan(Integer value) {
            addCriterion("user_note <", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteLessThanOrEqualTo(Integer value) {
            addCriterion("user_note <=", value, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteIn(List<Integer> values) {
            addCriterion("user_note in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotIn(List<Integer> values) {
            addCriterion("user_note not in", values, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteBetween(Integer value1, Integer value2) {
            addCriterion("user_note between", value1, value2, "userNote");
            return (Criteria) this;
        }

        public Criteria andUserNoteNotBetween(Integer value1, Integer value2) {
            addCriterion("user_note not between", value1, value2, "userNote");
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

        public Criteria andUserAlterTimeIsNull() {
            addCriterion("user_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeIsNotNull() {
            addCriterion("user_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeEqualTo(Date value) {
            addCriterion("user_alter_time =", value, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeNotEqualTo(Date value) {
            addCriterion("user_alter_time <>", value, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeGreaterThan(Date value) {
            addCriterion("user_alter_time >", value, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_alter_time >=", value, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeLessThan(Date value) {
            addCriterion("user_alter_time <", value, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_alter_time <=", value, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeIn(List<Date> values) {
            addCriterion("user_alter_time in", values, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeNotIn(List<Date> values) {
            addCriterion("user_alter_time not in", values, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeBetween(Date value1, Date value2) {
            addCriterion("user_alter_time between", value1, value2, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_alter_time not between", value1, value2, "userAlterTime");
            return (Criteria) this;
        }

        public Criteria andUserNull1IsNull() {
            addCriterion("user_null1 is null");
            return (Criteria) this;
        }

        public Criteria andUserNull1IsNotNull() {
            addCriterion("user_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserNull1EqualTo(String value) {
            addCriterion("user_null1 =", value, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1NotEqualTo(String value) {
            addCriterion("user_null1 <>", value, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1GreaterThan(String value) {
            addCriterion("user_null1 >", value, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1GreaterThanOrEqualTo(String value) {
            addCriterion("user_null1 >=", value, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1LessThan(String value) {
            addCriterion("user_null1 <", value, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1LessThanOrEqualTo(String value) {
            addCriterion("user_null1 <=", value, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1Like(String value) {
            addCriterion("user_null1 like", value, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1NotLike(String value) {
            addCriterion("user_null1 not like", value, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1In(List<String> values) {
            addCriterion("user_null1 in", values, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1NotIn(List<String> values) {
            addCriterion("user_null1 not in", values, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1Between(String value1, String value2) {
            addCriterion("user_null1 between", value1, value2, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull1NotBetween(String value1, String value2) {
            addCriterion("user_null1 not between", value1, value2, "userNull1");
            return (Criteria) this;
        }

        public Criteria andUserNull2IsNull() {
            addCriterion("user_null2 is null");
            return (Criteria) this;
        }

        public Criteria andUserNull2IsNotNull() {
            addCriterion("user_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserNull2EqualTo(String value) {
            addCriterion("user_null2 =", value, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2NotEqualTo(String value) {
            addCriterion("user_null2 <>", value, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2GreaterThan(String value) {
            addCriterion("user_null2 >", value, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2GreaterThanOrEqualTo(String value) {
            addCriterion("user_null2 >=", value, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2LessThan(String value) {
            addCriterion("user_null2 <", value, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2LessThanOrEqualTo(String value) {
            addCriterion("user_null2 <=", value, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2Like(String value) {
            addCriterion("user_null2 like", value, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2NotLike(String value) {
            addCriterion("user_null2 not like", value, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2In(List<String> values) {
            addCriterion("user_null2 in", values, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2NotIn(List<String> values) {
            addCriterion("user_null2 not in", values, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2Between(String value1, String value2) {
            addCriterion("user_null2 between", value1, value2, "userNull2");
            return (Criteria) this;
        }

        public Criteria andUserNull2NotBetween(String value1, String value2) {
            addCriterion("user_null2 not between", value1, value2, "userNull2");
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