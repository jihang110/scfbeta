package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.InterestFlow;
import com.ut.scf.pojo.auto.InterestFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestFlowMapper {
    /**
     *
     * @mbggenerated 2017-06-26
     */
    int countByExample(InterestFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int deleteByExample(InterestFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int deleteByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int insert(InterestFlow record);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int insertSelective(InterestFlow record);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    List<InterestFlow> selectByExample(InterestFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    InterestFlow selectByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByExampleSelective(@Param("record") InterestFlow record, @Param("example") InterestFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByExample(@Param("record") InterestFlow record, @Param("example") InterestFlowExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByPrimaryKeySelective(InterestFlow record);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByPrimaryKey(InterestFlow record);
}