package com.ut.scf.dao.auto;

import com.ut.scf.pojo.auto.SysUserDeptRole;
import com.ut.scf.pojo.auto.SysUserDeptRoleExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysUserDeptRoleMapper {
    long countByExample(SysUserDeptRoleExample example);

    int deleteByExample(SysUserDeptRoleExample example);

    int deleteByPrimaryKey(String recUid);
    
    int deleteById(String userId);

    int insert(SysUserDeptRole record);

    int insertSelective(SysUserDeptRole record);

    List<SysUserDeptRole> selectByExample(SysUserDeptRoleExample example);

    SysUserDeptRole selectByPrimaryKey(String recUid);

    int updateByExampleSelective(@Param("record") SysUserDeptRole record, @Param("example") SysUserDeptRoleExample example);

    int updateByExample(@Param("record") SysUserDeptRole record, @Param("example") SysUserDeptRoleExample example);

    int updateByPrimaryKeySelective(SysUserDeptRole record);

    int updateByPrimaryKey(SysUserDeptRole record);

}