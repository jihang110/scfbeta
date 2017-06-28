package com.ut.scf.pojo.auto;

import java.util.Date;

public class Product {
    private String recUid;

    private String productNm;

    private String productSts;

    private String pictureText;

    private String createUser;

    private Date createTime;

    private Short status;

    private Date busiDt;

    private String updateUser;

    private Date updateTime;

    private String productDescript;

    public String getRecUid() {
        return recUid;
    }

    public void setRecUid(String recUid) {
        this.recUid = recUid;
    }

    public String getProductNm() {
        return productNm;
    }

    public void setProductNm(String productNm) {
        this.productNm = productNm;
    }

    public String getProductSts() {
        return productSts;
    }

    public void setProductSts(String productSts) {
        this.productSts = productSts;
    }

    public String getPictureText() {
        return pictureText;
    }

    public void setPictureText(String pictureText) {
        this.pictureText = pictureText;
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

    public String getProductDescript() {
        return productDescript;
    }

    public void setProductDescript(String productDescript) {
        this.productDescript = productDescript;
    }
}