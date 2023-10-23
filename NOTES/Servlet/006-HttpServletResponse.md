### response对象的功能分为以下四种：
1. 设置响应头信息 
2. 发送状态码 
3. 设置响应正文
4. 重定向
![response报文格式.png](../../res/imgs/response报文格式.png)

1. 获取响应流，两个不能同时get，不然会抛IllegalStateException
    - PrintWriter out = response.getWriter()：获取字符流（默认字符编码为ISO-8859-1，[点击这里](003-解决乱码.md)）
    - ServletOutputStream out = response.getOutputStream()：获取字节流

2. 设置响应头信息
    - 设置content-type响应头，该头的作用是告诉浏览器响应内容为html类型，编码为utf-8。而且同时会设置response的字符流编码为utf-8，即response.setCharacterEncoding(“utf-8”)；
    - response.setHeader(“content-type”, “text/html;charset=utf-8”)：
    - response.setHeader("Refresh","5; URL=http://www.baidu.cn")：5秒后自动跳转到百度主页。

3. 设置状态码及其他方法
    - response.setContentType("text/html;charset=utf-8")：等同于调用response.setHeader(“content-type”, “text/html;charset=utf-8”)；用它就行了。
    - response.setStatus(200)：设置状态码； 
    - response.sendError(404, “您要查找的资源不存在”)：当发送错误状态码时，Tomcat会跳转到固定的错误页面去，显示错误信息