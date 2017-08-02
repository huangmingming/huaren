package com.hr.huarenlib.net.entity;

import java.io.Serializable;

public class HuarEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shareholders;
	private String team;
	private String history;
	public String getShareholders() {
		return shareholders;
	}
	public void setShareholders(String shareholders) {
		this.shareholders = shareholders;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getHistory() {
		return history;
	}
	public void setHistory(String history) {
		this.history = history;
	}
	@Override
	public String toString() {
		return "HuarEntity [shareholders=" + shareholders + ", team=" + team
				+ ", history=" + history + "]";
	}
	
}
