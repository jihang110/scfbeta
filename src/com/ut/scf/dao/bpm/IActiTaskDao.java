package com.ut.scf.dao.bpm;

import java.util.List;
import java.util.Map;

import com.ut.scf.core.dict.PageInfoBean;
import com.ut.scf.respbean.bpm.CompletedTaskRespBean;
import com.ut.scf.respbean.bpm.TaskListRespBean;

public interface IActiTaskDao {

	List<CompletedTaskRespBean> getCompletedTaskList(Map<String, Object> params, PageInfoBean page);

	List<TaskListRespBean> getTodoTaskList(Map<String, Object> params, PageInfoBean page);
}
