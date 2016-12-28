<%--
  Created by IntelliJ IDEA.
  User: hign
  Date: 2016/12/28
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>index</title>
</head>
<body>
 <a href="<%=basePath%>/hi.jsp">action</a><%=basePath%>
</body>

</html>
