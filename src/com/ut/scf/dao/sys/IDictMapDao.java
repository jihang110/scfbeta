package com.ut.scf.dao.sys;

import com.ut.scf.core.dict.PageInfoBean;

import java.util.List;
import java.util.Map;


public interface IDictMapDao {
    
    List<Map<String, Object>> getDictMapList(Map<String, Object> paramMap, PageInfoBean page);
    
    List<Map<String, Object>> getDictMapList(Map<String, Object> paramMap);
    
    List<Map<String, String>> getAllDictMapList();
}