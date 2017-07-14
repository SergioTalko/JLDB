package com.Services;

import com.DAO.OfficeDAO;
import com.DAO.UserDAO;
import com.Entity.User;
import com.Entity.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private OfficeDAO officeDAO;

    @Override
    public User loginUser(String login, String password) {
        return userDAO.logUser(login, password);
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(Long userId) {
        userDAO.removeUser(userId);
    }

    @Override
    public User getUser(Long userId) {
        return userDAO.getUser(userId);
    }

    @Override
    public List<User> getAll() {
        return userDAO.getAllUsers();
    }

    public List<UserType> getPositions(){;
        return Arrays.asList(UserType.values());
    }

}
