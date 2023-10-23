package com.exercise.filter;

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
        Integer visit = (Integer) application.getAttribute("count");
        if (visit == null) {
            application.setAttribute("count", 1);
        } else {
            application.setAttribute("count", visit + 1);
        }
    }
}
