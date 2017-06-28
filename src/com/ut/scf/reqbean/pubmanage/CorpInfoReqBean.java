package com.ut.scf.reqbean.pubmanage;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.collect.Lists;
import com.ut.scf.core.annotation.UniqueResource;

/**
 * @author shenying
 *
 */
public class CorpInfoReqBean {
	/**
	 * 企业Id,主键
	 */
	private String corpId;

	/**
	 * 企业名称
	 */
	@UniqueResource
	private String corpName;

	/**
	 * 企业类型
	 */
	private String corpType;

	/**
	 * 企业性质，类型有2保理商/3券商/4核心企业/5供应商
	 */
	private String sysType;

	/**
	 * 是否国有,0:否1:是
	 */
	private String isCountry;

	/**
	 * 法定代表人
	 */
	private String legalPerson;

	/**
	 * 授信额度
	 */
	private BigDecimal lmtAmt;

	/**
	 * 营业执照
	 */
	private String businessLicense;

	/**
	 * 税号
	 */
	private String taxNo;

	/**
	 * 办公地址
	 */
	private String officeAddress;

	/**
	 * 联系方式
	 */
	private String mobPhone;

	/**
	 * 法人电话
	 */
	private String legalMobPhone;

	/**
	 * 固定电话
	 */
	private String fixedPhone;

	/**
	 * 住所地
	 */
	private String domicileAddr;

	/**
	 * 邮编
	 */
	private String postcode;

	/**
	 * 所属企业
	 */
	private String relaCorpId;

	/**
	 * 注册日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date regDate;

	/**
	 * 企业logo地址
	 */
	private String logoUrl;

	/**
	 * 特殊资质
	 */
	private String specNatural;

	/**
	 * 组织机构代码
	 */
	@UniqueResource
	private String orgnNo;

	/**
	 * 备注
	 */
	private String note;

	/**
	 * 电子邮箱
	 */
	private String email;

	/**
	 * 创建人
	 */
	private String createUser;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	/**
	 * 删除状态：0 删除，1 正常
	 */
	private Short status;

	/**
	 * null
	 */
	private Date busiDt;

	/**
	 * null
	 */
	private String updateUser;

	/**
	 * null
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	private List<CustAcBean> acctList = Lists.newArrayList();

	public List<CustAcBean> getAcctList() {
		return acctList;
	}

	public void setAcctList(List<CustAcBean> acctList) {
		this.acctList = acctList;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getCorpType() {
		return corpType;
	}

	public void setCorpType(String corpType) {
		this.corpType = corpType;
	}

	public String getSysType() {
		return sysType;
	}

	public void setSysType(String sysType) {
		this.sysType = sysType;
	}

	public String getIsCountry() {
		return isCountry;
	}

	public void setIsCountry(String isCountry) {
		this.isCountry = isCountry;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public BigDecimal getLmtAmt() {
		return lmtAmt;
	}

	public void setLmtAmt(BigDecimal lmtAmt) {
		this.lmtAmt = lmtAmt;
	}

	public String getBusinessLicense() {
		return businessLicense;
	}

	public void setBusinessLicense(String businessLicense) {
		this.businessLicense = businessLicense;
	}

	public String getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getMobPhone() {
		return mobPhone;
	}

	public void setMobPhone(String mobPhone) {
		this.mobPhone = mobPhone;
	}

	public String getLegalMobPhone() {
		return legalMobPhone;
	}

	public void setLegalMobPhone(String legalMobPhone) {
		this.legalMobPhone = legalMobPhone;
	}

	public String getFixedPhone() {
		return fixedPhone;
	}

	public void setFixedPhone(String fixedPhone) {
		this.fixedPhone = fixedPhone;
	}

	public String getDomicileAddr() {
		return domicileAddr;
	}

	public void setDomicileAddr(String domicileAddr) {
		this.domicileAddr = domicileAddr;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getRelaCorpId() {
		return relaCorpId;
	}

	public void setRelaCorpId(String relaCorpId) {
		this.relaCorpId = relaCorpId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getSpecNatural() {
		return specNatural;
	}

	public void setSpecNatural(String specNatural) {
		this.specNatural = specNatural;
	}

	public String getOrgnNo() {
		return orgnNo;
	}

	public void setOrgnNo(String orgnNo) {
		this.orgnNo = orgnNo;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}
