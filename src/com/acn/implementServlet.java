package com.acn;


import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/09/18/19:25
 */
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
//        servletResponse.setCharacterEncoding("GBK");
        servletResponse.setContentType("text/plain;charset=UTF-8");
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
