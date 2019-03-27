package com.lks.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountDrawalApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountDrawalApplyExample() {
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

        public Criteria andDrawalMeonyIsNull() {
            addCriterion("drawal_meony is null");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyIsNotNull() {
            addCriterion("drawal_meony is not null");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyEqualTo(BigDecimal value) {
            addCriterion("drawal_meony =", value, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyNotEqualTo(BigDecimal value) {
            addCriterion("drawal_meony <>", value, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyGreaterThan(BigDecimal value) {
            addCriterion("drawal_meony >", value, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drawal_meony >=", value, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyLessThan(BigDecimal value) {
            addCriterion("drawal_meony <", value, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drawal_meony <=", value, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyIn(List<BigDecimal> values) {
            addCriterion("drawal_meony in", values, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyNotIn(List<BigDecimal> values) {
            addCriterion("drawal_meony not in", values, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drawal_meony between", value1, value2, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andDrawalMeonyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drawal_meony not between", value1, value2, "drawalMeony");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNull() {
            addCriterion("apply_user_name is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIsNotNull() {
            addCriterion("apply_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameEqualTo(String value) {
            addCriterion("apply_user_name =", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotEqualTo(String value) {
            addCriterion("apply_user_name <>", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThan(String value) {
            addCriterion("apply_user_name >", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_user_name >=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThan(String value) {
            addCriterion("apply_user_name <", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("apply_user_name <=", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameLike(String value) {
            addCriterion("apply_user_name like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotLike(String value) {
            addCriterion("apply_user_name not like", value, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameIn(List<String> values) {
            addCriterion("apply_user_name in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotIn(List<String> values) {
            addCriterion("apply_user_name not in", values, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameBetween(String value1, String value2) {
            addCriterion("apply_user_name between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserNameNotBetween(String value1, String value2) {
            addCriterion("apply_user_name not between", value1, value2, "applyUserName");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNull() {
            addCriterion("apply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIsNotNull() {
            addCriterion("apply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdEqualTo(Integer value) {
            addCriterion("apply_user_id =", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotEqualTo(Integer value) {
            addCriterion("apply_user_id <>", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThan(Integer value) {
            addCriterion("apply_user_id >", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_user_id >=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThan(Integer value) {
            addCriterion("apply_user_id <", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("apply_user_id <=", value, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdIn(List<Integer> values) {
            addCriterion("apply_user_id in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotIn(List<Integer> values) {
            addCriterion("apply_user_id not in", values, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdBetween(Integer value1, Integer value2) {
            addCriterion("apply_user_id between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andApplyUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_user_id not between", value1, value2, "applyUserId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Integer value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Integer value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Integer value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Integer value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Integer value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Integer> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Integer> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Integer value1, Integer value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNull() {
            addCriterion("audit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNotNull() {
            addCriterion("audit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameEqualTo(String value) {
            addCriterion("audit_user_name =", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotEqualTo(String value) {
            addCriterion("audit_user_name <>", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThan(String value) {
            addCriterion("audit_user_name >", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user_name >=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThan(String value) {
            addCriterion("audit_user_name <", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("audit_user_name <=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLike(String value) {
            addCriterion("audit_user_name like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotLike(String value) {
            addCriterion("audit_user_name not like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIn(List<String> values) {
            addCriterion("audit_user_name in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotIn(List<String> values) {
            addCriterion("audit_user_name not in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameBetween(String value1, String value2) {
            addCriterion("audit_user_name between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("audit_user_name not between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNull() {
            addCriterion("audit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNotNull() {
            addCriterion("audit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdEqualTo(Integer value) {
            addCriterion("audit_user_id =", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotEqualTo(Integer value) {
            addCriterion("audit_user_id <>", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThan(Integer value) {
            addCriterion("audit_user_id >", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("audit_user_id >=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThan(Integer value) {
            addCriterion("audit_user_id <", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("audit_user_id <=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIn(List<Integer> values) {
            addCriterion("audit_user_id in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotIn(List<Integer> values) {
            addCriterion("audit_user_id not in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdBetween(Integer value1, Integer value2) {
            addCriterion("audit_user_id between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("audit_user_id not between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
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

        public Criteria andDrawalCardNumberIsNull() {
            addCriterion("drawal_card_number is null");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberIsNotNull() {
            addCriterion("drawal_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberEqualTo(String value) {
            addCriterion("drawal_card_number =", value, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberNotEqualTo(String value) {
            addCriterion("drawal_card_number <>", value, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberGreaterThan(String value) {
            addCriterion("drawal_card_number >", value, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("drawal_card_number >=", value, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberLessThan(String value) {
            addCriterion("drawal_card_number <", value, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberLessThanOrEqualTo(String value) {
            addCriterion("drawal_card_number <=", value, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberLike(String value) {
            addCriterion("drawal_card_number like", value, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberNotLike(String value) {
            addCriterion("drawal_card_number not like", value, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberIn(List<String> values) {
            addCriterion("drawal_card_number in", values, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberNotIn(List<String> values) {
            addCriterion("drawal_card_number not in", values, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberBetween(String value1, String value2) {
            addCriterion("drawal_card_number between", value1, value2, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalCardNumberNotBetween(String value1, String value2) {
            addCriterion("drawal_card_number not between", value1, value2, "drawalCardNumber");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameIsNull() {
            addCriterion("drawal_account_name is null");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameIsNotNull() {
            addCriterion("drawal_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameEqualTo(String value) {
            addCriterion("drawal_account_name =", value, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameNotEqualTo(String value) {
            addCriterion("drawal_account_name <>", value, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameGreaterThan(String value) {
            addCriterion("drawal_account_name >", value, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("drawal_account_name >=", value, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameLessThan(String value) {
            addCriterion("drawal_account_name <", value, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameLessThanOrEqualTo(String value) {
            addCriterion("drawal_account_name <=", value, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameLike(String value) {
            addCriterion("drawal_account_name like", value, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameNotLike(String value) {
            addCriterion("drawal_account_name not like", value, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameIn(List<String> values) {
            addCriterion("drawal_account_name in", values, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameNotIn(List<String> values) {
            addCriterion("drawal_account_name not in", values, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameBetween(String value1, String value2) {
            addCriterion("drawal_account_name between", value1, value2, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountNameNotBetween(String value1, String value2) {
            addCriterion("drawal_account_name not between", value1, value2, "drawalAccountName");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankIsNull() {
            addCriterion("drawal_account_bank is null");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankIsNotNull() {
            addCriterion("drawal_account_bank is not null");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankEqualTo(String value) {
            addCriterion("drawal_account_bank =", value, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankNotEqualTo(String value) {
            addCriterion("drawal_account_bank <>", value, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankGreaterThan(String value) {
            addCriterion("drawal_account_bank >", value, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankGreaterThanOrEqualTo(String value) {
            addCriterion("drawal_account_bank >=", value, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankLessThan(String value) {
            addCriterion("drawal_account_bank <", value, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankLessThanOrEqualTo(String value) {
            addCriterion("drawal_account_bank <=", value, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankLike(String value) {
            addCriterion("drawal_account_bank like", value, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankNotLike(String value) {
            addCriterion("drawal_account_bank not like", value, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankIn(List<String> values) {
            addCriterion("drawal_account_bank in", values, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankNotIn(List<String> values) {
            addCriterion("drawal_account_bank not in", values, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankBetween(String value1, String value2) {
            addCriterion("drawal_account_bank between", value1, value2, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountBankNotBetween(String value1, String value2) {
            addCriterion("drawal_account_bank not between", value1, value2, "drawalAccountBank");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameIsNull() {
            addCriterion("drawal_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameIsNotNull() {
            addCriterion("drawal_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameEqualTo(String value) {
            addCriterion("drawal_bank_name =", value, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameNotEqualTo(String value) {
            addCriterion("drawal_bank_name <>", value, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameGreaterThan(String value) {
            addCriterion("drawal_bank_name >", value, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("drawal_bank_name >=", value, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameLessThan(String value) {
            addCriterion("drawal_bank_name <", value, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameLessThanOrEqualTo(String value) {
            addCriterion("drawal_bank_name <=", value, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameLike(String value) {
            addCriterion("drawal_bank_name like", value, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameNotLike(String value) {
            addCriterion("drawal_bank_name not like", value, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameIn(List<String> values) {
            addCriterion("drawal_bank_name in", values, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameNotIn(List<String> values) {
            addCriterion("drawal_bank_name not in", values, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameBetween(String value1, String value2) {
            addCriterion("drawal_bank_name between", value1, value2, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andDrawalBankNameNotBetween(String value1, String value2) {
            addCriterion("drawal_bank_name not between", value1, value2, "drawalBankName");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeIsNull() {
            addCriterion("drawal_account_type is null");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeIsNotNull() {
            addCriterion("drawal_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeEqualTo(Integer value) {
            addCriterion("drawal_account_type =", value, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeNotEqualTo(Integer value) {
            addCriterion("drawal_account_type <>", value, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeGreaterThan(Integer value) {
            addCriterion("drawal_account_type >", value, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("drawal_account_type >=", value, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeLessThan(Integer value) {
            addCriterion("drawal_account_type <", value, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("drawal_account_type <=", value, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeIn(List<Integer> values) {
            addCriterion("drawal_account_type in", values, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeNotIn(List<Integer> values) {
            addCriterion("drawal_account_type not in", values, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("drawal_account_type between", value1, value2, "drawalAccountType");
            return (Criteria) this;
        }

        public Criteria andDrawalAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("drawal_account_type not between", value1, value2, "drawalAccountType");
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