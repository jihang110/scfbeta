package com.ut.scf.service.bpm.impl;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.JavaDelegate;

import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.service.sys.IUserDeptRoleStrategyService;
import com.ut.scf.service.sys.IUserDeptRoleStrategyServiceFactory;

/**
 * 设置会签成员
 * 
 * @author zyx
 *
 */
public class ActAssgineeMultiInstancePer implements JavaDelegate {

	private Expression roleIds;
	
	public void execute(DelegateExecution execution) throws Exception {
		// 通过roleId获取用户设置会签人员
		String ids ="ROLE000003,ROLE000005,ROLE000006,ROLE000007,";
		List<String> userlist = new ArrayList<String>();
		
		IUserDeptRoleStrategyService userDeptRoleStrategyService = IUserDeptRoleStrategyServiceFactory.getBy();
		List<SysUser> list = userDeptRoleStrategyService.getUserNamesBy(ids);
		for (SysUser u : list) {
			userlist.add(u.getUsername());
		}
		System.out.println("会签环节的人员" + userlist);
		execution.setVariable("pers", userlist);
		// 初始化同意人数
		execution.setVariable("signCount", 0);
		// 总共会签的人数
		// List userlist = (List)execution.getVariable("pers");
		int signSize = userlist.size();
		execution.setVariable("signSize", signSize);
	}

	public Expression getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Expression roleIds) {
		this.roleIds = roleIds;
	}
	
}
