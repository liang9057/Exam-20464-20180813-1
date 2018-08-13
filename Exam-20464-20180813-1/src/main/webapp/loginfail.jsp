<%--
  Created by IntelliJ IDEA.
  User: liangshuang
  Date: 2018/8/13
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My JSP 'login_failure.jsp' starting page</title>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">

</head>
<body>
<%
    String userName = (String)session.getAttribute ( "UserName" );
%>
<div align=center>
    <%=userName%>
    对不起，登录失败！
</div>
</body>
</html>
