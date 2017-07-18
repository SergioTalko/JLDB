package com.DAO;

import com.Entity.User;

public interface UserDAO extends AbstractDAO{
    User logUser(String email, String password);
}
