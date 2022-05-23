package javaModel.dao;

import javaModel.entity.User;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean userLogin(User user) {
        System.out.println(user.getJob()+user.getEmail()+user.getSchool());
        return "我是学生".equals(user.getJob())&&
                "1687457099@qq.com".equals(user.getEmail())&&
                "安徽三联学院".equals(user.getSchool());
    }
}
