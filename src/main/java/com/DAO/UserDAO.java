package com.DAO;

import com.Entity.User;

import java.util.List;

/**
 * Created by Dracula on 22.05.2017.
 */
public interface UserDAO{
    void addUser(User user);
    void removeUser(User user);
    void updateUser(User user);
    //User getUser(String name, String surname); //Maybe unnecessary
    User getUser(Long userId);
    User logUser(String email, String password);
    List<User> getAllUsers();

}
