package com.acn;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/02/13:40
 */
public class extendsGenericServlet extends GenericServlet {
    public static int i = 1; // 请求次数
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("请求" + i + "次");
//        servletResponse.setCharacterEncoding("GBK");
        servletResponse.setContentType("text/plain;charset=UTF-8");
        PrintWriter writer = servletResponse.getWriter();
        writer.print("GenericServlet请求" + i++ + "次");
        writer.flush();
    }
}
