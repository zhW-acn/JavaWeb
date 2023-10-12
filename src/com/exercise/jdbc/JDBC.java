package com.exercise.jdbc;

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
        sql = "insert into test(username,password) values(?,?)";
        st = c.prepareStatement(sql);
        st.setString(1, username);
        st.setString(2, password);
        int i = st.executeUpdate();
        if (i == 1) {
            return true;
        }
        return false;
    }

    public static boolean login(String username, String password) throws SQLException {
        sql = "select * from test where username = ? and password = ?";
        st = c.prepareStatement(sql);
        st.setString(1, username);
        st.setString(2, password);
        ResultSet rs = st.executeQuery();
        int i = 0;
        while(rs.next()){i++;}
        if(i != 0){
            return true;
        }
        return false;
    }
}