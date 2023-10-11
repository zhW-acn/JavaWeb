package com.iflytek;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/11/9:47
 */

@WebServlet("/JDBCServlet")
public class JDBCServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            boolean flag = JDBC.insert(req.getParameter("username"), req.getParameter("password"));
            req.getRequestDispatcher("week2/ShowIsSuccess.jsp").forward(req,resp);
        } catch (SQLException e) {
            req.getRequestDispatcher("web/errorHandle.jsp");
        }
    }
}
