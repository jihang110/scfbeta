package com.ut.scf.core.dict;

import java.io.Serializable;

import javax.validation.constraints.Min;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Page
 * 
 * @author zyx
 *
 */
public class PageInfoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * 当前页, 默认为第1页
	 */
	@Min(value = 1, message = "{page.pageNumber.min}")
	private int pageNumber = 1;

	/*
	 * 每页记录数
	 */
	private int pageSize = 10;

	/*
	 * 总记录数, 默认为-1, 表示需要查询
	 */
	private int totalRecord = -1;

	/*
	 * 总页数, 默认为-1, 表示需要计算
	 */
	private int totalPage = -1;


	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public void computeTotalPage() {
		this.totalPage =  (int) ((totalRecord % pageSize==0)? Math.floor(totalRecord/pageSize) : Math.floor(totalRecord/pageSize)+1);
	}
	
	public int getFirstResultIndex(String dbType) {
		return dbType.equalsIgnoreCase(ScfConsts.ORACLE_DBTYPE) ? (pageNumber - 1) * pageSize + 1 : (pageNumber - 1) * pageSize;
	}
}
