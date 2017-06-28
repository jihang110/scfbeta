package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CorpInfoExample {
    /**
     * SCFCLOUD.CORP_INFO
     */
    protected String orderByClause;

    /**
     * SCFCLOUD.CORP_INFO
     */
    protected boolean distinct;

    /**
     * SCFCLOUD.CORP_INFO
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public CorpInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-14
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
     * @mbggenerated 2017-06-14
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated 2017-06-14
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * SCFCLOUD.CORP_INFO 2017-06-14
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

        public Criteria andCorpIdIsNull() {
            addCriterion("CORP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNotNull() {
            addCriterion("CORP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIdEqualTo(String value) {
            addCriterion("CORP_ID =", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotEqualTo(String value) {
            addCriterion("CORP_ID <>", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThan(String value) {
            addCriterion("CORP_ID >", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_ID >=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThan(String value) {
            addCriterion("CORP_ID <", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThanOrEqualTo(String value) {
            addCriterion("CORP_ID <=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLike(String value) {
            addCriterion("CORP_ID like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotLike(String value) {
            addCriterion("CORP_ID not like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIn(List<String> values) {
            addCriterion("CORP_ID in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotIn(List<String> values) {
            addCriterion("CORP_ID not in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdBetween(String value1, String value2) {
            addCriterion("CORP_ID between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotBetween(String value1, String value2) {
            addCriterion("CORP_ID not between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNull() {
            addCriterion("CORP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNotNull() {
            addCriterion("CORP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCorpNameEqualTo(String value) {
            addCriterion("CORP_NAME =", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotEqualTo(String value) {
            addCriterion("CORP_NAME <>", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThan(String value) {
            addCriterion("CORP_NAME >", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_NAME >=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThan(String value) {
            addCriterion("CORP_NAME <", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThanOrEqualTo(String value) {
            addCriterion("CORP_NAME <=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLike(String value) {
            addCriterion("CORP_NAME like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotLike(String value) {
            addCriterion("CORP_NAME not like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameIn(List<String> values) {
            addCriterion("CORP_NAME in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotIn(List<String> values) {
            addCriterion("CORP_NAME not in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameBetween(String value1, String value2) {
            addCriterion("CORP_NAME between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotBetween(String value1, String value2) {
            addCriterion("CORP_NAME not between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpTypeIsNull() {
            addCriterion("CORP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCorpTypeIsNotNull() {
            addCriterion("CORP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCorpTypeEqualTo(String value) {
            addCriterion("CORP_TYPE =", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeNotEqualTo(String value) {
            addCriterion("CORP_TYPE <>", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeGreaterThan(String value) {
            addCriterion("CORP_TYPE >", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_TYPE >=", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeLessThan(String value) {
            addCriterion("CORP_TYPE <", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeLessThanOrEqualTo(String value) {
            addCriterion("CORP_TYPE <=", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeLike(String value) {
            addCriterion("CORP_TYPE like", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeNotLike(String value) {
            addCriterion("CORP_TYPE not like", value, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeIn(List<String> values) {
            addCriterion("CORP_TYPE in", values, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeNotIn(List<String> values) {
            addCriterion("CORP_TYPE not in", values, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeBetween(String value1, String value2) {
            addCriterion("CORP_TYPE between", value1, value2, "corpType");
            return (Criteria) this;
        }

        public Criteria andCorpTypeNotBetween(String value1, String value2) {
            addCriterion("CORP_TYPE not between", value1, value2, "corpType");
            return (Criteria) this;
        }

        public Criteria andSysTypeIsNull() {
            addCriterion("SYS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSysTypeIsNotNull() {
            addCriterion("SYS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSysTypeEqualTo(String value) {
            addCriterion("SYS_TYPE =", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotEqualTo(String value) {
            addCriterion("SYS_TYPE <>", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeGreaterThan(String value) {
            addCriterion("SYS_TYPE >", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_TYPE >=", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLessThan(String value) {
            addCriterion("SYS_TYPE <", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLessThanOrEqualTo(String value) {
            addCriterion("SYS_TYPE <=", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLike(String value) {
            addCriterion("SYS_TYPE like", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotLike(String value) {
            addCriterion("SYS_TYPE not like", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeIn(List<String> values) {
            addCriterion("SYS_TYPE in", values, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotIn(List<String> values) {
            addCriterion("SYS_TYPE not in", values, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeBetween(String value1, String value2) {
            addCriterion("SYS_TYPE between", value1, value2, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotBetween(String value1, String value2) {
            addCriterion("SYS_TYPE not between", value1, value2, "sysType");
            return (Criteria) this;
        }

        public Criteria andIsCountryIsNull() {
            addCriterion("IS_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andIsCountryIsNotNull() {
            addCriterion("IS_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIsCountryEqualTo(String value) {
            addCriterion("IS_COUNTRY =", value, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryNotEqualTo(String value) {
            addCriterion("IS_COUNTRY <>", value, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryGreaterThan(String value) {
            addCriterion("IS_COUNTRY >", value, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryGreaterThanOrEqualTo(String value) {
            addCriterion("IS_COUNTRY >=", value, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryLessThan(String value) {
            addCriterion("IS_COUNTRY <", value, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryLessThanOrEqualTo(String value) {
            addCriterion("IS_COUNTRY <=", value, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryLike(String value) {
            addCriterion("IS_COUNTRY like", value, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryNotLike(String value) {
            addCriterion("IS_COUNTRY not like", value, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryIn(List<String> values) {
            addCriterion("IS_COUNTRY in", values, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryNotIn(List<String> values) {
            addCriterion("IS_COUNTRY not in", values, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryBetween(String value1, String value2) {
            addCriterion("IS_COUNTRY between", value1, value2, "isCountry");
            return (Criteria) this;
        }

        public Criteria andIsCountryNotBetween(String value1, String value2) {
            addCriterion("IS_COUNTRY not between", value1, value2, "isCountry");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("LEGAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("LEGAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("LEGAL_PERSON =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("LEGAL_PERSON <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("LEGAL_PERSON >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("LEGAL_PERSON <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_PERSON <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("LEGAL_PERSON like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("LEGAL_PERSON not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("LEGAL_PERSON in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("LEGAL_PERSON not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("LEGAL_PERSON not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLmtAmtIsNull() {
            addCriterion("LMT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andLmtAmtIsNotNull() {
            addCriterion("LMT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andLmtAmtEqualTo(BigDecimal value) {
            addCriterion("LMT_AMT =", value, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtNotEqualTo(BigDecimal value) {
            addCriterion("LMT_AMT <>", value, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtGreaterThan(BigDecimal value) {
            addCriterion("LMT_AMT >", value, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LMT_AMT >=", value, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtLessThan(BigDecimal value) {
            addCriterion("LMT_AMT <", value, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LMT_AMT <=", value, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtIn(List<BigDecimal> values) {
            addCriterion("LMT_AMT in", values, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtNotIn(List<BigDecimal> values) {
            addCriterion("LMT_AMT not in", values, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMT_AMT between", value1, value2, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andLmtAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LMT_AMT not between", value1, value2, "lmtAmt");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("BUSINESS_LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("BUSINESS_LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("BUSINESS_LICENSE <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("BUSINESS_LICENSE like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("BUSINESS_LICENSE not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNull() {
            addCriterion("TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNotNull() {
            addCriterion("TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNoEqualTo(String value) {
            addCriterion("TAX_NO =", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotEqualTo(String value) {
            addCriterion("TAX_NO <>", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThan(String value) {
            addCriterion("TAX_NO >", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_NO >=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThan(String value) {
            addCriterion("TAX_NO <", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThanOrEqualTo(String value) {
            addCriterion("TAX_NO <=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLike(String value) {
            addCriterion("TAX_NO like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotLike(String value) {
            addCriterion("TAX_NO not like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoIn(List<String> values) {
            addCriterion("TAX_NO in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotIn(List<String> values) {
            addCriterion("TAX_NO not in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoBetween(String value1, String value2) {
            addCriterion("TAX_NO between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotBetween(String value1, String value2) {
            addCriterion("TAX_NO not between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIsNull() {
            addCriterion("OFFICE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIsNotNull() {
            addCriterion("OFFICE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS =", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS <>", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressGreaterThan(String value) {
            addCriterion("OFFICE_ADDRESS >", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS >=", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLessThan(String value) {
            addCriterion("OFFICE_ADDRESS <", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS <=", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLike(String value) {
            addCriterion("OFFICE_ADDRESS like", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotLike(String value) {
            addCriterion("OFFICE_ADDRESS not like", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIn(List<String> values) {
            addCriterion("OFFICE_ADDRESS in", values, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotIn(List<String> values) {
            addCriterion("OFFICE_ADDRESS not in", values, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressBetween(String value1, String value2) {
            addCriterion("OFFICE_ADDRESS between", value1, value2, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotBetween(String value1, String value2) {
            addCriterion("OFFICE_ADDRESS not between", value1, value2, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andMobPhoneIsNull() {
            addCriterion("MOB_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobPhoneIsNotNull() {
            addCriterion("MOB_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobPhoneEqualTo(String value) {
            addCriterion("MOB_PHONE =", value, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneNotEqualTo(String value) {
            addCriterion("MOB_PHONE <>", value, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneGreaterThan(String value) {
            addCriterion("MOB_PHONE >", value, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOB_PHONE >=", value, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneLessThan(String value) {
            addCriterion("MOB_PHONE <", value, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneLessThanOrEqualTo(String value) {
            addCriterion("MOB_PHONE <=", value, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneLike(String value) {
            addCriterion("MOB_PHONE like", value, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneNotLike(String value) {
            addCriterion("MOB_PHONE not like", value, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneIn(List<String> values) {
            addCriterion("MOB_PHONE in", values, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneNotIn(List<String> values) {
            addCriterion("MOB_PHONE not in", values, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneBetween(String value1, String value2) {
            addCriterion("MOB_PHONE between", value1, value2, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andMobPhoneNotBetween(String value1, String value2) {
            addCriterion("MOB_PHONE not between", value1, value2, "mobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneIsNull() {
            addCriterion("LEGAL_MOB_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneIsNotNull() {
            addCriterion("LEGAL_MOB_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneEqualTo(String value) {
            addCriterion("LEGAL_MOB_PHONE =", value, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneNotEqualTo(String value) {
            addCriterion("LEGAL_MOB_PHONE <>", value, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneGreaterThan(String value) {
            addCriterion("LEGAL_MOB_PHONE >", value, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_MOB_PHONE >=", value, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneLessThan(String value) {
            addCriterion("LEGAL_MOB_PHONE <", value, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_MOB_PHONE <=", value, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneLike(String value) {
            addCriterion("LEGAL_MOB_PHONE like", value, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneNotLike(String value) {
            addCriterion("LEGAL_MOB_PHONE not like", value, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneIn(List<String> values) {
            addCriterion("LEGAL_MOB_PHONE in", values, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneNotIn(List<String> values) {
            addCriterion("LEGAL_MOB_PHONE not in", values, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneBetween(String value1, String value2) {
            addCriterion("LEGAL_MOB_PHONE between", value1, value2, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andLegalMobPhoneNotBetween(String value1, String value2) {
            addCriterion("LEGAL_MOB_PHONE not between", value1, value2, "legalMobPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNull() {
            addCriterion("FIXED_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNotNull() {
            addCriterion("FIXED_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneEqualTo(String value) {
            addCriterion("FIXED_PHONE =", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotEqualTo(String value) {
            addCriterion("FIXED_PHONE <>", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThan(String value) {
            addCriterion("FIXED_PHONE >", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("FIXED_PHONE >=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThan(String value) {
            addCriterion("FIXED_PHONE <", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThanOrEqualTo(String value) {
            addCriterion("FIXED_PHONE <=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLike(String value) {
            addCriterion("FIXED_PHONE like", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotLike(String value) {
            addCriterion("FIXED_PHONE not like", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIn(List<String> values) {
            addCriterion("FIXED_PHONE in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotIn(List<String> values) {
            addCriterion("FIXED_PHONE not in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneBetween(String value1, String value2) {
            addCriterion("FIXED_PHONE between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotBetween(String value1, String value2) {
            addCriterion("FIXED_PHONE not between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrIsNull() {
            addCriterion("DOMICILE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrIsNotNull() {
            addCriterion("DOMICILE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrEqualTo(String value) {
            addCriterion("DOMICILE_ADDR =", value, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrNotEqualTo(String value) {
            addCriterion("DOMICILE_ADDR <>", value, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrGreaterThan(String value) {
            addCriterion("DOMICILE_ADDR >", value, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILE_ADDR >=", value, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrLessThan(String value) {
            addCriterion("DOMICILE_ADDR <", value, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrLessThanOrEqualTo(String value) {
            addCriterion("DOMICILE_ADDR <=", value, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrLike(String value) {
            addCriterion("DOMICILE_ADDR like", value, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrNotLike(String value) {
            addCriterion("DOMICILE_ADDR not like", value, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrIn(List<String> values) {
            addCriterion("DOMICILE_ADDR in", values, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrNotIn(List<String> values) {
            addCriterion("DOMICILE_ADDR not in", values, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrBetween(String value1, String value2) {
            addCriterion("DOMICILE_ADDR between", value1, value2, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andDomicileAddrNotBetween(String value1, String value2) {
            addCriterion("DOMICILE_ADDR not between", value1, value2, "domicileAddr");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdIsNull() {
            addCriterion("RELA_CORP_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdIsNotNull() {
            addCriterion("RELA_CORP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdEqualTo(String value) {
            addCriterion("RELA_CORP_ID =", value, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdNotEqualTo(String value) {
            addCriterion("RELA_CORP_ID <>", value, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdGreaterThan(String value) {
            addCriterion("RELA_CORP_ID >", value, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdGreaterThanOrEqualTo(String value) {
            addCriterion("RELA_CORP_ID >=", value, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdLessThan(String value) {
            addCriterion("RELA_CORP_ID <", value, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdLessThanOrEqualTo(String value) {
            addCriterion("RELA_CORP_ID <=", value, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdLike(String value) {
            addCriterion("RELA_CORP_ID like", value, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdNotLike(String value) {
            addCriterion("RELA_CORP_ID not like", value, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdIn(List<String> values) {
            addCriterion("RELA_CORP_ID in", values, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdNotIn(List<String> values) {
            addCriterion("RELA_CORP_ID not in", values, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdBetween(String value1, String value2) {
            addCriterion("RELA_CORP_ID between", value1, value2, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRelaCorpIdNotBetween(String value1, String value2) {
            addCriterion("RELA_CORP_ID not between", value1, value2, "relaCorpId");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("REG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("REG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("REG_DATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("REG_DATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("REG_DATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_DATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("REG_DATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("REG_DATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("REG_DATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("REG_DATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("REG_DATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("REG_DATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("LOGO_URL is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("LOGO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("LOGO_URL =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("LOGO_URL <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("LOGO_URL >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LOGO_URL >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("LOGO_URL <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("LOGO_URL <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("LOGO_URL like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("LOGO_URL not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("LOGO_URL in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("LOGO_URL not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("LOGO_URL between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("LOGO_URL not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalIsNull() {
            addCriterion("SPEC_NATURAL is null");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalIsNotNull() {
            addCriterion("SPEC_NATURAL is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalEqualTo(String value) {
            addCriterion("SPEC_NATURAL =", value, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalNotEqualTo(String value) {
            addCriterion("SPEC_NATURAL <>", value, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalGreaterThan(String value) {
            addCriterion("SPEC_NATURAL >", value, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_NATURAL >=", value, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalLessThan(String value) {
            addCriterion("SPEC_NATURAL <", value, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalLessThanOrEqualTo(String value) {
            addCriterion("SPEC_NATURAL <=", value, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalLike(String value) {
            addCriterion("SPEC_NATURAL like", value, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalNotLike(String value) {
            addCriterion("SPEC_NATURAL not like", value, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalIn(List<String> values) {
            addCriterion("SPEC_NATURAL in", values, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalNotIn(List<String> values) {
            addCriterion("SPEC_NATURAL not in", values, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalBetween(String value1, String value2) {
            addCriterion("SPEC_NATURAL between", value1, value2, "specNatural");
            return (Criteria) this;
        }

        public Criteria andSpecNaturalNotBetween(String value1, String value2) {
            addCriterion("SPEC_NATURAL not between", value1, value2, "specNatural");
            return (Criteria) this;
        }

        public Criteria andOrgnNoIsNull() {
            addCriterion("ORGN_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrgnNoIsNotNull() {
            addCriterion("ORGN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnNoEqualTo(String value) {
            addCriterion("ORGN_NO =", value, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoNotEqualTo(String value) {
            addCriterion("ORGN_NO <>", value, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoGreaterThan(String value) {
            addCriterion("ORGN_NO >", value, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORGN_NO >=", value, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoLessThan(String value) {
            addCriterion("ORGN_NO <", value, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoLessThanOrEqualTo(String value) {
            addCriterion("ORGN_NO <=", value, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoLike(String value) {
            addCriterion("ORGN_NO like", value, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoNotLike(String value) {
            addCriterion("ORGN_NO not like", value, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoIn(List<String> values) {
            addCriterion("ORGN_NO in", values, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoNotIn(List<String> values) {
            addCriterion("ORGN_NO not in", values, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoBetween(String value1, String value2) {
            addCriterion("ORGN_NO between", value1, value2, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andOrgnNoNotBetween(String value1, String value2) {
            addCriterion("ORGN_NO not between", value1, value2, "orgnNo");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
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
     * SCFCLOUD.CORP_INFO
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * SCFCLOUD.CORP_INFO 2017-06-14
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