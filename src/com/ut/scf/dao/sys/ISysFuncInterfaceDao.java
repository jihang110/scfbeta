package com.ut.scf.dao.sys;

import java.util.List;
import java.util.Map;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.pojo.auto.SysFuncInterface;

/**
 * 系统接口表操作
 * @author shenying
 *
 */
public interface ISysFuncInterfaceDao {

	List<SysFuncInterface> getList(Map<String, Object> paramMap, PageInfoBean page);

	List<SysFuncInterface> getList(Map<String, Object> paramMap);
}
