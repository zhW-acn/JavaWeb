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
    <title>Title</title>
    <base href="<%=basePath%>">
</head>
<body>
请求次数： ${applicationScope.count}
<form action="LoginServlet" method="post">
    <label>
        <input name="user" type="text">
    </label>

    <label>
        <input name="passwd" type="password">
    </label>
    <input type="submit">
</form>
</body>
</html>
