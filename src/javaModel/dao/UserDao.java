package javaModel.dao;

import javaModel.entity.User;

import java.util.List;

public interface UserDao {
    public boolean userLogin(User user);
    public List<User> getAllUser();
    public void addUser(User user);
    public void updateUser(String id,User user);
    public User findUserById(String id);
    public void delUser(String id);
}
