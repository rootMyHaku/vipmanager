package cn.zh.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoExample() {
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

        public Criteria andListIdIsNull() {
            addCriterion("LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andListIdIsNotNull() {
            addCriterion("LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andListIdEqualTo(String value) {
            addCriterion("LIST_ID =", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotEqualTo(String value) {
            addCriterion("LIST_ID <>", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThan(String value) {
            addCriterion("LIST_ID >", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdGreaterThanOrEqualTo(String value) {
            addCriterion("LIST_ID >=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThan(String value) {
            addCriterion("LIST_ID <", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLessThanOrEqualTo(String value) {
            addCriterion("LIST_ID <=", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdLike(String value) {
            addCriterion("LIST_ID like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotLike(String value) {
            addCriterion("LIST_ID not like", value, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdIn(List<String> values) {
            addCriterion("LIST_ID in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotIn(List<String> values) {
            addCriterion("LIST_ID not in", values, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdBetween(String value1, String value2) {
            addCriterion("LIST_ID between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andListIdNotBetween(String value1, String value2) {
            addCriterion("LIST_ID not between", value1, value2, "listId");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("ORDER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("ORDER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_TIME =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_TIME <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ORDER_TIME >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_TIME >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterionForJDBCDate("ORDER_TIME <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ORDER_TIME <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ORDER_TIME in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ORDER_TIME not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ORDER_TIME between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ORDER_TIME not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("ORDER_SN is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("ORDER_SN is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("ORDER_SN =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("ORDER_SN <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("ORDER_SN >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SN >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("ORDER_SN <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SN <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("ORDER_SN like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("ORDER_SN not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("ORDER_SN in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("ORDER_SN not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("ORDER_SN between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("ORDER_SN not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andPickUserIdIsNull() {
            addCriterion("PICK_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPickUserIdIsNotNull() {
            addCriterion("PICK_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPickUserIdEqualTo(String value) {
            addCriterion("PICK_USER_ID =", value, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdNotEqualTo(String value) {
            addCriterion("PICK_USER_ID <>", value, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdGreaterThan(String value) {
            addCriterion("PICK_USER_ID >", value, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("PICK_USER_ID >=", value, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdLessThan(String value) {
            addCriterion("PICK_USER_ID <", value, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdLessThanOrEqualTo(String value) {
            addCriterion("PICK_USER_ID <=", value, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdLike(String value) {
            addCriterion("PICK_USER_ID like", value, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdNotLike(String value) {
            addCriterion("PICK_USER_ID not like", value, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdIn(List<String> values) {
            addCriterion("PICK_USER_ID in", values, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdNotIn(List<String> values) {
            addCriterion("PICK_USER_ID not in", values, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdBetween(String value1, String value2) {
            addCriterion("PICK_USER_ID between", value1, value2, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andPickUserIdNotBetween(String value1, String value2) {
            addCriterion("PICK_USER_ID not between", value1, value2, "pickUserId");
            return (Criteria) this;
        }

        public Criteria andRepeatPvIsNull() {
            addCriterion("REPEAT_PV is null");
            return (Criteria) this;
        }

        public Criteria andRepeatPvIsNotNull() {
            addCriterion("REPEAT_PV is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatPvEqualTo(BigDecimal value) {
            addCriterion("REPEAT_PV =", value, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvNotEqualTo(BigDecimal value) {
            addCriterion("REPEAT_PV <>", value, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvGreaterThan(BigDecimal value) {
            addCriterion("REPEAT_PV >", value, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_PV >=", value, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvLessThan(BigDecimal value) {
            addCriterion("REPEAT_PV <", value, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPEAT_PV <=", value, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvIn(List<BigDecimal> values) {
            addCriterion("REPEAT_PV in", values, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvNotIn(List<BigDecimal> values) {
            addCriterion("REPEAT_PV not in", values, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_PV between", value1, value2, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andRepeatPvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPEAT_PV not between", value1, value2, "repeatPv");
            return (Criteria) this;
        }

        public Criteria andBasePvIsNull() {
            addCriterion("BASE_PV is null");
            return (Criteria) this;
        }

        public Criteria andBasePvIsNotNull() {
            addCriterion("BASE_PV is not null");
            return (Criteria) this;
        }

        public Criteria andBasePvEqualTo(BigDecimal value) {
            addCriterion("BASE_PV =", value, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvNotEqualTo(BigDecimal value) {
            addCriterion("BASE_PV <>", value, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvGreaterThan(BigDecimal value) {
            addCriterion("BASE_PV >", value, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_PV >=", value, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvLessThan(BigDecimal value) {
            addCriterion("BASE_PV <", value, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_PV <=", value, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvIn(List<BigDecimal> values) {
            addCriterion("BASE_PV in", values, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvNotIn(List<BigDecimal> values) {
            addCriterion("BASE_PV not in", values, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_PV between", value1, value2, "basePv");
            return (Criteria) this;
        }

        public Criteria andBasePvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_PV not between", value1, value2, "basePv");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("SERVICE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("SERVICE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(BigDecimal value) {
            addCriterion("SERVICE_FEE =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("SERVICE_FEE <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("SERVICE_FEE >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICE_FEE >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(BigDecimal value) {
            addCriterion("SERVICE_FEE <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SERVICE_FEE <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<BigDecimal> values) {
            addCriterion("SERVICE_FEE in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("SERVICE_FEE not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICE_FEE between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SERVICE_FEE not between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andShipFreIsNull() {
            addCriterion("SHIP_FRE is null");
            return (Criteria) this;
        }

        public Criteria andShipFreIsNotNull() {
            addCriterion("SHIP_FRE is not null");
            return (Criteria) this;
        }

        public Criteria andShipFreEqualTo(BigDecimal value) {
            addCriterion("SHIP_FRE =", value, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreNotEqualTo(BigDecimal value) {
            addCriterion("SHIP_FRE <>", value, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreGreaterThan(BigDecimal value) {
            addCriterion("SHIP_FRE >", value, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIP_FRE >=", value, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreLessThan(BigDecimal value) {
            addCriterion("SHIP_FRE <", value, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHIP_FRE <=", value, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreIn(List<BigDecimal> values) {
            addCriterion("SHIP_FRE in", values, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreNotIn(List<BigDecimal> values) {
            addCriterion("SHIP_FRE not in", values, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIP_FRE between", value1, value2, "shipFre");
            return (Criteria) this;
        }

        public Criteria andShipFreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHIP_FRE not between", value1, value2, "shipFre");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("USER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("USER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("USER_ADDRESS =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("USER_ADDRESS <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("USER_ADDRESS >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ADDRESS >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("USER_ADDRESS <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("USER_ADDRESS <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("USER_ADDRESS like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("USER_ADDRESS not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("USER_ADDRESS in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("USER_ADDRESS not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("USER_ADDRESS between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("USER_ADDRESS not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andStatIsNull() {
            addCriterion("STAT is null");
            return (Criteria) this;
        }

        public Criteria andStatIsNotNull() {
            addCriterion("STAT is not null");
            return (Criteria) this;
        }

        public Criteria andStatEqualTo(Integer value) {
            addCriterion("STAT =", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotEqualTo(Integer value) {
            addCriterion("STAT <>", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThan(Integer value) {
            addCriterion("STAT >", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatGreaterThanOrEqualTo(Integer value) {
            addCriterion("STAT >=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThan(Integer value) {
            addCriterion("STAT <", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatLessThanOrEqualTo(Integer value) {
            addCriterion("STAT <=", value, "stat");
            return (Criteria) this;
        }

        public Criteria andStatIn(List<Integer> values) {
            addCriterion("STAT in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotIn(List<Integer> values) {
            addCriterion("STAT not in", values, "stat");
            return (Criteria) this;
        }

        public Criteria andStatBetween(Integer value1, Integer value2) {
            addCriterion("STAT between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andStatNotBetween(Integer value1, Integer value2) {
            addCriterion("STAT not between", value1, value2, "stat");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNull() {
            addCriterion("SHIP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNotNull() {
            addCriterion("SHIP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShipTypeEqualTo(String value) {
            addCriterion("SHIP_TYPE =", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotEqualTo(String value) {
            addCriterion("SHIP_TYPE <>", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThan(String value) {
            addCriterion("SHIP_TYPE >", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_TYPE >=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThan(String value) {
            addCriterion("SHIP_TYPE <", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThanOrEqualTo(String value) {
            addCriterion("SHIP_TYPE <=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLike(String value) {
            addCriterion("SHIP_TYPE like", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotLike(String value) {
            addCriterion("SHIP_TYPE not like", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeIn(List<String> values) {
            addCriterion("SHIP_TYPE in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotIn(List<String> values) {
            addCriterion("SHIP_TYPE not in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeBetween(String value1, String value2) {
            addCriterion("SHIP_TYPE between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotBetween(String value1, String value2) {
            addCriterion("SHIP_TYPE not between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipNumIsNull() {
            addCriterion("SHIP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andShipNumIsNotNull() {
            addCriterion("SHIP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andShipNumEqualTo(String value) {
            addCriterion("SHIP_NUM =", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumNotEqualTo(String value) {
            addCriterion("SHIP_NUM <>", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumGreaterThan(String value) {
            addCriterion("SHIP_NUM >", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_NUM >=", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumLessThan(String value) {
            addCriterion("SHIP_NUM <", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumLessThanOrEqualTo(String value) {
            addCriterion("SHIP_NUM <=", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumLike(String value) {
            addCriterion("SHIP_NUM like", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumNotLike(String value) {
            addCriterion("SHIP_NUM not like", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumIn(List<String> values) {
            addCriterion("SHIP_NUM in", values, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumNotIn(List<String> values) {
            addCriterion("SHIP_NUM not in", values, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumBetween(String value1, String value2) {
            addCriterion("SHIP_NUM between", value1, value2, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumNotBetween(String value1, String value2) {
            addCriterion("SHIP_NUM not between", value1, value2, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNull() {
            addCriterion("SHIP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNotNull() {
            addCriterion("SHIP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andShipTimeEqualTo(Date value) {
            addCriterionForJDBCDate("SHIP_TIME =", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("SHIP_TIME <>", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("SHIP_TIME >", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHIP_TIME >=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThan(Date value) {
            addCriterionForJDBCDate("SHIP_TIME <", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SHIP_TIME <=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIn(List<Date> values) {
            addCriterionForJDBCDate("SHIP_TIME in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("SHIP_TIME not in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHIP_TIME between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SHIP_TIME not between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("RECEIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("RECEIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("RECEIVE_TIME =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("RECEIVE_TIME <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("RECEIVE_TIME >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECEIVE_TIME >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterionForJDBCDate("RECEIVE_TIME <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECEIVE_TIME <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("RECEIVE_TIME in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("RECEIVE_TIME not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECEIVE_TIME between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECEIVE_TIME not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andShipNoteIsNull() {
            addCriterion("SHIP_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andShipNoteIsNotNull() {
            addCriterion("SHIP_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andShipNoteEqualTo(String value) {
            addCriterion("SHIP_NOTE =", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotEqualTo(String value) {
            addCriterion("SHIP_NOTE <>", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteGreaterThan(String value) {
            addCriterion("SHIP_NOTE >", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_NOTE >=", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLessThan(String value) {
            addCriterion("SHIP_NOTE <", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLessThanOrEqualTo(String value) {
            addCriterion("SHIP_NOTE <=", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteLike(String value) {
            addCriterion("SHIP_NOTE like", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotLike(String value) {
            addCriterion("SHIP_NOTE not like", value, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteIn(List<String> values) {
            addCriterion("SHIP_NOTE in", values, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotIn(List<String> values) {
            addCriterion("SHIP_NOTE not in", values, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteBetween(String value1, String value2) {
            addCriterion("SHIP_NOTE between", value1, value2, "shipNote");
            return (Criteria) this;
        }

        public Criteria andShipNoteNotBetween(String value1, String value2) {
            addCriterion("SHIP_NOTE not between", value1, value2, "shipNote");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdIsNull() {
            addCriterion("buy_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdIsNotNull() {
            addCriterion("buy_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdEqualTo(String value) {
            addCriterion("buy_user_id =", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotEqualTo(String value) {
            addCriterion("buy_user_id <>", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdGreaterThan(String value) {
            addCriterion("buy_user_id >", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("buy_user_id >=", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdLessThan(String value) {
            addCriterion("buy_user_id <", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdLessThanOrEqualTo(String value) {
            addCriterion("buy_user_id <=", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdLike(String value) {
            addCriterion("buy_user_id like", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotLike(String value) {
            addCriterion("buy_user_id not like", value, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdIn(List<String> values) {
            addCriterion("buy_user_id in", values, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotIn(List<String> values) {
            addCriterion("buy_user_id not in", values, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdBetween(String value1, String value2) {
            addCriterion("buy_user_id between", value1, value2, "buyUserId");
            return (Criteria) this;
        }

        public Criteria andBuyUserIdNotBetween(String value1, String value2) {
            addCriterion("buy_user_id not between", value1, value2, "buyUserId");
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