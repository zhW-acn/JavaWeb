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
    <title>INSERT</title>
    <base href="<%=basePath%>">
</head>
<body>
<div>
    <form action="${pageContext.request.contextPath}/JDBCServlet" method="post">
        <label>username:</label><label>
        <input type="text" name="username">
    </label>
        <label>password:</label><label>
        <input type="password" name="password">
    </label>
        <input type="submit">
    </form>
</div>

</body>
</html>
