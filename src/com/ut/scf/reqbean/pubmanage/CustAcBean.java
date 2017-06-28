package com.ut.scf.reqbean.pubmanage;

import java.util.Date;

/**
 * 客户账号表
 * 
 * @author shenying
 *
 */
public class CustAcBean {
	/**
	 * 主键，id
	 */
	private String recUid;

	/**
	 * 账号户名
	 */
	private String acNm;

	/**
	 * 开户行行名
	 */
	private String acBkNm;

	/**
	 * 账号类型： 0.（供应商）放款账号 1.（供应商）扣款账号 2.虚拟账号 3.一般账号
	 */
	private String acTp;

	/**
	 * 账号状态： 0.未激活 1.已激活
	 */
	private String acSts;

	/**
	 * 账号
	 */
	private String acNo;

	/**
	 * 客户编号
	 */
	private String custId;

	/**
	 * 创建人
	 */
	private String createUser;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 删除状态：0 删除，1 正常
	 */
	private Short status;

	/**
	 * 业务日期
	 */
	private Date busiDt;

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
	 * 
	 * @return REC_UID 主键，id
	 */
	public String getRecUid() {
		return recUid;
	}

	/**
	 * 主键，id
	 * 
	 * @param recUid
	 *            主键，id
	 */
	public void setRecUid(String recUid) {
		this.recUid = recUid;
	}

	/**
	 * 账号户名
	 * 
	 * @return AC_NM 账号户名
	 */
	public String getAcNm() {
		return acNm;
	}

	/**
	 * 账号户名
	 * 
	 * @param acNm
	 *            账号户名
	 */
	public void setAcNm(String acNm) {
		this.acNm = acNm;
	}

	/**
	 * 开户行行名
	 * 
	 * @return AC_BK_NM 开户行行名
	 */
	public String getAcBkNm() {
		return acBkNm;
	}

	/**
	 * 开户行行名
	 * 
	 * @param acBkNm
	 *            开户行行名
	 */
	public void setAcBkNm(String acBkNm) {
		this.acBkNm = acBkNm;
	}

	/**
	 * 账号类型： 0.（供应商）放款账号 1.（供应商）扣款账号 2.虚拟账号 3.一般账号
	 * 
	 * @return AC_TP 账号类型： 0.（供应商）放款账号 1.（供应商）扣款账号 2.虚拟账号 3.一般账号
	 */
	public String getAcTp() {
		return acTp;
	}

	/**
	 * 账号类型： 0.（供应商）放款账号 1.（供应商）扣款账号 2.虚拟账号 3.一般账号
	 * 
	 * @param acTp
	 *            账号类型： 0.（供应商）放款账号 1.（供应商）扣款账号 2.虚拟账号 3.一般账号
	 */
	public void setAcTp(String acTp) {
		this.acTp = acTp;
	}

	/**
	 * 账号状态： 0.未激活 1.已激活
	 * 
	 * @return AC_STS 账号状态： 0.未激活 1.已激活
	 */
	public String getAcSts() {
		return acSts;
	}

	/**
	 * 账号状态： 0.未激活 1.已激活
	 * 
	 * @param acSts
	 *            账号状态： 0.未激活 1.已激活
	 */
	public void setAcSts(String acSts) {
		this.acSts = acSts;
	}

	/**
	 * 账号
	 * 
	 * @return AC_NO 账号
	 */
	public String getAcNo() {
		return acNo;
	}

	/**
	 * 账号
	 * 
	 * @param acNo
	 *            账号
	 */
	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	/**
	 * 客户编号
	 * 
	 * @return CUST_ID 客户编号
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * 客户编号
	 * 
	 * @param custId
	 *            客户编号
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * 创建人
	 * 
	 * @return CREATE_USER 创建人
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * 创建人
	 * 
	 * @param createUser
	 *            创建人
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * 创建时间
	 * 
	 * @return CREATE_TIME 创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * 创建时间
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 删除状态：0 删除，1 正常
	 * 
	 * @return STATUS 删除状态：0 删除，1 正常
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * 删除状态：0 删除，1 正常
	 * 
	 * @param status
	 *            删除状态：0 删除，1 正常
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * 业务日期
	 * 
	 * @return BUSI_DT 业务日期
	 */
	public Date getBusiDt() {
		return busiDt;
	}

	/**
	 * 业务日期
	 * 
	 * @param busiDt
	 *            业务日期
	 */
	public void setBusiDt(Date busiDt) {
		this.busiDt = busiDt;
	}

	/**
	 * 最后更新人
	 * 
	 * @return UPDATE_USER 最后更新人
	 */
	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * 最后更新人
	 * 
	 * @param updateUser
	 *            最后更新人
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * 最后更新时间
	 * 
	 * @return UPDATE_TIME 最后更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * 最后更新时间
	 * 
	 * @param updateTime
	 *            最后更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}