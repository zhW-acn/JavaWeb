package com.acn;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/03/22:45
 */
@WebServlet({"/annotationServlet"})
public class annotationServlet extends HttpServlet {
    public static int i = 1; // 请求次数

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("annotationServlet请求" + i + "次");
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print("annotationServlet请求" + i++ + "次");
        writer.flush();
        System.out.println("-----------");


        System.out.println("request.getAuthType() = " + request.getAuthType());
        System.out.println("request.getCookies() = " + Arrays.toString(request.getCookies()));
        System.out.println("request.getParameter(\"name\") = " + request.getParameter("name"));

        // 参数
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String key = parameterNames.nextElement();
            String[] parameterValues = request.getParameterValues(key);
            System.out.println(key + ":" + Arrays.toString(parameterValues));
        }

        System.out.println("request.getContextPath() = " + request.getContextPath());
        System.out.println("request.getMethod() = " + request.getMethod());
        System.out.println("request.getQueryString() = " + request.getQueryString());
        System.out.println("request.getServletPath() = " + request.getServletPath());
        System.out.println("request.getRequestURI() = " + request.getRequestURI());
        System.out.println("request.getRequestURL() = " + request.getRequestURL());
        System.out.println("request.getRemoteHost() = " + request.getRemoteHost());

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

    }
}
