package cn.zh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andRtitleIsNull() {
            addCriterion("rTitle is null");
            return (Criteria) this;
        }

        public Criteria andRtitleIsNotNull() {
            addCriterion("rTitle is not null");
            return (Criteria) this;
        }

        public Criteria andRtitleEqualTo(String value) {
            addCriterion("rTitle =", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleNotEqualTo(String value) {
            addCriterion("rTitle <>", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleGreaterThan(String value) {
            addCriterion("rTitle >", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleGreaterThanOrEqualTo(String value) {
            addCriterion("rTitle >=", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleLessThan(String value) {
            addCriterion("rTitle <", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleLessThanOrEqualTo(String value) {
            addCriterion("rTitle <=", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleLike(String value) {
            addCriterion("rTitle like", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleNotLike(String value) {
            addCriterion("rTitle not like", value, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleIn(List<String> values) {
            addCriterion("rTitle in", values, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleNotIn(List<String> values) {
            addCriterion("rTitle not in", values, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleBetween(String value1, String value2) {
            addCriterion("rTitle between", value1, value2, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRtitleNotBetween(String value1, String value2) {
            addCriterion("rTitle not between", value1, value2, "rtitle");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNull() {
            addCriterion("rContent is null");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNotNull() {
            addCriterion("rContent is not null");
            return (Criteria) this;
        }

        public Criteria andRcontentEqualTo(String value) {
            addCriterion("rContent =", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotEqualTo(String value) {
            addCriterion("rContent <>", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThan(String value) {
            addCriterion("rContent >", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThanOrEqualTo(String value) {
            addCriterion("rContent >=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThan(String value) {
            addCriterion("rContent <", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThanOrEqualTo(String value) {
            addCriterion("rContent <=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLike(String value) {
            addCriterion("rContent like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotLike(String value) {
            addCriterion("rContent not like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentIn(List<String> values) {
            addCriterion("rContent in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotIn(List<String> values) {
            addCriterion("rContent not in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentBetween(String value1, String value2) {
            addCriterion("rContent between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotBetween(String value1, String value2) {
            addCriterion("rContent not between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRauthorIsNull() {
            addCriterion("rAuthor is null");
            return (Criteria) this;
        }

        public Criteria andRauthorIsNotNull() {
            addCriterion("rAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andRauthorEqualTo(String value) {
            addCriterion("rAuthor =", value, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorNotEqualTo(String value) {
            addCriterion("rAuthor <>", value, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorGreaterThan(String value) {
            addCriterion("rAuthor >", value, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorGreaterThanOrEqualTo(String value) {
            addCriterion("rAuthor >=", value, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorLessThan(String value) {
            addCriterion("rAuthor <", value, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorLessThanOrEqualTo(String value) {
            addCriterion("rAuthor <=", value, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorLike(String value) {
            addCriterion("rAuthor like", value, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorNotLike(String value) {
            addCriterion("rAuthor not like", value, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorIn(List<String> values) {
            addCriterion("rAuthor in", values, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorNotIn(List<String> values) {
            addCriterion("rAuthor not in", values, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorBetween(String value1, String value2) {
            addCriterion("rAuthor between", value1, value2, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRauthorNotBetween(String value1, String value2) {
            addCriterion("rAuthor not between", value1, value2, "rauthor");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("rDate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("rDate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(Date value) {
            addCriterion("rDate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(Date value) {
            addCriterion("rDate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(Date value) {
            addCriterion("rDate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(Date value) {
            addCriterion("rDate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(Date value) {
            addCriterion("rDate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(Date value) {
            addCriterion("rDate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<Date> values) {
            addCriterion("rDate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<Date> values) {
            addCriterion("rDate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(Date value1, Date value2) {
            addCriterion("rDate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(Date value1, Date value2) {
            addCriterion("rDate not between", value1, value2, "rdate");
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