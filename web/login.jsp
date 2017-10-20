<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 2017/6/21
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Login</title>
</head>
<style>
    body{
        padding: 0;
        margin:0;
    }
    h1{
        background-color: black;
        color: white;
    }
    .subform{
        width:200px;
        border-style:solid;
        border-color: black;
        border-radius: 2px;
        padding: 10px;
        margin-left: 40px;
        margin-top: 70px;

    }


</style>

<body>
<h1>Login For My Struts</h1>
<hr>

<div class="subform">
    <form method="post" action="loginuser.action" name="pform" >

        <p>用户名：</p><br>
        <input type="text" name="username" id="name"><br>
        <br>
        <p>密码：</p><br>
        <input type="password" name="password" id="key"><br>
        <br>
        <s:actionmessage></s:actionmessage>
        <input type="submit" value="登陆" onclick="return check(this);"/>

        <a href="register.jsp">点我注册</a>

    </form>
</div>





</body>
<script>
    function check(form) {
        if(document.forms.pform.username.value==""){
            alert("用户名不能为空！")
            document.forms.pform.username.focus();
            return false;
        }


        if(document.forms.pform.password.value==""){
            alert("密码不能为空！")
            document.forms.pform.password.focus();
            return false;
        }
    }
</script>

</html>
