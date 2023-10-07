<%--
  Created by IntelliJ IDEA.
  User: acane
  Date: 2023/10/7
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set scope="page" var="name" value="page"/>
<c:set scope="request" var="name" value="request"/>
<c:set scope="session" var="name" value="session"/>
<c:set scope="application" var="name" value="application"/>
${pageScope.name}
${requestScope.name}
${sessionScope.name}
${applicationScope.name}
</body>
</html>
