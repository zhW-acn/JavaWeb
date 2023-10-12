<%--
  User: acane
  Date: 2023/10/12
  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>false</title>
    <base href="<%=basePath%>">

</head>

<body>
账号密码错误，<label id="countdown">3</label>秒后跳转到登录页面

<script>
    // 设置倒计时时间
    var countdown = 3;

    function startCountdown() {
        var countdownDisplay = document.getElementById("countdown");

        var interval = setInterval(function () {
            if (countdown === 0) {
                clearInterval(interval);
                window.location = "/week2/exercise/login/login.jsp";
            } else {
                countdownDisplay.innerHTML = countdown + "";
                countdown--;
            }
        }, 1000); // 每秒更新一次
    }

    window.onload = startCountdown()
</script>

</body>
</html>
