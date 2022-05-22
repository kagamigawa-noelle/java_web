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

@WebServlet(name="isic",urlPatterns = "/isic")
public class isic extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        File file = new File("D:\\AutoSaveScan\\webJava\\imgs\\isic.png");
        FileInputStream fis;
        fis = new FileInputStream(file);
        request.setAttribute("off","");

        long size = file.length();
        byte[] temp = new byte[(int) size];
        fis.read(temp, 0, (int) size);
        fis.close();
        byte[] data = temp;
        OutputStream out = response.getOutputStream();
        response.setContentType("image/png");
        out.write(data);

        out.flush();
        out.close();
    }
}