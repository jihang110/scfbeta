package com.ut.scf.web.controller.bpm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.core.dict.ScfConsts;
import com.ut.scf.core.util.BeanUtil;
import com.ut.scf.pojo.auto.SysUser;
import com.ut.scf.reqbean.PageReqBean;
import com.ut.scf.reqbean.bpm.AuditHisReqBean;
import com.ut.scf.reqbean.bpm.CompletedTaskListReqBean;
import com.ut.scf.respbean.BaseRespBean;
import com.ut.scf.respbean.DataListRespBean;
import com.ut.scf.respbean.PageListRespBean;
import com.ut.scf.respbean.bpm.AuditHisListRespBean;
import com.ut.scf.respbean.bpm.CompletedTaskRespBean;
import com.ut.scf.respbean.bpm.TaskListRespBean;
import com.ut.scf.service.bpm.BpmCommonService;
import com.ut.scf.service.sys.UserOperService;
import com.ut.scf.web.controller.BaseJsonController;

@Controller
@RequestMapping("/bpm")
public class BpmCommonController extends BaseJsonController {

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private BpmCommonService bpmCommonService;

	@Autowired
	private UserOperService userOperService;

	private static final String TASK_PREFFIX = "/task";

	protected String getCurrentProcessor() {
		return (String) request.getSession().getAttribute(ScfConsts.SESSION_USER_ID);
	}

	@RequestMapping(value = TASK_PREFFIX + "/todoList")
	@ResponseBody
	public BaseRespBean queryList(@RequestBody @Valid PageReqBean pageReqBean) {
		PageInfoBean page = pageReqBean.getPage();
		Map<String, Object> params = Maps.newHashMap();
		params.put("userId", getCurrentProcessor());

		List<TaskListRespBean> taskRespList = bpmCommonService.queryToDoTaskList(params, page);
		for (TaskListRespBean task : taskRespList) {
			SysUser user = userOperService.getById(task.getLastProcessorId());
			if (user != null) {
				task.setLastProcessor(user.getRealname());
			}
		}

		PageListRespBean resp = new PageListRespBean();
		resp.putDataList(taskRespList, page);
		return resp;
	}

	// 流程审批历史列表
	@RequestMapping(value = TASK_PREFFIX + "/historylist")
	@ResponseBody
	public BaseRespBean queryAuditHistorylist(@RequestBody @Valid AuditHisReqBean auditHisReqBean) {
		List<AuditHisListRespBean> hisList = bpmCommonService.queryAuditHistoryList(auditHisReqBean);
		DataListRespBean listResp = new DataListRespBean();
		listResp.putDataList(hisList);
		return listResp;
	}

	@RequestMapping(value = TASK_PREFFIX + "/completedlist")
	@ResponseBody
	public BaseRespBean queryCompletedTaskList(@RequestBody @Valid CompletedTaskListReqBean ctlReqBean) {
		String userId = (String) getSessionAttribute(ScfConsts.SESSION_USER_ID);
		PageInfoBean page = ctlReqBean.getPage();
		Map<String, Object> params = BeanUtil.beanToMap(ctlReqBean);
		params.put("userId", userId);
		List<CompletedTaskRespBean> taskList = bpmCommonService.getCompletedTaskList(params, page);
		PageListRespBean resp = new PageListRespBean();
		resp.putDataList(taskList, page);
		return resp;
	}

	@RequestMapping(value = "/graph", method = RequestMethod.GET)
	public void Graph(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String processDefinitionId = request.getParameter("processDefinitionId");
		processDefinitionId = StringUtils.isNotEmpty(processDefinitionId) ? processDefinitionId.replace("%3A", ":")
				: processDefinitionId;
		String processInstanceId = request.getParameter("processInstanceId");
		processInstanceId = StringUtils.isNotEmpty(processInstanceId) ? processInstanceId.replace("%3A", ":")
				: processInstanceId;
		String taskId = request.getParameter("taskId");

		// 设置响应的类型格式为图片格式
		response.setContentType("image/jpeg");
		// 禁止图像缓存。
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setCharacterEncoding("utf-8");

		InputStream is = bpmCommonService.getProcessGraph(processDefinitionId, processInstanceId, taskId);
		OutputStream toClient = response.getOutputStream();
		int len = 0;
		byte[] b = new byte[1024];
		while ((len = is.read(b, 0, 1024)) != -1) {
			toClient.write(b, 0, len);
		}
		toClient.flush();
		toClient.close();
		is.close();
	}

}
