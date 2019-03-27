package com.lks.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TerminalsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TerminalsExample() {
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

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andImgLogoIsNull() {
            addCriterion("img_logo is null");
            return (Criteria) this;
        }

        public Criteria andImgLogoIsNotNull() {
            addCriterion("img_logo is not null");
            return (Criteria) this;
        }

        public Criteria andImgLogoEqualTo(String value) {
            addCriterion("img_logo =", value, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoNotEqualTo(String value) {
            addCriterion("img_logo <>", value, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoGreaterThan(String value) {
            addCriterion("img_logo >", value, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoGreaterThanOrEqualTo(String value) {
            addCriterion("img_logo >=", value, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoLessThan(String value) {
            addCriterion("img_logo <", value, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoLessThanOrEqualTo(String value) {
            addCriterion("img_logo <=", value, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoLike(String value) {
            addCriterion("img_logo like", value, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoNotLike(String value) {
            addCriterion("img_logo not like", value, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoIn(List<String> values) {
            addCriterion("img_logo in", values, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoNotIn(List<String> values) {
            addCriterion("img_logo not in", values, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoBetween(String value1, String value2) {
            addCriterion("img_logo between", value1, value2, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andImgLogoNotBetween(String value1, String value2) {
            addCriterion("img_logo not between", value1, value2, "imgLogo");
            return (Criteria) this;
        }

        public Criteria andStockStatusIsNull() {
            addCriterion("stock_status is null");
            return (Criteria) this;
        }

        public Criteria andStockStatusIsNotNull() {
            addCriterion("stock_status is not null");
            return (Criteria) this;
        }

        public Criteria andStockStatusEqualTo(Boolean value) {
            addCriterion("stock_status =", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotEqualTo(Boolean value) {
            addCriterion("stock_status <>", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusGreaterThan(Boolean value) {
            addCriterion("stock_status >", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stock_status >=", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusLessThan(Boolean value) {
            addCriterion("stock_status <", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("stock_status <=", value, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusIn(List<Boolean> values) {
            addCriterion("stock_status in", values, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotIn(List<Boolean> values) {
            addCriterion("stock_status not in", values, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("stock_status between", value1, value2, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andStockStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stock_status not between", value1, value2, "stockStatus");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("province_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("province_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("province_name =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("province_name <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("province_name >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_name >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("province_name <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("province_name <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("province_name like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("province_name not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("province_name in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("province_name not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("province_name between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("province_name not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("city_name is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("city_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("city_name =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("city_name <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("city_name >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_name >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("city_name <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("city_name <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("city_name like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("city_name not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("city_name in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("city_name not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("city_name between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("city_name not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdIsNull() {
            addCriterion("distrib_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdIsNotNull() {
            addCriterion("distrib_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdEqualTo(Integer value) {
            addCriterion("distrib_user_id =", value, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdNotEqualTo(Integer value) {
            addCriterion("distrib_user_id <>", value, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdGreaterThan(Integer value) {
            addCriterion("distrib_user_id >", value, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("distrib_user_id >=", value, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdLessThan(Integer value) {
            addCriterion("distrib_user_id <", value, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("distrib_user_id <=", value, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdIn(List<Integer> values) {
            addCriterion("distrib_user_id in", values, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdNotIn(List<Integer> values) {
            addCriterion("distrib_user_id not in", values, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdBetween(Integer value1, Integer value2) {
            addCriterion("distrib_user_id between", value1, value2, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andDistribUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("distrib_user_id not between", value1, value2, "distribUserId");
            return (Criteria) this;
        }

        public Criteria andContainerDepthIsNull() {
            addCriterion("container_depth is null");
            return (Criteria) this;
        }

        public Criteria andContainerDepthIsNotNull() {
            addCriterion("container_depth is not null");
            return (Criteria) this;
        }

        public Criteria andContainerDepthEqualTo(Integer value) {
            addCriterion("container_depth =", value, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthNotEqualTo(Integer value) {
            addCriterion("container_depth <>", value, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthGreaterThan(Integer value) {
            addCriterion("container_depth >", value, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthGreaterThanOrEqualTo(Integer value) {
            addCriterion("container_depth >=", value, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthLessThan(Integer value) {
            addCriterion("container_depth <", value, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthLessThanOrEqualTo(Integer value) {
            addCriterion("container_depth <=", value, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthIn(List<Integer> values) {
            addCriterion("container_depth in", values, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthNotIn(List<Integer> values) {
            addCriterion("container_depth not in", values, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthBetween(Integer value1, Integer value2) {
            addCriterion("container_depth between", value1, value2, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andContainerDepthNotBetween(Integer value1, Integer value2) {
            addCriterion("container_depth not between", value1, value2, "containerDepth");
            return (Criteria) this;
        }

        public Criteria andControlTypeIsNull() {
            addCriterion("control_type is null");
            return (Criteria) this;
        }

        public Criteria andControlTypeIsNotNull() {
            addCriterion("control_type is not null");
            return (Criteria) this;
        }

        public Criteria andControlTypeEqualTo(Byte value) {
            addCriterion("control_type =", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotEqualTo(Byte value) {
            addCriterion("control_type <>", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeGreaterThan(Byte value) {
            addCriterion("control_type >", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("control_type >=", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeLessThan(Byte value) {
            addCriterion("control_type <", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeLessThanOrEqualTo(Byte value) {
            addCriterion("control_type <=", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeIn(List<Byte> values) {
            addCriterion("control_type in", values, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotIn(List<Byte> values) {
            addCriterion("control_type not in", values, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeBetween(Byte value1, Byte value2) {
            addCriterion("control_type between", value1, value2, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("control_type not between", value1, value2, "controlType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNull() {
            addCriterion("terminal_type is null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIsNotNull() {
            addCriterion("terminal_type is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeEqualTo(Byte value) {
            addCriterion("terminal_type =", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotEqualTo(Byte value) {
            addCriterion("terminal_type <>", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThan(Byte value) {
            addCriterion("terminal_type >", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("terminal_type >=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThan(Byte value) {
            addCriterion("terminal_type <", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeLessThanOrEqualTo(Byte value) {
            addCriterion("terminal_type <=", value, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeIn(List<Byte> values) {
            addCriterion("terminal_type in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotIn(List<Byte> values) {
            addCriterion("terminal_type not in", values, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeBetween(Byte value1, Byte value2) {
            addCriterion("terminal_type between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andTerminalTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("terminal_type not between", value1, value2, "terminalType");
            return (Criteria) this;
        }

        public Criteria andMakerIsNull() {
            addCriterion("maker is null");
            return (Criteria) this;
        }

        public Criteria andMakerIsNotNull() {
            addCriterion("maker is not null");
            return (Criteria) this;
        }

        public Criteria andMakerEqualTo(String value) {
            addCriterion("maker =", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotEqualTo(String value) {
            addCriterion("maker <>", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThan(String value) {
            addCriterion("maker >", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerGreaterThanOrEqualTo(String value) {
            addCriterion("maker >=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThan(String value) {
            addCriterion("maker <", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLessThanOrEqualTo(String value) {
            addCriterion("maker <=", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerLike(String value) {
            addCriterion("maker like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotLike(String value) {
            addCriterion("maker not like", value, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerIn(List<String> values) {
            addCriterion("maker in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotIn(List<String> values) {
            addCriterion("maker not in", values, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerBetween(String value1, String value2) {
            addCriterion("maker between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andMakerNotBetween(String value1, String value2) {
            addCriterion("maker not between", value1, value2, "maker");
            return (Criteria) this;
        }

        public Criteria andModelNumIsNull() {
            addCriterion("model_num is null");
            return (Criteria) this;
        }

        public Criteria andModelNumIsNotNull() {
            addCriterion("model_num is not null");
            return (Criteria) this;
        }

        public Criteria andModelNumEqualTo(String value) {
            addCriterion("model_num =", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumNotEqualTo(String value) {
            addCriterion("model_num <>", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumGreaterThan(String value) {
            addCriterion("model_num >", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumGreaterThanOrEqualTo(String value) {
            addCriterion("model_num >=", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumLessThan(String value) {
            addCriterion("model_num <", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumLessThanOrEqualTo(String value) {
            addCriterion("model_num <=", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumLike(String value) {
            addCriterion("model_num like", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumNotLike(String value) {
            addCriterion("model_num not like", value, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumIn(List<String> values) {
            addCriterion("model_num in", values, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumNotIn(List<String> values) {
            addCriterion("model_num not in", values, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumBetween(String value1, String value2) {
            addCriterion("model_num between", value1, value2, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelNumNotBetween(String value1, String value2) {
            addCriterion("model_num not between", value1, value2, "modelNum");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andOutCountIsNull() {
            addCriterion("out_count is null");
            return (Criteria) this;
        }

        public Criteria andOutCountIsNotNull() {
            addCriterion("out_count is not null");
            return (Criteria) this;
        }

        public Criteria andOutCountEqualTo(Integer value) {
            addCriterion("out_count =", value, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountNotEqualTo(Integer value) {
            addCriterion("out_count <>", value, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountGreaterThan(Integer value) {
            addCriterion("out_count >", value, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_count >=", value, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountLessThan(Integer value) {
            addCriterion("out_count <", value, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountLessThanOrEqualTo(Integer value) {
            addCriterion("out_count <=", value, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountIn(List<Integer> values) {
            addCriterion("out_count in", values, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountNotIn(List<Integer> values) {
            addCriterion("out_count not in", values, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountBetween(Integer value1, Integer value2) {
            addCriterion("out_count between", value1, value2, "outCount");
            return (Criteria) this;
        }

        public Criteria andOutCountNotBetween(Integer value1, Integer value2) {
            addCriterion("out_count not between", value1, value2, "outCount");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeIsNull() {
            addCriterion("take_out_time is null");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeIsNotNull() {
            addCriterion("take_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeEqualTo(BigDecimal value) {
            addCriterion("take_out_time =", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeNotEqualTo(BigDecimal value) {
            addCriterion("take_out_time <>", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeGreaterThan(BigDecimal value) {
            addCriterion("take_out_time >", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("take_out_time >=", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeLessThan(BigDecimal value) {
            addCriterion("take_out_time <", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("take_out_time <=", value, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeIn(List<BigDecimal> values) {
            addCriterion("take_out_time in", values, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeNotIn(List<BigDecimal> values) {
            addCriterion("take_out_time not in", values, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("take_out_time between", value1, value2, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andTakeOutTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("take_out_time not between", value1, value2, "takeOutTime");
            return (Criteria) this;
        }

        public Criteria andBuyWayIsNull() {
            addCriterion("buy_way is null");
            return (Criteria) this;
        }

        public Criteria andBuyWayIsNotNull() {
            addCriterion("buy_way is not null");
            return (Criteria) this;
        }

        public Criteria andBuyWayEqualTo(Integer value) {
            addCriterion("buy_way =", value, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayNotEqualTo(Integer value) {
            addCriterion("buy_way <>", value, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayGreaterThan(Integer value) {
            addCriterion("buy_way >", value, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_way >=", value, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayLessThan(Integer value) {
            addCriterion("buy_way <", value, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayLessThanOrEqualTo(Integer value) {
            addCriterion("buy_way <=", value, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayIn(List<Integer> values) {
            addCriterion("buy_way in", values, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayNotIn(List<Integer> values) {
            addCriterion("buy_way not in", values, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayBetween(Integer value1, Integer value2) {
            addCriterion("buy_way between", value1, value2, "buyWay");
            return (Criteria) this;
        }

        public Criteria andBuyWayNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_way not between", value1, value2, "buyWay");
            return (Criteria) this;
        }

        public Criteria andContractDateIsNull() {
            addCriterion("contract_date is null");
            return (Criteria) this;
        }

        public Criteria andContractDateIsNotNull() {
            addCriterion("contract_date is not null");
            return (Criteria) this;
        }

        public Criteria andContractDateEqualTo(Date value) {
            addCriterion("contract_date =", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotEqualTo(Date value) {
            addCriterion("contract_date <>", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateGreaterThan(Date value) {
            addCriterion("contract_date >", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_date >=", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateLessThan(Date value) {
            addCriterion("contract_date <", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateLessThanOrEqualTo(Date value) {
            addCriterion("contract_date <=", value, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateIn(List<Date> values) {
            addCriterion("contract_date in", values, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotIn(List<Date> values) {
            addCriterion("contract_date not in", values, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateBetween(Date value1, Date value2) {
            addCriterion("contract_date between", value1, value2, "contractDate");
            return (Criteria) this;
        }

        public Criteria andContractDateNotBetween(Date value1, Date value2) {
            addCriterion("contract_date not between", value1, value2, "contractDate");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(Integer value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(Integer value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(Integer value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(Integer value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<Integer> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<Integer> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(Integer value1, Integer value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineTitleIsNull() {
            addCriterion("line_title is null");
            return (Criteria) this;
        }

        public Criteria andLineTitleIsNotNull() {
            addCriterion("line_title is not null");
            return (Criteria) this;
        }

        public Criteria andLineTitleEqualTo(String value) {
            addCriterion("line_title =", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleNotEqualTo(String value) {
            addCriterion("line_title <>", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleGreaterThan(String value) {
            addCriterion("line_title >", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleGreaterThanOrEqualTo(String value) {
            addCriterion("line_title >=", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleLessThan(String value) {
            addCriterion("line_title <", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleLessThanOrEqualTo(String value) {
            addCriterion("line_title <=", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleLike(String value) {
            addCriterion("line_title like", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleNotLike(String value) {
            addCriterion("line_title not like", value, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleIn(List<String> values) {
            addCriterion("line_title in", values, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleNotIn(List<String> values) {
            addCriterion("line_title not in", values, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleBetween(String value1, String value2) {
            addCriterion("line_title between", value1, value2, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andLineTitleNotBetween(String value1, String value2) {
            addCriterion("line_title not between", value1, value2, "lineTitle");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNull() {
            addCriterion("point_id is null");
            return (Criteria) this;
        }

        public Criteria andPointIdIsNotNull() {
            addCriterion("point_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointIdEqualTo(Integer value) {
            addCriterion("point_id =", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotEqualTo(Integer value) {
            addCriterion("point_id <>", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThan(Integer value) {
            addCriterion("point_id >", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_id >=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThan(Integer value) {
            addCriterion("point_id <", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdLessThanOrEqualTo(Integer value) {
            addCriterion("point_id <=", value, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdIn(List<Integer> values) {
            addCriterion("point_id in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotIn(List<Integer> values) {
            addCriterion("point_id not in", values, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdBetween(Integer value1, Integer value2) {
            addCriterion("point_id between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("point_id not between", value1, value2, "pointId");
            return (Criteria) this;
        }

        public Criteria andPointTitleIsNull() {
            addCriterion("point_title is null");
            return (Criteria) this;
        }

        public Criteria andPointTitleIsNotNull() {
            addCriterion("point_title is not null");
            return (Criteria) this;
        }

        public Criteria andPointTitleEqualTo(String value) {
            addCriterion("point_title =", value, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleNotEqualTo(String value) {
            addCriterion("point_title <>", value, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleGreaterThan(String value) {
            addCriterion("point_title >", value, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleGreaterThanOrEqualTo(String value) {
            addCriterion("point_title >=", value, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleLessThan(String value) {
            addCriterion("point_title <", value, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleLessThanOrEqualTo(String value) {
            addCriterion("point_title <=", value, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleLike(String value) {
            addCriterion("point_title like", value, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleNotLike(String value) {
            addCriterion("point_title not like", value, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleIn(List<String> values) {
            addCriterion("point_title in", values, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleNotIn(List<String> values) {
            addCriterion("point_title not in", values, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleBetween(String value1, String value2) {
            addCriterion("point_title between", value1, value2, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andPointTitleNotBetween(String value1, String value2) {
            addCriterion("point_title not between", value1, value2, "pointTitle");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeIsNull() {
            addCriterion("last_advert_time is null");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeIsNotNull() {
            addCriterion("last_advert_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeEqualTo(Date value) {
            addCriterion("last_advert_time =", value, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeNotEqualTo(Date value) {
            addCriterion("last_advert_time <>", value, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeGreaterThan(Date value) {
            addCriterion("last_advert_time >", value, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_advert_time >=", value, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeLessThan(Date value) {
            addCriterion("last_advert_time <", value, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_advert_time <=", value, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeIn(List<Date> values) {
            addCriterion("last_advert_time in", values, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeNotIn(List<Date> values) {
            addCriterion("last_advert_time not in", values, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeBetween(Date value1, Date value2) {
            addCriterion("last_advert_time between", value1, value2, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andLastAdvertTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_advert_time not between", value1, value2, "lastAdvertTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentIsNull() {
            addCriterion("is_merge_shipment is null");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentIsNotNull() {
            addCriterion("is_merge_shipment is not null");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentEqualTo(Boolean value) {
            addCriterion("is_merge_shipment =", value, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentNotEqualTo(Boolean value) {
            addCriterion("is_merge_shipment <>", value, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentGreaterThan(Boolean value) {
            addCriterion("is_merge_shipment >", value, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_merge_shipment >=", value, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentLessThan(Boolean value) {
            addCriterion("is_merge_shipment <", value, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_merge_shipment <=", value, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentIn(List<Boolean> values) {
            addCriterion("is_merge_shipment in", values, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentNotIn(List<Boolean> values) {
            addCriterion("is_merge_shipment not in", values, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_merge_shipment between", value1, value2, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsMergeShipmentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_merge_shipment not between", value1, value2, "isMergeShipment");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalIsNull() {
            addCriterion("is_sync_terminal is null");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalIsNotNull() {
            addCriterion("is_sync_terminal is not null");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalEqualTo(Boolean value) {
            addCriterion("is_sync_terminal =", value, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalNotEqualTo(Boolean value) {
            addCriterion("is_sync_terminal <>", value, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalGreaterThan(Boolean value) {
            addCriterion("is_sync_terminal >", value, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_sync_terminal >=", value, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalLessThan(Boolean value) {
            addCriterion("is_sync_terminal <", value, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalLessThanOrEqualTo(Boolean value) {
            addCriterion("is_sync_terminal <=", value, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalIn(List<Boolean> values) {
            addCriterion("is_sync_terminal in", values, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalNotIn(List<Boolean> values) {
            addCriterion("is_sync_terminal not in", values, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sync_terminal between", value1, value2, "isSyncTerminal");
            return (Criteria) this;
        }

        public Criteria andIsSyncTerminalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_sync_terminal not between", value1, value2, "isSyncTerminal");
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