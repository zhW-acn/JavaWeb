<%--
  User: acane
  Date: 2023/10/11
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title></title>
    <base href="<%=basePath%>">
</head>
<body>
<h1>${flag}</h1>
</body>
</html>
