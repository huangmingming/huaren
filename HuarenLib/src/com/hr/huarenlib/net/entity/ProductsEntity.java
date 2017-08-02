package com.hr.huarenlib.net.entity;

import java.io.Serializable;
import java.util.List;

public class ProductsEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String status;
	private String msg;
	private String page;
	private String limit;
	private String count;
	private String totalcount;
	private List<ProductsListEntity> productList;
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
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getTotalcount() {
		return totalcount;
	}
	public void setTotalcount(String totalcount) {
		this.totalcount = totalcount;
	}
	public List<ProductsListEntity> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductsListEntity> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "ProductsEntity [status=" + status + ", msg=" + msg + ", page="
				+ page + ", limit=" + limit + ", count=" + count
				+ ", totalcount=" + totalcount + ", productList=" + productList
				+ "]";
	}
	
}
