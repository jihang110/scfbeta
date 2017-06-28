package com.ut.scf.pojo.auto;

import java.math.BigDecimal;
import java.util.Date;

public class Limits {
    /**
     * 额度ID
     */
    private String recUid;

    /**
     * 父额度ID
     */
    private String parentId;

    /**
     * 客户ID
     */
    private String corpId;

    /**
     * 协议ID
     */
    private String cntId;

    /**
     * 额度类型：1.授信额度2.产品额度3.关联额度
     */
    private String lmtTp;

    /**
     * 额度到期日
     */
    private Date lmtDueDt;

    /**
     * 额度状态：0.有效 1.锁定
     */
    private String lmtSts;

    /**
     * 额度使用类型：0.循环额度1.单笔额度
     */
    private String lmtUsingTp;

    /**
     * 额度总金额
     */
    private BigDecimal lmtAmt;

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
     * 额度ID
     * @return REC_UID 额度ID
     */
    public String getRecUid() {
        return recUid;
    }

    /**
     * 额度ID
     * @param recUid 额度ID
     */
    public void setRecUid(String recUid) {
        this.recUid = recUid;
    }

    /**
     * 父额度ID
     * @return PARENT_ID 父额度ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 父额度ID
     * @param parentId 父额度ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 客户ID
     * @return CORP_ID 客户ID
     */
    public String getCorpId() {
        return corpId;
    }

    /**
     * 客户ID
     * @param corpId 客户ID
     */
    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    /**
     * 协议ID
     * @return CNT_ID 协议ID
     */
    public String getCntId() {
        return cntId;
    }

    /**
     * 协议ID
     * @param cntId 协议ID
     */
    public void setCntId(String cntId) {
        this.cntId = cntId;
    }

    /**
     * 额度类型：1.授信额度2.产品额度3.关联额度
     * @return LMT_TP 额度类型：1.授信额度2.产品额度3.关联额度
     */
    public String getLmtTp() {
        return lmtTp;
    }

    /**
     * 额度类型：1.授信额度2.产品额度3.关联额度
     * @param lmtTp 额度类型：1.授信额度2.产品额度3.关联额度
     */
    public void setLmtTp(String lmtTp) {
        this.lmtTp = lmtTp;
    }

    /**
     * 额度到期日
     * @return LMT_DUE_DT 额度到期日
     */
    public Date getLmtDueDt() {
        return lmtDueDt;
    }

    /**
     * 额度到期日
     * @param lmtDueDt 额度到期日
     */
    public void setLmtDueDt(Date lmtDueDt) {
        this.lmtDueDt = lmtDueDt;
    }

    /**
     * 额度状态：0.有效 1.锁定
     * @return LMT_STS 额度状态：0.有效 1.锁定
     */
    public String getLmtSts() {
        return lmtSts;
    }

    /**
     * 额度状态：0.有效 1.锁定
     * @param lmtSts 额度状态：0.有效 1.锁定
     */
    public void setLmtSts(String lmtSts) {
        this.lmtSts = lmtSts;
    }

    /**
     * 额度使用类型：0.循环额度1.单笔额度
     * @return LMT_USING_TP 额度使用类型：0.循环额度1.单笔额度
     */
    public String getLmtUsingTp() {
        return lmtUsingTp;
    }

    /**
     * 额度使用类型：0.循环额度1.单笔额度
     * @param lmtUsingTp 额度使用类型：0.循环额度1.单笔额度
     */
    public void setLmtUsingTp(String lmtUsingTp) {
        this.lmtUsingTp = lmtUsingTp;
    }

    /**
     * 额度总金额
     * @return LMT_AMT 额度总金额
     */
    public BigDecimal getLmtAmt() {
        return lmtAmt;
    }

    /**
     * 额度总金额
     * @param lmtAmt 额度总金额
     */
    public void setLmtAmt(BigDecimal lmtAmt) {
        this.lmtAmt = lmtAmt;
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