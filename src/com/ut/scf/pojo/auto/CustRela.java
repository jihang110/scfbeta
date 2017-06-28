package com.ut.scf.pojo.auto;

import java.util.Date;

public class CustRela {
    /**
     * 主键，id
     */
    private String recUid;

    /**
     * 客户id
     */
    private String custId;

    /**
     * 交易对手id
     */
    private String counterPartyId;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除状态：0 删除，1 正常
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
     * 主键，id
     * @return REC_UID 主键，id
     */
    public String getRecUid() {
        return recUid;
    }

    /**
     * 主键，id
     * @param recUid 主键，id
     */
    public void setRecUid(String recUid) {
        this.recUid = recUid;
    }

    /**
     * 客户id
     * @return CUST_ID 客户id
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 客户id
     * @param custId 客户id
     */
    public void setCustId(String custId) {
        this.custId = custId;
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
     * 删除状态：0 删除，1 正常
     * @return STATUS 删除状态：0 删除，1 正常
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 删除状态：0 删除，1 正常
     * @param status 删除状态：0 删除，1 正常
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