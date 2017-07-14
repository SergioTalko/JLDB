package com.Entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Transactional
@Table(name = "ACCOUNTS")
public class Account {
    Long accountId;
    AccType accType;
    String bank;
    String adress;
    int accNr;
    String swift;
    String iban;
    String tel;
    Double ballance;
    Long officeID;

    //Constructors
    public Account(){
    }
    public Account(AccType accType, String bank, String adress, int accNr, String swift, String iban, String tel, Double ballance, Long officeID) {
        this.accType = accType;
        this.bank = bank;
        this.adress = adress;
        this.accNr = accNr;
        this.swift = swift;
        this.iban = iban;
        this.tel = tel;
        this.ballance = ballance;
        this.officeID = officeID;
    }

    //Getters
    @Id
    @SequenceGenerator(name = "ACCOUNTID_SEQ", sequenceName = "ACCOUNTID_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNTID_SEQ")
    public Long getAccountId() {
        return accountId;
    }
    @Column(name = "ACCOUNTTYPE")
    public AccType getAccType() {
        return accType;
    }
    @Column(name = "BANK")
    public String getBank() {
        return bank;
    }
    @Column(name = "ADRESS")
    public String getAdress() {
        return adress;
    }
    @Column(name = "ACCOUNTNR")
    public int getAccNr() {
        return accNr;
    }
    @Column(name = "SWIFT")
    public String getSwift() {
        return swift;
    }
    @Column(name = "IBAN")
    public String getIban() {
        return iban;
    }
    @Column(name = "TEL")
    public String getTel() {
        return tel;
    }
    @Column(name = "BALLANCE")
    public Double getBallance() {
        return ballance;
    }
    @Column(name = "OFFICEID")
    public Long getOfficeID() {
        return officeID;
    }

    //Setters //TODO CHECK Think they are unnecessary as we manipulate data in DB, not raw objects in memory.

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setAccType(AccType accType) {
        this.accType = accType;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAccNr(int accNr) {
        this.accNr = accNr;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setBallance(Double ballance) {
        this.ballance = ballance;
    }

    public void setOfficeID(Long officeID) {
        this.officeID = officeID;
    }
}
