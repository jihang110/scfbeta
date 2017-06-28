package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.Loan;
import com.ut.scf.pojo.auto.LoanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanMapper {
    /**
     *
     * @mbggenerated 2017-06-24
     */
    int countByExample(LoanExample example);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    int deleteByExample(LoanExample example);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    int deleteByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    int insert(Loan record);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    int insertSelective(Loan record);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    List<Loan> selectByExample(LoanExample example);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    Loan selectByPrimaryKey(String recUid);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    int updateByExampleSelective(@Param("record") Loan record, @Param("example") LoanExample example);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    int updateByExample(@Param("record") Loan record, @Param("example") LoanExample example);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    int updateByPrimaryKeySelective(Loan record);

    /**
     *
     * @mbggenerated 2017-06-24
     */
    int updateByPrimaryKey(Loan record);
}