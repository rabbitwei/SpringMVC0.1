<%--
  Created by IntelliJ IDEA.
  User: DIWEI
  Date: 2019/10/25
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/uploadFile" method="post" enctype="multipart/form-data">
    文件： <input type="file" name="image" accept="image/*"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
