package com.chinasofti.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.alibaba.fastjson.JSON;
import com.chinasofti.vo.Departement;
import com.chinasofti.vo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private User user;

	@Action(value = "login", results = {
			@Result(name = "success", location = "/index.jsp", type = "redirect"),
			@Result(name = "input", location = "/login.jsp") })
	public String login() {
		// 是否有错误
		/*
		 * boolean error = false;
		 * 
		 * if (user.getUsername().isEmpty() ) { addFieldError("user.username",
		 * "请输入用户名"); error = true; }
		 * 
		 * if (user.getPassword().isEmpty()) { addFieldError("user.password",
		 * "请输入密码"); error = true; }
		 * 
		 * if (error) { return INPUT; }
		 */

		// 判断密码是否错误
		if ("admin".equals(user.getUsername())
				&& "1234".equals(user.getPassword())) {
			ActionContext.getContext().getSession().put("user", user);
			return SUCCESS;
		}

		addActionError("用户名或密码错误");
		return INPUT;
	}

	@Action(value = "addUser", results = {
			@Result(name = "message", location = "/message.jsp"),
			@Result(name = "input", location = "/user-add.jsp"),
	})
	public String addUser() {
		System.out.println(JSON.toJSONString(user));
		if ("admin".equals(user.getUsername())) {
			return "input";
		}
		
		return "message";
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private Departement departement;

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

}
