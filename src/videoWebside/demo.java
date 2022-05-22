package videoWebside;

import mysqlConnect.ConnMySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Statement statement =ConnMySQL.getStatement();
        ResultSet rs= statement.executeQuery("select * from video union all select * from cartoon");
        while (rs.next()){
            System.out.println(rs.getString(1));
        }

    }
}
