package com.iflytek;

import java.sql.*;

/**
 * @Description: TODO
 * @author: acn
 * @date: 2023/10/11/9:50
 */
public class JDBC {
    static Connection c;
    static PreparedStatement st;
    static String sql;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///demo", "root", "acane");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * 插入
     */
    public static boolean insert(String username, String password) throws SQLException {
        try {
            sql = "insert into test(username,password) values(?,?)";
            st = c.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            int i = st.executeUpdate();
            if (i == 1) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}