package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.Date;

public class Interests {
    /**
     * null
     */
    private String recUid;

    /**
     * 融资明细ID
     */
    private String loanDetailId;

    /**
     * 发票ID
     */
    private String invcId;

    /**
     * 总利息金额
     */
    private BigDecimal ttlIntAmt;

    /**
     * 上次计息日
     */
    private Date lastIntDt;

    /**
     * 承担方ID
     */
    private String bearerId;

    /**
     * null
     */
    private String createUser;

    /**
     * null
     */
    private Date createTime;

    /**
     * 0删除，1正常
     */
    private Short status;

    /**
     * null
     */
    private Date busiDt;

    /**
     * null
     */
    private String updateUser;

    /**
     * null
     */
    private Date updateTime;

    /**
     * null
     * @return REC_UID null
     */
    public String getRecUid() {
        return recUid;
    }

    /**
     * null
     * @param recUid null
     */
    public void setRecUid(String recUid) {
        this.recUid = recUid;
    }

    /**
     * 融资明细ID
     * @return LOAN_DETAIL_ID 融资明细ID
     */
    public String getLoanDetailId() {
        return loanDetailId;
    }

    /**
     * 融资明细ID
     * @param loanDetailId 融资明细ID
     */
    public void setLoanDetailId(String loanDetailId) {
        this.loanDetailId = loanDetailId;
    }

    /**
     * 发票ID
     * @return INVC_ID 发票ID
     */
    public String getInvcId() {
        return invcId;
    }

    /**
     * 发票ID
     * @param invcId 发票ID
     */
    public void setInvcId(String invcId) {
        this.invcId = invcId;
    }

    /**
     * 总利息金额
     * @return TTL_INT_AMT 总利息金额
     */
    public BigDecimal getTtlIntAmt() {
        return ttlIntAmt;
    }

    /**
     * 总利息金额
     * @param ttlIntAmt 总利息金额
     */
    public void setTtlIntAmt(BigDecimal ttlIntAmt) {
        this.ttlIntAmt = ttlIntAmt;
    }

    /**
     * 上次计息日
     * @return LAST_INT_DT 上次计息日
     */
    public Date getLastIntDt() {
        return lastIntDt;
    }

    /**
     * 上次计息日
     * @param lastIntDt 上次计息日
     */
    public void setLastIntDt(Date lastIntDt) {
        this.lastIntDt = lastIntDt;
    }

    /**
     * 承担方ID
     * @return BEARER_ID 承担方ID
     */
    public String getBearerId() {
        return bearerId;
    }

    /**
     * 承担方ID
     * @param bearerId 承担方ID
     */
    public void setBearerId(String bearerId) {
        this.bearerId = bearerId;
    }

    /**
     * null
     * @return CREATE_USER null
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * null
     * @param createUser null
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * null
     * @return CREATE_TIME null
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * null
     * @param createTime null
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 0删除，1正常
     * @return STATUS 0删除，1正常
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 0删除，1正常
     * @param status 0删除，1正常
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * null
     * @return BUSI_DT null
     */
    public Date getBusiDt() {
        return busiDt;
    }

    /**
     * null
     * @param busiDt null
     */
    public void setBusiDt(Date busiDt) {
        this.busiDt = busiDt;
    }

    /**
     * null
     * @return UPDATE_USER null
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * null
     * @param updateUser null
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * null
     * @return UPDATE_TIME null
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * null
     * @param updateTime null
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}