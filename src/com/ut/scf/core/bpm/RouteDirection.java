package com.ut.scf.core.bpm;

public class RouteDirection {

	private String id;

	private String name;

	private SequenceFlowConfig flowCfg;

	public RouteDirection() {
		super();
	}

	public RouteDirection(String id, String name, SequenceFlowConfig flowCfg) {
		super();
		this.id = id;
		this.name = name;
		this.flowCfg = flowCfg;
	}

	public SequenceFlowConfig getFlowCfg() {
		return flowCfg;
	}

	public void setFlowCfg(SequenceFlowConfig flowCfg) {
		this.flowCfg = flowCfg;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
