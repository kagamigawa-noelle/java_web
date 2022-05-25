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

@WebServlet(name = "UpdateUser",urlPatterns = "/updateuser")
public class UpdateUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id=request.getParameter("id");
        String work=request.getParameter("work");
        String record=request.getParameter("record");
        String isMain="on".equals(request.getParameter("isMain"))?"是":"否";//request.getParameter("isMain").equals("on")?"是":"否";
        String email=request.getParameter("email2");
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String nation=request.getParameter("nation");
        String birth=request.getParameter("birth");
        String school=request.getParameter("school");
        String webside=request.getParameter("webside");
        String isN="on".equals(request.getParameter("isN"))?"是":"否";
        String isM="on".equals(request.getParameter("isM"))?"是":"否";
        String file=request.getParameter("file");
        String zhengming=request.getParameter("zhengming");
        String yanzheng=request.getParameter("yanzheng");
        String zhushi=request.getParameter("zhushi");
        String ageless="on".equals(request.getParameter("ageless"))?"是":"否";
        String isAllow="on".equals(request.getParameter("isAllow"))?"同意":"不同意";
        String agree="on".equals(request.getParameter("agree"))?"同意":"不同意";
        User user=new User(work,record,isMain,email,lastName+firstName,nation,birth,
                school,webside,isN,isM,file,zhengming,yanzheng,zhushi,ageless,isAllow,
                agree);
        UserService userService=new UserServiceImpl();
        userService.updateUser(id,user);
        resp.sendRedirect("/findall");
    }
}
