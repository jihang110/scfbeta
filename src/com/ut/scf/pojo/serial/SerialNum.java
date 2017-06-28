package com.ut.scf.pojo.serial;

import java.util.Date;

public class SerialNum {
    /**
     * 流水号表编号
     */
    private String serialId;

    /**
     * 流水号指派给的表名
     */
    private String serialNm;

    /**
     * 流水号规则
     */
    private String serialRule;

    /**
     * 模块一
     */
    private String modOne;

    /**
     * 模块二
     */
    private String modTwo;

    /**
     * 分隔符 ： 1 不使用分隔符，  2 - ， 3 _ ， 4 ： ，5 空格
     */
    private String separator;

    /**
     * 流水号状态：0 冻结 ，1 正常
     */
    private String status;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 流水号表编号
     * @return SERIAL_ID 流水号表编号
     */
    public String getSerialId() {
        return serialId;
    }

    /**
     * 流水号表编号
     * @param serialId 流水号表编号
     */
    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    /**
     * 流水号指派给的表名
     * @return SERIAL_NM 流水号指派给的表名
     */
    public String getSerialNm() {
        return serialNm;
    }

    /**
     * 流水号指派给的表名
     * @param serialNm 流水号指派给的表名
     */
    public void setSerialNm(String serialNm) {
        this.serialNm = serialNm;
    }

    /**
     * 流水号规则
     * @return SERIAL_RULE 流水号规则
     */
    public String getSerialRule() {
        return serialRule;
    }

    /**
     * 流水号规则
     * @param serialRule 流水号规则
     */
    public void setSerialRule(String serialRule) {
        this.serialRule = serialRule;
    }

    /**
     * 模块一
     * @return MOD_ONE 模块一
     */
    public String getModOne() {
        return modOne;
    }

    /**
     * 模块一
     * @param modOne 模块一
     */
    public void setModOne(String modOne) {
        this.modOne = modOne;
    }

    /**
     * 模块二
     * @return MOD_TWO 模块二
     */
    public String getModTwo() {
        return modTwo;
    }

    /**
     * 模块二
     * @param modTwo 模块二
     */
    public void setModTwo(String modTwo) {
        this.modTwo = modTwo;
    }

    /**
     * 分隔符 ： 1 不使用分隔符，  2 - ， 3 _ ， 4 ： ，5 空格
     * @return SEPARATOR 分隔符 ： 1 不使用分隔符，  2 - ， 3 _ ， 4 ： ，5 空格
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * 分隔符 ： 1 不使用分隔符，  2 - ， 3 _ ， 4 ： ，5 空格
     * @param separator 分隔符 ： 1 不使用分隔符，  2 - ， 3 _ ， 4 ： ，5 空格
     */
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    /**
     * 流水号状态：0 冻结 ，1 正常
     * @return STATUS 流水号状态：0 冻结 ，1 正常
     */
    public String getStatus() {
        return status;
    }

    /**
     * 流水号状态：0 冻结 ，1 正常
     * @param status 流水号状态：0 冻结 ，1 正常
     */
    public void setStatus(String status) {
        this.status = status;
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
}