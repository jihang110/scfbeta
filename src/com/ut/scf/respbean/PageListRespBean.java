package com.ut.scf.respbean;

import java.util.List;

import com.ut.scf.core.dict.PageInfoBean;

/**
 * 分页查询响应
 * 
 * @author shenying
 *
 */
public class PageListRespBean extends BaseRespBean {
	/**
	 * 常用于分页设置返回数据列表
	 * 
	 * @param dataList
	 * @param page
	 */
	public void putDataList(List<?> dataList, PageInfoBean page) {
		createResultData().put("dataList", dataList);
		createResultData().put("page", page);
	}

}
