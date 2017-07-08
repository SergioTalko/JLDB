package com.DAO;

import com.Entity.Account;

import java.util.List;

public interface AccountDAO {
    Account addAccount(Account account);
    Account updateAccount(Account account);
    void updateAccountBalance(Account account, Double value);
    Account deleteAccount(Account account);
    Account getAccountByID(Long accountID);
    List<Account> getAccountsByOffice(Long officeID);
    List<Account> getAccounts();
}
