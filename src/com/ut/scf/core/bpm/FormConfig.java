package com.ut.scf.core.bpm;

/**
 * 可编辑字段配置，需要配置在流程图节点的documentation属性里
 * 
 * @author shenying
 *
 */
public class FormConfig {

	// 是否全部字段可编辑
	private boolean editable;

	// 排除字段
	// allEditable=true,排除字段表示的是不可编辑的字段
	// allEditable=false,排除字段表示的是可编辑的字段
	private String[] editableExclusion;

	// 隐藏字段
	private String[] visibleExclusion;

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String[] getEditableExclusion() {
		return editableExclusion;
	}

	public void setEditableExclusion(String[] editableExclusion) {
		this.editableExclusion = editableExclusion;
	}

	public String[] getVisibleExclusion() {
		return visibleExclusion;
	}

	public void setVisibleExclusion(String[] visibleExclusion) {
		this.visibleExclusion = visibleExclusion;
	}

 

}
