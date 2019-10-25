<%--
  Created by IntelliJ IDEA.
  User: DIWEI
  Date: 2019/10/25
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/addUser" method="post">
        名称：<input type="text" name="name"><br/>
        密码：<input type="password" name="password"><br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
