package com.Services;

import com.Entity.Account;

import java.util.List;

public interface AccountService extends AbstractService{
/*
    void addAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Account account);
    List<Account> getAccounts();
    Account getAccountByID(Long accountID);*/
    List<Account> getAccountsByOffice(Long officeID);
    void updateAccountBalance(Account account, Double value);

}

