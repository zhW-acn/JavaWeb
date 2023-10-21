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
    <title>JSTL</title>
</head>
<body>
<h1>c:set</h1>
<c:set scope="page" var="name" value="page"/>
<c:set scope="request" var="name" value="request"/>
<c:set scope="session" var="name" value="session"/>
<c:set scope="application" var="name" value="application"/>
${pageScope.name}
${requestScope.name}
${sessionScope.name}
${applicationScope.name}
${name}
<hr>
<h1>c:if</h1>
<c:set var="age" value="24"/>
<p>age = ${age}</p>
<c:if test="${age ge 18}">
    你成年了
</c:if>
<c:if test="${age lt 18}">
    禁止涩涩
</c:if>
<hr>
<h1>c:choose</h1>
<c:set var="age2" value="6"/>
age2 = ${age2}
<c:choose>
    <c:when test="${age2 eq 18}">
        刚成年
    </c:when>
    <c:when test="${age2 gt 18}">
        已成年
    </c:when>
    <c:otherwise>
        未成年
    </c:otherwise>
</c:choose>
<hr>
<h1>c:foreach</h1>
<c:forEach var="i" begin="0" end="10" step="2" varStatus="Status">
    ${i}<br>
    ${Status.index+1}
</c:forEach>
<hr>
<%--字符串分割--%>
<c:forTokens var="str" items="abc,def,xyz" delims=",">
    <p>${str}</p>
</c:forTokens>
</body>
</html>
