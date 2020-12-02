package com.sy.pojo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class SybidaTeachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SybidaTeachExample() {
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

        public Criteria andTeachIdIsNull() {
            addCriterion("teach_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachIdIsNotNull() {
            addCriterion("teach_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachIdEqualTo(Integer value) {
            addCriterion("teach_id =", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdNotEqualTo(Integer value) {
            addCriterion("teach_id <>", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdGreaterThan(Integer value) {
            addCriterion("teach_id >", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teach_id >=", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdLessThan(Integer value) {
            addCriterion("teach_id <", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdLessThanOrEqualTo(Integer value) {
            addCriterion("teach_id <=", value, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdIn(List<Integer> values) {
            addCriterion("teach_id in", values, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdNotIn(List<Integer> values) {
            addCriterion("teach_id not in", values, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdBetween(Integer value1, Integer value2) {
            addCriterion("teach_id between", value1, value2, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teach_id not between", value1, value2, "teachId");
            return (Criteria) this;
        }

        public Criteria andTeachNameIsNull() {
            addCriterion("teach_name is null");
            return (Criteria) this;
        }

        public Criteria andTeachNameIsNotNull() {
            addCriterion("teach_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeachNameEqualTo(String value) {
            addCriterion("teach_name =", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameNotEqualTo(String value) {
            addCriterion("teach_name <>", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameGreaterThan(String value) {
            addCriterion("teach_name >", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameGreaterThanOrEqualTo(String value) {
            addCriterion("teach_name >=", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameLessThan(String value) {
            addCriterion("teach_name <", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameLessThanOrEqualTo(String value) {
            addCriterion("teach_name <=", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameLike(String value) {
            addCriterion("teach_name like", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameNotLike(String value) {
            addCriterion("teach_name not like", value, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameIn(List<String> values) {
            addCriterion("teach_name in", values, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameNotIn(List<String> values) {
            addCriterion("teach_name not in", values, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameBetween(String value1, String value2) {
            addCriterion("teach_name between", value1, value2, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachNameNotBetween(String value1, String value2) {
            addCriterion("teach_name not between", value1, value2, "teachName");
            return (Criteria) this;
        }

        public Criteria andTeachSexIsNull() {
            addCriterion("teach_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeachSexIsNotNull() {
            addCriterion("teach_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeachSexEqualTo(String value) {
            addCriterion("teach_sex =", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexNotEqualTo(String value) {
            addCriterion("teach_sex <>", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexGreaterThan(String value) {
            addCriterion("teach_sex >", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexGreaterThanOrEqualTo(String value) {
            addCriterion("teach_sex >=", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexLessThan(String value) {
            addCriterion("teach_sex <", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexLessThanOrEqualTo(String value) {
            addCriterion("teach_sex <=", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexLike(String value) {
            addCriterion("teach_sex like", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexNotLike(String value) {
            addCriterion("teach_sex not like", value, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexIn(List<String> values) {
            addCriterion("teach_sex in", values, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexNotIn(List<String> values) {
            addCriterion("teach_sex not in", values, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexBetween(String value1, String value2) {
            addCriterion("teach_sex between", value1, value2, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachSexNotBetween(String value1, String value2) {
            addCriterion("teach_sex not between", value1, value2, "teachSex");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoIsNull() {
            addCriterion("teach_photo is null");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoIsNotNull() {
            addCriterion("teach_photo is not null");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoEqualTo(String value) {
            addCriterion("teach_photo =", value, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoNotEqualTo(String value) {
            addCriterion("teach_photo <>", value, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoGreaterThan(String value) {
            addCriterion("teach_photo >", value, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("teach_photo >=", value, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoLessThan(String value) {
            addCriterion("teach_photo <", value, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoLessThanOrEqualTo(String value) {
            addCriterion("teach_photo <=", value, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoLike(String value) {
            addCriterion("teach_photo like", value, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoNotLike(String value) {
            addCriterion("teach_photo not like", value, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoIn(List<String> values) {
            addCriterion("teach_photo in", values, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoNotIn(List<String> values) {
            addCriterion("teach_photo not in", values, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoBetween(String value1, String value2) {
            addCriterion("teach_photo between", value1, value2, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachPhotoNotBetween(String value1, String value2) {
            addCriterion("teach_photo not between", value1, value2, "teachPhoto");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdIsNull() {
            addCriterion("teach_study_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdIsNotNull() {
            addCriterion("teach_study_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdEqualTo(Integer value) {
            addCriterion("teach_study_id =", value, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdNotEqualTo(Integer value) {
            addCriterion("teach_study_id <>", value, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdGreaterThan(Integer value) {
            addCriterion("teach_study_id >", value, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teach_study_id >=", value, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdLessThan(Integer value) {
            addCriterion("teach_study_id <", value, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdLessThanOrEqualTo(Integer value) {
            addCriterion("teach_study_id <=", value, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdIn(List<Integer> values) {
            addCriterion("teach_study_id in", values, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdNotIn(List<Integer> values) {
            addCriterion("teach_study_id not in", values, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdBetween(Integer value1, Integer value2) {
            addCriterion("teach_study_id between", value1, value2, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachStudyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teach_study_id not between", value1, value2, "teachStudyId");
            return (Criteria) this;
        }

        public Criteria andTeachTelIsNull() {
            addCriterion("teach_tel is null");
            return (Criteria) this;
        }

        public Criteria andTeachTelIsNotNull() {
            addCriterion("teach_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTeachTelEqualTo(String value) {
            addCriterion("teach_tel =", value, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelNotEqualTo(String value) {
            addCriterion("teach_tel <>", value, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelGreaterThan(String value) {
            addCriterion("teach_tel >", value, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelGreaterThanOrEqualTo(String value) {
            addCriterion("teach_tel >=", value, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelLessThan(String value) {
            addCriterion("teach_tel <", value, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelLessThanOrEqualTo(String value) {
            addCriterion("teach_tel <=", value, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelLike(String value) {
            addCriterion("teach_tel like", value, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelNotLike(String value) {
            addCriterion("teach_tel not like", value, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelIn(List<String> values) {
            addCriterion("teach_tel in", values, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelNotIn(List<String> values) {
            addCriterion("teach_tel not in", values, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelBetween(String value1, String value2) {
            addCriterion("teach_tel between", value1, value2, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachTelNotBetween(String value1, String value2) {
            addCriterion("teach_tel not between", value1, value2, "teachTel");
            return (Criteria) this;
        }

        public Criteria andTeachWechatIsNull() {
            addCriterion("teach_wechat is null");
            return (Criteria) this;
        }

        public Criteria andTeachWechatIsNotNull() {
            addCriterion("teach_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andTeachWechatEqualTo(String value) {
            addCriterion("teach_wechat =", value, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatNotEqualTo(String value) {
            addCriterion("teach_wechat <>", value, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatGreaterThan(String value) {
            addCriterion("teach_wechat >", value, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatGreaterThanOrEqualTo(String value) {
            addCriterion("teach_wechat >=", value, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatLessThan(String value) {
            addCriterion("teach_wechat <", value, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatLessThanOrEqualTo(String value) {
            addCriterion("teach_wechat <=", value, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatLike(String value) {
            addCriterion("teach_wechat like", value, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatNotLike(String value) {
            addCriterion("teach_wechat not like", value, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatIn(List<String> values) {
            addCriterion("teach_wechat in", values, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatNotIn(List<String> values) {
            addCriterion("teach_wechat not in", values, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatBetween(String value1, String value2) {
            addCriterion("teach_wechat between", value1, value2, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachWechatNotBetween(String value1, String value2) {
            addCriterion("teach_wechat not between", value1, value2, "teachWechat");
            return (Criteria) this;
        }

        public Criteria andTeachQqIsNull() {
            addCriterion("teach_qq is null");
            return (Criteria) this;
        }

        public Criteria andTeachQqIsNotNull() {
            addCriterion("teach_qq is not null");
            return (Criteria) this;
        }

        public Criteria andTeachQqEqualTo(String value) {
            addCriterion("teach_qq =", value, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqNotEqualTo(String value) {
            addCriterion("teach_qq <>", value, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqGreaterThan(String value) {
            addCriterion("teach_qq >", value, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqGreaterThanOrEqualTo(String value) {
            addCriterion("teach_qq >=", value, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqLessThan(String value) {
            addCriterion("teach_qq <", value, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqLessThanOrEqualTo(String value) {
            addCriterion("teach_qq <=", value, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqLike(String value) {
            addCriterion("teach_qq like", value, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqNotLike(String value) {
            addCriterion("teach_qq not like", value, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqIn(List<String> values) {
            addCriterion("teach_qq in", values, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqNotIn(List<String> values) {
            addCriterion("teach_qq not in", values, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqBetween(String value1, String value2) {
            addCriterion("teach_qq between", value1, value2, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachQqNotBetween(String value1, String value2) {
            addCriterion("teach_qq not between", value1, value2, "teachQq");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeIsNull() {
            addCriterion("teach_alter_time is null");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeIsNotNull() {
            addCriterion("teach_alter_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeEqualTo(Date value) {
            addCriterion("teach_alter_time =", value, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeNotEqualTo(Date value) {
            addCriterion("teach_alter_time <>", value, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeGreaterThan(Date value) {
            addCriterion("teach_alter_time >", value, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("teach_alter_time >=", value, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeLessThan(Date value) {
            addCriterion("teach_alter_time <", value, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("teach_alter_time <=", value, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeIn(List<Date> values) {
            addCriterion("teach_alter_time in", values, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeNotIn(List<Date> values) {
            addCriterion("teach_alter_time not in", values, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeBetween(Date value1, Date value2) {
            addCriterion("teach_alter_time between", value1, value2, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("teach_alter_time not between", value1, value2, "teachAlterTime");
            return (Criteria) this;
        }

        public Criteria andTeachNull1IsNull() {
            addCriterion("teach_null1 is null");
            return (Criteria) this;
        }

        public Criteria andTeachNull1IsNotNull() {
            addCriterion("teach_null1 is not null");
            return (Criteria) this;
        }

        public Criteria andTeachNull1EqualTo(String value) {
            addCriterion("teach_null1 =", value, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1NotEqualTo(String value) {
            addCriterion("teach_null1 <>", value, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1GreaterThan(String value) {
            addCriterion("teach_null1 >", value, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1GreaterThanOrEqualTo(String value) {
            addCriterion("teach_null1 >=", value, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1LessThan(String value) {
            addCriterion("teach_null1 <", value, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1LessThanOrEqualTo(String value) {
            addCriterion("teach_null1 <=", value, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1Like(String value) {
            addCriterion("teach_null1 like", value, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1NotLike(String value) {
            addCriterion("teach_null1 not like", value, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1In(List<String> values) {
            addCriterion("teach_null1 in", values, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1NotIn(List<String> values) {
            addCriterion("teach_null1 not in", values, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1Between(String value1, String value2) {
            addCriterion("teach_null1 between", value1, value2, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull1NotBetween(String value1, String value2) {
            addCriterion("teach_null1 not between", value1, value2, "teachNull1");
            return (Criteria) this;
        }

        public Criteria andTeachNull2IsNull() {
            addCriterion("teach_null2 is null");
            return (Criteria) this;
        }

        public Criteria andTeachNull2IsNotNull() {
            addCriterion("teach_null2 is not null");
            return (Criteria) this;
        }

        public Criteria andTeachNull2EqualTo(String value) {
            addCriterion("teach_null2 =", value, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2NotEqualTo(String value) {
            addCriterion("teach_null2 <>", value, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2GreaterThan(String value) {
            addCriterion("teach_null2 >", value, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2GreaterThanOrEqualTo(String value) {
            addCriterion("teach_null2 >=", value, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2LessThan(String value) {
            addCriterion("teach_null2 <", value, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2LessThanOrEqualTo(String value) {
            addCriterion("teach_null2 <=", value, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2Like(String value) {
            addCriterion("teach_null2 like", value, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2NotLike(String value) {
            addCriterion("teach_null2 not like", value, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2In(List<String> values) {
            addCriterion("teach_null2 in", values, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2NotIn(List<String> values) {
            addCriterion("teach_null2 not in", values, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2Between(String value1, String value2) {
            addCriterion("teach_null2 between", value1, value2, "teachNull2");
            return (Criteria) this;
        }

        public Criteria andTeachNull2NotBetween(String value1, String value2) {
            addCriterion("teach_null2 not between", value1, value2, "teachNull2");
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