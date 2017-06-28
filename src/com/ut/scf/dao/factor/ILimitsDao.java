package com.ut.scf.dao.factor;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ut.scf.pojo.auto.Limits;

public interface ILimitsDao {

	List<Limits> getParentLimitBy(@Param("lmtId") String lmtId);

	int updateOccStsByAssLmt(@Param("lmtId") String lmtId, @Param("beforeSts") String beforeSts,
			@Param("afterSts") String afterSts);
}
