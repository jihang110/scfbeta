package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvcBatchExample {
    /**
     * SCFCLOUD.INVC_BATCH
     */
    protected String orderByClause;

    /**
     * SCFCLOUD.INVC_BATCH
     */
    protected boolean distinct;

    /**
     * SCFCLOUD.INVC_BATCH
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-06-15
     */
    public InvcBatchExample() {
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
     * SCFCLOUD.INVC_BATCH 2017-06-15
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

        public Criteria andBatchTpIsNull() {
            addCriterion("BATCH_TP is null");
            return (Criteria) this;
        }

        public Criteria andBatchTpIsNotNull() {
            addCriterion("BATCH_TP is not null");
            return (Criteria) this;
        }

        public Criteria andBatchTpEqualTo(String value) {
            addCriterion("BATCH_TP =", value, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpNotEqualTo(String value) {
            addCriterion("BATCH_TP <>", value, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpGreaterThan(String value) {
            addCriterion("BATCH_TP >", value, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_TP >=", value, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpLessThan(String value) {
            addCriterion("BATCH_TP <", value, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpLessThanOrEqualTo(String value) {
            addCriterion("BATCH_TP <=", value, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpLike(String value) {
            addCriterion("BATCH_TP like", value, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpNotLike(String value) {
            addCriterion("BATCH_TP not like", value, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpIn(List<String> values) {
            addCriterion("BATCH_TP in", values, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpNotIn(List<String> values) {
            addCriterion("BATCH_TP not in", values, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpBetween(String value1, String value2) {
            addCriterion("BATCH_TP between", value1, value2, "batchTp");
            return (Criteria) this;
        }

        public Criteria andBatchTpNotBetween(String value1, String value2) {
            addCriterion("BATCH_TP not between", value1, value2, "batchTp");
            return (Criteria) this;
        }

        public Criteria andCntIdIsNull() {
            addCriterion("CNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCntIdIsNotNull() {
            addCriterion("CNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCntIdEqualTo(String value) {
            addCriterion("CNT_ID =", value, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdNotEqualTo(String value) {
            addCriterion("CNT_ID <>", value, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdGreaterThan(String value) {
            addCriterion("CNT_ID >", value, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdGreaterThanOrEqualTo(String value) {
            addCriterion("CNT_ID >=", value, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdLessThan(String value) {
            addCriterion("CNT_ID <", value, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdLessThanOrEqualTo(String value) {
            addCriterion("CNT_ID <=", value, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdLike(String value) {
            addCriterion("CNT_ID like", value, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdNotLike(String value) {
            addCriterion("CNT_ID not like", value, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdIn(List<String> values) {
            addCriterion("CNT_ID in", values, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdNotIn(List<String> values) {
            addCriterion("CNT_ID not in", values, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdBetween(String value1, String value2) {
            addCriterion("CNT_ID between", value1, value2, "cntId");
            return (Criteria) this;
        }

        public Criteria andCntIdNotBetween(String value1, String value2) {
            addCriterion("CNT_ID not between", value1, value2, "cntId");
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

        public Criteria andDeduMethodIsNull() {
            addCriterion("DEDU_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andDeduMethodIsNotNull() {
            addCriterion("DEDU_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andDeduMethodEqualTo(String value) {
            addCriterion("DEDU_METHOD =", value, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodNotEqualTo(String value) {
            addCriterion("DEDU_METHOD <>", value, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodGreaterThan(String value) {
            addCriterion("DEDU_METHOD >", value, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodGreaterThanOrEqualTo(String value) {
            addCriterion("DEDU_METHOD >=", value, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodLessThan(String value) {
            addCriterion("DEDU_METHOD <", value, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodLessThanOrEqualTo(String value) {
            addCriterion("DEDU_METHOD <=", value, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodLike(String value) {
            addCriterion("DEDU_METHOD like", value, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodNotLike(String value) {
            addCriterion("DEDU_METHOD not like", value, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodIn(List<String> values) {
            addCriterion("DEDU_METHOD in", values, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodNotIn(List<String> values) {
            addCriterion("DEDU_METHOD not in", values, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodBetween(String value1, String value2) {
            addCriterion("DEDU_METHOD between", value1, value2, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andDeduMethodNotBetween(String value1, String value2) {
            addCriterion("DEDU_METHOD not between", value1, value2, "deduMethod");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyIsNull() {
            addCriterion("RATE_BEAR_PARTY is null");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyIsNotNull() {
            addCriterion("RATE_BEAR_PARTY is not null");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyEqualTo(String value) {
            addCriterion("RATE_BEAR_PARTY =", value, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyNotEqualTo(String value) {
            addCriterion("RATE_BEAR_PARTY <>", value, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyGreaterThan(String value) {
            addCriterion("RATE_BEAR_PARTY >", value, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyGreaterThanOrEqualTo(String value) {
            addCriterion("RATE_BEAR_PARTY >=", value, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyLessThan(String value) {
            addCriterion("RATE_BEAR_PARTY <", value, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyLessThanOrEqualTo(String value) {
            addCriterion("RATE_BEAR_PARTY <=", value, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyLike(String value) {
            addCriterion("RATE_BEAR_PARTY like", value, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyNotLike(String value) {
            addCriterion("RATE_BEAR_PARTY not like", value, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyIn(List<String> values) {
            addCriterion("RATE_BEAR_PARTY in", values, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyNotIn(List<String> values) {
            addCriterion("RATE_BEAR_PARTY not in", values, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyBetween(String value1, String value2) {
            addCriterion("RATE_BEAR_PARTY between", value1, value2, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateBearPartyNotBetween(String value1, String value2) {
            addCriterion("RATE_BEAR_PARTY not between", value1, value2, "rateBearParty");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtIsNull() {
            addCriterion("CHARGE_TOTAL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtIsNotNull() {
            addCriterion("CHARGE_TOTAL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtEqualTo(BigDecimal value) {
            addCriterion("CHARGE_TOTAL_AMT =", value, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtNotEqualTo(BigDecimal value) {
            addCriterion("CHARGE_TOTAL_AMT <>", value, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtGreaterThan(BigDecimal value) {
            addCriterion("CHARGE_TOTAL_AMT >", value, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGE_TOTAL_AMT >=", value, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtLessThan(BigDecimal value) {
            addCriterion("CHARGE_TOTAL_AMT <", value, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGE_TOTAL_AMT <=", value, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtIn(List<BigDecimal> values) {
            addCriterion("CHARGE_TOTAL_AMT in", values, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtNotIn(List<BigDecimal> values) {
            addCriterion("CHARGE_TOTAL_AMT not in", values, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGE_TOTAL_AMT between", value1, value2, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andChargeTotalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGE_TOTAL_AMT not between", value1, value2, "chargeTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtIsNull() {
            addCriterion("INVC_TRANS_TOTAL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtIsNotNull() {
            addCriterion("INVC_TRANS_TOTAL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtEqualTo(BigDecimal value) {
            addCriterion("INVC_TRANS_TOTAL_AMT =", value, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtNotEqualTo(BigDecimal value) {
            addCriterion("INVC_TRANS_TOTAL_AMT <>", value, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtGreaterThan(BigDecimal value) {
            addCriterion("INVC_TRANS_TOTAL_AMT >", value, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVC_TRANS_TOTAL_AMT >=", value, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtLessThan(BigDecimal value) {
            addCriterion("INVC_TRANS_TOTAL_AMT <", value, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVC_TRANS_TOTAL_AMT <=", value, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtIn(List<BigDecimal> values) {
            addCriterion("INVC_TRANS_TOTAL_AMT in", values, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtNotIn(List<BigDecimal> values) {
            addCriterion("INVC_TRANS_TOTAL_AMT not in", values, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVC_TRANS_TOTAL_AMT between", value1, value2, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransTotalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVC_TRANS_TOTAL_AMT not between", value1, value2, "invcTransTotalAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtIsNull() {
            addCriterion("INVC_TRANS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtIsNotNull() {
            addCriterion("INVC_TRANS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtEqualTo(BigDecimal value) {
            addCriterion("INVC_TRANS_AMT =", value, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtNotEqualTo(BigDecimal value) {
            addCriterion("INVC_TRANS_AMT <>", value, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtGreaterThan(BigDecimal value) {
            addCriterion("INVC_TRANS_AMT >", value, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVC_TRANS_AMT >=", value, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtLessThan(BigDecimal value) {
            addCriterion("INVC_TRANS_AMT <", value, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVC_TRANS_AMT <=", value, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtIn(List<BigDecimal> values) {
            addCriterion("INVC_TRANS_AMT in", values, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtNotIn(List<BigDecimal> values) {
            addCriterion("INVC_TRANS_AMT not in", values, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVC_TRANS_AMT between", value1, value2, "invcTransAmt");
            return (Criteria) this;
        }

        public Criteria andInvcTransAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVC_TRANS_AMT not between", value1, value2, "invcTransAmt");
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
    }

    /**
     * SCFCLOUD.INVC_BATCH
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SCFCLOUD.INVC_BATCH 2017-06-15
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