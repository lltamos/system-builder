<%--
  Created by IntelliJ IDEA.
  User: hign
  Date: 2017/1/5
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html>
<head>
    <style type="text/css">
        .div1{ margin-top:50px; margin-left:600px; font-size:14px; color:white}
    </style>
</head>

<body bgcolor="#0099FF">
<div class="div1">
    欢迎您：${sessionScope.existEmployee.username}
</div>
</body>
</html>
