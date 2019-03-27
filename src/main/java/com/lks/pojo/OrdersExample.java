package com.lks.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Integer value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Integer value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Integer value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Integer value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Integer> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Integer> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Integer value1, Integer value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNull() {
            addCriterion("terminal_id is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIsNotNull() {
            addCriterion("terminal_id is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalIdEqualTo(Integer value) {
            addCriterion("terminal_id =", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotEqualTo(Integer value) {
            addCriterion("terminal_id <>", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThan(Integer value) {
            addCriterion("terminal_id >", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminal_id >=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThan(Integer value) {
            addCriterion("terminal_id <", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdLessThanOrEqualTo(Integer value) {
            addCriterion("terminal_id <=", value, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdIn(List<Integer> values) {
            addCriterion("terminal_id in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotIn(List<Integer> values) {
            addCriterion("terminal_id not in", values, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdBetween(Integer value1, Integer value2) {
            addCriterion("terminal_id between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("terminal_id not between", value1, value2, "terminalId");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIsNull() {
            addCriterion("terminal_img is null");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIsNotNull() {
            addCriterion("terminal_img is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalImgEqualTo(String value) {
            addCriterion("terminal_img =", value, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgNotEqualTo(String value) {
            addCriterion("terminal_img <>", value, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgGreaterThan(String value) {
            addCriterion("terminal_img >", value, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_img >=", value, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgLessThan(String value) {
            addCriterion("terminal_img <", value, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgLessThanOrEqualTo(String value) {
            addCriterion("terminal_img <=", value, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgLike(String value) {
            addCriterion("terminal_img like", value, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgNotLike(String value) {
            addCriterion("terminal_img not like", value, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgIn(List<String> values) {
            addCriterion("terminal_img in", values, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgNotIn(List<String> values) {
            addCriterion("terminal_img not in", values, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgBetween(String value1, String value2) {
            addCriterion("terminal_img between", value1, value2, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalImgNotBetween(String value1, String value2) {
            addCriterion("terminal_img not between", value1, value2, "terminalImg");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNull() {
            addCriterion("terminal_name is null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIsNotNull() {
            addCriterion("terminal_name is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalNameEqualTo(String value) {
            addCriterion("terminal_name =", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotEqualTo(String value) {
            addCriterion("terminal_name <>", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThan(String value) {
            addCriterion("terminal_name >", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_name >=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThan(String value) {
            addCriterion("terminal_name <", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLessThanOrEqualTo(String value) {
            addCriterion("terminal_name <=", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameLike(String value) {
            addCriterion("terminal_name like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotLike(String value) {
            addCriterion("terminal_name not like", value, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameIn(List<String> values) {
            addCriterion("terminal_name in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotIn(List<String> values) {
            addCriterion("terminal_name not in", values, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameBetween(String value1, String value2) {
            addCriterion("terminal_name between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNameNotBetween(String value1, String value2) {
            addCriterion("terminal_name not between", value1, value2, "terminalName");
            return (Criteria) this;
        }

        public Criteria andTerminalNoIsNull() {
            addCriterion("terminal_no is null");
            return (Criteria) this;
        }

        public Criteria andTerminalNoIsNotNull() {
            addCriterion("terminal_no is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalNoEqualTo(String value) {
            addCriterion("terminal_no =", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoNotEqualTo(String value) {
            addCriterion("terminal_no <>", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoGreaterThan(String value) {
            addCriterion("terminal_no >", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoGreaterThanOrEqualTo(String value) {
            addCriterion("terminal_no >=", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoLessThan(String value) {
            addCriterion("terminal_no <", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoLessThanOrEqualTo(String value) {
            addCriterion("terminal_no <=", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoLike(String value) {
            addCriterion("terminal_no like", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoNotLike(String value) {
            addCriterion("terminal_no not like", value, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoIn(List<String> values) {
            addCriterion("terminal_no in", values, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoNotIn(List<String> values) {
            addCriterion("terminal_no not in", values, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoBetween(String value1, String value2) {
            addCriterion("terminal_no between", value1, value2, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andTerminalNoNotBetween(String value1, String value2) {
            addCriterion("terminal_no not between", value1, value2, "terminalNo");
            return (Criteria) this;
        }

        public Criteria andDescribeAIsNull() {
            addCriterion("describe_a is null");
            return (Criteria) this;
        }

        public Criteria andDescribeAIsNotNull() {
            addCriterion("describe_a is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeAEqualTo(String value) {
            addCriterion("describe_a =", value, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeANotEqualTo(String value) {
            addCriterion("describe_a <>", value, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeAGreaterThan(String value) {
            addCriterion("describe_a >", value, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeAGreaterThanOrEqualTo(String value) {
            addCriterion("describe_a >=", value, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeALessThan(String value) {
            addCriterion("describe_a <", value, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeALessThanOrEqualTo(String value) {
            addCriterion("describe_a <=", value, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeALike(String value) {
            addCriterion("describe_a like", value, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeANotLike(String value) {
            addCriterion("describe_a not like", value, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeAIn(List<String> values) {
            addCriterion("describe_a in", values, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeANotIn(List<String> values) {
            addCriterion("describe_a not in", values, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeABetween(String value1, String value2) {
            addCriterion("describe_a between", value1, value2, "describeA");
            return (Criteria) this;
        }

        public Criteria andDescribeANotBetween(String value1, String value2) {
            addCriterion("describe_a not between", value1, value2, "describeA");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
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

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Integer value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Integer value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Integer value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Integer value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Integer> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Integer> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeIsNull() {
            addCriterion("payment_fee is null");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeIsNotNull() {
            addCriterion("payment_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeEqualTo(BigDecimal value) {
            addCriterion("payment_fee =", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeNotEqualTo(BigDecimal value) {
            addCriterion("payment_fee <>", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeGreaterThan(BigDecimal value) {
            addCriterion("payment_fee >", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_fee >=", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeLessThan(BigDecimal value) {
            addCriterion("payment_fee <", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_fee <=", value, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeIn(List<BigDecimal> values) {
            addCriterion("payment_fee in", values, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeNotIn(List<BigDecimal> values) {
            addCriterion("payment_fee not in", values, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_fee between", value1, value2, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_fee not between", value1, value2, "paymentFee");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNull() {
            addCriterion("payment_status is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIsNotNull() {
            addCriterion("payment_status is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusEqualTo(Byte value) {
            addCriterion("payment_status =", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotEqualTo(Byte value) {
            addCriterion("payment_status <>", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThan(Byte value) {
            addCriterion("payment_status >", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("payment_status >=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThan(Byte value) {
            addCriterion("payment_status <", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusLessThanOrEqualTo(Byte value) {
            addCriterion("payment_status <=", value, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusIn(List<Byte> values) {
            addCriterion("payment_status in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotIn(List<Byte> values) {
            addCriterion("payment_status not in", values, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusBetween(Byte value1, Byte value2) {
            addCriterion("payment_status between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("payment_status not between", value1, value2, "paymentStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNull() {
            addCriterion("payment_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIsNotNull() {
            addCriterion("payment_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeEqualTo(Date value) {
            addCriterion("payment_time =", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotEqualTo(Date value) {
            addCriterion("payment_time <>", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThan(Date value) {
            addCriterion("payment_time >", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_time >=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThan(Date value) {
            addCriterion("payment_time <", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_time <=", value, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeIn(List<Date> values) {
            addCriterion("payment_time in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotIn(List<Date> values) {
            addCriterion("payment_time not in", values, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeBetween(Date value1, Date value2) {
            addCriterion("payment_time between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andPaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_time not between", value1, value2, "paymentTime");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andAcceptNameIsNull() {
            addCriterion("accept_name is null");
            return (Criteria) this;
        }

        public Criteria andAcceptNameIsNotNull() {
            addCriterion("accept_name is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptNameEqualTo(String value) {
            addCriterion("accept_name =", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameNotEqualTo(String value) {
            addCriterion("accept_name <>", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameGreaterThan(String value) {
            addCriterion("accept_name >", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameGreaterThanOrEqualTo(String value) {
            addCriterion("accept_name >=", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameLessThan(String value) {
            addCriterion("accept_name <", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameLessThanOrEqualTo(String value) {
            addCriterion("accept_name <=", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameLike(String value) {
            addCriterion("accept_name like", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameNotLike(String value) {
            addCriterion("accept_name not like", value, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameIn(List<String> values) {
            addCriterion("accept_name in", values, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameNotIn(List<String> values) {
            addCriterion("accept_name not in", values, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameBetween(String value1, String value2) {
            addCriterion("accept_name between", value1, value2, "acceptName");
            return (Criteria) this;
        }

        public Criteria andAcceptNameNotBetween(String value1, String value2) {
            addCriterion("accept_name not between", value1, value2, "acceptName");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(Byte value) {
            addCriterion("is_invoice =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(Byte value) {
            addCriterion("is_invoice <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(Byte value) {
            addCriterion("is_invoice >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_invoice >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(Byte value) {
            addCriterion("is_invoice <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(Byte value) {
            addCriterion("is_invoice <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<Byte> values) {
            addCriterion("is_invoice in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<Byte> values) {
            addCriterion("is_invoice not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(Byte value1, Byte value2) {
            addCriterion("is_invoice between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_invoice not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesIsNull() {
            addCriterion("invoice_taxes is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesIsNotNull() {
            addCriterion("invoice_taxes is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesEqualTo(BigDecimal value) {
            addCriterion("invoice_taxes =", value, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesNotEqualTo(BigDecimal value) {
            addCriterion("invoice_taxes <>", value, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesGreaterThan(BigDecimal value) {
            addCriterion("invoice_taxes >", value, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_taxes >=", value, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesLessThan(BigDecimal value) {
            addCriterion("invoice_taxes <", value, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invoice_taxes <=", value, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesIn(List<BigDecimal> values) {
            addCriterion("invoice_taxes in", values, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesNotIn(List<BigDecimal> values) {
            addCriterion("invoice_taxes not in", values, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_taxes between", value1, value2, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invoice_taxes not between", value1, value2, "invoiceTaxes");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNull() {
            addCriterion("payable_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIsNotNull() {
            addCriterion("payable_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayableAmountEqualTo(BigDecimal value) {
            addCriterion("payable_amount =", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotEqualTo(BigDecimal value) {
            addCriterion("payable_amount <>", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThan(BigDecimal value) {
            addCriterion("payable_amount >", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount >=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThan(BigDecimal value) {
            addCriterion("payable_amount <", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payable_amount <=", value, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountIn(List<BigDecimal> values) {
            addCriterion("payable_amount in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotIn(List<BigDecimal> values) {
            addCriterion("payable_amount not in", values, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andPayableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payable_amount not between", value1, value2, "payableAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNull() {
            addCriterion("real_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealAmountIsNotNull() {
            addCriterion("real_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmountEqualTo(BigDecimal value) {
            addCriterion("real_amount =", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_amount <>", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThan(BigDecimal value) {
            addCriterion("real_amount >", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount >=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThan(BigDecimal value) {
            addCriterion("real_amount <", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_amount <=", value, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountIn(List<BigDecimal> values) {
            addCriterion("real_amount in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_amount not in", values, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andRealAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_amount not between", value1, value2, "realAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNull() {
            addCriterion("verification_code is null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNotNull() {
            addCriterion("verification_code is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeEqualTo(String value) {
            addCriterion("verification_code =", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotEqualTo(String value) {
            addCriterion("verification_code <>", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThan(String value) {
            addCriterion("verification_code >", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("verification_code >=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThan(String value) {
            addCriterion("verification_code <", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThanOrEqualTo(String value) {
            addCriterion("verification_code <=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLike(String value) {
            addCriterion("verification_code like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotLike(String value) {
            addCriterion("verification_code not like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIn(List<String> values) {
            addCriterion("verification_code in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotIn(List<String> values) {
            addCriterion("verification_code not in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeBetween(String value1, String value2) {
            addCriterion("verification_code between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotBetween(String value1, String value2) {
            addCriterion("verification_code not between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNull() {
            addCriterion("refund_type is null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIsNotNull() {
            addCriterion("refund_type is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTypeEqualTo(Byte value) {
            addCriterion("refund_type =", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotEqualTo(Byte value) {
            addCriterion("refund_type <>", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThan(Byte value) {
            addCriterion("refund_type >", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_type >=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThan(Byte value) {
            addCriterion("refund_type <", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeLessThanOrEqualTo(Byte value) {
            addCriterion("refund_type <=", value, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeIn(List<Byte> values) {
            addCriterion("refund_type in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotIn(List<Byte> values) {
            addCriterion("refund_type not in", values, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeBetween(Byte value1, Byte value2) {
            addCriterion("refund_type between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_type not between", value1, value2, "refundType");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNull() {
            addCriterion("refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIsNotNull() {
            addCriterion("refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTimeEqualTo(Date value) {
            addCriterion("refund_time =", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotEqualTo(Date value) {
            addCriterion("refund_time <>", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThan(Date value) {
            addCriterion("refund_time >", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_time >=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThan(Date value) {
            addCriterion("refund_time <", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_time <=", value, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeIn(List<Date> values) {
            addCriterion("refund_time in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotIn(List<Date> values) {
            addCriterion("refund_time not in", values, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeBetween(Date value1, Date value2) {
            addCriterion("refund_time between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_time not between", value1, value2, "refundTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeIsNull() {
            addCriterion("refund_arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeIsNotNull() {
            addCriterion("refund_arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeEqualTo(Date value) {
            addCriterion("refund_arrival_time =", value, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeNotEqualTo(Date value) {
            addCriterion("refund_arrival_time <>", value, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeGreaterThan(Date value) {
            addCriterion("refund_arrival_time >", value, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_arrival_time >=", value, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeLessThan(Date value) {
            addCriterion("refund_arrival_time <", value, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_arrival_time <=", value, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeIn(List<Date> values) {
            addCriterion("refund_arrival_time in", values, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeNotIn(List<Date> values) {
            addCriterion("refund_arrival_time not in", values, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("refund_arrival_time between", value1, value2, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_arrival_time not between", value1, value2, "refundArrivalTime");
            return (Criteria) this;
        }

        public Criteria andRefundModeIsNull() {
            addCriterion("refund_mode is null");
            return (Criteria) this;
        }

        public Criteria andRefundModeIsNotNull() {
            addCriterion("refund_mode is not null");
            return (Criteria) this;
        }

        public Criteria andRefundModeEqualTo(Byte value) {
            addCriterion("refund_mode =", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeNotEqualTo(Byte value) {
            addCriterion("refund_mode <>", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeGreaterThan(Byte value) {
            addCriterion("refund_mode >", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund_mode >=", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeLessThan(Byte value) {
            addCriterion("refund_mode <", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeLessThanOrEqualTo(Byte value) {
            addCriterion("refund_mode <=", value, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeIn(List<Byte> values) {
            addCriterion("refund_mode in", values, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeNotIn(List<Byte> values) {
            addCriterion("refund_mode not in", values, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeBetween(Byte value1, Byte value2) {
            addCriterion("refund_mode between", value1, value2, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundModeNotBetween(Byte value1, Byte value2) {
            addCriterion("refund_mode not between", value1, value2, "refundMode");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeIsNull() {
            addCriterion("refund_acceptance_time is null");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeIsNotNull() {
            addCriterion("refund_acceptance_time is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeEqualTo(Date value) {
            addCriterion("refund_acceptance_time =", value, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeNotEqualTo(Date value) {
            addCriterion("refund_acceptance_time <>", value, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeGreaterThan(Date value) {
            addCriterion("refund_acceptance_time >", value, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("refund_acceptance_time >=", value, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeLessThan(Date value) {
            addCriterion("refund_acceptance_time <", value, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeLessThanOrEqualTo(Date value) {
            addCriterion("refund_acceptance_time <=", value, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeIn(List<Date> values) {
            addCriterion("refund_acceptance_time in", values, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeNotIn(List<Date> values) {
            addCriterion("refund_acceptance_time not in", values, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeBetween(Date value1, Date value2) {
            addCriterion("refund_acceptance_time between", value1, value2, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAcceptanceTimeNotBetween(Date value1, Date value2) {
            addCriterion("refund_acceptance_time not between", value1, value2, "refundAcceptanceTime");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIsNull() {
            addCriterion("refund_account is null");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIsNotNull() {
            addCriterion("refund_account is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAccountEqualTo(String value) {
            addCriterion("refund_account =", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotEqualTo(String value) {
            addCriterion("refund_account <>", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountGreaterThan(String value) {
            addCriterion("refund_account >", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountGreaterThanOrEqualTo(String value) {
            addCriterion("refund_account >=", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLessThan(String value) {
            addCriterion("refund_account <", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLessThanOrEqualTo(String value) {
            addCriterion("refund_account <=", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountLike(String value) {
            addCriterion("refund_account like", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotLike(String value) {
            addCriterion("refund_account not like", value, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountIn(List<String> values) {
            addCriterion("refund_account in", values, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotIn(List<String> values) {
            addCriterion("refund_account not in", values, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountBetween(String value1, String value2) {
            addCriterion("refund_account between", value1, value2, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andRefundAccountNotBetween(String value1, String value2) {
            addCriterion("refund_account not between", value1, value2, "refundAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdIsNull() {
            addCriterion("customer_redenv_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdIsNotNull() {
            addCriterion("customer_redenv_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdEqualTo(Integer value) {
            addCriterion("customer_redenv_id =", value, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdNotEqualTo(Integer value) {
            addCriterion("customer_redenv_id <>", value, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdGreaterThan(Integer value) {
            addCriterion("customer_redenv_id >", value, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_redenv_id >=", value, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdLessThan(Integer value) {
            addCriterion("customer_redenv_id <", value, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_redenv_id <=", value, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdIn(List<Integer> values) {
            addCriterion("customer_redenv_id in", values, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdNotIn(List<Integer> values) {
            addCriterion("customer_redenv_id not in", values, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_redenv_id between", value1, value2, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andCustomerRedenvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_redenv_id not between", value1, value2, "customerRedenvId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameIsNull() {
            addCriterion("refund_admin_name is null");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameIsNotNull() {
            addCriterion("refund_admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameEqualTo(String value) {
            addCriterion("refund_admin_name =", value, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameNotEqualTo(String value) {
            addCriterion("refund_admin_name <>", value, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameGreaterThan(String value) {
            addCriterion("refund_admin_name >", value, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("refund_admin_name >=", value, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameLessThan(String value) {
            addCriterion("refund_admin_name <", value, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameLessThanOrEqualTo(String value) {
            addCriterion("refund_admin_name <=", value, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameLike(String value) {
            addCriterion("refund_admin_name like", value, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameNotLike(String value) {
            addCriterion("refund_admin_name not like", value, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameIn(List<String> values) {
            addCriterion("refund_admin_name in", values, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameNotIn(List<String> values) {
            addCriterion("refund_admin_name not in", values, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameBetween(String value1, String value2) {
            addCriterion("refund_admin_name between", value1, value2, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminNameNotBetween(String value1, String value2) {
            addCriterion("refund_admin_name not between", value1, value2, "refundAdminName");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdIsNull() {
            addCriterion("refund_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdIsNotNull() {
            addCriterion("refund_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdEqualTo(Integer value) {
            addCriterion("refund_admin_id =", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdNotEqualTo(Integer value) {
            addCriterion("refund_admin_id <>", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdGreaterThan(Integer value) {
            addCriterion("refund_admin_id >", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_admin_id >=", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdLessThan(Integer value) {
            addCriterion("refund_admin_id <", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_admin_id <=", value, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdIn(List<Integer> values) {
            addCriterion("refund_admin_id in", values, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdNotIn(List<Integer> values) {
            addCriterion("refund_admin_id not in", values, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_admin_id between", value1, value2, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_admin_id not between", value1, value2, "refundAdminId");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(BigDecimal value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(BigDecimal value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(BigDecimal value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<BigDecimal> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisIsNull() {
            addCriterion("is_sync_kis is null");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisIsNotNull() {
            addCriterion("is_sync_kis is not null");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisEqualTo(Boolean value) {
            addCriterion("is_sync_kis =", value, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisNotEqualTo(Boolean value) {
            addCriterion("is_sync_kis <>", value, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisGreaterThan(Boolean value) {
            addCriterion("is_sync_kis >", value, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_sync_kis >=", value, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisLessThan(Boolean value) {
            addCriterion("is_sync_kis <", value, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisLessThanOrEqualTo(Boolean value) {
            addCriterion("is_sync_kis <=", value, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisIn(List<Boolean> values) {
            addCriterion("is_sync_kis in", values, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisNotIn(List<Boolean> values) {
            addCriterion("is_sync_kis not in", values, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sync_kis between", value1, value2, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andIsSyncKisNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sync_kis not between", value1, value2, "isSyncKis");
            return (Criteria) this;
        }

        public Criteria andResoureTypeIsNull() {
            addCriterion("resoure_type is null");
            return (Criteria) this;
        }

        public Criteria andResoureTypeIsNotNull() {
            addCriterion("resoure_type is not null");
            return (Criteria) this;
        }

        public Criteria andResoureTypeEqualTo(Short value) {
            addCriterion("resoure_type =", value, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeNotEqualTo(Short value) {
            addCriterion("resoure_type <>", value, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeGreaterThan(Short value) {
            addCriterion("resoure_type >", value, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("resoure_type >=", value, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeLessThan(Short value) {
            addCriterion("resoure_type <", value, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeLessThanOrEqualTo(Short value) {
            addCriterion("resoure_type <=", value, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeIn(List<Short> values) {
            addCriterion("resoure_type in", values, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeNotIn(List<Short> values) {
            addCriterion("resoure_type not in", values, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeBetween(Short value1, Short value2) {
            addCriterion("resoure_type between", value1, value2, "resoureType");
            return (Criteria) this;
        }

        public Criteria andResoureTypeNotBetween(Short value1, Short value2) {
            addCriterion("resoure_type not between", value1, value2, "resoureType");
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