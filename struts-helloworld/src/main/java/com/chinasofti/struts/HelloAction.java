package com.chinasofti.struts;

public class HelloAction {
	
	private static final String SUCCESS = "success";
	
	public String execute() {
		System.out.println("执行了HelloAction的execute方法");
		return SUCCESS;
	}

}
