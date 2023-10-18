<%--
  User: acane
  Date: 2023/10/18
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
<form action="imgSubmit" method="post" enctype="multipart/form-data">
    <input type="file" name="profile">
    <input type="submit">
</form>
</body>
</html>
