package javaModel.action;

import javaModel.service.UserService;
import javaModel.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DelUser",urlPatterns = "/delete")
public class DelUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        UserService userService=new UserServiceImpl();
        userService.delUser(id);
        resp.sendRedirect("/findall");
    }
}
