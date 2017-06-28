package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CntRecomSelExample {
    /**
     * SCFCLOUD.CNT_RECOM_SEL
     */
    protected String orderByClause;

    /**
     * SCFCLOUD.CNT_RECOM_SEL
     */
    protected boolean distinct;

    /**
     * SCFCLOUD.CNT_RECOM_SEL
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public CntRecomSelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-19
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
     * @mbggenerated 2017-06-19
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * SCFCLOUD.CNT_RECOM_SEL 2017-06-19
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
     * SCFCLOUD.CNT_RECOM_SEL
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SCFCLOUD.CNT_RECOM_SEL 2017-06-19
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