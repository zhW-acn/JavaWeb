package com.acn;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/03/22:24
 */
public class extendsHttpServlet extends HttpServlet {
    public static int i = 1; // 请求次数
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("HttpServlet请求" + i + "次");
        resp.setContentType("text/plain;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.print(i);
//        writer.print("HttpServlet请求" + i++ + "次");
//        writer.flush();
    }
}
