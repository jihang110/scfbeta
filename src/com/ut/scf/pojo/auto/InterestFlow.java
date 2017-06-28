package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.Date;

public class InterestFlow {
    /**
     * null
     */
    private String recUid;

    /**
     * 利息表外键
     */
    private String intUid;

    /**
     * 本次利息金额
     */
    private BigDecimal intAmt;

    /**
     * 利息收取标志：0.应收未收1.应收已收
     */
    private String intPayFlg;

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
     * 利息表外键
     * @return INT_UID 利息表外键
     */
    public String getIntUid() {
        return intUid;
    }

    /**
     * 利息表外键
     * @param intUid 利息表外键
     */
    public void setIntUid(String intUid) {
        this.intUid = intUid;
    }

    /**
     * 本次利息金额
     * @return INT_AMT 本次利息金额
     */
    public BigDecimal getIntAmt() {
        return intAmt;
    }

    /**
     * 本次利息金额
     * @param intAmt 本次利息金额
     */
    public void setIntAmt(BigDecimal intAmt) {
        this.intAmt = intAmt;
    }

    /**
     * 利息收取标志：0.应收未收1.应收已收
     * @return INT_PAY_FLG 利息收取标志：0.应收未收1.应收已收
     */
    public String getIntPayFlg() {
        return intPayFlg;
    }

    /**
     * 利息收取标志：0.应收未收1.应收已收
     * @param intPayFlg 利息收取标志：0.应收未收1.应收已收
     */
    public void setIntPayFlg(String intPayFlg) {
        this.intPayFlg = intPayFlg;
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