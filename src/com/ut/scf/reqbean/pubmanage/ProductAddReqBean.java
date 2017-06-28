package com.ut.scf.reqbean.pubmanage;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午1:57:23
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class ProductAddReqBean {
	
	private String recUid;
	
	private String productNm;
	
	private String productDescript;
	
	private String pictureText;
	
	private String createUser;
	
    
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

	
    public String getProductDescript() {
    	return productDescript;
    }

	
    public void setProductDescript(String productDescript) {
    	this.productDescript = productDescript;
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
	
}
