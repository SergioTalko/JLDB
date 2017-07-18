package com.Services;

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

    @Override
    public User loginUser(String login, String password) {
        return userDAO.logUser(login, password);
    }

    @Override
    public void create(Object o) {
        userDAO.create(o);
    }

    @Override
    public void update(Object o) {
        userDAO.update(o);
    }

    @Override
    public Object getById(Long id) {
        return userDAO.getById(id);
    }

    @Override
    public void delete(Object o) {
        userDAO.delete(o);
    }

    @Override
    public List<Object> getAll() {
        return userDAO.getAll();
    }

    public List<UserType> getPositions(){;
        return Arrays.asList(UserType.values());
    }

}
