<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 2017/6/21
  Time: 13:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Register</title>
</head>

<style>
    body{
        padding:0;
        margin:0;
    }
    h1{
        background-color: black;
        color:white;
    }
    .form{
        width: 400px;
        border-radius: 2px;
        padding:10px;
        border-style: solid;
        border-color: black;
        margin:0 auto;
    }

</style>
<body>
<H1>Register up for My Struts</H1>
<hr>
<form method="post" action="reguser.action" name="rform" class="form">

    <p>请输入用户名：</p><br>
    <input type="text" name="username" id="name"><br>
    <br>
    <p>请输入密码：</p><br>
    <input type="password" name="password" id="key"><br>
    <p>请再次输入密码：</p><br>
    <input type="password" name="compassword" id="comkey"><br>
    <br>
    <s:actionmessage></s:actionmessage>
    <input type="submit" value="注册" onclick="return recheck(this);" />
    <a href="login.jsp">登陆</a>

</form>
</body>
<script>
    function recheck(form) {
        if(document.forms.rform.username.value==""){
            alert("用户名不能为空！");
            document.forms.rform.username.focus();
            return false;
        }
        if(document.forms.rform.password.value==""||document.forms.rform.compassword.value==""){
            alert("密码不能为空！");
            document.forms.rform.password.focus();
            return false;
        }
        if(document.forms.rform.password.value!=document.forms.rform.compassword.value){
            alert("两次输入的密码不相同！")
            document.forms.rform.password.focus();
            return false;
        }
    }
</script>

</html>
