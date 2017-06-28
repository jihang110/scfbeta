package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    /**
     * 主键
     */
    private String recUid;

    /**
     * 协议id
     */
    private String cntId;

    /**
     * 产品id
     */
    private String productId;

    /**
     * 交易对手id
     */
    private String counterPartyId;

    /**
     * 未付应付账款总额
     */
    private BigDecimal unpaidPayableAmt;

    /**
     * 本次付款总额
     */
    private BigDecimal ttlPmtAmt;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 0删除，1正常
     */
    private Short status;

    /**
     * 业务日期
     */
    private Date busiDt;

    /**
     * 最后更新人
     */
    private String updateUser;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 主键
     * @return REC_UID 主键
     */
    public String getRecUid() {
        return recUid;
    }

    /**
     * 主键
     * @param recUid 主键
     */
    public void setRecUid(String recUid) {
        this.recUid = recUid;
    }

    /**
     * 协议id
     * @return CNT_ID 协议id
     */
    public String getCntId() {
        return cntId;
    }

    /**
     * 协议id
     * @param cntId 协议id
     */
    public void setCntId(String cntId) {
        this.cntId = cntId;
    }

    /**
     * 产品id
     * @return PRODUCT_ID 产品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 产品id
     * @param productId 产品id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 交易对手id
     * @return COUNTER_PARTY_ID 交易对手id
     */
    public String getCounterPartyId() {
        return counterPartyId;
    }

    /**
     * 交易对手id
     * @param counterPartyId 交易对手id
     */
    public void setCounterPartyId(String counterPartyId) {
        this.counterPartyId = counterPartyId;
    }

    /**
     * 未付应付账款总额
     * @return UNPAID_PAYABLE_AMT 未付应付账款总额
     */
    public BigDecimal getUnpaidPayableAmt() {
        return unpaidPayableAmt;
    }

    /**
     * 未付应付账款总额
     * @param unpaidPayableAmt 未付应付账款总额
     */
    public void setUnpaidPayableAmt(BigDecimal unpaidPayableAmt) {
        this.unpaidPayableAmt = unpaidPayableAmt;
    }

    /**
     * 本次付款总额
     * @return TTL_PMT_AMT 本次付款总额
     */
    public BigDecimal getTtlPmtAmt() {
        return ttlPmtAmt;
    }

    /**
     * 本次付款总额
     * @param ttlPmtAmt 本次付款总额
     */
    public void setTtlPmtAmt(BigDecimal ttlPmtAmt) {
        this.ttlPmtAmt = ttlPmtAmt;
    }

    /**
     * 创建人
     * @return CREATE_USER 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     * @param createUser 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
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
     * 业务日期
     * @return BUSI_DT 业务日期
     */
    public Date getBusiDt() {
        return busiDt;
    }

    /**
     * 业务日期
     * @param busiDt 业务日期
     */
    public void setBusiDt(Date busiDt) {
        this.busiDt = busiDt;
    }

    /**
     * 最后更新人
     * @return UPDATE_USER 最后更新人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 最后更新人
     * @param updateUser 最后更新人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 最后更新时间
     * @return UPDATE_TIME 最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 最后更新时间
     * @param updateTime 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}