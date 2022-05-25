package javaModel.service;

import javaModel.entity.User;

import java.util.List;

public interface UserService {
    public boolean login(User user);
    public List<User> getAll();
    public void addUser(User user);
    public User findUserById(String id);
    public void updateUser(String id, User user);
    public void delUser(String id);
}
