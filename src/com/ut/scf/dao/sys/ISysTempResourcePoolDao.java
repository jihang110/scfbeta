package com.ut.scf.dao.sys;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Param;

public interface ISysTempResourcePoolDao {

	BigDecimal sumSharingValuesBy(@Param("def") String def, @Param("key") String key, @Param("val") String val);
}
