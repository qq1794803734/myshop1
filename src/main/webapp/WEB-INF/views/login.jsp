<%--
  Created by IntelliJ IDEA.
  User: gzay
  Date: 2019/5/23
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
        <input id="username" name="username" type="text" >
        <input id="password" name="password" type="password" >
        <input id="verification" name="verification" type="text"style="width: 119px;">
        <img id="validateCode" src="/verification" style="float: right; padding-right: 23px; cursor: pointer;" title="看不清？换一张" />
</form>
</body>
</html>
