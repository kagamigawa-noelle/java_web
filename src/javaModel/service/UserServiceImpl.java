package javaModel.service;

import javaModel.entity.User;
import javaModel.dao.UserDao;
import javaModel.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    @Override
    public boolean login(User user) {
        return userDao.userLogin(user);
    }
}
