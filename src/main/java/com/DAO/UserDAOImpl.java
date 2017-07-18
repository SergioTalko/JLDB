package com.DAO;

import com.Entity.Agent;
import com.Entity.AgentType;
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
    public Object create(Object o) {
        entityManager.persist(o);
        return o;
    }

    @Override
    public Object update(Object o) {
        Session session = getSession();
        session.update(o);
        return o;
    }

    @Override
    public Object getById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void delete(Object o) {
        entityManager.remove(o);
    }

    @Override
    public List<Object> getAll() {
        Session session = getSession();
        return session.createQuery("from User").list();
    }

    @Override
    public User logUser(String email, String password) {
        User user;
        try {
            user = entityManager.find(User.class, email);
        }
        catch (Exception e){
            return null;
        }

        if (user.getPassword().equals(password))
            return user;
        return null;
/*
        Session session = getSession();
        Query query = session.createQuery("from User where email = :emailCode AND password = :passCode");

        query.setParameter("emailCode", email);
        query.setParameter("passCode", password);

        List<User> users = query.list();

        if (users.size() == 0)
            return null;
        return users.get(0);*/
    }



/*
    @Override
    public void removeUser(Long userId) {
        Session session = getSession();
        User user = session.load(User.class, new Long(userId));
        if(user!=null){
            session.delete(user);
        }
        //entityManager.remove(user);
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
*/
}
