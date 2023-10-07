<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>EL运算</title>
</head>
<body>
<%
  request.setAttribute("num1","12");
  request.setAttribute("num2","14");

  application.setAttribute("flag1",true);
  application.setAttribute("flag2",false);
%>
<br>--------------------使用java语言---------------------------<br>
<%
  String num1 = (String)request.getAttribute("num1");
  String num2 = (String)request.getAttribute("num2");
  int num3 = Integer.parseInt(num1) + Integer.parseInt(num2);

  boolean flag1 = (Boolean) application.getAttribute("flag1");
  boolean flag2 = (Boolean) application.getAttribute("flag2");
  boolean flag3 = flag1 && flag2;
  //输出方式一
  out.write(Boolean.toString(flag3));
%>
<!-- 输出方式二 -->
<h1><%=num3%></h1>

<br>--------------------使用EL表达式--------------------------<br>
<h1>${ requestScope.num1 + requestScope.num2 }</h1>
<h1>${ requestScope.num1 > requestScope.num2 }</h1>
<h1>${ applicationScope.flag1 && applicationScope.flag2 }</h1>

</body>
</html>
