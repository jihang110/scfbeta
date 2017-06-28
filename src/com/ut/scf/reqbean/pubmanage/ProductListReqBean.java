package com.ut.scf.reqbean.pubmanage;

import com.ut.scf.reqbean.PageReqBean;


/**
 * 标题、简要说明. <br>
 * 产品list实体
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午3:32:25
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class ProductListReqBean extends PageReqBean {

	private String recUid;
	
	private String productNm;
	
	private String pictureText;

	
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

	
    public String getPictureText() {
    	return pictureText;
    }

	
    public void setPictureText(String pictureText) {
    	this.pictureText = pictureText;
    }
	
}
