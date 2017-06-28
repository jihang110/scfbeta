package com.ut.scf.pojo.auto;

import java.util.Date;

public class SysBpmCandidateConfig {
    /**
     * 主键，id
     */
    private String recUid;

    /**
     * 流程定义KEY
     */
    private String prcDefKey;

    /**
     * 节点ID
     */
    private String taskId;

    /**
     * 候选人角色
     */
    private String candidateRole;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

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
     * 流程定义KEY
     * @return PRC_DEF_KEY 流程定义KEY
     */
    public String getPrcDefKey() {
        return prcDefKey;
    }

    /**
     * 流程定义KEY
     * @param prcDefKey 流程定义KEY
     */
    public void setPrcDefKey(String prcDefKey) {
        this.prcDefKey = prcDefKey;
    }

    /**
     * 节点ID
     * @return TASK_ID 节点ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 节点ID
     * @param taskId 节点ID
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * 候选人角色
     * @return CANDIDATE_ROLE 候选人角色
     */
    public String getCandidateRole() {
        return candidateRole;
    }

    /**
     * 候选人角色
     * @param candidateRole 候选人角色
     */
    public void setCandidateRole(String candidateRole) {
        this.candidateRole = candidateRole;
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