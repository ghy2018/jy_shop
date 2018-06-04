package com.jy.shop.common;

import java.util.List;

/**
 * 封装分页查询的 JavaBean
 * @author ghy
 */

public class DataTableJSONResponse {
	private Object sEcho;//当前访问的次数
	private Object iTotalRecords;//查询的总记录数
	private Object iTotalDisplayRecords;//过滤后的记录数
	private List<?> aaData;//查询的信息集合
	
	public DataTableJSONResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DataTableJSONResponse(List<?> aaData) {
		super();
		this.aaData = aaData;
	}

	public DataTableJSONResponse(Object sEcho, Object iTotalRecords, Object iTotalDisplayRecords, List<?> aaData) {
		super();
		this.sEcho = sEcho;
		this.iTotalRecords = iTotalRecords;
		this.iTotalDisplayRecords = iTotalDisplayRecords;
		this.aaData = aaData;
	}

	public Object getsEcho() {
		return sEcho;
	}
	public void setsEcho(Object sEcho) {
		this.sEcho = sEcho;
	}
	public Object getiTotalRecords() {
		return iTotalRecords;
	}
	public void setiTotalRecords(Object iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}
	public Object getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}
	public void setiTotalDisplayRecords(Object iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}
	public List<?> getAaData() {
		return aaData;
	}
	public void setAaData(List<?> aaData) {
		this.aaData = aaData;
	}
	
}
