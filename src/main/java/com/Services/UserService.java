package com.Services;

import com.Entity.User;
import com.Entity.UserType;

import java.util.List;

public interface UserService {

    User loginUser(String login, String password);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long userId);

    User getUser(Long userId);

    List<User> getAll();

    //User getUser(String name, String surname); //Maybe unnecessary

    // Secindary for UI
    List<UserType> getPositions();
}
