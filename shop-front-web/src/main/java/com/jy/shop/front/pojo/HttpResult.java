package com.jy.shop.front.pojo;

/**
 * 封装 POST 请求的实体
 * 
 * @author Administrator
 *
 */
public class HttpResult {

	// 状态码
	private Integer code;
	// 响应体
	private String body;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public HttpResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HttpResult(Integer code, String body) {
		super();
		this.code = code;
		this.body = body;
	}

}
