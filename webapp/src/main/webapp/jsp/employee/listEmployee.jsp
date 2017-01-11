<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" isELIgnored="false"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
    <style type="text/css">
        .table1 {
            border: 1px solid #ddd;
            width: 900px;

        }

        thead {
            background-color: lightblue;
        }

    </style>
</head>
<body>
<table border="0" width="900px">
    <tr>
        <td align="center" style="font-size:24px; color:#666"> 员工管理</td>
    </tr>
    <tr>
        <td align="right"><a href="<%=basePath%>/employee/addEmployeeUI.action">添加</a></td>
    </tr>
</table>
<br/>


<table cellspacing="0" border="1" class="table1">
    <thead>
    <tr>
        <td align="center">编号</td>
        <td align="center">员工姓名</td>
        <td align="center">性别</td>
        <td align="center">出生日期</td>
        <td align="center">入职时间</td>
        <td align="center">所属部门</td>
        <td align="center">编辑</td>
    </tr>
    </thead>
    <tbody>
    <s:iterator value="data" var="e">
        <tr>
            <td align="center"><s:property value="#e.eid"/></td>
            <td align="center"><s:property value="#e.ename"/></td>
            <td align="center"><s:property value="#e.sex"/></td>
            <td align="center"><s:property value="#e.birthday"/></td>
            <td align="center"><s:property value="#e.joinDate"/></td>
            <td align="center"><s:property value="#e.department.dname"/></td>
            <td align="center"><a href="<%=basePath%>/employee/editEmployeeUI.action?eid=<s:property value="#e.eid"/>"><img
                    src="<%=basePath%>/images/bianji.png"/></a></td>
        </tr>
    </s:iterator>
    </tbody>
</table>
<br/>

<table table border="0" cellspacing="0" cellpadding="0" width="900px">
    <tr>
        <td align="right">
            <span>第<s:property value="currentPage"/>/<s:property value="totalPage"/>页</span>
            <span>
                <s:if test="currentPage!=1">
                    <a href="<%=basePath%>/employee/findAll.action?currPage=1">[首页]</a>&nbsp;&nbsp;
                    <a href="<%=basePath%>/employee/findAll.action?currPage=<s:property value="currentPage-1"/>">[上一页]</a>&nbsp;&nbsp;
                </s:if>
                  <s:if test="currentPage!=totalPage">
                      <a href="<%=basePath%>/employee/findAll.action?currPage=<s:property value="currentPage+1"/>">[下一页]</a>&nbsp;&nbsp;
                      <a href="<%=basePath%>/employee/findAll.action?currPage=<s:property value="totalPage"/>">[尾页]</a>&nbsp;&nbsp;
                  </s:if>
            </span>
        </td>
    </tr>
</table>
</body>
</html>