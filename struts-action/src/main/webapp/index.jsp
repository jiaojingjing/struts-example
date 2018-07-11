<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="UTF-8">
<title>struts-action主页</title>
</head>
<body>
<h1>欢迎 <s:property value="#session.user"/> 访问 ${pageContext.request.contextPath} 程序！</h1>
<table border="1" rules="all">
  <tr>
    <th>功能</th><th>说明</th>
  </tr>
  <tr>
    <td><a href="login.jsp">登录</a></td><td>数据绑定，消息传递</td>
  </tr>
  
  <tr>
    <td><a href="user-add.jsp">添加用户</a></td><td>数据绑定，类型转换器</td>
  </tr>
  

</table>

</body>
</html>