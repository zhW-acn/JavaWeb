package com.acn.json;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/30/11:58
 */
@WebServlet(urlPatterns = {"/JSON"},name = "JSONServlet")
public class JSONServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("acn");
        String jsonString = JSONObject.toJSONString(user);
        System.out.println(jsonString);
        PrintWriter writer = resp.getWriter();
        writer.print(jsonString);
    }
}
