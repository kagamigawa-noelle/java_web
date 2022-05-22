package videoWebside;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mysqlConnect.ConnMySQL;

@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query= URLDecoder.decode(request.getQueryString(),"utf-8");
        String[] querys=query.split("&");
        String account=querys[0].replace("account=","");
        String password=querys[1].replace("password=","");
        String login=querys[2].replace("state=","");

        try {
            Statement statement =ConnMySQL.getStatement();
            String sql="select * from users where username='"+account+"' and password='"+password+"'";;
            if(!login.equals("login")){
                ResultSet rs= statement.executeQuery(sql);
                if(rs.next()){
                    response.setContentType("charset=utf-8");
                    String result = "{\"states\":\"repeatn\"}";
                    // 返回数据
                    response.getWriter().print(result);
                    return;
                }
                sql="insert into users value ('"+account+"','"+password+"','0')";
                int re=statement.executeUpdate(sql);
                if(re!=0){
                    response.setContentType("charset=utf-8");
                    String result = "{\"states\":\"success\"}";
                    // 返回数据
                    response.getWriter().print(result);
                }
                else {
                    response.setContentType("charset=utf-8");
                    String result = "{\"states\":\"zhuce failed\"}";
                    // 返回数据
                    response.getWriter().print(result);
                }
                return;
            }

            ResultSet rs= statement.executeQuery(sql);
            System.out.println(sql);
            if(rs.next()){
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

        System.out.println(query);
    }
}
