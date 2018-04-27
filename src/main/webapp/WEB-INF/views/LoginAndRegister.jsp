<%--
  Created by IntelliJ IDEA.
  User: aizongbin
  Date: 2018/4/27
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/user/login" method="post">
    id:<input type="text" name="id"><br>
    username:<input type="text" name="username"><br>
    password:<input type="password" name="password">
    <input type="submit" value="登陆">
</form>
</body>
</html>
