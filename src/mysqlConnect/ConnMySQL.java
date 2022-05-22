package mysqlConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ConnMySQL {
    public static Statement getStatement() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt=null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        long start =System.currentTimeMillis();

        // 建立连接
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/videoweb?serverTimezone=UTC",
                "root", "123456");

        // 创建Statement对象
        stmt = conn.createStatement();
        return stmt;
    }
    public static void main(String[] args) throws Exception {
        ResultSet rs=null;
        Connection conn = null;
        Statement stmt=null;
        try {
            // 加载驱动类


            // 执行SQL语句
            stmt=ConnMySQL.getStatement();
            rs = stmt.executeQuery("select * from users");
            while (rs.next()) {
                System.out.println(
                        rs.getString(1)+"\t\t"+
                        rs.getInt(2)+"\t\t"+
                        rs.getString(3)+"\t\t");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}