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
<script>
    var title = document.head.getElementsByTagName("title")[0];
    title.innerText =
</script>
<h1>插入成功</h1>
<h1>插入失败</h1>
</body>
</html>
