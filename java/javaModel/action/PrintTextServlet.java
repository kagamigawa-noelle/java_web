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

@WebServlet(name = "PrintTextServlet",value = "/print")
public class PrintTextServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String work=request.getParameter("work");
        String record=request.getParameter("record");
        String isMain=request.getParameter("isMain");
        String email=request.getParameter("email2");
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");
        String nation=request.getParameter("nation");
        String birth=request.getParameter("birth");
        String school=request.getParameter("school");
        String webside=request.getParameter("webside");
        String isN=request.getParameter("isN");
        String isM=request.getParameter("isM");
        String file=request.getParameter("file");
        String zhengming=request.getParameter("zhengming");
        String yanzheng=request.getParameter("yanzheng");
        String zhushi=request.getParameter("zhushi");
        String ageless="on".equals(request.getParameter("ageless"))?"是":"否";
        String isAllow="on".equals(request.getParameter("isAllow"))?"同意":"不同意";
        String agree="on".equals(request.getParameter("agree"))?"同意":"不同意";
        User user=new User(work,record,isMain,email,firstName+lastName,nation,birth,
        school,webside,isN,isM,file,zhengming,yanzheng,zhushi,ageless,isAllow,
                agree);
        UserService userService=new UserServiceImpl();
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("user",user);
        System.out.println(userService.login(user));
        if(userService.login(user)//等等验证信息
        ){
            System.out.println(user.getName()+"同学提交成功");
            request.getRequestDispatcher("/welcome.jsp").forward(request,response);

        }
        else response.sendRedirect("/application.html");

    }
}
