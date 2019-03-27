package com.lks.pojo;

import java.io.Serializable;

public class MobileResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer code;
	private String message;
	private Object data;

	public static MobileResult parameterError() {
		MobileResult mobileResult = new MobileResult();
		mobileResult.setCode(101);
		mobileResult.setMessage("参数错误");
		return mobileResult;
	}

	public static MobileResult success() {
		MobileResult mobileResult = new MobileResult();
		mobileResult.setCode(0);
		mobileResult.setMessage("success");
		return mobileResult;
	}

	public static MobileResult loginTimeOut() {
		MobileResult mobileResult = new MobileResult();
		mobileResult.setCode(700);
		mobileResult.setMessage("登录超时");
		return mobileResult;
	}

	public static MobileResult success(Object object) {
		MobileResult mobileResult = new MobileResult();
		mobileResult.setCode(0);
		mobileResult.setMessage("success");
		mobileResult.setData(object);
		return mobileResult;
	}

	public static MobileResult fail(String msg) {
		MobileResult mobileResult = new MobileResult();
		mobileResult.setCode(300);
		mobileResult.setMessage(msg);
		return mobileResult;
	}
	

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
