[Jakarta5.0官网](https://jakarta.ee/specifications/servlet/5.0/jakarta-servlet-spec-5.0)

提供框架和组件就是为了让我们更加地专注于自己的业务，公共统一处理的业务逻辑抽离出去。

继承Servlet。重写
``` java
// 在首次访问某个Servlet时，init()方法会被执行，而且也会执行service()方法
void init(ServletConfig);

// 再次访问时，只会执行service()方法，不再执行init()方法
void service(ServletRequest,ServletResponse);

// 关闭Web容器时会调用destroy()方法
void distory();

// 获取配置和信息
String getServletInfo();
ServletConfig getServletConfig();
```
这几个方法构成了一个Servlet的生命周期