package com.exercise.jdbc;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/11/9:47
 */

@WebServlet(urlPatterns = {"/JDBCServlet"}, initParams = {
        @WebInitParam(name = "id", value = "114"),
        @WebInitParam(name = "name", value = "acn"),
        @WebInitParam(name = "classid", value = "2103")
})
public class JDBCServlet extends HttpServlet {
    String id;
    String name;
    String classid;
    @Override
    public void init() throws ServletException {
        id = getInitParameter("id");
        name = getInitParameter("name");
        classid = getInitParameter("classid");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        boolean flag = false;
        try {
            flag = JDBC.login(req.getParameter("username"), req.getParameter("password"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (flag) {
            HttpSession session = req.getSession();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String currentTime = sdf.format(new Date());
            req.setAttribute("date", currentTime);
            req.setAttribute("id", id);
            req.setAttribute("name", name);
            req.setAttribute("classid", classid);

            req.getRequestDispatcher("week2/exercise/login/ShowIsSuccess.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/week2/exercise/login/ShowFalse.jsp");
        }
    }
}
