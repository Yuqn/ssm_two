<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/23 0023
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
<form action="addStu">
    name:<input type="text" name="name">
    age:<input type="text" name="age">
    <input type="submit" value="提交">
</form>
</body>
</html>
