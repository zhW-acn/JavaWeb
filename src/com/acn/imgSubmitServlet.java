package com.acn;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/18/10:31
 */
@WebServlet("/imgSubmit")
@MultipartConfig
public class imgSubmitServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        Part profile = null;
        InputStream is = null;
        OutputStream fos = null;
        try {
            profile = req.getPart("profile");
            is = profile.getInputStream();
            fos = new FileOutputStream(new File("F:/GitHub/JavaWeb/res/imgSubmit/" + profile.getSubmittedFileName()));
            int len = 0;
            byte[] buf = new byte[1024 * 1024];
            while ((len = is.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
