<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    首页
</head>
<br>

<body>
欢迎进入
<br>

<form action="/service/hello/submit" method="post">
    <p>输入查询的姓名:<input type="text" name="name"></p>

    <br><input id="login" type="submit" value="测试spring-mvc">

</form>
</body>
</html>