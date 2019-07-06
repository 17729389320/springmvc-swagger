package com.tem.demo.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="用户对象模型")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value="id")
	private Long id;

	@ApiModelProperty(value="用户名称")
	private String name;

 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

	}

}