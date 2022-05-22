package videoWebside;

import mysqlConnect.ConnMySQL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "UptateZan" +
        "", urlPatterns = "/updatezan")
public class UpdateZan extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query= URLDecoder.decode(request.getQueryString(),"utf-8");
        String[] querys=query.split("&");
        String videoID=querys[0].replace("videoID=","");
        String zan=querys[1].replace("zan=","");
        System.out.println(videoID+"-------"+zan);
        try {
            Statement statement =ConnMySQL.getStatement();
            String sql="update video set zan="+zan+" where videoID=\""+videoID+"\"";

            int rs= statement.executeUpdate(sql);
            if (rs==0){
                sql="update cartoon set zan="+zan+" where videoID=\""+videoID+"\"";
            }
            rs= statement.executeUpdate(sql);
            System.out.println(rs);
            if(rs!=0){
                response.setContentType("charset=utf-8");
                String result = "{\"states\":\"true\"}";
                // 返回数据
                response.getWriter().print(result);
            }
            else {
                response.setContentType("charset=utf-8");
                String result = "{\"states\":\"faild\"}";
                // 返回数据
                response.getWriter().print(result);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
