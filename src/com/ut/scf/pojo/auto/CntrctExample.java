package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CntrctExample {
    /**
     * SCFCLOUD.CNTRCT
     */
    protected String orderByClause;

    /**
     * SCFCLOUD.CNTRCT
     */
    protected boolean distinct;

    /**
     * SCFCLOUD.CNTRCT
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public CntrctExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-21
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
     * @mbggenerated 2017-06-21
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-21
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * SCFCLOUD.CNTRCT 2017-06-21
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

        public Criteria andCntTpIsNull() {
            addCriterion("CNT_TP is null");
            return (Criteria) this;
        }

        public Criteria andCntTpIsNotNull() {
            addCriterion("CNT_TP is not null");
            return (Criteria) this;
        }

        public Criteria andCntTpEqualTo(String value) {
            addCriterion("CNT_TP =", value, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpNotEqualTo(String value) {
            addCriterion("CNT_TP <>", value, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpGreaterThan(String value) {
            addCriterion("CNT_TP >", value, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpGreaterThanOrEqualTo(String value) {
            addCriterion("CNT_TP >=", value, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpLessThan(String value) {
            addCriterion("CNT_TP <", value, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpLessThanOrEqualTo(String value) {
            addCriterion("CNT_TP <=", value, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpLike(String value) {
            addCriterion("CNT_TP like", value, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpNotLike(String value) {
            addCriterion("CNT_TP not like", value, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpIn(List<String> values) {
            addCriterion("CNT_TP in", values, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpNotIn(List<String> values) {
            addCriterion("CNT_TP not in", values, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpBetween(String value1, String value2) {
            addCriterion("CNT_TP between", value1, value2, "cntTp");
            return (Criteria) this;
        }

        public Criteria andCntTpNotBetween(String value1, String value2) {
            addCriterion("CNT_TP not between", value1, value2, "cntTp");
            return (Criteria) this;
        }

        public Criteria andProductDistIdIsNull() {
            addCriterion("PRODUCT_DIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductDistIdIsNotNull() {
            addCriterion("PRODUCT_DIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductDistIdEqualTo(String value) {
            addCriterion("PRODUCT_DIST_ID =", value, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdNotEqualTo(String value) {
            addCriterion("PRODUCT_DIST_ID <>", value, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdGreaterThan(String value) {
            addCriterion("PRODUCT_DIST_ID >", value, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DIST_ID >=", value, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdLessThan(String value) {
            addCriterion("PRODUCT_DIST_ID <", value, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DIST_ID <=", value, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdLike(String value) {
            addCriterion("PRODUCT_DIST_ID like", value, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdNotLike(String value) {
            addCriterion("PRODUCT_DIST_ID not like", value, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdIn(List<String> values) {
            addCriterion("PRODUCT_DIST_ID in", values, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdNotIn(List<String> values) {
            addCriterion("PRODUCT_DIST_ID not in", values, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_DIST_ID between", value1, value2, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductDistIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DIST_ID not between", value1, value2, "productDistId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNull() {
            addCriterion("PAYMENT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNotNull() {
            addCriterion("PAYMENT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeEqualTo(String value) {
            addCriterion("PAYMENT_MODE =", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotEqualTo(String value) {
            addCriterion("PAYMENT_MODE <>", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThan(String value) {
            addCriterion("PAYMENT_MODE >", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_MODE >=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThan(String value) {
            addCriterion("PAYMENT_MODE <", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_MODE <=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLike(String value) {
            addCriterion("PAYMENT_MODE like", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotLike(String value) {
            addCriterion("PAYMENT_MODE not like", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIn(List<String> values) {
            addCriterion("PAYMENT_MODE in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotIn(List<String> values) {
            addCriterion("PAYMENT_MODE not in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBetween(String value1, String value2) {
            addCriterion("PAYMENT_MODE between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_MODE not between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNull() {
            addCriterion("AC_ID is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("AC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(String value) {
            addCriterion("AC_ID =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(String value) {
            addCriterion("AC_ID <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(String value) {
            addCriterion("AC_ID >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(String value) {
            addCriterion("AC_ID >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(String value) {
            addCriterion("AC_ID <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(String value) {
            addCriterion("AC_ID <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLike(String value) {
            addCriterion("AC_ID like", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotLike(String value) {
            addCriterion("AC_ID not like", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<String> values) {
            addCriterion("AC_ID in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<String> values) {
            addCriterion("AC_ID not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(String value1, String value2) {
            addCriterion("AC_ID between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(String value1, String value2) {
            addCriterion("AC_ID not between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmIsNull() {
            addCriterion("COORDINATOR_NM is null");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmIsNotNull() {
            addCriterion("COORDINATOR_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmEqualTo(String value) {
            addCriterion("COORDINATOR_NM =", value, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmNotEqualTo(String value) {
            addCriterion("COORDINATOR_NM <>", value, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmGreaterThan(String value) {
            addCriterion("COORDINATOR_NM >", value, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmGreaterThanOrEqualTo(String value) {
            addCriterion("COORDINATOR_NM >=", value, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmLessThan(String value) {
            addCriterion("COORDINATOR_NM <", value, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmLessThanOrEqualTo(String value) {
            addCriterion("COORDINATOR_NM <=", value, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmLike(String value) {
            addCriterion("COORDINATOR_NM like", value, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmNotLike(String value) {
            addCriterion("COORDINATOR_NM not like", value, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmIn(List<String> values) {
            addCriterion("COORDINATOR_NM in", values, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmNotIn(List<String> values) {
            addCriterion("COORDINATOR_NM not in", values, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmBetween(String value1, String value2) {
            addCriterion("COORDINATOR_NM between", value1, value2, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorNmNotBetween(String value1, String value2) {
            addCriterion("COORDINATOR_NM not between", value1, value2, "coordinatorNm");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailIsNull() {
            addCriterion("COORDINATOR_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailIsNotNull() {
            addCriterion("COORDINATOR_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailEqualTo(String value) {
            addCriterion("COORDINATOR_EMAIL =", value, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailNotEqualTo(String value) {
            addCriterion("COORDINATOR_EMAIL <>", value, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailGreaterThan(String value) {
            addCriterion("COORDINATOR_EMAIL >", value, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailGreaterThanOrEqualTo(String value) {
            addCriterion("COORDINATOR_EMAIL >=", value, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailLessThan(String value) {
            addCriterion("COORDINATOR_EMAIL <", value, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailLessThanOrEqualTo(String value) {
            addCriterion("COORDINATOR_EMAIL <=", value, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailLike(String value) {
            addCriterion("COORDINATOR_EMAIL like", value, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailNotLike(String value) {
            addCriterion("COORDINATOR_EMAIL not like", value, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailIn(List<String> values) {
            addCriterion("COORDINATOR_EMAIL in", values, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailNotIn(List<String> values) {
            addCriterion("COORDINATOR_EMAIL not in", values, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailBetween(String value1, String value2) {
            addCriterion("COORDINATOR_EMAIL between", value1, value2, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andCoordinatorEmailNotBetween(String value1, String value2) {
            addCriterion("COORDINATOR_EMAIL not between", value1, value2, "coordinatorEmail");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtIsNull() {
            addCriterion("RELE_LMT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtIsNotNull() {
            addCriterion("RELE_LMT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtEqualTo(BigDecimal value) {
            addCriterion("RELE_LMT_AMT =", value, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtNotEqualTo(BigDecimal value) {
            addCriterion("RELE_LMT_AMT <>", value, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtGreaterThan(BigDecimal value) {
            addCriterion("RELE_LMT_AMT >", value, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELE_LMT_AMT >=", value, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtLessThan(BigDecimal value) {
            addCriterion("RELE_LMT_AMT <", value, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELE_LMT_AMT <=", value, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtIn(List<BigDecimal> values) {
            addCriterion("RELE_LMT_AMT in", values, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtNotIn(List<BigDecimal> values) {
            addCriterion("RELE_LMT_AMT not in", values, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELE_LMT_AMT between", value1, value2, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andReleLmtAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELE_LMT_AMT not between", value1, value2, "releLmtAmt");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdIsNull() {
            addCriterion("COUNTER_PARTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdIsNotNull() {
            addCriterion("COUNTER_PARTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdEqualTo(String value) {
            addCriterion("COUNTER_PARTY_ID =", value, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdNotEqualTo(String value) {
            addCriterion("COUNTER_PARTY_ID <>", value, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdGreaterThan(String value) {
            addCriterion("COUNTER_PARTY_ID >", value, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTER_PARTY_ID >=", value, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdLessThan(String value) {
            addCriterion("COUNTER_PARTY_ID <", value, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdLessThanOrEqualTo(String value) {
            addCriterion("COUNTER_PARTY_ID <=", value, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdLike(String value) {
            addCriterion("COUNTER_PARTY_ID like", value, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdNotLike(String value) {
            addCriterion("COUNTER_PARTY_ID not like", value, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdIn(List<String> values) {
            addCriterion("COUNTER_PARTY_ID in", values, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdNotIn(List<String> values) {
            addCriterion("COUNTER_PARTY_ID not in", values, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdBetween(String value1, String value2) {
            addCriterion("COUNTER_PARTY_ID between", value1, value2, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andCounterPartyIdNotBetween(String value1, String value2) {
            addCriterion("COUNTER_PARTY_ID not between", value1, value2, "counterPartyId");
            return (Criteria) this;
        }

        public Criteria andRecommIsNull() {
            addCriterion("RECOMM is null");
            return (Criteria) this;
        }

        public Criteria andRecommIsNotNull() {
            addCriterion("RECOMM is not null");
            return (Criteria) this;
        }

        public Criteria andRecommEqualTo(String value) {
            addCriterion("RECOMM =", value, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommNotEqualTo(String value) {
            addCriterion("RECOMM <>", value, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommGreaterThan(String value) {
            addCriterion("RECOMM >", value, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMM >=", value, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommLessThan(String value) {
            addCriterion("RECOMM <", value, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommLessThanOrEqualTo(String value) {
            addCriterion("RECOMM <=", value, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommLike(String value) {
            addCriterion("RECOMM like", value, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommNotLike(String value) {
            addCriterion("RECOMM not like", value, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommIn(List<String> values) {
            addCriterion("RECOMM in", values, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommNotIn(List<String> values) {
            addCriterion("RECOMM not in", values, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommBetween(String value1, String value2) {
            addCriterion("RECOMM between", value1, value2, "recomm");
            return (Criteria) this;
        }

        public Criteria andRecommNotBetween(String value1, String value2) {
            addCriterion("RECOMM not between", value1, value2, "recomm");
            return (Criteria) this;
        }

        public Criteria andAssocAmtIsNull() {
            addCriterion("ASSOC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andAssocAmtIsNotNull() {
            addCriterion("ASSOC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andAssocAmtEqualTo(BigDecimal value) {
            addCriterion("ASSOC_AMT =", value, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtNotEqualTo(BigDecimal value) {
            addCriterion("ASSOC_AMT <>", value, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtGreaterThan(BigDecimal value) {
            addCriterion("ASSOC_AMT >", value, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSOC_AMT >=", value, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtLessThan(BigDecimal value) {
            addCriterion("ASSOC_AMT <", value, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSOC_AMT <=", value, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtIn(List<BigDecimal> values) {
            addCriterion("ASSOC_AMT in", values, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtNotIn(List<BigDecimal> values) {
            addCriterion("ASSOC_AMT not in", values, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSOC_AMT between", value1, value2, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAssocAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSOC_AMT not between", value1, value2, "assocAmt");
            return (Criteria) this;
        }

        public Criteria andAmtTpIsNull() {
            addCriterion("AMT_TP is null");
            return (Criteria) this;
        }

        public Criteria andAmtTpIsNotNull() {
            addCriterion("AMT_TP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtTpEqualTo(String value) {
            addCriterion("AMT_TP =", value, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpNotEqualTo(String value) {
            addCriterion("AMT_TP <>", value, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpGreaterThan(String value) {
            addCriterion("AMT_TP >", value, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpGreaterThanOrEqualTo(String value) {
            addCriterion("AMT_TP >=", value, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpLessThan(String value) {
            addCriterion("AMT_TP <", value, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpLessThanOrEqualTo(String value) {
            addCriterion("AMT_TP <=", value, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpLike(String value) {
            addCriterion("AMT_TP like", value, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpNotLike(String value) {
            addCriterion("AMT_TP not like", value, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpIn(List<String> values) {
            addCriterion("AMT_TP in", values, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpNotIn(List<String> values) {
            addCriterion("AMT_TP not in", values, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpBetween(String value1, String value2) {
            addCriterion("AMT_TP between", value1, value2, "amtTp");
            return (Criteria) this;
        }

        public Criteria andAmtTpNotBetween(String value1, String value2) {
            addCriterion("AMT_TP not between", value1, value2, "amtTp");
            return (Criteria) this;
        }

        public Criteria andRecommStsIsNull() {
            addCriterion("RECOMM_STS is null");
            return (Criteria) this;
        }

        public Criteria andRecommStsIsNotNull() {
            addCriterion("RECOMM_STS is not null");
            return (Criteria) this;
        }

        public Criteria andRecommStsEqualTo(String value) {
            addCriterion("RECOMM_STS =", value, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsNotEqualTo(String value) {
            addCriterion("RECOMM_STS <>", value, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsGreaterThan(String value) {
            addCriterion("RECOMM_STS >", value, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMM_STS >=", value, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsLessThan(String value) {
            addCriterion("RECOMM_STS <", value, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsLessThanOrEqualTo(String value) {
            addCriterion("RECOMM_STS <=", value, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsLike(String value) {
            addCriterion("RECOMM_STS like", value, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsNotLike(String value) {
            addCriterion("RECOMM_STS not like", value, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsIn(List<String> values) {
            addCriterion("RECOMM_STS in", values, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsNotIn(List<String> values) {
            addCriterion("RECOMM_STS not in", values, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsBetween(String value1, String value2) {
            addCriterion("RECOMM_STS between", value1, value2, "recommSts");
            return (Criteria) this;
        }

        public Criteria andRecommStsNotBetween(String value1, String value2) {
            addCriterion("RECOMM_STS not between", value1, value2, "recommSts");
            return (Criteria) this;
        }

        public Criteria andAttachNmIsNull() {
            addCriterion("ATTACH_NM is null");
            return (Criteria) this;
        }

        public Criteria andAttachNmIsNotNull() {
            addCriterion("ATTACH_NM is not null");
            return (Criteria) this;
        }

        public Criteria andAttachNmEqualTo(String value) {
            addCriterion("ATTACH_NM =", value, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmNotEqualTo(String value) {
            addCriterion("ATTACH_NM <>", value, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmGreaterThan(String value) {
            addCriterion("ATTACH_NM >", value, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_NM >=", value, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmLessThan(String value) {
            addCriterion("ATTACH_NM <", value, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_NM <=", value, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmLike(String value) {
            addCriterion("ATTACH_NM like", value, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmNotLike(String value) {
            addCriterion("ATTACH_NM not like", value, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmIn(List<String> values) {
            addCriterion("ATTACH_NM in", values, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmNotIn(List<String> values) {
            addCriterion("ATTACH_NM not in", values, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmBetween(String value1, String value2) {
            addCriterion("ATTACH_NM between", value1, value2, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachNmNotBetween(String value1, String value2) {
            addCriterion("ATTACH_NM not between", value1, value2, "attachNm");
            return (Criteria) this;
        }

        public Criteria andAttachFormatIsNull() {
            addCriterion("ATTACH_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andAttachFormatIsNotNull() {
            addCriterion("ATTACH_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andAttachFormatEqualTo(String value) {
            addCriterion("ATTACH_FORMAT =", value, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatNotEqualTo(String value) {
            addCriterion("ATTACH_FORMAT <>", value, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatGreaterThan(String value) {
            addCriterion("ATTACH_FORMAT >", value, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_FORMAT >=", value, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatLessThan(String value) {
            addCriterion("ATTACH_FORMAT <", value, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_FORMAT <=", value, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatLike(String value) {
            addCriterion("ATTACH_FORMAT like", value, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatNotLike(String value) {
            addCriterion("ATTACH_FORMAT not like", value, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatIn(List<String> values) {
            addCriterion("ATTACH_FORMAT in", values, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatNotIn(List<String> values) {
            addCriterion("ATTACH_FORMAT not in", values, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatBetween(String value1, String value2) {
            addCriterion("ATTACH_FORMAT between", value1, value2, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachFormatNotBetween(String value1, String value2) {
            addCriterion("ATTACH_FORMAT not between", value1, value2, "attachFormat");
            return (Criteria) this;
        }

        public Criteria andAttachSizeIsNull() {
            addCriterion("ATTACH_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andAttachSizeIsNotNull() {
            addCriterion("ATTACH_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andAttachSizeEqualTo(String value) {
            addCriterion("ATTACH_SIZE =", value, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeNotEqualTo(String value) {
            addCriterion("ATTACH_SIZE <>", value, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeGreaterThan(String value) {
            addCriterion("ATTACH_SIZE >", value, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACH_SIZE >=", value, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeLessThan(String value) {
            addCriterion("ATTACH_SIZE <", value, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeLessThanOrEqualTo(String value) {
            addCriterion("ATTACH_SIZE <=", value, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeLike(String value) {
            addCriterion("ATTACH_SIZE like", value, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeNotLike(String value) {
            addCriterion("ATTACH_SIZE not like", value, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeIn(List<String> values) {
            addCriterion("ATTACH_SIZE in", values, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeNotIn(List<String> values) {
            addCriterion("ATTACH_SIZE not in", values, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeBetween(String value1, String value2) {
            addCriterion("ATTACH_SIZE between", value1, value2, "attachSize");
            return (Criteria) this;
        }

        public Criteria andAttachSizeNotBetween(String value1, String value2) {
            addCriterion("ATTACH_SIZE not between", value1, value2, "attachSize");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioIsNull() {
            addCriterion("MAX_LOAN_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioIsNotNull() {
            addCriterion("MAX_LOAN_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioEqualTo(String value) {
            addCriterion("MAX_LOAN_RATIO =", value, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioNotEqualTo(String value) {
            addCriterion("MAX_LOAN_RATIO <>", value, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioGreaterThan(String value) {
            addCriterion("MAX_LOAN_RATIO >", value, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioGreaterThanOrEqualTo(String value) {
            addCriterion("MAX_LOAN_RATIO >=", value, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioLessThan(String value) {
            addCriterion("MAX_LOAN_RATIO <", value, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioLessThanOrEqualTo(String value) {
            addCriterion("MAX_LOAN_RATIO <=", value, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioLike(String value) {
            addCriterion("MAX_LOAN_RATIO like", value, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioNotLike(String value) {
            addCriterion("MAX_LOAN_RATIO not like", value, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioIn(List<String> values) {
            addCriterion("MAX_LOAN_RATIO in", values, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioNotIn(List<String> values) {
            addCriterion("MAX_LOAN_RATIO not in", values, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioBetween(String value1, String value2) {
            addCriterion("MAX_LOAN_RATIO between", value1, value2, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andMaxLoanRatioNotBetween(String value1, String value2) {
            addCriterion("MAX_LOAN_RATIO not between", value1, value2, "maxLoanRatio");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockIsNull() {
            addCriterion("LOANRATIO_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockIsNotNull() {
            addCriterion("LOANRATIO_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockEqualTo(String value) {
            addCriterion("LOANRATIO_LOCK =", value, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockNotEqualTo(String value) {
            addCriterion("LOANRATIO_LOCK <>", value, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockGreaterThan(String value) {
            addCriterion("LOANRATIO_LOCK >", value, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockGreaterThanOrEqualTo(String value) {
            addCriterion("LOANRATIO_LOCK >=", value, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockLessThan(String value) {
            addCriterion("LOANRATIO_LOCK <", value, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockLessThanOrEqualTo(String value) {
            addCriterion("LOANRATIO_LOCK <=", value, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockLike(String value) {
            addCriterion("LOANRATIO_LOCK like", value, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockNotLike(String value) {
            addCriterion("LOANRATIO_LOCK not like", value, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockIn(List<String> values) {
            addCriterion("LOANRATIO_LOCK in", values, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockNotIn(List<String> values) {
            addCriterion("LOANRATIO_LOCK not in", values, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockBetween(String value1, String value2) {
            addCriterion("LOANRATIO_LOCK between", value1, value2, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andLoanratioLockNotBetween(String value1, String value2) {
            addCriterion("LOANRATIO_LOCK not between", value1, value2, "loanratioLock");
            return (Criteria) this;
        }

        public Criteria andGraceDaysIsNull() {
            addCriterion("GRACE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andGraceDaysIsNotNull() {
            addCriterion("GRACE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andGraceDaysEqualTo(Integer value) {
            addCriterion("GRACE_DAYS =", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysNotEqualTo(Integer value) {
            addCriterion("GRACE_DAYS <>", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysGreaterThan(Integer value) {
            addCriterion("GRACE_DAYS >", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRACE_DAYS >=", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysLessThan(Integer value) {
            addCriterion("GRACE_DAYS <", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysLessThanOrEqualTo(Integer value) {
            addCriterion("GRACE_DAYS <=", value, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysIn(List<Integer> values) {
            addCriterion("GRACE_DAYS in", values, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysNotIn(List<Integer> values) {
            addCriterion("GRACE_DAYS not in", values, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysBetween(Integer value1, Integer value2) {
            addCriterion("GRACE_DAYS between", value1, value2, "graceDays");
            return (Criteria) this;
        }

        public Criteria andGraceDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("GRACE_DAYS not between", value1, value2, "graceDays");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIsNull() {
            addCriterion("LOAN_DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIsNotNull() {
            addCriterion("LOAN_DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineEqualTo(Long value) {
            addCriterion("LOAN_DEADLINE =", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotEqualTo(Long value) {
            addCriterion("LOAN_DEADLINE <>", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineGreaterThan(Long value) {
            addCriterion("LOAN_DEADLINE >", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineGreaterThanOrEqualTo(Long value) {
            addCriterion("LOAN_DEADLINE >=", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineLessThan(Long value) {
            addCriterion("LOAN_DEADLINE <", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineLessThanOrEqualTo(Long value) {
            addCriterion("LOAN_DEADLINE <=", value, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineIn(List<Long> values) {
            addCriterion("LOAN_DEADLINE in", values, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotIn(List<Long> values) {
            addCriterion("LOAN_DEADLINE not in", values, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineBetween(Long value1, Long value2) {
            addCriterion("LOAN_DEADLINE between", value1, value2, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andLoanDeadlineNotBetween(Long value1, Long value2) {
            addCriterion("LOAN_DEADLINE not between", value1, value2, "loanDeadline");
            return (Criteria) this;
        }

        public Criteria andIntWayIsNull() {
            addCriterion("INT_WAY is null");
            return (Criteria) this;
        }

        public Criteria andIntWayIsNotNull() {
            addCriterion("INT_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andIntWayEqualTo(String value) {
            addCriterion("INT_WAY =", value, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayNotEqualTo(String value) {
            addCriterion("INT_WAY <>", value, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayGreaterThan(String value) {
            addCriterion("INT_WAY >", value, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayGreaterThanOrEqualTo(String value) {
            addCriterion("INT_WAY >=", value, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayLessThan(String value) {
            addCriterion("INT_WAY <", value, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayLessThanOrEqualTo(String value) {
            addCriterion("INT_WAY <=", value, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayLike(String value) {
            addCriterion("INT_WAY like", value, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayNotLike(String value) {
            addCriterion("INT_WAY not like", value, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayIn(List<String> values) {
            addCriterion("INT_WAY in", values, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayNotIn(List<String> values) {
            addCriterion("INT_WAY not in", values, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayBetween(String value1, String value2) {
            addCriterion("INT_WAY between", value1, value2, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntWayNotBetween(String value1, String value2) {
            addCriterion("INT_WAY not between", value1, value2, "intWay");
            return (Criteria) this;
        }

        public Criteria andIntRateIsNull() {
            addCriterion("INT_RATE is null");
            return (Criteria) this;
        }

        public Criteria andIntRateIsNotNull() {
            addCriterion("INT_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andIntRateEqualTo(BigDecimal value) {
            addCriterion("INT_RATE =", value, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateNotEqualTo(BigDecimal value) {
            addCriterion("INT_RATE <>", value, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateGreaterThan(BigDecimal value) {
            addCriterion("INT_RATE >", value, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INT_RATE >=", value, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateLessThan(BigDecimal value) {
            addCriterion("INT_RATE <", value, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INT_RATE <=", value, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateIn(List<BigDecimal> values) {
            addCriterion("INT_RATE in", values, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateNotIn(List<BigDecimal> values) {
            addCriterion("INT_RATE not in", values, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INT_RATE between", value1, value2, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INT_RATE not between", value1, value2, "intRate");
            return (Criteria) this;
        }

        public Criteria andIntPartyIsNull() {
            addCriterion("INT_PARTY is null");
            return (Criteria) this;
        }

        public Criteria andIntPartyIsNotNull() {
            addCriterion("INT_PARTY is not null");
            return (Criteria) this;
        }

        public Criteria andIntPartyEqualTo(String value) {
            addCriterion("INT_PARTY =", value, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyNotEqualTo(String value) {
            addCriterion("INT_PARTY <>", value, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyGreaterThan(String value) {
            addCriterion("INT_PARTY >", value, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyGreaterThanOrEqualTo(String value) {
            addCriterion("INT_PARTY >=", value, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyLessThan(String value) {
            addCriterion("INT_PARTY <", value, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyLessThanOrEqualTo(String value) {
            addCriterion("INT_PARTY <=", value, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyLike(String value) {
            addCriterion("INT_PARTY like", value, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyNotLike(String value) {
            addCriterion("INT_PARTY not like", value, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyIn(List<String> values) {
            addCriterion("INT_PARTY in", values, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyNotIn(List<String> values) {
            addCriterion("INT_PARTY not in", values, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyBetween(String value1, String value2) {
            addCriterion("INT_PARTY between", value1, value2, "intParty");
            return (Criteria) this;
        }

        public Criteria andIntPartyNotBetween(String value1, String value2) {
            addCriterion("INT_PARTY not between", value1, value2, "intParty");
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

        public Criteria andReceAcIdIsNull() {
            addCriterion("RECE_AC_ID is null");
            return (Criteria) this;
        }

        public Criteria andReceAcIdIsNotNull() {
            addCriterion("RECE_AC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReceAcIdEqualTo(String value) {
            addCriterion("RECE_AC_ID =", value, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdNotEqualTo(String value) {
            addCriterion("RECE_AC_ID <>", value, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdGreaterThan(String value) {
            addCriterion("RECE_AC_ID >", value, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdGreaterThanOrEqualTo(String value) {
            addCriterion("RECE_AC_ID >=", value, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdLessThan(String value) {
            addCriterion("RECE_AC_ID <", value, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdLessThanOrEqualTo(String value) {
            addCriterion("RECE_AC_ID <=", value, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdLike(String value) {
            addCriterion("RECE_AC_ID like", value, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdNotLike(String value) {
            addCriterion("RECE_AC_ID not like", value, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdIn(List<String> values) {
            addCriterion("RECE_AC_ID in", values, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdNotIn(List<String> values) {
            addCriterion("RECE_AC_ID not in", values, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdBetween(String value1, String value2) {
            addCriterion("RECE_AC_ID between", value1, value2, "receAcId");
            return (Criteria) this;
        }

        public Criteria andReceAcIdNotBetween(String value1, String value2) {
            addCriterion("RECE_AC_ID not between", value1, value2, "receAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdIsNull() {
            addCriterion("IOU_AC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIouAcIdIsNotNull() {
            addCriterion("IOU_AC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIouAcIdEqualTo(String value) {
            addCriterion("IOU_AC_ID =", value, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdNotEqualTo(String value) {
            addCriterion("IOU_AC_ID <>", value, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdGreaterThan(String value) {
            addCriterion("IOU_AC_ID >", value, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdGreaterThanOrEqualTo(String value) {
            addCriterion("IOU_AC_ID >=", value, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdLessThan(String value) {
            addCriterion("IOU_AC_ID <", value, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdLessThanOrEqualTo(String value) {
            addCriterion("IOU_AC_ID <=", value, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdLike(String value) {
            addCriterion("IOU_AC_ID like", value, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdNotLike(String value) {
            addCriterion("IOU_AC_ID not like", value, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdIn(List<String> values) {
            addCriterion("IOU_AC_ID in", values, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdNotIn(List<String> values) {
            addCriterion("IOU_AC_ID not in", values, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdBetween(String value1, String value2) {
            addCriterion("IOU_AC_ID between", value1, value2, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIouAcIdNotBetween(String value1, String value2) {
            addCriterion("IOU_AC_ID not between", value1, value2, "iouAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdIsNull() {
            addCriterion("INT_DEDUCT_AC_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdIsNotNull() {
            addCriterion("INT_DEDUCT_AC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdEqualTo(String value) {
            addCriterion("INT_DEDUCT_AC_ID =", value, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdNotEqualTo(String value) {
            addCriterion("INT_DEDUCT_AC_ID <>", value, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdGreaterThan(String value) {
            addCriterion("INT_DEDUCT_AC_ID >", value, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdGreaterThanOrEqualTo(String value) {
            addCriterion("INT_DEDUCT_AC_ID >=", value, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdLessThan(String value) {
            addCriterion("INT_DEDUCT_AC_ID <", value, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdLessThanOrEqualTo(String value) {
            addCriterion("INT_DEDUCT_AC_ID <=", value, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdLike(String value) {
            addCriterion("INT_DEDUCT_AC_ID like", value, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdNotLike(String value) {
            addCriterion("INT_DEDUCT_AC_ID not like", value, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdIn(List<String> values) {
            addCriterion("INT_DEDUCT_AC_ID in", values, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdNotIn(List<String> values) {
            addCriterion("INT_DEDUCT_AC_ID not in", values, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdBetween(String value1, String value2) {
            addCriterion("INT_DEDUCT_AC_ID between", value1, value2, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andIntDeductAcIdNotBetween(String value1, String value2) {
            addCriterion("INT_DEDUCT_AC_ID not between", value1, value2, "intDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdIsNull() {
            addCriterion("FEE_DEDUCT_AC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdIsNotNull() {
            addCriterion("FEE_DEDUCT_AC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdEqualTo(String value) {
            addCriterion("FEE_DEDUCT_AC_ID =", value, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdNotEqualTo(String value) {
            addCriterion("FEE_DEDUCT_AC_ID <>", value, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdGreaterThan(String value) {
            addCriterion("FEE_DEDUCT_AC_ID >", value, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_DEDUCT_AC_ID >=", value, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdLessThan(String value) {
            addCriterion("FEE_DEDUCT_AC_ID <", value, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdLessThanOrEqualTo(String value) {
            addCriterion("FEE_DEDUCT_AC_ID <=", value, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdLike(String value) {
            addCriterion("FEE_DEDUCT_AC_ID like", value, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdNotLike(String value) {
            addCriterion("FEE_DEDUCT_AC_ID not like", value, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdIn(List<String> values) {
            addCriterion("FEE_DEDUCT_AC_ID in", values, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdNotIn(List<String> values) {
            addCriterion("FEE_DEDUCT_AC_ID not in", values, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdBetween(String value1, String value2) {
            addCriterion("FEE_DEDUCT_AC_ID between", value1, value2, "feeDeductAcId");
            return (Criteria) this;
        }

        public Criteria andFeeDeductAcIdNotBetween(String value1, String value2) {
            addCriterion("FEE_DEDUCT_AC_ID not between", value1, value2, "feeDeductAcId");
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
     * SCFCLOUD.CNTRCT
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SCFCLOUD.CNTRCT 2017-06-21
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