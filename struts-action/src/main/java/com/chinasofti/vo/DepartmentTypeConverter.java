package com.chinasofti.vo;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.alibaba.fastjson.JSON;

public class DepartmentTypeConverter extends StrutsTypeConverter {

	@SuppressWarnings("rawtypes")
	@Override
	public Object convertFromString(Map context, String[] values,
			Class toClass) {
		Departement departement = new Departement();

		String value = values[0];

		String[] fields = value.split("-");

		departement.setId(Integer.parseInt(fields[0]));
		departement.setName(fields[1]);

		return departement;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String convertToString(Map context, Object o) {
		Departement departement = (Departement) o;
		return departement == null ? null : JSON.toJSONString(departement);
	}

}
