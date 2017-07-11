package com.ut.scf.pojo.auto;

import java.util.Date;

public class SysUser {
    /**
     * 用户Id,主键
     */
    private String userId;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户姓名
     */
    private String realname;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobilephone;

    /**
     * 固定电话
     */
    private String fixedPhone;

    /**
     * 所属企业Id
     */
    private String corpId;

    /**
     * 照片url
     */
    private String photoUrl;

    /**
     * 备注
     */
    private String note;

    /**
     * 记录创建时间
     */
    private Date createTime;

    /**
     * 状态，0：删除，1：正常
     */
    private Short status;

    /**
     * 用户Id,主键
     * @return USER_ID 用户Id,主键
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户Id,主键
     * @param userId 用户Id,主键
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 用户名称
     * @return USERNAME 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名称
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码
     * @return PASSWORD 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 用户姓名
     * @return REALNAME 用户姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 用户姓名
     * @param realname 用户姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 邮箱
     * @return EMAIL 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 手机号
     * @return MOBILEPHONE 手机号
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * 手机号
     * @param mobilephone 手机号
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    /**
     * 固定电话
     * @return FIXED_PHONE 固定电话
     */
    public String getFixedPhone() {
        return fixedPhone;
    }

    /**
     * 固定电话
     * @param fixedPhone 固定电话
     */
    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone;
    }

    /**
     * 所属企业Id
     * @return CORP_ID 所属企业Id
     */
    public String getCorpId() {
        return corpId;
    }

    /**
     * 所属企业Id
     * @param corpId 所属企业Id
     */
    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    /**
     * 照片url
     * @return PHOTO_URL 照片url
     */
    public String getPhotoUrl() {
        return photoUrl;
    }

    /**
     * 照片url
     * @param photoUrl 照片url
     */
    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
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
     * 记录创建时间
     * @return CREATE_TIME 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 记录创建时间
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 状态，0：删除，1：正常
     * @return STATUS 状态，0：删除，1：正常
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 状态，0：删除，1：正常
     * @param status 状态，0：删除，1：正常
     */
    public void setStatus(Short status) {
        this.status = status;
    }
}