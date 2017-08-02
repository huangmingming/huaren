package com.hr.huarenlib.net.entity;

import java.io.Serializable;
import java.util.List;

public class ProductsListEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String pstatus;
	private String pid;
	private String productName;
	private String pdeadline;
	private String preturnrate;
	private String premaincash;
	private String pnotice;
	private String image;
	private String beginMoney;
	private String jcsyl;
	private String zzsyl;
	private String limit;
	private String totalMoney;
	private String totalAmount;
	private String Bl;
	private String pimage;
	private String ptype;
	private String ptotalcash;
	private String is_transfer;
	private List<String> ico;

	public List<String> getIco() {
		return ico;
	}

	public void setIco(List<String> ico) {
		this.ico = ico;
	}

	public String getIs_transfer() {
		return is_transfer;
	}

	public void setIs_transfer(String is_transfer) {
		this.is_transfer = is_transfer;
	}

	public String getPtotalcash() {
		return ptotalcash;
	}
	public void setPtotalcash(String ptotalcash) {
		this.ptotalcash = ptotalcash;
	}
	public String getPstatus() {
		return pstatus;
	}
	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPdeadline() {
		return pdeadline;
	}
	public void setPdeadline(String pdeadline) {
		this.pdeadline = pdeadline;
	}
	public String getPreturnrate() {
		return preturnrate;
	}
	public void setPreturnrate(String preturnrate) {
		this.preturnrate = preturnrate;
	}
	public String getPremaincash() {
		return premaincash;
	}
	public void setPremaincash(String premaincash) {
		this.premaincash = premaincash;
	}
	public String getPnotice() {
		return pnotice;
	}
	public void setPnotice(String pnotice) {
		this.pnotice = pnotice;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBeginMoney() {
		return beginMoney;
	}
	public void setBeginMoney(String beginMoney) {
		this.beginMoney = beginMoney;
	}
	public String getJcsyl() {
		return jcsyl;
	}
	public void setJcsyl(String jcsyl) {
		this.jcsyl = jcsyl;
	}
	public String getZzsyl() {
		return zzsyl;
	}
	public void setZzsyl(String zzsyl) {
		this.zzsyl = zzsyl;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(String totalMoney) {
		this.totalMoney = totalMoney;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBl() {
		return Bl;
	}
	public void setBl(String bl) {
		Bl = bl;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	@Override
	public String toString() {
		return "ProductsListEntity{" +
				"beginMoney='" + beginMoney + '\'' +
				", pstatus='" + pstatus + '\'' +
				", pid='" + pid + '\'' +
				", productName='" + productName + '\'' +
				", pdeadline='" + pdeadline + '\'' +
				", preturnrate='" + preturnrate + '\'' +
				", premaincash='" + premaincash + '\'' +
				", pnotice='" + pnotice + '\'' +
				", image='" + image + '\'' +
				", jcsyl='" + jcsyl + '\'' +
				", zzsyl='" + zzsyl + '\'' +
				", limit='" + limit + '\'' +
				", totalMoney='" + totalMoney + '\'' +
				", totalAmount='" + totalAmount + '\'' +
				", Bl='" + Bl + '\'' +
				", pimage='" + pimage + '\'' +
				", ptype='" + ptype + '\'' +
				", ptotalcash='" + ptotalcash + '\'' +
				", is_transfer='" + is_transfer + '\'' +
				'}';
	}


}
