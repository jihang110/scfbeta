package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.CntRecomSel;
import com.ut.scf.pojo.auto.CntRecomSelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CntRecomSelMapper {
    /**
     *
     * @mbggenerated 2017-06-19
     */
    int countByExample(CntRecomSelExample example);

    /**
     *
     * @mbggenerated 2017-06-19
     */
    int deleteByExample(CntRecomSelExample example);

    /**
     *
     * @mbggenerated 2017-06-19
     */
    int insert(CntRecomSel record);

    /**
     *
     * @mbggenerated 2017-06-19
     */
    int insertSelective(CntRecomSel record);

    /**
     *
     * @mbggenerated 2017-06-19
     */
    List<CntRecomSel> selectByExample(CntRecomSelExample example);

    /**
     *
     * @mbggenerated 2017-06-19
     */
    int updateByExampleSelective(@Param("record") CntRecomSel record, @Param("example") CntRecomSelExample example);

    /**
     *
     * @mbggenerated 2017-06-19
     */
    int updateByExample(@Param("record") CntRecomSel record, @Param("example") CntRecomSelExample example);
}