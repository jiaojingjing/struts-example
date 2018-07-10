<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<title>struts-helloworld|登录</title>
</head>
<body>
<h1>欢迎访问 ${pageContext.request.contextPath} 登录！</h1>
<form action="${pageContext.request.contextPath}/login" method="post">
  账号:<input type="text" name="username" value="${username}"><br>
  密码:<input type="password" name="password" value="${password}"><br>
  <div>
    <span>&nbsp;${message}</span>
  </div>
  <input type="submit" value="登录">
</form>

<s:debug></s:debug>
</body>
</html>