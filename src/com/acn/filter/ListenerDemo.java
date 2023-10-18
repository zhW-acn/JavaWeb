package com.acn.filter;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/18/20:30
 */
@WebListener()
public class ListenerDemo implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletContext application = sre.getServletContext();
        Object visit = application.getAttribute("visit");
        if (visit == null) {
            application.setAttribute("visit", 1);
        } else {
            if (visit instanceof Integer) {
                Integer i = (Integer) visit;
                application.setAttribute("visit", i + 1);
            }
            else{
                throw new RuntimeException("数据有误");
            }
        }
    }
}
