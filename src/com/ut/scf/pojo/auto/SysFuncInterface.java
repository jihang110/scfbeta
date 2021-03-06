package com.ut.scf.pojo.auto;

import java.util.Date;

public class SysFuncInterface {
    /**
     * 功能接口Id,主键
     */
    private String interfaceId;

    /**
     * 接口名称
     */
    private String interfaceName;

    /**
     * 接口访问路径
     */
    private String path;

    /**
     * 接口访问方式
     */
    private String method;

    /**
     * 访问权限状态，0：不受限，1：受限，通过角色接口关系表配置
     */
    private Short accessStatus;

    /**
     * 备注
     */
    private String note;

    /**
     * 日志监控信息模板
     */
    private Date createTime;

    /**
     * null
     */
    private String logTemplate;

    /**
     * 功能接口Id,主键
     * @return INTERFACE_ID 功能接口Id,主键
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * 功能接口Id,主键
     * @param interfaceId 功能接口Id,主键
     */
    public void setInterfaceId(String interfaceId) {
        this.interfaceId = interfaceId;
    }

    /**
     * 接口名称
     * @return INTERFACE_NAME 接口名称
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * 接口名称
     * @param interfaceName 接口名称
     */
    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    /**
     * 接口访问路径
     * @return PATH 接口访问路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 接口访问路径
     * @param path 接口访问路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 接口访问方式
     * @return METHOD 接口访问方式
     */
    public String getMethod() {
        return method;
    }

    /**
     * 接口访问方式
     * @param method 接口访问方式
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * 访问权限状态，0：不受限，1：受限，通过角色接口关系表配置
     * @return ACCESS_STATUS 访问权限状态，0：不受限，1：受限，通过角色接口关系表配置
     */
    public Short getAccessStatus() {
        return accessStatus;
    }

    /**
     * 访问权限状态，0：不受限，1：受限，通过角色接口关系表配置
     * @param accessStatus 访问权限状态，0：不受限，1：受限，通过角色接口关系表配置
     */
    public void setAccessStatus(Short accessStatus) {
        this.accessStatus = accessStatus;
    }

    /**
     * 备注
     * @return NOTE 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 备注
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 日志监控信息模板
     * @return CREATE_TIME 日志监控信息模板
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 日志监控信息模板
     * @param createTime 日志监控信息模板
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * null
     * @return LOG_TEMPLATE null
     */
    public String getLogTemplate() {
        return logTemplate;
    }

    /**
     * null
     * @param logTemplate null
     */
    public void setLogTemplate(String logTemplate) {
        this.logTemplate = logTemplate;
    }
}