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
 * @date: 2023/10/08/11:52
 */
@WebServlet("/road")
public class Road extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 请求转发在服务器内部
//        req.getRequestDispatcher("/road/index.html").forward(req,resp);

        // 重定向在浏览器，要加上站点路径request.getContextPath() + /
        resp.sendRedirect("/road/index.html");
    }
}
