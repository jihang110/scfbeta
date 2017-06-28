package com.ut.scf.core.bpm;

public class BpmConsts {
	// 发起人
	public static final String START_USERID = "startUserId";
	
	// 最后处理人
	public static final String LAST_PROCESSOR = "lastProcessor";
	// 最后处理时间
	public static final String LAST_PROCESS_TIME = "lastProcessTime";

	// 表单变量名
	public static final String FORMDATA_VAR = "formData";

	// 审批意见变量默认前缀，一个审批节点可能有多个审批意见
	public static final String OPINION_VAR_PREFFIX = "vc_";

	// 任务审核动作
	public static final String TASK_FLOWED_NAME = "taskFlowedName";

	// 节点路由变量
	public static final String DIRECTION_VAR = "direction";

	// 节点只有一条出线时，返回的路由ID和name
	public static final String ONEWAY_ROUTE = "ONEWAYROUTE";

	public static final String ONEWAY_ROUTE_NAME = "提交";

}
