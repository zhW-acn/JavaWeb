<%--
  Created by IntelliJ IDEA.
  User: acane
  Date: 2023/10/5
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>setSomething</title>
</head>
<body>
<%
pageContext.setAttribute("name","pageContext");//在当前Servlet作用域有效
request.setAttribute("name","request");//在当前一次请求里有效
session.setAttribute("name","session");//在当前一次会话里有效
application.setAttribute("name","pageContext");//在整个应用的生命周期里有效
%>
<%--转发给getSomething--%>
<jsp:forward page="getSomething.jsp" />
</body>
</html>
