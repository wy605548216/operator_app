package com.lks.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderGoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderGoodExample() {
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

        public Criteria andGoodNoIsNull() {
            addCriterion("good_no is null");
            return (Criteria) this;
        }

        public Criteria andGoodNoIsNotNull() {
            addCriterion("good_no is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNoEqualTo(String value) {
            addCriterion("good_no =", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotEqualTo(String value) {
            addCriterion("good_no <>", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoGreaterThan(String value) {
            addCriterion("good_no >", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoGreaterThanOrEqualTo(String value) {
            addCriterion("good_no >=", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoLessThan(String value) {
            addCriterion("good_no <", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoLessThanOrEqualTo(String value) {
            addCriterion("good_no <=", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoLike(String value) {
            addCriterion("good_no like", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotLike(String value) {
            addCriterion("good_no not like", value, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoIn(List<String> values) {
            addCriterion("good_no in", values, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotIn(List<String> values) {
            addCriterion("good_no not in", values, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoBetween(String value1, String value2) {
            addCriterion("good_no between", value1, value2, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodNoNotBetween(String value1, String value2) {
            addCriterion("good_no not between", value1, value2, "goodNo");
            return (Criteria) this;
        }

        public Criteria andGoodTitleIsNull() {
            addCriterion("good_title is null");
            return (Criteria) this;
        }

        public Criteria andGoodTitleIsNotNull() {
            addCriterion("good_title is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTitleEqualTo(String value) {
            addCriterion("good_title =", value, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleNotEqualTo(String value) {
            addCriterion("good_title <>", value, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleGreaterThan(String value) {
            addCriterion("good_title >", value, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleGreaterThanOrEqualTo(String value) {
            addCriterion("good_title >=", value, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleLessThan(String value) {
            addCriterion("good_title <", value, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleLessThanOrEqualTo(String value) {
            addCriterion("good_title <=", value, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleLike(String value) {
            addCriterion("good_title like", value, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleNotLike(String value) {
            addCriterion("good_title not like", value, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleIn(List<String> values) {
            addCriterion("good_title in", values, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleNotIn(List<String> values) {
            addCriterion("good_title not in", values, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleBetween(String value1, String value2) {
            addCriterion("good_title between", value1, value2, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andGoodTitleNotBetween(String value1, String value2) {
            addCriterion("good_title not between", value1, value2, "goodTitle");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("good_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("good_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(BigDecimal value) {
            addCriterion("good_price =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(BigDecimal value) {
            addCriterion("good_price <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(BigDecimal value) {
            addCriterion("good_price >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("good_price >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(BigDecimal value) {
            addCriterion("good_price <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("good_price <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<BigDecimal> values) {
            addCriterion("good_price in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<BigDecimal> values) {
            addCriterion("good_price not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_price between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("good_price not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNull() {
            addCriterion("real_price is null");
            return (Criteria) this;
        }

        public Criteria andRealPriceIsNotNull() {
            addCriterion("real_price is not null");
            return (Criteria) this;
        }

        public Criteria andRealPriceEqualTo(BigDecimal value) {
            addCriterion("real_price =", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotEqualTo(BigDecimal value) {
            addCriterion("real_price <>", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThan(BigDecimal value) {
            addCriterion("real_price >", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_price >=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThan(BigDecimal value) {
            addCriterion("real_price <", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_price <=", value, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceIn(List<BigDecimal> values) {
            addCriterion("real_price in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotIn(List<BigDecimal> values) {
            addCriterion("real_price not in", values, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_price between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andRealPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_price not between", value1, value2, "realPrice");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andAisleNoIsNull() {
            addCriterion("aisle_no is null");
            return (Criteria) this;
        }

        public Criteria andAisleNoIsNotNull() {
            addCriterion("aisle_no is not null");
            return (Criteria) this;
        }

        public Criteria andAisleNoEqualTo(Integer value) {
            addCriterion("aisle_no =", value, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoNotEqualTo(Integer value) {
            addCriterion("aisle_no <>", value, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoGreaterThan(Integer value) {
            addCriterion("aisle_no >", value, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("aisle_no >=", value, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoLessThan(Integer value) {
            addCriterion("aisle_no <", value, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoLessThanOrEqualTo(Integer value) {
            addCriterion("aisle_no <=", value, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoIn(List<Integer> values) {
            addCriterion("aisle_no in", values, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoNotIn(List<Integer> values) {
            addCriterion("aisle_no not in", values, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoBetween(Integer value1, Integer value2) {
            addCriterion("aisle_no between", value1, value2, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andAisleNoNotBetween(Integer value1, Integer value2) {
            addCriterion("aisle_no not between", value1, value2, "aisleNo");
            return (Criteria) this;
        }

        public Criteria andContainerIdIsNull() {
            addCriterion("container_id is null");
            return (Criteria) this;
        }

        public Criteria andContainerIdIsNotNull() {
            addCriterion("container_id is not null");
            return (Criteria) this;
        }

        public Criteria andContainerIdEqualTo(Integer value) {
            addCriterion("container_id =", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotEqualTo(Integer value) {
            addCriterion("container_id <>", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdGreaterThan(Integer value) {
            addCriterion("container_id >", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("container_id >=", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLessThan(Integer value) {
            addCriterion("container_id <", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdLessThanOrEqualTo(Integer value) {
            addCriterion("container_id <=", value, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdIn(List<Integer> values) {
            addCriterion("container_id in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotIn(List<Integer> values) {
            addCriterion("container_id not in", values, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdBetween(Integer value1, Integer value2) {
            addCriterion("container_id between", value1, value2, "containerId");
            return (Criteria) this;
        }

        public Criteria andContainerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("container_id not between", value1, value2, "containerId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNull() {
            addCriterion("promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNotNull() {
            addCriterion("promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeEqualTo(Byte value) {
            addCriterion("promotion_type =", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotEqualTo(Byte value) {
            addCriterion("promotion_type <>", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThan(Byte value) {
            addCriterion("promotion_type >", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("promotion_type >=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThan(Byte value) {
            addCriterion("promotion_type <", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThanOrEqualTo(Byte value) {
            addCriterion("promotion_type <=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIn(List<Byte> values) {
            addCriterion("promotion_type in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotIn(List<Byte> values) {
            addCriterion("promotion_type not in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeBetween(Byte value1, Byte value2) {
            addCriterion("promotion_type between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("promotion_type not between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdIsNull() {
            addCriterion("terminal_cabinet_id is null");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdIsNotNull() {
            addCriterion("terminal_cabinet_id is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdEqualTo(Integer value) {
            addCriterion("terminal_cabinet_id =", value, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdNotEqualTo(Integer value) {
            addCriterion("terminal_cabinet_id <>", value, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdGreaterThan(Integer value) {
            addCriterion("terminal_cabinet_id >", value, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("terminal_cabinet_id >=", value, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdLessThan(Integer value) {
            addCriterion("terminal_cabinet_id <", value, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdLessThanOrEqualTo(Integer value) {
            addCriterion("terminal_cabinet_id <=", value, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdIn(List<Integer> values) {
            addCriterion("terminal_cabinet_id in", values, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdNotIn(List<Integer> values) {
            addCriterion("terminal_cabinet_id not in", values, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdBetween(Integer value1, Integer value2) {
            addCriterion("terminal_cabinet_id between", value1, value2, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andTerminalCabinetIdNotBetween(Integer value1, Integer value2) {
            addCriterion("terminal_cabinet_id not between", value1, value2, "terminalCabinetId");
            return (Criteria) this;
        }

        public Criteria andCabNoIsNull() {
            addCriterion("cab_no is null");
            return (Criteria) this;
        }

        public Criteria andCabNoIsNotNull() {
            addCriterion("cab_no is not null");
            return (Criteria) this;
        }

        public Criteria andCabNoEqualTo(Integer value) {
            addCriterion("cab_no =", value, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoNotEqualTo(Integer value) {
            addCriterion("cab_no <>", value, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoGreaterThan(Integer value) {
            addCriterion("cab_no >", value, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cab_no >=", value, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoLessThan(Integer value) {
            addCriterion("cab_no <", value, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoLessThanOrEqualTo(Integer value) {
            addCriterion("cab_no <=", value, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoIn(List<Integer> values) {
            addCriterion("cab_no in", values, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoNotIn(List<Integer> values) {
            addCriterion("cab_no not in", values, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoBetween(Integer value1, Integer value2) {
            addCriterion("cab_no between", value1, value2, "cabNo");
            return (Criteria) this;
        }

        public Criteria andCabNoNotBetween(Integer value1, Integer value2) {
            addCriterion("cab_no not between", value1, value2, "cabNo");
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

        public Criteria andDisAmountIsNull() {
            addCriterion("dis_amount is null");
            return (Criteria) this;
        }

        public Criteria andDisAmountIsNotNull() {
            addCriterion("dis_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDisAmountEqualTo(BigDecimal value) {
            addCriterion("dis_amount =", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountNotEqualTo(BigDecimal value) {
            addCriterion("dis_amount <>", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountGreaterThan(BigDecimal value) {
            addCriterion("dis_amount >", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dis_amount >=", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountLessThan(BigDecimal value) {
            addCriterion("dis_amount <", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dis_amount <=", value, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountIn(List<BigDecimal> values) {
            addCriterion("dis_amount in", values, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountNotIn(List<BigDecimal> values) {
            addCriterion("dis_amount not in", values, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dis_amount between", value1, value2, "disAmount");
            return (Criteria) this;
        }

        public Criteria andDisAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dis_amount not between", value1, value2, "disAmount");
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