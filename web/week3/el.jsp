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
<p>cookie</p>
<% Cookie cookie = new Cookie("name", "acn");
    response.addCookie(cookie);
%>
key:${cookie.get("name").name}<br>
value:${cookie.get("name").value}
<hr>
<p>数学运算</p>
<span>5 + 3 = </span>${5 + 3}<br>
<span>5 - 3 = </span>${5 - 3}<br>
<span>5 * 3 = </span>${5 * 3}<br>
<span>5 / 3 = </span>${5 / 3}<br>
<span>5 div 3 = </span>${5 div 3}<br>
<span>5 % 3 = </span>${5 % 3}<br>
<span>5 mod 3 = </span>${5 mod 3}<br>
<hr>
<p>关系运算</p>
<span>7 == 5</span>${7 == 5}<br>
<span>7 eq 5</span>${7 eq 5}<br>
<span>7 ne 5</span>${7 ne 5}<br>
<span>7 > 5</span>${7 > 5}<br>
<span>7 gt 5</span>${7 gt 5}<br>
<span>7 > 5</span>${7 > 5}<br>
<span>7 ge 5</span>${7 ge 5}<br>
<span>7 < 5</span>${7 < 5}<br>
<span>7 lt 5</span>${7 lt 5}<br>
<span>7 le 5</span>${7 le 5}<br>
<span>7 <= 5</span>${7 <= 5}<br>

</body>
</html>
