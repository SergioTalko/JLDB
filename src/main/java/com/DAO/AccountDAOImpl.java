package com.DAO;

import com.Entity.Account;
import com.Entity.Agent;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class AccountDAOImpl implements AccountDAO {

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
        /*Session session = getSession();
        Query query = session.createQuery("from Account where id = :id");
        //TODO:Check if works.
        query.setParameter("id", id);

        List<Account> list = query.list();

        if (list.size() == 0)
            return null;

        return list.get(0);
        */
        return entityManager.find(Account.class ,id);
    }

    @Override
    public void delete(Object o) {
        entityManager.remove(o);
    }

    @Override
    public List<Object> getAll() {
        Session session = getSession();
        return session.createQuery("from Account").list();
    }

    @Override
    public void updateAccountBalance(Account account, Double value) {
        Session session = getSession();
        account.setBallance(account.getBallance() - value); //TODO: Check if works.
        session.update(account);
    }

    @Override
    public List<Account> getAllByOfficeId(Long officeID) {
        Session session = getSession();
        Query query = session.createQuery("from Account where officeID = :officeId");
        //TODO:Check if works.
        query.setParameter("officeId", officeID);
        List<Account> list = query.list();
        if (list.size() == 0)
            return null;

        return list;
    }
}
