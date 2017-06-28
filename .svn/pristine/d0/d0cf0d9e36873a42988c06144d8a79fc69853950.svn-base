package com.ut.scf.dao.auto;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.pojo.auto.DictMap;
import com.ut.scf.pojo.auto.DictMapExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DictMapMapper {
    int countByExample(DictMapExample example);

    int deleteByExample(DictMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(DictMap record);

    int insertSelective(DictMap record);

    List<DictMap> selectByExample(DictMapExample example, PageInfoBean page);

    DictMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DictMap record, @Param("example") DictMapExample example);

    int updateByExample(@Param("record") DictMap record, @Param("example") DictMapExample example);

    int updateByPrimaryKeySelective(DictMap record);

    int updateByPrimaryKey(DictMap record);
    
}