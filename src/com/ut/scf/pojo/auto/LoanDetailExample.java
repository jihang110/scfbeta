package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanDetailExample {
    /**
     * SCFCLOUD.LOAN_DETAIL
     */
    protected String orderByClause;

    /**
     * SCFCLOUD.LOAN_DETAIL
     */
    protected boolean distinct;

    /**
     * SCFCLOUD.LOAN_DETAIL
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-06-19
     */
    public LoanDetailExample() {
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
     * SCFCLOUD.LOAN_DETAIL 2017-06-19
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

        public Criteria andRelaIdIsNull() {
            addCriterion("RELA_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelaIdIsNotNull() {
            addCriterion("RELA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelaIdEqualTo(String value) {
            addCriterion("RELA_ID =", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotEqualTo(String value) {
            addCriterion("RELA_ID <>", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdGreaterThan(String value) {
            addCriterion("RELA_ID >", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELA_ID >=", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdLessThan(String value) {
            addCriterion("RELA_ID <", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdLessThanOrEqualTo(String value) {
            addCriterion("RELA_ID <=", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdLike(String value) {
            addCriterion("RELA_ID like", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotLike(String value) {
            addCriterion("RELA_ID not like", value, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdIn(List<String> values) {
            addCriterion("RELA_ID in", values, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotIn(List<String> values) {
            addCriterion("RELA_ID not in", values, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdBetween(String value1, String value2) {
            addCriterion("RELA_ID between", value1, value2, "relaId");
            return (Criteria) this;
        }

        public Criteria andRelaIdNotBetween(String value1, String value2) {
            addCriterion("RELA_ID not between", value1, value2, "relaId");
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

        public Criteria andInvLoanAvalIsNull() {
            addCriterion("INV_LOAN_AVAL is null");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalIsNotNull() {
            addCriterion("INV_LOAN_AVAL is not null");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalEqualTo(BigDecimal value) {
            addCriterion("INV_LOAN_AVAL =", value, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalNotEqualTo(BigDecimal value) {
            addCriterion("INV_LOAN_AVAL <>", value, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalGreaterThan(BigDecimal value) {
            addCriterion("INV_LOAN_AVAL >", value, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_LOAN_AVAL >=", value, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalLessThan(BigDecimal value) {
            addCriterion("INV_LOAN_AVAL <", value, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_LOAN_AVAL <=", value, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalIn(List<BigDecimal> values) {
            addCriterion("INV_LOAN_AVAL in", values, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalNotIn(List<BigDecimal> values) {
            addCriterion("INV_LOAN_AVAL not in", values, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_LOAN_AVAL between", value1, value2, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAvalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_LOAN_AVAL not between", value1, value2, "invLoanAval");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtIsNull() {
            addCriterion("INV_LOAN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtIsNotNull() {
            addCriterion("INV_LOAN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtEqualTo(BigDecimal value) {
            addCriterion("INV_LOAN_AMT =", value, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtNotEqualTo(BigDecimal value) {
            addCriterion("INV_LOAN_AMT <>", value, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtGreaterThan(BigDecimal value) {
            addCriterion("INV_LOAN_AMT >", value, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_LOAN_AMT >=", value, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtLessThan(BigDecimal value) {
            addCriterion("INV_LOAN_AMT <", value, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INV_LOAN_AMT <=", value, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtIn(List<BigDecimal> values) {
            addCriterion("INV_LOAN_AMT in", values, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtNotIn(List<BigDecimal> values) {
            addCriterion("INV_LOAN_AMT not in", values, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_LOAN_AMT between", value1, value2, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INV_LOAN_AMT not between", value1, value2, "invLoanAmt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtIsNull() {
            addCriterion("LOAN_VAL_DT is null");
            return (Criteria) this;
        }

        public Criteria andLoanValDtIsNotNull() {
            addCriterion("LOAN_VAL_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanValDtEqualTo(Date value) {
            addCriterion("LOAN_VAL_DT =", value, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtNotEqualTo(Date value) {
            addCriterion("LOAN_VAL_DT <>", value, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtGreaterThan(Date value) {
            addCriterion("LOAN_VAL_DT >", value, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtGreaterThanOrEqualTo(Date value) {
            addCriterion("LOAN_VAL_DT >=", value, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtLessThan(Date value) {
            addCriterion("LOAN_VAL_DT <", value, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtLessThanOrEqualTo(Date value) {
            addCriterion("LOAN_VAL_DT <=", value, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtIn(List<Date> values) {
            addCriterion("LOAN_VAL_DT in", values, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtNotIn(List<Date> values) {
            addCriterion("LOAN_VAL_DT not in", values, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtBetween(Date value1, Date value2) {
            addCriterion("LOAN_VAL_DT between", value1, value2, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanValDtNotBetween(Date value1, Date value2) {
            addCriterion("LOAN_VAL_DT not between", value1, value2, "loanValDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtIsNull() {
            addCriterion("LOAN_DUE_DT is null");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtIsNotNull() {
            addCriterion("LOAN_DUE_DT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtEqualTo(Date value) {
            addCriterion("LOAN_DUE_DT =", value, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtNotEqualTo(Date value) {
            addCriterion("LOAN_DUE_DT <>", value, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtGreaterThan(Date value) {
            addCriterion("LOAN_DUE_DT >", value, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtGreaterThanOrEqualTo(Date value) {
            addCriterion("LOAN_DUE_DT >=", value, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtLessThan(Date value) {
            addCriterion("LOAN_DUE_DT <", value, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtLessThanOrEqualTo(Date value) {
            addCriterion("LOAN_DUE_DT <=", value, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtIn(List<Date> values) {
            addCriterion("LOAN_DUE_DT in", values, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtNotIn(List<Date> values) {
            addCriterion("LOAN_DUE_DT not in", values, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtBetween(Date value1, Date value2) {
            addCriterion("LOAN_DUE_DT between", value1, value2, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andLoanDueDtNotBetween(Date value1, Date value2) {
            addCriterion("LOAN_DUE_DT not between", value1, value2, "loanDueDt");
            return (Criteria) this;
        }

        public Criteria andIntAmtIsNull() {
            addCriterion("INT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andIntAmtIsNotNull() {
            addCriterion("INT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andIntAmtEqualTo(BigDecimal value) {
            addCriterion("INT_AMT =", value, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtNotEqualTo(BigDecimal value) {
            addCriterion("INT_AMT <>", value, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtGreaterThan(BigDecimal value) {
            addCriterion("INT_AMT >", value, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INT_AMT >=", value, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtLessThan(BigDecimal value) {
            addCriterion("INT_AMT <", value, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INT_AMT <=", value, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtIn(List<BigDecimal> values) {
            addCriterion("INT_AMT in", values, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtNotIn(List<BigDecimal> values) {
            addCriterion("INT_AMT not in", values, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INT_AMT between", value1, value2, "intAmt");
            return (Criteria) this;
        }

        public Criteria andIntAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INT_AMT not between", value1, value2, "intAmt");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsIsNull() {
            addCriterion("INV_LOAN_STS is null");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsIsNotNull() {
            addCriterion("INV_LOAN_STS is not null");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsEqualTo(String value) {
            addCriterion("INV_LOAN_STS =", value, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsNotEqualTo(String value) {
            addCriterion("INV_LOAN_STS <>", value, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsGreaterThan(String value) {
            addCriterion("INV_LOAN_STS >", value, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsGreaterThanOrEqualTo(String value) {
            addCriterion("INV_LOAN_STS >=", value, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsLessThan(String value) {
            addCriterion("INV_LOAN_STS <", value, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsLessThanOrEqualTo(String value) {
            addCriterion("INV_LOAN_STS <=", value, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsLike(String value) {
            addCriterion("INV_LOAN_STS like", value, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsNotLike(String value) {
            addCriterion("INV_LOAN_STS not like", value, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsIn(List<String> values) {
            addCriterion("INV_LOAN_STS in", values, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsNotIn(List<String> values) {
            addCriterion("INV_LOAN_STS not in", values, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsBetween(String value1, String value2) {
            addCriterion("INV_LOAN_STS between", value1, value2, "invLoanSts");
            return (Criteria) this;
        }

        public Criteria andInvLoanStsNotBetween(String value1, String value2) {
            addCriterion("INV_LOAN_STS not between", value1, value2, "invLoanSts");
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
     * SCFCLOUD.LOAN_DETAIL
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SCFCLOUD.LOAN_DETAIL 2017-06-19
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