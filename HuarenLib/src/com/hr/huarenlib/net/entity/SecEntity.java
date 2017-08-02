package com.hr.huarenlib.net.entity;

import java.io.Serializable;

public class SecEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String money;
	private String system;
	private String law;
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getLaw() {
		return law;
	}
	public void setLaw(String law) {
		this.law = law;
	}
	@Override
	public String toString() {
		return "SecEntity [money=" + money + ", system=" + system + ", law="
				+ law + "]";
	}
	
}
