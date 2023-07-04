package ru.yusupov.springboot.service;


import ru.yusupov.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(User user);
}