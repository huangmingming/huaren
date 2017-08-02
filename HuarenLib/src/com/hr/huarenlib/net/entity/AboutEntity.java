package com.hr.huarenlib.net.entity;

import java.io.Serializable;

public class AboutEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	private String msg;
	private HuarEntity huar;
	private SecEntity sec;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HuarEntity getHuar() {
		return huar;
	}
	public void setHuar(HuarEntity huar) {
		this.huar = huar;
	}
	public SecEntity getSec() {
		return sec;
	}
	public void setSec(SecEntity sec) {
		this.sec = sec;
	}
	@Override
	public String toString() {
		return "AboutEntity [status=" + status + ", msg=" + msg + ", huar="
				+ huar + ", sec=" + sec + "]";
	}
	
}
