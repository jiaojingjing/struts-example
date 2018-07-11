package com.chinasofti.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	
	public String execute() {
		System.out.println("执行了HelloAction的execute方法");
		return SUCCESS;
	}

}
