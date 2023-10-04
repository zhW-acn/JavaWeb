package com.acn;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/04/18:19
 */
@WebServlet("/redirectServlet")
public class redirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 第一种方法
        resp.setStatus(302);
        resp.setHeader("Location","https://bilibili.com");

        // 第二种方法
        resp.sendRedirect("https://bilibili.com");
    }
}
