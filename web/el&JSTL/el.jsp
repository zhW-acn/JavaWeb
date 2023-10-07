<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el</title>
</head>
<body>
<%
    application.setAttribute("name","application");
    session.setAttribute("name","session");
    request.setAttribute("name","request");
    pageContext.setAttribute("name","pageContext");
%>
<br>--------------------使用java语言---------------------------<br>
application中的值：<%= application.getAttribute("name") %> <br>
session中的值：<%= session.getAttribute("name") %> <br>
request中的值：<%= request.getAttribute("name") %> <br>
pageContext中的值：<%= pageContext.getAttribute("name") %> <br>

<br>--------------------使用EL表达式---------------------------<br>
application中的值：${applicationScope.name} <br>
session中的值：${sessionScope.name} <br>
request中的值：${requestScope.name} <br>
pageContext中的值：${pageScope.name} <br>

<br>----------------使用EL表达式,省略域对象---------------------<br>
application中的值：${name} <br>

</body>
</html>

