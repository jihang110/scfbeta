package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.FeeFlow;
import com.ut.scf.pojo.auto.FeeFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeFlowMapper {
    /**
     *
     * @mbggenerated 2017-06-27
     */
    int countByExample(FeeFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    int deleteByExample(FeeFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    int deleteByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    int insert(FeeFlow record);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    int insertSelective(FeeFlow record);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    List<FeeFlow> selectByExample(FeeFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    FeeFlow selectByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    int updateByExampleSelective(@Param("record") FeeFlow record, @Param("example") FeeFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    int updateByExample(@Param("record") FeeFlow record, @Param("example") FeeFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    int updateByPrimaryKeySelective(FeeFlow record);

    /**
     *
     * @mbggenerated 2017-06-27
     */
    int updateByPrimaryKey(FeeFlow record);
}