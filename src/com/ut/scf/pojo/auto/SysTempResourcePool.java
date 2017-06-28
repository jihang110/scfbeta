package com.ut.scf.pojo.auto;

import java.util.Date;

public class SysTempResourcePool {
    /**
     * 主键，id
     */
    private String recUid;

    /**
     * 定义
     */
    private String definition;

    /**
     * 实例ID
     */
    private String instanceid;

    /**
     * 键
     */
    private String key;

    /**
     * 共享值
     */
    private String value;

    /**
     * null
     */
    private String shareval;

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
     * 定义
     * @return DEFINITION 定义
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * 定义
     * @param definition 定义
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * 实例ID
     * @return INSTANCEID 实例ID
     */
    public String getInstanceid() {
        return instanceid;
    }

    /**
     * 实例ID
     * @param instanceid 实例ID
     */
    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid;
    }

    /**
     * 键
     * @return KEY 键
     */
    public String getKey() {
        return key;
    }

    /**
     * 键
     * @param key 键
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 共享值
     * @return VALUE 共享值
     */
    public String getValue() {
        return value;
    }

    /**
     * 共享值
     * @param value 共享值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * null
     * @return SHAREVAL null
     */
    public String getShareval() {
        return shareval;
    }

    /**
     * null
     * @param shareval null
     */
    public void setShareval(String shareval) {
        this.shareval = shareval;
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