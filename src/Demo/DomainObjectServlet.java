package Demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "DomainObjectServlet",value = "/domainObject")
public class DomainObjectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        ServletContext servletContext=this.getServletContext();
        req.setAttribute("reqKey","保存在request中的数据");
        session.setAttribute("sesskey","保存在session中的数据");
        servletContext.setAttribute("appkey","保存在application中得数据");
        req.getRequestDispatcher("domainObject1.jsp").forward(req,resp);
    }
}
