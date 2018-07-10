package com.chinasofti.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private String username;
	
	private String password;

	
	public String login() {
		if ("admin".equals(username) && "1234".equals(password)) {
			return SUCCESS;
		}
		String message = "账号或密码错误";
		ActionContext.getContext().getValueStack().set("message", message);
		
		return INPUT;
	}
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
