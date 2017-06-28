package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterestsExample {
    /**
     * SCFCLOUD.INTERESTS
     */
    protected String orderByClause;

    /**
     * SCFCLOUD.INTERESTS
     */
    protected boolean distinct;

    /**
     * SCFCLOUD.INTERESTS
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public InterestsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-26
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * SCFCLOUD.INTERESTS 2017-06-26
     */
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

        public Criteria andRecUidIsNull() {
            addCriterion("REC_UID is null");
            return (Criteria) this;
        }

        public Criteria andRecUidIsNotNull() {
            addCriterion("REC_UID is not null");
            return (Criteria) this;
        }

        public Criteria andRecUidEqualTo(String value) {
            addCriterion("REC_UID =", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotEqualTo(String value) {
            addCriterion("REC_UID <>", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidGreaterThan(String value) {
            addCriterion("REC_UID >", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidGreaterThanOrEqualTo(String value) {
            addCriterion("REC_UID >=", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidLessThan(String value) {
            addCriterion("REC_UID <", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidLessThanOrEqualTo(String value) {
            addCriterion("REC_UID <=", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidLike(String value) {
            addCriterion("REC_UID like", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotLike(String value) {
            addCriterion("REC_UID not like", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidIn(List<String> values) {
            addCriterion("REC_UID in", values, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotIn(List<String> values) {
            addCriterion("REC_UID not in", values, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidBetween(String value1, String value2) {
            addCriterion("REC_UID between", value1, value2, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotBetween(String value1, String value2) {
            addCriterion("REC_UID not between", value1, value2, "recUid");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdIsNull() {
            addCriterion("LOAN_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdIsNotNull() {
            addCriterion("LOAN_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdEqualTo(String value) {
            addCriterion("LOAN_DETAIL_ID =", value, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdNotEqualTo(String value) {
            addCriterion("LOAN_DETAIL_ID <>", value, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdGreaterThan(String value) {
            addCriterion("LOAN_DETAIL_ID >", value, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_DETAIL_ID >=", value, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdLessThan(String value) {
            addCriterion("LOAN_DETAIL_ID <", value, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdLessThanOrEqualTo(String value) {
            addCriterion("LOAN_DETAIL_ID <=", value, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdLike(String value) {
            addCriterion("LOAN_DETAIL_ID like", value, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdNotLike(String value) {
            addCriterion("LOAN_DETAIL_ID not like", value, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdIn(List<String> values) {
            addCriterion("LOAN_DETAIL_ID in", values, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdNotIn(List<String> values) {
            addCriterion("LOAN_DETAIL_ID not in", values, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdBetween(String value1, String value2) {
            addCriterion("LOAN_DETAIL_ID between", value1, value2, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andLoanDetailIdNotBetween(String value1, String value2) {
            addCriterion("LOAN_DETAIL_ID not between", value1, value2, "loanDetailId");
            return (Criteria) this;
        }

        public Criteria andInvcIdIsNull() {
            addCriterion("INVC_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvcIdIsNotNull() {
            addCriterion("INVC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvcIdEqualTo(String value) {
            addCriterion("INVC_ID =", value, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdNotEqualTo(String value) {
            addCriterion("INVC_ID <>", value, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdGreaterThan(String value) {
            addCriterion("INVC_ID >", value, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVC_ID >=", value, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdLessThan(String value) {
            addCriterion("INVC_ID <", value, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdLessThanOrEqualTo(String value) {
            addCriterion("INVC_ID <=", value, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdLike(String value) {
            addCriterion("INVC_ID like", value, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdNotLike(String value) {
            addCriterion("INVC_ID not like", value, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdIn(List<String> values) {
            addCriterion("INVC_ID in", values, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdNotIn(List<String> values) {
            addCriterion("INVC_ID not in", values, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdBetween(String value1, String value2) {
            addCriterion("INVC_ID between", value1, value2, "invcId");
            return (Criteria) this;
        }

        public Criteria andInvcIdNotBetween(String value1, String value2) {
            addCriterion("INVC_ID not between", value1, value2, "invcId");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtIsNull() {
            addCriterion("TTL_INT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtIsNotNull() {
            addCriterion("TTL_INT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtEqualTo(BigDecimal value) {
            addCriterion("TTL_INT_AMT =", value, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtNotEqualTo(BigDecimal value) {
            addCriterion("TTL_INT_AMT <>", value, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtGreaterThan(BigDecimal value) {
            addCriterion("TTL_INT_AMT >", value, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TTL_INT_AMT >=", value, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtLessThan(BigDecimal value) {
            addCriterion("TTL_INT_AMT <", value, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TTL_INT_AMT <=", value, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtIn(List<BigDecimal> values) {
            addCriterion("TTL_INT_AMT in", values, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtNotIn(List<BigDecimal> values) {
            addCriterion("TTL_INT_AMT not in", values, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TTL_INT_AMT between", value1, value2, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andTtlIntAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TTL_INT_AMT not between", value1, value2, "ttlIntAmt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtIsNull() {
            addCriterion("LAST_INT_DT is null");
            return (Criteria) this;
        }

        public Criteria andLastIntDtIsNotNull() {
            addCriterion("LAST_INT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLastIntDtEqualTo(Date value) {
            addCriterion("LAST_INT_DT =", value, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtNotEqualTo(Date value) {
            addCriterion("LAST_INT_DT <>", value, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtGreaterThan(Date value) {
            addCriterion("LAST_INT_DT >", value, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_INT_DT >=", value, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtLessThan(Date value) {
            addCriterion("LAST_INT_DT <", value, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtLessThanOrEqualTo(Date value) {
            addCriterion("LAST_INT_DT <=", value, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtIn(List<Date> values) {
            addCriterion("LAST_INT_DT in", values, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtNotIn(List<Date> values) {
            addCriterion("LAST_INT_DT not in", values, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtBetween(Date value1, Date value2) {
            addCriterion("LAST_INT_DT between", value1, value2, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andLastIntDtNotBetween(Date value1, Date value2) {
            addCriterion("LAST_INT_DT not between", value1, value2, "lastIntDt");
            return (Criteria) this;
        }

        public Criteria andBearerIdIsNull() {
            addCriterion("BEARER_ID is null");
            return (Criteria) this;
        }

        public Criteria andBearerIdIsNotNull() {
            addCriterion("BEARER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBearerIdEqualTo(String value) {
            addCriterion("BEARER_ID =", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdNotEqualTo(String value) {
            addCriterion("BEARER_ID <>", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdGreaterThan(String value) {
            addCriterion("BEARER_ID >", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdGreaterThanOrEqualTo(String value) {
            addCriterion("BEARER_ID >=", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdLessThan(String value) {
            addCriterion("BEARER_ID <", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdLessThanOrEqualTo(String value) {
            addCriterion("BEARER_ID <=", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdLike(String value) {
            addCriterion("BEARER_ID like", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdNotLike(String value) {
            addCriterion("BEARER_ID not like", value, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdIn(List<String> values) {
            addCriterion("BEARER_ID in", values, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdNotIn(List<String> values) {
            addCriterion("BEARER_ID not in", values, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdBetween(String value1, String value2) {
            addCriterion("BEARER_ID between", value1, value2, "bearerId");
            return (Criteria) this;
        }

        public Criteria andBearerIdNotBetween(String value1, String value2) {
            addCriterion("BEARER_ID not between", value1, value2, "bearerId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBusiDtIsNull() {
            addCriterion("BUSI_DT is null");
            return (Criteria) this;
        }

        public Criteria andBusiDtIsNotNull() {
            addCriterion("BUSI_DT is not null");
            return (Criteria) this;
        }

        public Criteria andBusiDtEqualTo(Date value) {
            addCriterion("BUSI_DT =", value, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtNotEqualTo(Date value) {
            addCriterion("BUSI_DT <>", value, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtGreaterThan(Date value) {
            addCriterion("BUSI_DT >", value, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtGreaterThanOrEqualTo(Date value) {
            addCriterion("BUSI_DT >=", value, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtLessThan(Date value) {
            addCriterion("BUSI_DT <", value, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtLessThanOrEqualTo(Date value) {
            addCriterion("BUSI_DT <=", value, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtIn(List<Date> values) {
            addCriterion("BUSI_DT in", values, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtNotIn(List<Date> values) {
            addCriterion("BUSI_DT not in", values, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtBetween(Date value1, Date value2) {
            addCriterion("BUSI_DT between", value1, value2, "busiDt");
            return (Criteria) this;
        }

        public Criteria andBusiDtNotBetween(Date value1, Date value2) {
            addCriterion("BUSI_DT not between", value1, value2, "busiDt");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * SCFCLOUD.INTERESTS
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SCFCLOUD.INTERESTS 2017-06-26
     */
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