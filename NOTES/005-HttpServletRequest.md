### request的功能可以分为以下几种：
1. 封装了请求头数据；
2. 封装了请求正文数据，如果是GET请求，那么就没有正文；
3. request是一个域对象，可以把它当成Map来添加获取数据； 
4. request提供了请求转发和请求包含功能


``` java
// 参数
Enumeration<String> parameterNames = request.getParameterNames();
while (parameterNames.hasMoreElements()) {
    String key = parameterNames.nextElement();
    String[] parameterValues = request.getParameterValues(key);
    System.out.println(key + ":" + Arrays.toString(parameterValues));
}

// 头部信息
System.out.println("request.getHeader(\"acn\") = " + request.getHeader("acn"));
Enumeration<String> enumeration = request.getHeaders("zhW");
while (enumeration.hasMoreElements()) {
    System.out.println("zhW = " + enumeration.nextElement());
}
Enumeration<String> headerNames = request.getHeaderNames();
while (headerNames.hasMoreElements()) {
    String key = headerNames.nextElement();
    String value = request.getHeader(key);
    System.out.println(key + ":" + value);
}
```


getRequestURL()：返回一个 String 对象，表示客户端请求的 URL。

getRequestURI()：返回一个 String 对象，表示客户端请求的 URI（不包括主机名和端口号）。

getContextPath()：返回一个 String 对象，表示当前 Web 应用程序的上下文路径（Context Path）。

getMethod()：返回一个 String 对象，表示客户端请求的 HTTP 方法（如 GET、POST）。

getProtocol()：返回一个 String 对象，表示客户端请求的协议（如 HTTP/1.1）。

getServerName()：返回一个 String 对象，表示当前服务器的主机名。

getServerPort()：返回一个整数，表示当前服务器的端口号。

getRemoteAddr()：返回一个 String 对象，表示客户端的 IP 地址。

getRemoteHost()：返回一个 String 对象，表示客户端的主机名。

getRemotePort()：返回一个整数，表示客户端的端口号。

getLocalAddr()：返回一个 String 对象，表示服务器的 IP 地址。

getLocalName()：返回一个 String 对象，表示服务器的主机名。

getLocalPort()：返回一个整数，表示服务器的端口号。

getQueryString()：返回一个 String 对象，表示请求的查询字符串部分。

getHeader(String name)：返回指定名称的请求头的值。

getHeaders(String name)：返回一个 Enumeration 对象，包含指定名称的请求头的所有值。

getParameter(String name)：返回指定名称的请求参数的值。

getParameterNames()：返回一个 Enumeration 对象，包含所有请求参数的名称。

getParameterValues(String name)：返回一个 String 数组，包含指定名称的请求参数的所有值。

getAttribute(String name)：返回指定名称的请求属性的值。

setAttribute(String name, Object value)：设置指定名称的请求属性的值。

getSession()：返回与请求关联的 HttpSession 对象，如果不存在则创建一个。

getSession(boolean create)：返回与请求关联的 HttpSession 对象，如果不存在则根据参数决定是否创建一个。