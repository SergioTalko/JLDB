package com.DAO;

import com.Entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;

    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void removeUser(User user) {
        entityManager.remove(user);
    }

    public void updateUser(User user){
        Session session = getSession();
        session.update(user);
    }

    @Override
    public User getUser(Long userId) {
        Session session = getSession();
        Query query = session.createQuery("from User where id = :id");
        query.setParameter("id", userId);
        //TODO: Check if works
        List<User> users = query.list();

        if (users.size() == 0)
            return null;
        return users.get(0);
    }

    @Override
    public User logUser(String email, String password) {
        Session session = getSession();
        Query query = session.createQuery("from User where email = :emailCode AND password = :passCode");

        query.setParameter("emailCode", email);
        query.setParameter("passCode", password);

        List<User> users = query.list();

        if (users.size() == 0)
            return null;
        return users.get(0);
    }

    @Override
    public List<User> getAllUsers() {
        Session session = getSession();
        return session.createQuery("from User").list();
    }

}
