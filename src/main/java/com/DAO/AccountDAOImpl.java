package com.DAO;

import com.Entity.Account;
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
public class AccountDAOImpl implements AccountDAO {

    @PersistenceContext
    EntityManager entityManager;

    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public Account addAccount(Account account) {
        entityManager.persist(account);
        return account;
    }

    public Account deleteAccount(Account account) {
        entityManager.remove(account);
        return account;
    }

    public Account updateAccount(Account account) {
        Session session = getSession();
        session.update(account);
        return account;
    }

    public void updateAccountBalance(Account account, Double value) {
        Session session = getSession();
        account.setBallance(account.getBallance() - value); //TODO: Check if works.
        session.update(account);
    }

    public Account getAccountByID(Long accountID) {
        Session session = getSession();
        Query query = session.createQuery("from Account where id = :accountId");
        //TODO:Check if works.
        query.setParameter("accountId", accountID);

        List<Account> list = query.list();

        if (list.size() == 0)
            return null;

        return list.get(0);
    }

    public List<Account> getAccountsByOffice(Long officeID) {
        Session session = getSession();
        Query query = session.createQuery("from Account where officeId = :officeId");
        //TODO:Check if works.
        query.setParameter("officeId", officeID);
        List<Account> list = query.list();
        if (list.size() == 0)
            return null;

        return list;
    }

    public List<Account> getAccounts() {
        Session session = getSession();
        return session.createQuery("from Account").list();
    }
}
