<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 2017/6/16
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>WelCome to My Struts Page</h1>
<hr>
当前登录的用户:${param.username}<br>
<hr>
当前所有登陆的用户：
<table border=1 width=200>
    <s:iterator value="#application.online" var="user">
        <tr <s:if test="#user.odd"> style="background-color: dimgray"  </s:if> >
            <td><s:property value="#user.count"></s:property> </td>
            <td><s:property value="#user"></s:property></td>
        </tr>
    </s:iterator>

</table>

<a href="${pageContext.request.contextPath}/offuser.action?username=${param.username}">注销</a>
</body>
</html>
