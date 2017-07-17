package com.DAO;

import com.Entity.Account;

import java.util.List;

public interface AccountDAO extends AbstractDAO{
    void updateAccountBalance(Account account, Double value);
    List<Account> getAllByOfficeId(Long officeID);
}
