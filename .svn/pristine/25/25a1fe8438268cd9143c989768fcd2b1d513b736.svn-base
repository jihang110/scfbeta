package com.ut.scf.service.sys;

import com.ut.scf.core.dict.ScfCacheDict;
import com.ut.scf.core.util.SpringContextUtil;

public class IUserDeptRoleStrategyServiceFactory {

	public static final IUserDeptRoleStrategyService getBy() {
		String strategy = ScfCacheDict.sysConfigMap.get("userDeptRoleStrategy");
		return getBy(strategy);
	}

	public static final IUserDeptRoleStrategyService getBy(String strategy) {
		IUserDeptRoleStrategyService service = null;
		if (strategy.equals("forcebind")) {
			service = SpringContextUtil.getBean("userDeptRoleForcebindStrategyService",
					IUserDeptRoleStrategyService.class);
		} else if (strategy.equals("unbind")) {
			service = SpringContextUtil
					.getBean("userDeptRoleUnbindStrategyService", IUserDeptRoleStrategyService.class);
		}
		return service;
	}
}
