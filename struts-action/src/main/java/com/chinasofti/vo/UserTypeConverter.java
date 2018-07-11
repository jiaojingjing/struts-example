package com.chinasofti.vo;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.alibaba.fastjson.JSON;

public class UserTypeConverter extends StrutsTypeConverter {
	
	@Override
	public Object convertFromString(Map context, String[] values,
			Class toClass) {
		User user = new User();
		System.out.println(JSON.toJSONString(values));
		System.out.println(JSON.toJSONString(context));
		return user;
	}

	@Override
	public String convertToString(Map context, Object o) {
		User user = (User) o;
		return user == null ? null : user.getUsername();
	}

}
