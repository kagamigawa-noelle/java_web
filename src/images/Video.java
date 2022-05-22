package images;

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

import mysqlConnect.ConnMySQL;

@WebServlet(name="Video",urlPatterns = "/video")
public class Video extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Statement statement=null;
        ResultSet rs=null;
        String videoId=request.getQueryString().replace("videoId=","");
        String sql="select * from video where videoID='"+videoId+"' union all select * from cartoon where videoID='"+videoId+"'";
        String path="";
        try {
            statement=ConnMySQL.getStatement();
            rs=statement.executeQuery(sql);
            while (rs.next()){
                path=rs.getString(6);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        File file = new File(path);
        FileInputStream fis;
        fis = new FileInputStream(file);
        request.setAttribute("off","");

        long size = file.length();
        byte[] temp = new byte[(int) size];
        fis.read(temp, 0, (int) size);
        fis.close();
        byte[] data = temp;
        OutputStream out = response.getOutputStream();
        response.setContentType("video/mpeg4");
        out.write(data);

        out.flush();
        out.close();
    }
}