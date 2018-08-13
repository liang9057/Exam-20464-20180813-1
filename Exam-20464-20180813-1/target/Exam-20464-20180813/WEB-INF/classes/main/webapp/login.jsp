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
    <title>登录</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="Content-Language" content="ch-cn">
</head>
<body>

<form method="post" name="fromLogin" action="loginservelt">
    <h1 align="center">用户登录</h1><br>
    <div align="center">用户名：
        <input type="text" name="txtUserName" value=""
               size="20" maxlength="20"
               onfocus="if(this.value=='Your name')this.value='';"><br><br><br><br><br><br>
        <button type="submit" 　value="登  陆" onClick="validateLogin();" >
            登陆
        </button>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

    </div>
</form>

<script language="javaScript">
    function validateLogin()
    {
        var sUserName = document.frmLogin.txtUserName.value;
        var sPassword = document.frmLogin.txtPassword.value;
        if( sUserName=="" )
        {
            alert("请输入用户名！");
            return false;
        }

    }
</script>
</body>
</html>
