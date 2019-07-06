package com.tem.demo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class RespData<T> {

	@ApiModelProperty(value = "响应码")
	private Integer code;

	@ApiModelProperty(value = "响应消息")
	private String message;

	@ApiModelProperty(value = "响应数据")
	private T data;
	
	public RespData(Integer code,T data,String message) {
		this.code=code;
		this.data=data;
		this.message=message;
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

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	

}
