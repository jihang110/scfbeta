package com.ut.scf.reqbean.pubmanage;

import com.ut.scf.reqbean.BaseReqBean;


/**
 * 标题、简要说明. <br>
 * 类详细说明.
 * <p>
 * Copyright: Copyright (c) 2017年6月14日 下午8:29:30
 * <p>
 * Company: 南京信雅达友田信息技术有限公司
 * <p>
 * @author wuk@starutian.com
 * @version 1.0.0
 */
public class IntFeeDeleteReqBean extends BaseReqBean {

	private String recUid;

	private short status;

	
    public String getRecUid() {
    	return recUid;
    }

	
    public void setRecUid(String recUid) {
    	this.recUid = recUid;
    }

	
    public short getStatus() {
    	return status;
    }

	
    public void setStatus(short status) {
    	this.status = status;
    }
	
}
