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
}
