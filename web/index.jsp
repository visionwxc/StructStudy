<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 2017/6/10
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Struts_Attempt</title>
  </head>
  <body>
    <form action="user.action" method="post">
      用户名：<input type="text" name="username" ><br>
      密码：<input type="password" name="password"><br>
      住址：<input type="text" name="address"><br>
      电话：<input type="text" name="telephone"><br>
      <input type="submit"  value="提交">
      <input type="reset" value="清空">
    </form>

  </body>
</html>
