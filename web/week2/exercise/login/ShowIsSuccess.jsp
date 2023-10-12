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
    <title>success</title>
    <base href="<%=basePath%>">
</head>
<body>
<p>学号： ${requestScope.id}</p>
<p>姓名：${requestScope.name}</p>
<p>班级：${requestScope.classid}</p>
<p>时间：${requestScope.date}</p>
<div id="99">
</div>

<script>
    var div = document.getElementById("99");
    var str = "<table border='1' cellspacing='0'>";
    for (var i = 1; i <= 9; i++) {
        str += "<tr>"
        for (var j = 1; j <= i; j++) {
            str += "<td>" + i + "*" + j + "=" + i * j + "</td>"
        }
        str += "</tr>"
    }
    str += "</table>";
    div.innerHTML = str;
</script>
</body>
</html>
