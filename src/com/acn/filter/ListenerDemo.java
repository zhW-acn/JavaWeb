package com.acn.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/18/20:30
 */
@WebListener
public class ListenerDemo implements ServletRequestListener {

    public ListenerDemo() {
    }

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
