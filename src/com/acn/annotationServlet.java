package com.acn;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/03/22:45
 */
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
