package com.acn.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/11/20:40
 */
@WebServlet({"/LoginServlet"})
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String passwd = req.getParameter("passwd");
        if ("admin".equals(user) && "123".equals(passwd)) {
            // 向session中保存状态
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            // 转发到一个成功的页面
            req.getRequestDispatcher("/WEB-INF/loginpage/success.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/WEB-INF/loginpage/relog.jsp").forward(req, resp);
        }
    }
}
