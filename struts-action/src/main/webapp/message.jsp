<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>

<style type="text/css">
ul.errorMessage, ul.errorMessage li {
  list-style-type: none;
  display: inline-block;
}
</style>
<meta charset="UTF-8">
<title>查看提交消息</title>
</head>
<body>
<h3>提交数据</h3>
账号: <s:property value="user.username"/> <br />
部门: <s:property value="user.department"/> <br />
部门: <s:property value="department"/> <br />
</body>
</html>