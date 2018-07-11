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
<title>登录</title>
</head>
<body>
<h3>登录</h3>
<form action="addUser" method="post">
账号: <input type="text" name="user.username"  value="<s:property value="user.username"/>"/>
<br />
部门: <input type="text" name="user.department" value="<s:property value="user.department"/>" />
<br />
<input type="submit" value="提交" />
</form>
</body>
</html>