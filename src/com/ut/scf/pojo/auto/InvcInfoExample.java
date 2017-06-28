package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvcInfoExample {
    /**
     * SCFCLOUD.INVC_INFO
     */
    protected String orderByClause;

    /**
     * SCFCLOUD.INVC_INFO
     */
    protected boolean distinct;

    /**
     * SCFCLOUD.INVC_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public InvcInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-15
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
     * @mbggenerated 2017-06-15
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * SCFCLOUD.INVC_INFO 2017-06-15
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

        public Criteria andRegBtcIdIsNull() {
            addCriterion("REG_BTC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdIsNotNull() {
            addCriterion("REG_BTC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdEqualTo(String value) {
            addCriterion("REG_BTC_ID =", value, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdNotEqualTo(String value) {
            addCriterion("REG_BTC_ID <>", value, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdGreaterThan(String value) {
            addCriterion("REG_BTC_ID >", value, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdGreaterThanOrEqualTo(String value) {
            addCriterion("REG_BTC_ID >=", value, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdLessThan(String value) {
            addCriterion("REG_BTC_ID <", value, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdLessThanOrEqualTo(String value) {
            addCriterion("REG_BTC_ID <=", value, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdLike(String value) {
            addCriterion("REG_BTC_ID like", value, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdNotLike(String value) {
            addCriterion("REG_BTC_ID not like", value, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdIn(List<String> values) {
            addCriterion("REG_BTC_ID in", values, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdNotIn(List<String> values) {
            addCriterion("REG_BTC_ID not in", values, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdBetween(String value1, String value2) {
            addCriterion("REG_BTC_ID between", value1, value2, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andRegBtcIdNotBetween(String value1, String value2) {
            addCriterion("REG_BTC_ID not between", value1, value2, "regBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdIsNull() {
            addCriterion("CNF_BTC_ID is null");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdIsNotNull() {
            addCriterion("CNF_BTC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdEqualTo(String value) {
            addCriterion("CNF_BTC_ID =", value, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdNotEqualTo(String value) {
            addCriterion("CNF_BTC_ID <>", value, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdGreaterThan(String value) {
            addCriterion("CNF_BTC_ID >", value, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdGreaterThanOrEqualTo(String value) {
            addCriterion("CNF_BTC_ID >=", value, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdLessThan(String value) {
            addCriterion("CNF_BTC_ID <", value, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdLessThanOrEqualTo(String value) {
            addCriterion("CNF_BTC_ID <=", value, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdLike(String value) {
            addCriterion("CNF_BTC_ID like", value, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdNotLike(String value) {
            addCriterion("CNF_BTC_ID not like", value, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdIn(List<String> values) {
            addCriterion("CNF_BTC_ID in", values, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdNotIn(List<String> values) {
            addCriterion("CNF_BTC_ID not in", values, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdBetween(String value1, String value2) {
            addCriterion("CNF_BTC_ID between", value1, value2, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andCnfBtcIdNotBetween(String value1, String value2) {
            addCriterion("CNF_BTC_ID not between", value1, value2, "cnfBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdIsNull() {
            addCriterion("TRANS_BTC_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdIsNotNull() {
            addCriterion("TRANS_BTC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdEqualTo(String value) {
            addCriterion("TRANS_BTC_ID =", value, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdNotEqualTo(String value) {
            addCriterion("TRANS_BTC_ID <>", value, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdGreaterThan(String value) {
            addCriterion("TRANS_BTC_ID >", value, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_BTC_ID >=", value, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdLessThan(String value) {
            addCriterion("TRANS_BTC_ID <", value, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdLessThanOrEqualTo(String value) {
            addCriterion("TRANS_BTC_ID <=", value, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdLike(String value) {
            addCriterion("TRANS_BTC_ID like", value, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdNotLike(String value) {
            addCriterion("TRANS_BTC_ID not like", value, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdIn(List<String> values) {
            addCriterion("TRANS_BTC_ID in", values, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdNotIn(List<String> values) {
            addCriterion("TRANS_BTC_ID not in", values, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdBetween(String value1, String value2) {
            addCriterion("TRANS_BTC_ID between", value1, value2, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andTransBtcIdNotBetween(String value1, String value2) {
            addCriterion("TRANS_BTC_ID not between", value1, value2, "transBtcId");
            return (Criteria) this;
        }

        public Criteria andInvcNoIsNull() {
            addCriterion("INVC_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvcNoIsNotNull() {
            addCriterion("INVC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvcNoEqualTo(String value) {
            addCriterion("INVC_NO =", value, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoNotEqualTo(String value) {
            addCriterion("INVC_NO <>", value, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoGreaterThan(String value) {
            addCriterion("INVC_NO >", value, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVC_NO >=", value, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoLessThan(String value) {
            addCriterion("INVC_NO <", value, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoLessThanOrEqualTo(String value) {
            addCriterion("INVC_NO <=", value, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoLike(String value) {
            addCriterion("INVC_NO like", value, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoNotLike(String value) {
            addCriterion("INVC_NO not like", value, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoIn(List<String> values) {
            addCriterion("INVC_NO in", values, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoNotIn(List<String> values) {
            addCriterion("INVC_NO not in", values, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoBetween(String value1, String value2) {
            addCriterion("INVC_NO between", value1, value2, "invcNo");
            return (Criteria) this;
        }

        public Criteria andInvcNoNotBetween(String value1, String value2) {
            addCriterion("INVC_NO not between", value1, value2, "invcNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoIsNull() {
            addCriterion("CNTRCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCntrctNoIsNotNull() {
            addCriterion("CNTRCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCntrctNoEqualTo(String value) {
            addCriterion("CNTRCT_NO =", value, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoNotEqualTo(String value) {
            addCriterion("CNTRCT_NO <>", value, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoGreaterThan(String value) {
            addCriterion("CNTRCT_NO >", value, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoGreaterThanOrEqualTo(String value) {
            addCriterion("CNTRCT_NO >=", value, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoLessThan(String value) {
            addCriterion("CNTRCT_NO <", value, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoLessThanOrEqualTo(String value) {
            addCriterion("CNTRCT_NO <=", value, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoLike(String value) {
            addCriterion("CNTRCT_NO like", value, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoNotLike(String value) {
            addCriterion("CNTRCT_NO not like", value, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoIn(List<String> values) {
            addCriterion("CNTRCT_NO in", values, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoNotIn(List<String> values) {
            addCriterion("CNTRCT_NO not in", values, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoBetween(String value1, String value2) {
            addCriterion("CNTRCT_NO between", value1, value2, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andCntrctNoNotBetween(String value1, String value2) {
            addCriterion("CNTRCT_NO not between", value1, value2, "cntrctNo");
            return (Criteria) this;
        }

        public Criteria andInvcDateIsNull() {
            addCriterion("INVC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvcDateIsNotNull() {
            addCriterion("INVC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvcDateEqualTo(Date value) {
            addCriterion("INVC_DATE =", value, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateNotEqualTo(Date value) {
            addCriterion("INVC_DATE <>", value, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateGreaterThan(Date value) {
            addCriterion("INVC_DATE >", value, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INVC_DATE >=", value, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateLessThan(Date value) {
            addCriterion("INVC_DATE <", value, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateLessThanOrEqualTo(Date value) {
            addCriterion("INVC_DATE <=", value, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateIn(List<Date> values) {
            addCriterion("INVC_DATE in", values, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateNotIn(List<Date> values) {
            addCriterion("INVC_DATE not in", values, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateBetween(Date value1, Date value2) {
            addCriterion("INVC_DATE between", value1, value2, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvcDateNotBetween(Date value1, Date value2) {
            addCriterion("INVC_DATE not between", value1, value2, "invcDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateIsNull() {
            addCriterion("INV_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvStartDateIsNotNull() {
            addCriterion("INV_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvStartDateEqualTo(Date value) {
            addCriterion("INV_START_DATE =", value, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateNotEqualTo(Date value) {
            addCriterion("INV_START_DATE <>", value, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateGreaterThan(Date value) {
            addCriterion("INV_START_DATE >", value, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INV_START_DATE >=", value, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateLessThan(Date value) {
            addCriterion("INV_START_DATE <", value, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateLessThanOrEqualTo(Date value) {
            addCriterion("INV_START_DATE <=", value, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateIn(List<Date> values) {
            addCriterion("INV_START_DATE in", values, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateNotIn(List<Date> values) {
            addCriterion("INV_START_DATE not in", values, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateBetween(Date value1, Date value2) {
            addCriterion("INV_START_DATE between", value1, value2, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvStartDateNotBetween(Date value1, Date value2) {
            addCriterion("INV_START_DATE not between", value1, value2, "invStartDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateIsNull() {
            addCriterion("INV_DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInvDueDateIsNotNull() {
            addCriterion("INV_DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvDueDateEqualTo(Date value) {
            addCriterion("INV_DUE_DATE =", value, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateNotEqualTo(Date value) {
            addCriterion("INV_DUE_DATE <>", value, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateGreaterThan(Date value) {
            addCriterion("INV_DUE_DATE >", value, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INV_DUE_DATE >=", value, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateLessThan(Date value) {
            addCriterion("INV_DUE_DATE <", value, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateLessThanOrEqualTo(Date value) {
            addCriterion("INV_DUE_DATE <=", value, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateIn(List<Date> values) {
            addCriterion("INV_DUE_DATE in", values, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateNotIn(List<Date> values) {
            addCriterion("INV_DUE_DATE not in", values, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateBetween(Date value1, Date value2) {
            addCriterion("INV_DUE_DATE between", value1, value2, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvDueDateNotBetween(Date value1, Date value2) {
            addCriterion("INV_DUE_DATE not between", value1, value2, "invDueDate");
            return (Criteria) this;
        }

        public Criteria andInvAmtIsNull() {
            addCriterion("INV_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInvAmtIsNotNull() {
            addCriterion("INV_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInvAmtEqualTo(BigDecimal value) {
            addCriterion("INV_AMT =", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtNotEqualTo(BigDecimal value) {
            addCriterion("INV_AMT <>", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtGreaterThan(BigDecimal value) {
            addCriterion("INV_AMT >", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_AMT >=", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtLessThan(BigDecimal value) {
            addCriterion("INV_AMT <", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_AMT <=", value, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtIn(List<BigDecimal> values) {
            addCriterion("INV_AMT in", values, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtNotIn(List<BigDecimal> values) {
            addCriterion("INV_AMT not in", values, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_AMT between", value1, value2, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_AMT not between", value1, value2, "invAmt");
            return (Criteria) this;
        }

        public Criteria andInvStatusIsNull() {
            addCriterion("INV_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInvStatusIsNotNull() {
            addCriterion("INV_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInvStatusEqualTo(String value) {
            addCriterion("INV_STATUS =", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusNotEqualTo(String value) {
            addCriterion("INV_STATUS <>", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusGreaterThan(String value) {
            addCriterion("INV_STATUS >", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusGreaterThanOrEqualTo(String value) {
            addCriterion("INV_STATUS >=", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusLessThan(String value) {
            addCriterion("INV_STATUS <", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusLessThanOrEqualTo(String value) {
            addCriterion("INV_STATUS <=", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusLike(String value) {
            addCriterion("INV_STATUS like", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusNotLike(String value) {
            addCriterion("INV_STATUS not like", value, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusIn(List<String> values) {
            addCriterion("INV_STATUS in", values, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusNotIn(List<String> values) {
            addCriterion("INV_STATUS not in", values, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusBetween(String value1, String value2) {
            addCriterion("INV_STATUS between", value1, value2, "invStatus");
            return (Criteria) this;
        }

        public Criteria andInvStatusNotBetween(String value1, String value2) {
            addCriterion("INV_STATUS not between", value1, value2, "invStatus");
            return (Criteria) this;
        }

        public Criteria andCntNoIsNull() {
            addCriterion("CNT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCntNoIsNotNull() {
            addCriterion("CNT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCntNoEqualTo(String value) {
            addCriterion("CNT_NO =", value, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoNotEqualTo(String value) {
            addCriterion("CNT_NO <>", value, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoGreaterThan(String value) {
            addCriterion("CNT_NO >", value, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoGreaterThanOrEqualTo(String value) {
            addCriterion("CNT_NO >=", value, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoLessThan(String value) {
            addCriterion("CNT_NO <", value, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoLessThanOrEqualTo(String value) {
            addCriterion("CNT_NO <=", value, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoLike(String value) {
            addCriterion("CNT_NO like", value, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoNotLike(String value) {
            addCriterion("CNT_NO not like", value, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoIn(List<String> values) {
            addCriterion("CNT_NO in", values, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoNotIn(List<String> values) {
            addCriterion("CNT_NO not in", values, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoBetween(String value1, String value2) {
            addCriterion("CNT_NO between", value1, value2, "cntNo");
            return (Criteria) this;
        }

        public Criteria andCntNoNotBetween(String value1, String value2) {
            addCriterion("CNT_NO not between", value1, value2, "cntNo");
            return (Criteria) this;
        }

        public Criteria andIsChargeIsNull() {
            addCriterion("IS_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andIsChargeIsNotNull() {
            addCriterion("IS_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsChargeEqualTo(String value) {
            addCriterion("IS_CHARGE =", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotEqualTo(String value) {
            addCriterion("IS_CHARGE <>", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeGreaterThan(String value) {
            addCriterion("IS_CHARGE >", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHARGE >=", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLessThan(String value) {
            addCriterion("IS_CHARGE <", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLessThanOrEqualTo(String value) {
            addCriterion("IS_CHARGE <=", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeLike(String value) {
            addCriterion("IS_CHARGE like", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotLike(String value) {
            addCriterion("IS_CHARGE not like", value, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeIn(List<String> values) {
            addCriterion("IS_CHARGE in", values, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotIn(List<String> values) {
            addCriterion("IS_CHARGE not in", values, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeBetween(String value1, String value2) {
            addCriterion("IS_CHARGE between", value1, value2, "isCharge");
            return (Criteria) this;
        }

        public Criteria andIsChargeNotBetween(String value1, String value2) {
            addCriterion("IS_CHARGE not between", value1, value2, "isCharge");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(BigDecimal value) {
            addCriterion("CHARGE =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(BigDecimal value) {
            addCriterion("CHARGE <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(BigDecimal value) {
            addCriterion("CHARGE >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGE >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(BigDecimal value) {
            addCriterion("CHARGE <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGE <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<BigDecimal> values) {
            addCriterion("CHARGE in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<BigDecimal> values) {
            addCriterion("CHARGE not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGE between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGE not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtIsNull() {
            addCriterion("INVC_TOTAL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtIsNotNull() {
            addCriterion("INVC_TOTAL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtEqualTo(BigDecimal value) {
            addCriterion("INVC_TOTAL_AMT =", value, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtNotEqualTo(BigDecimal value) {
            addCriterion("INVC_TOTAL_AMT <>", value, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtGreaterThan(BigDecimal value) {
            addCriterion("INVC_TOTAL_AMT >", value, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVC_TOTAL_AMT >=", value, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtLessThan(BigDecimal value) {
            addCriterion("INVC_TOTAL_AMT <", value, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVC_TOTAL_AMT <=", value, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtIn(List<BigDecimal> values) {
            addCriterion("INVC_TOTAL_AMT in", values, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtNotIn(List<BigDecimal> values) {
            addCriterion("INVC_TOTAL_AMT not in", values, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVC_TOTAL_AMT between", value1, value2, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTotalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVC_TOTAL_AMT not between", value1, value2, "invcTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtIsNull() {
            addCriterion("INVC_CONFIRM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtIsNotNull() {
            addCriterion("INVC_CONFIRM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtEqualTo(BigDecimal value) {
            addCriterion("INVC_CONFIRM_AMT =", value, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtNotEqualTo(BigDecimal value) {
            addCriterion("INVC_CONFIRM_AMT <>", value, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtGreaterThan(BigDecimal value) {
            addCriterion("INVC_CONFIRM_AMT >", value, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVC_CONFIRM_AMT >=", value, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtLessThan(BigDecimal value) {
            addCriterion("INVC_CONFIRM_AMT <", value, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVC_CONFIRM_AMT <=", value, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtIn(List<BigDecimal> values) {
            addCriterion("INVC_CONFIRM_AMT in", values, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtNotIn(List<BigDecimal> values) {
            addCriterion("INVC_CONFIRM_AMT not in", values, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVC_CONFIRM_AMT between", value1, value2, "invcConfirmAmt");
            return (Criteria) this;
        }

        public Criteria andInvcConfirmAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVC_CONFIRM_AMT not between", value1, value2, "invcConfirmAmt");
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
     * SCFCLOUD.INVC_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SCFCLOUD.INVC_INFO 2017-06-15
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