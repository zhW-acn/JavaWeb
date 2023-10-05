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
    <title>getSomething</title>
</head>
<body>
<%--跨了Servlet，拿不到--%>
pageContext:<%=pageContext.getAttribute("name")%>
<hr>
request:<%=request.getAttribute("name")%>
<hr>
session:<%=session.getAttribute("name")%>
<hr>
application:<%=application.getAttribute("name")%>
<hr>

</body>
</html>
