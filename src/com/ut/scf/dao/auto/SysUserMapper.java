package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.pojo.auto.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    /**
     *
     * @mbggenerated 2017-06-29
     */
    int countByExample(SysUserExample example);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    int deleteByExample(SysUserExample example);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    int deleteByPrimaryKey(String userId);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    int insert(SysUser record);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    int insertSelective(SysUser record);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    SysUser selectByPrimaryKey(String userId);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     *
     * @mbggenerated 2017-06-29
     */
    int updateByPrimaryKey(SysUser record);
}