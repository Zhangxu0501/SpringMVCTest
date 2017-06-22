<%--
  Created by IntelliJ IDEA.
  User: zhangxu
  Date: 2017/6/20
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>

<form method="post" action="/upload/file" enctype="multipart/form-data">
    file:<input type="file" name="file">
    <input type="submit" value="提交">
</form>

</body>
</html>
