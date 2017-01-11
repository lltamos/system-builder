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
        <td align="center" style="font-size:24px; color:#666"> 员工编辑</td>
    </tr>
    <tr>
        <td align="right">
            <a href="javascript:document.getElementById('form').submit();">保存</a> &nbsp;&nbsp;
            <a href="#">退回</a>
        </td>
    </tr>
</table>
<br/>

<s:form  id="form" action="updateEmployee" namespace="/employee" theme="simple" method="POST">
    <input type="hidden" name="eid" value="<s:property value="%{model.eid}" />"/>
<table border='0' cellpadding="0" cellspacing="10">
    <tr>
        <td>姓名：</td>
        <td><input type="text" name="ename" value="<s:property value="%{model.ename}"/>"/></td>
        <td>性别：</td>
        <td><s:radio theme="simple" list="{'男','女'}" name="sex" value="%{model.sex}"/></td>
    </tr>
    <tr>
        <td>出生日期：</td>
        <td><input type="text" name="birthday" value="<s:date name="model.birthday" format="yyyy-MM-dd"/>"/></td>
        <td>入职时间：</td>
        <td><input type="text" name="joinDate" value="<s:date name="model.joinDate" format="yyyy-MM-dd"/>"/></td>
    </tr>

    <tr>
        <td>所属部门：</td>
        <td><s:select theme="simple" name="department.did" list="#session.list" value="%{model.department.did}" listKey="did" listValue="dname"/></td>
        <td>编号：</td>
        <td><input type="text" name="eno"/></td>
    </tr>
</table>
</s:form>

</body>
</html>