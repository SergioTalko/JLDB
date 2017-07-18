package com.Services;

import com.DAO.AccountDAO;
import com.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDAO accountDAO;

    @Override
    public void create(Object o) {
        accountDAO.create(o);
    }

    @Override
    public void update(Object o) {
        accountDAO.update(o);
    }

    @Override
    public Object getById(Long id) {
        return accountDAO.getById(id);
    }

    @Override
    public void delete(Object o) {
        accountDAO.delete(o);
    }

    @Override
    public List<Object> getAll() {
        return accountDAO.getAll();
    }

    @Override
    public List<Account> getAccountsByOffice(Long officeID) {
        return accountDAO.getAllByOfficeId(officeID);
    }

    @Override
    public void updateAccountBalance(Account account, Double value) {
        accountDAO.updateAccountBalance(account, value);
    }




/*
    @Override
    public void addAccount(Account account) {
        accountDAO.addAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountDAO.updateAccount(account);
    }

    @Override
    public void deleteAccount(Account account) {
        accountDAO.deleteAccount(account);
    }

    @Override
    public Account getAccountByID(Long accountID) {
        return accountDAO.getAccountByID(accountID);
    }

    @Override
    public List<Account> getAccountsByOffice(Long officeID) {
        return accountDAO.getAccountsByOffice(officeID);
    }

    @Override
    public List<Account> getAccounts() {
        return accountDAO.getAccounts();
    }

    @Override
    public void updateAccountBalance(Account account, Double value) {
        accountDAO.updateAccountBalance(account, value);
    }
*/
}
