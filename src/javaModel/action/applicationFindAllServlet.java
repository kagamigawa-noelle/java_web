package javaModel.action;

import javaModel.entity.User;
import javaModel.service.UserService;
import javaModel.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "applicationFindAllServlet",urlPatterns = "/findall")
public class applicationFindAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService=new UserServiceImpl();
        List<User> users= userService.getAll();
        req.setAttribute("users",users);
        req.getRequestDispatcher("/applicationFindAll.jsp").forward(req,resp);
    }
}
