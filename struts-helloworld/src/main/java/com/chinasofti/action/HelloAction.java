package com.chinasofti.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	private static final long serialVersionUID = 8371419543701706132L;

	public String execute() {
		System.out.println("执行了HelloAction的execute方法");
		return SUCCESS;
	}

}
