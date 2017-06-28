package com.ut.scf.respbean.factor;

import java.math.BigDecimal;
import java.util.Date;

public class CancIntFeeDetailRespBean {
    /**
     * 主键
     */
    private String recUid;

    /**
     * 主表id
     */
    private String relaId;

    /**
     * 发票编号
     */
    private String invcNo;

    /**
     * 发票id
     */
    private String invcId;

    /**
     * 交易对手名称
     */
    private String counterPartyNm;

    /**
     * 交易对手id
     */
    private String counterPartyId;

    /**
     * 结算金额
     */
    private BigDecimal settlementAmt;

    /**
     * 账单状态
     */
    private String billSts;

    /**
     * 利息收取状态
     */
    private String intPaySts;

    /**
     * 费用收取状态
     */
    private String costPaySts;

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

    public String getRecUid() {
        return recUid;
    }

    public void setRecUid(String recUid) {
        this.recUid = recUid;
    }

    public String getRelaId() {
        return relaId;
    }

    public void setRelaId(String relaId) {
        this.relaId = relaId;
    }

    public String getInvcNo() {
        return invcNo;
    }

    public void setInvcNo(String invcNo) {
        this.invcNo = invcNo;
    }

    public String getInvcId() {
        return invcId;
    }

    public void setInvcId(String invcId) {
        this.invcId = invcId;
    }

    public String getCounterPartyNm() {
        return counterPartyNm;
    }

    public void setCounterPartyNm(String counterPartyNm) {
        this.counterPartyNm = counterPartyNm;
    }

    public String getCounterPartyId() {
        return counterPartyId;
    }

    public void setCounterPartyId(String counterPartyId) {
        this.counterPartyId = counterPartyId;
    }

    public BigDecimal getSettlementAmt() {
        return settlementAmt;
    }

    public void setSettlementAmt(BigDecimal settlementAmt) {
        this.settlementAmt = settlementAmt;
    }

    public String getBillSts() {
        return billSts;
    }

    public void setBillSts(String billSts) {
        this.billSts = billSts;
    }

    public String getIntPaySts() {
        return intPaySts;
    }

    public void setIntPaySts(String intPaySts) {
        this.intPaySts = intPaySts;
    }

    public String getCostPaySts() {
        return costPaySts;
    }

    public void setCostPaySts(String costPaySts) {
        this.costPaySts = costPaySts;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getBusiDt() {
        return busiDt;
    }

    public void setBusiDt(Date busiDt) {
        this.busiDt = busiDt;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
