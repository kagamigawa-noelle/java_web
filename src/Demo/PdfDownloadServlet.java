package Demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "PDFdownLoad",urlPatterns = "/pdfdown")
public class PdfDownloadServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        File file = new File("C:\\Users\\Shinelon\\Desktop\\zzz.pdf");
        FileInputStream fis;
        fis = new FileInputStream(file);
        request.setAttribute("off","");

        long size = file.length();
        byte[] temp = new byte[(int) size];
        fis.read(temp, 0, (int) size);
        fis.close();
        byte[] data = temp;
        OutputStream out = response.getOutputStream();
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition","attachment;fileName="+"test.pdf");
        out.write(data);

        out.flush();
        out.close();
    }
}
