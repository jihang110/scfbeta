package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.Interests;
import com.ut.scf.pojo.auto.InterestsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterestsMapper {
    /**
     *
     * @mbggenerated 2017-06-26
     */
    int countByExample(InterestsExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int deleteByExample(InterestsExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int insert(Interests record);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int insertSelective(Interests record);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    List<Interests> selectByExample(InterestsExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByExampleSelective(@Param("record") Interests record, @Param("example") InterestsExample example);

    /**
     *
     * @mbggenerated 2017-06-26
     */
    int updateByExample(@Param("record") Interests record, @Param("example") InterestsExample example);
}