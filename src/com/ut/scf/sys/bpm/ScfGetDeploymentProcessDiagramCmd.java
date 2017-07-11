package com.ut.scf.sys.bpm;

import java.io.InputStream;

import org.activiti.bpmn.model.BpmnModel;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.impl.cmd.GetBpmnModelCmd;
import org.activiti.engine.impl.cmd.GetDeploymentProcessDiagramCmd;
import org.activiti.engine.impl.context.Context;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.image.impl.DefaultProcessDiagramGenerator;

public class ScfGetDeploymentProcessDiagramCmd extends GetDeploymentProcessDiagramCmd implements Command<InputStream> {

	private static final long serialVersionUID = -201146676736541615L;

	public ScfGetDeploymentProcessDiagramCmd(String processDefinitionId) {
		super(processDefinitionId);
	}

	public InputStream execute(CommandContext commandContext) {
		GetBpmnModelCmd getBpmnModelCmd = new GetBpmnModelCmd(processDefinitionId);
		BpmnModel bpmnModel = getBpmnModelCmd.execute(commandContext);
		ProcessEngineConfiguration processEngineConfiguration = Context.getProcessEngineConfiguration();
		InputStream is = new DefaultProcessDiagramGenerator().generateDiagram(bpmnModel, "png",
				processEngineConfiguration.getProcessEngineConfiguration().getActivityFontName(),
				processEngineConfiguration.getProcessEngineConfiguration().getLabelFontName(),
				processEngineConfiguration.getProcessEngineConfiguration().getAnnotationFontName(), null, 1.0);
		return is;
	}
}
