package javaModel.entity;

import mysqlConnect.ConnMySQL;

import java.sql.*;

public class JDBConn {
    public static Statement getStatement() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        long start =System.currentTimeMillis();

        // 建立连接
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jetbrain?serverTimezone=UTC",
                "root", "123456");

        // 创建Statement对象
        stmt = conn.createStatement();
        return stmt;
    }
    public static PreparedStatement getPreStatement(String sql) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        PreparedStatement stmt=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        long start =System.currentTimeMillis();

        // 建立连接
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jetbrain?serverTimezone=UTC",
                "root", "123456");

        // 创建Statement对象
        stmt = conn.prepareStatement(sql);
        return stmt;
    }

}
