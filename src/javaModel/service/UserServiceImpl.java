package javaModel.service;

import javaModel.entity.User;
import javaModel.dao.UserDao;
import javaModel.dao.UserDaoImpl;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao=new UserDaoImpl();
    @Override
    public boolean login(User user) {
        return userDao.userLogin(user);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAllUser();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User findUserById(String id) {
        return userDao.findUserById(id);
    }

    @Override
    public void updateUser(String id, User user) {
        userDao.updateUser(id,user);
    }

    @Override
    public void delUser(String id) {
        userDao.delUser(id);
    }
}
