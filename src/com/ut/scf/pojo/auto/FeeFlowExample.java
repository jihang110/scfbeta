package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeeFlowExample {
    /**
     * SCFCLOUD.FEE_FLOW
     */
    protected String orderByClause;

    /**
     * SCFCLOUD.FEE_FLOW
     */
    protected boolean distinct;

    /**
     * SCFCLOUD.FEE_FLOW
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public FeeFlowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-27
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
     * @mbggenerated 2017-06-27
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-27
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * SCFCLOUD.FEE_FLOW 2017-06-27
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

        public Criteria andFeeUidIsNull() {
            addCriterion("FEE_UID is null");
            return (Criteria) this;
        }

        public Criteria andFeeUidIsNotNull() {
            addCriterion("FEE_UID is not null");
            return (Criteria) this;
        }

        public Criteria andFeeUidEqualTo(String value) {
            addCriterion("FEE_UID =", value, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidNotEqualTo(String value) {
            addCriterion("FEE_UID <>", value, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidGreaterThan(String value) {
            addCriterion("FEE_UID >", value, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_UID >=", value, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidLessThan(String value) {
            addCriterion("FEE_UID <", value, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidLessThanOrEqualTo(String value) {
            addCriterion("FEE_UID <=", value, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidLike(String value) {
            addCriterion("FEE_UID like", value, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidNotLike(String value) {
            addCriterion("FEE_UID not like", value, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidIn(List<String> values) {
            addCriterion("FEE_UID in", values, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidNotIn(List<String> values) {
            addCriterion("FEE_UID not in", values, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidBetween(String value1, String value2) {
            addCriterion("FEE_UID between", value1, value2, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeUidNotBetween(String value1, String value2) {
            addCriterion("FEE_UID not between", value1, value2, "feeUid");
            return (Criteria) this;
        }

        public Criteria andFeeDtIsNull() {
            addCriterion("FEE_DT is null");
            return (Criteria) this;
        }

        public Criteria andFeeDtIsNotNull() {
            addCriterion("FEE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andFeeDtEqualTo(Date value) {
            addCriterion("FEE_DT =", value, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtNotEqualTo(Date value) {
            addCriterion("FEE_DT <>", value, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtGreaterThan(Date value) {
            addCriterion("FEE_DT >", value, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtGreaterThanOrEqualTo(Date value) {
            addCriterion("FEE_DT >=", value, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtLessThan(Date value) {
            addCriterion("FEE_DT <", value, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtLessThanOrEqualTo(Date value) {
            addCriterion("FEE_DT <=", value, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtIn(List<Date> values) {
            addCriterion("FEE_DT in", values, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtNotIn(List<Date> values) {
            addCriterion("FEE_DT not in", values, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtBetween(Date value1, Date value2) {
            addCriterion("FEE_DT between", value1, value2, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeDtNotBetween(Date value1, Date value2) {
            addCriterion("FEE_DT not between", value1, value2, "feeDt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNull() {
            addCriterion("FEE_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNotNull() {
            addCriterion("FEE_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtEqualTo(BigDecimal value) {
            addCriterion("FEE_AMT =", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("FEE_AMT <>", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("FEE_AMT >", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_AMT >=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThan(BigDecimal value) {
            addCriterion("FEE_AMT <", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEE_AMT <=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIn(List<BigDecimal> values) {
            addCriterion("FEE_AMT in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("FEE_AMT not in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_AMT between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEE_AMT not between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgIsNull() {
            addCriterion("FEE_PAY_FLG is null");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgIsNotNull() {
            addCriterion("FEE_PAY_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgEqualTo(String value) {
            addCriterion("FEE_PAY_FLG =", value, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgNotEqualTo(String value) {
            addCriterion("FEE_PAY_FLG <>", value, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgGreaterThan(String value) {
            addCriterion("FEE_PAY_FLG >", value, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_PAY_FLG >=", value, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgLessThan(String value) {
            addCriterion("FEE_PAY_FLG <", value, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgLessThanOrEqualTo(String value) {
            addCriterion("FEE_PAY_FLG <=", value, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgLike(String value) {
            addCriterion("FEE_PAY_FLG like", value, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgNotLike(String value) {
            addCriterion("FEE_PAY_FLG not like", value, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgIn(List<String> values) {
            addCriterion("FEE_PAY_FLG in", values, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgNotIn(List<String> values) {
            addCriterion("FEE_PAY_FLG not in", values, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgBetween(String value1, String value2) {
            addCriterion("FEE_PAY_FLG between", value1, value2, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeePayFlgNotBetween(String value1, String value2) {
            addCriterion("FEE_PAY_FLG not between", value1, value2, "feePayFlg");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("FEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("FEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(String value) {
            addCriterion("FEE_TYPE =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(String value) {
            addCriterion("FEE_TYPE <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(String value) {
            addCriterion("FEE_TYPE >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_TYPE >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(String value) {
            addCriterion("FEE_TYPE <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(String value) {
            addCriterion("FEE_TYPE <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLike(String value) {
            addCriterion("FEE_TYPE like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotLike(String value) {
            addCriterion("FEE_TYPE not like", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<String> values) {
            addCriterion("FEE_TYPE in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<String> values) {
            addCriterion("FEE_TYPE not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(String value1, String value2) {
            addCriterion("FEE_TYPE between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(String value1, String value2) {
            addCriterion("FEE_TYPE not between", value1, value2, "feeType");
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
     * SCFCLOUD.FEE_FLOW
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SCFCLOUD.FEE_FLOW 2017-06-27
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