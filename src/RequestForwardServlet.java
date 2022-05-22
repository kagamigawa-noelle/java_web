import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RequestForwardServlet", value = "/RequestForwardServlet")
public class RequestForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("data1","此页面是官方文件");
        request.getRequestDispatcher("/PrintTextServlet").forward(request,response);
    }
}
