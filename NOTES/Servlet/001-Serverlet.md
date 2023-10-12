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

# Servlet的三种实现方法
1. 实现Servlet接口
   ```java
   public class implementServlet implements Servlet {
       public static int i = 1; // 请求次数
   
       @Override
       public void init(ServletConfig servletConfig) {
           System.out.println("调用Servlet.init()初始化");
       }
   
       @Override
       public ServletConfig getServletConfig() {
           return null;
       }
   
       @Override
       public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
           System.out.println("Servlet请求" + i + "次");
           servletResponse.setCharacterEncoding("GBK");
           PrintWriter writer = servletResponse.getWriter();
           writer.print("Servlet请求" + i++ + "次");
           writer.flush();
       }
   
       @Override
       public String getServletInfo() {
           return null;
       }
   
       @Override
       public void destroy() {
   
       }
   }
   ```
2. 继承GenericServlet
    ```java
   public class extendsGenericServlet extends GenericServlet {
       public static int i = 1; // 请求次数
       @Override
       public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
              System.out.println("GenericServlet请求" + i + "次");
          servletResponse.setContentType("text/plain;charset=UTF-8");
          PrintWriter writer = servletResponse.getWriter();
          writer.print("GenericServlet请求" + i++ + "次");
          writer.flush();
       }
    }
   ```
3. 继承HttpServlet
   ```java
   public class extendsHttpServlet extends HttpServlet {
      public static int i = 1; // 请求次数
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
         System.out.println("HttpServlet请求" + i + "次");
         resp.setContentType("text/plain;charset=UTF-8");
         PrintWriter writer = resp.getWriter();
         writer.print("HttpServlet请求" + i++ + "次");
         writer.flush();
      }
   }
   ```
4. 使用annotation
   ```java
   @WebServlet({"/annotationServlet", "/*"})
   public class annotationServlet extends HttpServlet {
       public static int i = 1; // 请求次数
      
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
           System.out.println("annotationServlet请求" + i + "次");
           response.setContentType("text/plain;charset=UTF-8");
           PrintWriter writer = response.getWriter();
           writer.print("annotationServlet请求" + i++ + "次");
           writer.flush();
       }
   }
   ```

# 总结
1. 实现Servlet接口需要重写servlet所有生命周期方法
   - Servlet的生命周期
   - Servlet 初始化后调用 init () 方法。在用户访问时调用。一旦init完成，Servlet实例一直保持在内存中，不管用户是否该关闭浏览器。~~【好搞笑。。我服务器的Servlet跟客户端有啥关系】~~
   - Servlet 调用 service() 方法来处理客户端的请求。每请求一次就调用一次。 
   - Servlet 销毁前调用 destroy() 方法。 
   - 最后，Servlet 是由 JVM 的垃圾回收器进行垃圾回收的
   - 在web.xml中的servlet使用`load-on-startup`标签设为1，设定非懒加载。
2. 继承GenericServlet只需重写核心的service方法。HttpServlet帮你实现了service，只需重写其他请求相关的方法
3. 使用WebServlet注解后，无需对web.xml进行配置，注解会覆盖web.xml。需要指定多个URL时，注解里写成数组形式@WebServlet{"/servlet1","/servlet2"}