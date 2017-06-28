package com.ut.scf.reqbean.pubmanage;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午4:02:49
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * 
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class ProductUpdateReqBean {

	private String recUid;

	private String productNm;

	private String productSts;

	private String pictureText;

	private Short status;

	private Date busiDt;

	private String updateUser;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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
