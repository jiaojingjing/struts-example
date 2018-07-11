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
<form action="login" method="post">
账号: <input type="text" name="user.username"  value="${user.username}"/>
<s:fielderror fieldName="user.username" cssStyle="color:red;"/>
<br />
密码: <input type="password" name="user.password" value="${user.password }" />
<s:fielderror fieldName="user.password" cssStyle="color:red;"/>
<br />
<s:actionerror cssStyle="color:red;"/> <br >
<input type="submit" value="登录" />
</form>
</body>
</html>