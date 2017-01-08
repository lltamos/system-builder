<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" isELIgnored="false"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!doctype html>
<html>
<head></head>
<body>
<table border="0" width="600px">
    <tr>
        <td align="center" style="font-size:24px; color:#666"> 员工添加</td>
    </tr>
    <tr>
        <td align="right">
            <a href="javascript:document.getElementById('saveEmployee').submit()">保存</a> &nbsp;&nbsp;
            <a href="javascript:history.go(-1)">退回</a>
        </td>
    </tr>
</table>
<br/>

<s:form action="saveEmployee" method="POST" namespace="/employee" id="saveEmployee" theme="simple">
    <table border='0' cellpadding="0" cellspacing="10">
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="ename" title=""/></td>
            <td>性别：</td>
            <td><s:radio list="{'男','女'}" name="sex" theme="simple"/></td>
        </tr>
        <tr>
            <td>出生日期：</td>
            <td><input type="date" title="" name="birthday"/></td>
            <td>入职时间：</td>
            <td><input type="date" title="" name="joinDate"/></td>
        </tr>
        <tr>
            <td>用户名：</td>
            <td><input type="text" title="" name="username"/></td>
            <td>密码：</td>
            <td><input type="text" title="" name="password"/></td>
        </tr>
        <tr>
            <td>所属部门：</td>
            <td><s:select name="department.did" list="list" listKey="did" listValue="dname" headerKey="" headerValue="请选择" theme="simple"/></td>
            <td>编号：</td>
            <td><input type="text" title="" name="eno"/></td>
        </tr>
    </table>

</s:form>
</body>
</html>