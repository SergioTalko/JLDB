package com.Services;

import com.Entity.Account;

import java.util.List;

public interface AccountService {

    void addAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Account account);
    Account getAccountByID(Long accountID);
    List<Account> getAccountsByOffice(Long officeID);
    List<Account> getAccounts();
    void updateAccountBalance(Account account, Double value);

}

