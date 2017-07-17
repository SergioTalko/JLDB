package com.Services;

import java.util.List;

public interface AbstractService {
    void create(Object o);
    void update(Object o);
    Object read(Object o);
    Object getById(Long id);
    void delete(Object o);
    List<Object> getAll();
    /*
    void deleteAccount(Account account);
    Account getAccountByID(Long accountID);
    List<Account> getAccountsByOffice(Long officeID);
    List<Account> getAccounts();
    void updateAccountBalance(Account account, Double value);
    */
}
