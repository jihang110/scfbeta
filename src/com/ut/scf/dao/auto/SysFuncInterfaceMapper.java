package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.SysFuncInterface;
import com.ut.scf.pojo.auto.SysFuncInterfaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFuncInterfaceMapper {
    /**
     *
     * @mbggenerated 2017-07-06
     */
    int countByExample(SysFuncInterfaceExample example);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    int deleteByExample(SysFuncInterfaceExample example);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    int deleteByPrimaryKey(String interfaceId);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    int insert(SysFuncInterface record);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    int insertSelective(SysFuncInterface record);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    List<SysFuncInterface> selectByExample(SysFuncInterfaceExample example);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    SysFuncInterface selectByPrimaryKey(String interfaceId);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    int updateByExampleSelective(@Param("record") SysFuncInterface record, @Param("example") SysFuncInterfaceExample example);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    int updateByExample(@Param("record") SysFuncInterface record, @Param("example") SysFuncInterfaceExample example);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    int updateByPrimaryKeySelective(SysFuncInterface record);

    /**
     *
     * @mbggenerated 2017-07-06
     */
    int updateByPrimaryKey(SysFuncInterface record);
}