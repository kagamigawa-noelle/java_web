package videoWebside;

import mysqlConnect.ConnMySQL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "GetVideoList",urlPatterns = "/api/lists")
public class GetVideoList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Statement statement=null;
        ResultSet rs=null;
        try {
            statement= ConnMySQL.getStatement();
            String sql=null;
            String type=request.getQueryString().replace("type=","");
            if(type.equals("recommand"))
                sql="select  * from video";
            else
                sql="select  * from cartoon";
            rs=statement.executeQuery(sql);
            String[] results=new String[99];
            int index=0;
            while (rs.next()){
                results[index]="";
                results[index]+=rs.getString(1)+"--"+rs.getString(2)+"--"+
                        rs.getString(3)+"--"+rs.getString(4)+"--"+
                        rs.getString(5)+"--"+rs.getString(6)+"--"+
                        rs.getInt(7)+"--"+rs.getString(8);
                index++;
            }
            String jsonData="[";
            for (int i = 0; i <index ; i++) {
                String[] data=results[i].split("--");
                jsonData+="{\"videoID\":"+"\""+data[0]+"\","+"\"author\":"+"\""+data[1]+"\","+
                        "\"title\":"+"\""+data[2]+"\","+"\"comment\":"+"\""+data[3]+"\","+
                        "\"cover\":"+"\""+data[4]+"\","+"\"path\":"+"\""+data[5]+"\","+
                        "\"zan\":"+"\""+data[6]+"\","+"\"date\":"+"\""+data[7]+"\"},";
            }
            jsonData=jsonData.substring(0,jsonData.length()-1);
            jsonData+="]";
            response.setCharacterEncoding("UTF-8");
            response.setContentType("charset=utf-8");
            String result = "{\"data\":"+jsonData+"}";
            // ????????????
            response.getWriter().print(result);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
