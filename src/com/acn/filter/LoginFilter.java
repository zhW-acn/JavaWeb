package com.acn.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 判断用户登录的过滤器
 * @author: acn
 * @date: 2023/10/11/20:21
 */
@WebFilter({"/filterdemo/*"})//loginpage下的过滤器
public class LoginFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        //创建白名单
        List<String> witheNames = Arrays.asList(request.getContextPath() + "LoginServlet", request.getContextPath() + "/login.jsp");
        // 如果在白名单我就放行
        if (witheNames.contains(request.getRequestURI())) {
            chain.doFilter(request, response);
        } else {
            HttpSession session = request.getSession(false);
            // 有用户信息说明已经登录
            if (session != null && session.getAttribute("user") != null) {
                chain.doFilter(request, response);// 放行
            } else { // 否则就重新跳转
                response.sendRedirect(request.getContextPath() + "/login.jsp");
            }
        }
    }
}
