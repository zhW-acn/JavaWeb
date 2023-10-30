<%--
  User: acane
  Date: 2023/10/30
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

<input id="i1">
<input id="i2">
<input id="i3">


<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script>

    // 以对象的形式传参
    $.ajax({
        url: "JSON",// 地址
        type: "get",// 缺省为get
        data: "",
        dataType: "",
        success: function (result) {
            var user = eval("("+result+")")
            alert(user.uname)
            // $('#i1').val(result.uname)
        }
    })
</script>
</body>
</html>
