package com.ut.scf.pojo.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCommonWebsiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCommonWebsiteExample() {
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

        public Criteria andRecUidIsNull() {
            addCriterion("REC_UID is null");
            return (Criteria) this;
        }

        public Criteria andRecUidIsNotNull() {
            addCriterion("REC_UID is not null");
            return (Criteria) this;
        }

        public Criteria andRecUidEqualTo(Object value) {
            addCriterion("REC_UID =", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotEqualTo(Object value) {
            addCriterion("REC_UID <>", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidGreaterThan(Object value) {
            addCriterion("REC_UID >", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidGreaterThanOrEqualTo(Object value) {
            addCriterion("REC_UID >=", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidLessThan(Object value) {
            addCriterion("REC_UID <", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidLessThanOrEqualTo(Object value) {
            addCriterion("REC_UID <=", value, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidIn(List<Object> values) {
            addCriterion("REC_UID in", values, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotIn(List<Object> values) {
            addCriterion("REC_UID not in", values, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidBetween(Object value1, Object value2) {
            addCriterion("REC_UID between", value1, value2, "recUid");
            return (Criteria) this;
        }

        public Criteria andRecUidNotBetween(Object value1, Object value2) {
            addCriterion("REC_UID not between", value1, value2, "recUid");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameIsNull() {
            addCriterion("WEBSITE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameIsNotNull() {
            addCriterion("WEBSITE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameEqualTo(Object value) {
            addCriterion("WEBSITE_NAME =", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotEqualTo(Object value) {
            addCriterion("WEBSITE_NAME <>", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameGreaterThan(Object value) {
            addCriterion("WEBSITE_NAME >", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameGreaterThanOrEqualTo(Object value) {
            addCriterion("WEBSITE_NAME >=", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameLessThan(Object value) {
            addCriterion("WEBSITE_NAME <", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameLessThanOrEqualTo(Object value) {
            addCriterion("WEBSITE_NAME <=", value, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameIn(List<Object> values) {
            addCriterion("WEBSITE_NAME in", values, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotIn(List<Object> values) {
            addCriterion("WEBSITE_NAME not in", values, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameBetween(Object value1, Object value2) {
            addCriterion("WEBSITE_NAME between", value1, value2, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteNameNotBetween(Object value1, Object value2) {
            addCriterion("WEBSITE_NAME not between", value1, value2, "websiteName");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressIsNull() {
            addCriterion("WEBSITE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressIsNotNull() {
            addCriterion("WEBSITE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressEqualTo(Object value) {
            addCriterion("WEBSITE_ADDRESS =", value, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressNotEqualTo(Object value) {
            addCriterion("WEBSITE_ADDRESS <>", value, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressGreaterThan(Object value) {
            addCriterion("WEBSITE_ADDRESS >", value, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressGreaterThanOrEqualTo(Object value) {
            addCriterion("WEBSITE_ADDRESS >=", value, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressLessThan(Object value) {
            addCriterion("WEBSITE_ADDRESS <", value, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressLessThanOrEqualTo(Object value) {
            addCriterion("WEBSITE_ADDRESS <=", value, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressIn(List<Object> values) {
            addCriterion("WEBSITE_ADDRESS in", values, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressNotIn(List<Object> values) {
            addCriterion("WEBSITE_ADDRESS not in", values, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressBetween(Object value1, Object value2) {
            addCriterion("WEBSITE_ADDRESS between", value1, value2, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andWebsiteAddressNotBetween(Object value1, Object value2) {
            addCriterion("WEBSITE_ADDRESS not between", value1, value2, "websiteAddress");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNull() {
            addCriterion("CORP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNotNull() {
            addCriterion("CORP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIdEqualTo(Object value) {
            addCriterion("CORP_ID =", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotEqualTo(Object value) {
            addCriterion("CORP_ID <>", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThan(Object value) {
            addCriterion("CORP_ID >", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThanOrEqualTo(Object value) {
            addCriterion("CORP_ID >=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThan(Object value) {
            addCriterion("CORP_ID <", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThanOrEqualTo(Object value) {
            addCriterion("CORP_ID <=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIn(List<Object> values) {
            addCriterion("CORP_ID in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotIn(List<Object> values) {
            addCriterion("CORP_ID not in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdBetween(Object value1, Object value2) {
            addCriterion("CORP_ID between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotBetween(Object value1, Object value2) {
            addCriterion("CORP_ID not between", value1, value2, "corpId");
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

        public Criteria andNoteEqualTo(Object value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(Object value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(Object value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(Object value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(Object value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(Object value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<Object> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<Object> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(Object value1, Object value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(Object value1, Object value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Object value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Object value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Object value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Object value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Object value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Object value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Object> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Object> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Object value1, Object value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Object value1, Object value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
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