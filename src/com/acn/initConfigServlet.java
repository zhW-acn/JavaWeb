package com.acn;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/24/11:16
 */
@WebServlet(urlPatterns = {"/initConfigServlet"},
    initParams = @WebInitParam(name = "name", value = "acn")
)

public class initConfigServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println(config.getInitParameter("name"));
    }
}
