package cn.zh.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserPointGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPointGoodsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPointGoodsIdIsNull() {
            addCriterion("POINT_GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdIsNotNull() {
            addCriterion("POINT_GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdEqualTo(String value) {
            addCriterion("POINT_GOODS_ID =", value, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdNotEqualTo(String value) {
            addCriterion("POINT_GOODS_ID <>", value, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdGreaterThan(String value) {
            addCriterion("POINT_GOODS_ID >", value, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("POINT_GOODS_ID >=", value, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdLessThan(String value) {
            addCriterion("POINT_GOODS_ID <", value, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("POINT_GOODS_ID <=", value, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdLike(String value) {
            addCriterion("POINT_GOODS_ID like", value, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdNotLike(String value) {
            addCriterion("POINT_GOODS_ID not like", value, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdIn(List<String> values) {
            addCriterion("POINT_GOODS_ID in", values, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdNotIn(List<String> values) {
            addCriterion("POINT_GOODS_ID not in", values, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdBetween(String value1, String value2) {
            addCriterion("POINT_GOODS_ID between", value1, value2, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPointGoodsIdNotBetween(String value1, String value2) {
            addCriterion("POINT_GOODS_ID not between", value1, value2, "pointGoodsId");
            return (Criteria) this;
        }

        public Criteria andPickTimeIsNull() {
            addCriterion("PICK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPickTimeIsNotNull() {
            addCriterion("PICK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPickTimeEqualTo(Date value) {
            addCriterionForJDBCDate("PICK_TIME =", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("PICK_TIME <>", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("PICK_TIME >", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PICK_TIME >=", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeLessThan(Date value) {
            addCriterionForJDBCDate("PICK_TIME <", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PICK_TIME <=", value, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeIn(List<Date> values) {
            addCriterionForJDBCDate("PICK_TIME in", values, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("PICK_TIME not in", values, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PICK_TIME between", value1, value2, "pickTime");
            return (Criteria) this;
        }

        public Criteria andPickTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PICK_TIME not between", value1, value2, "pickTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNull() {
            addCriterion("BUY_PV is null");
            return (Criteria) this;
        }

        public Criteria andBuyPvIsNotNull() {
            addCriterion("BUY_PV is not null");
            return (Criteria) this;
        }

        public Criteria andBuyPvEqualTo(BigDecimal value) {
            addCriterion("BUY_PV =", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotEqualTo(BigDecimal value) {
            addCriterion("BUY_PV <>", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThan(BigDecimal value) {
            addCriterion("BUY_PV >", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_PV >=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThan(BigDecimal value) {
            addCriterion("BUY_PV <", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_PV <=", value, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvIn(List<BigDecimal> values) {
            addCriterion("BUY_PV in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotIn(List<BigDecimal> values) {
            addCriterion("BUY_PV not in", values, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_PV between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andBuyPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_PV not between", value1, value2, "buyPv");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
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