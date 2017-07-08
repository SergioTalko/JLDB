package com.Entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Transactional
@Table(name = "USERS")
public class User {
    private Long id;
    private String name;
    private String surname;
    private String tel;
    private String email;
    private String password;
    private UserType userType;
    private Long officeID;

    //Constructors
    public User(){

    }
    public User(String name, String surname, String tel, String email, String password, UserType userType, Long officeID) {
        this.name = name;
        this.surname = surname;
        this.tel = tel;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.officeID = officeID;
    }

     //Getters
    @Id
    @SequenceGenerator(name = "USERID_SEQ", sequenceName = "USERID_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USERID_SEQ")
    public Long getId() {
        return id;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }
    @Column(name = "SURNAME")
    public String getSurname() {
        return surname;
    }
    @Column(name = "TEL")
    public String getTel() {
        return tel;
    }
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }
    @Column(name = "PASSWORD")
    public String getPassword() {
        return password;
    }
    @Column(name = "USERTYPE")
    public UserType getUserType(){
        return userType;
    }
    @Column(name = "OFFICEID")
    public Long getOfficeID() {
        return officeID;
    }

    // Setters //TODO CHECK Think they are unnecessary as we manipulate data in DB, not raw objects in memory.

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(UserType userType){
        this.userType = userType;
    }

    public void setOfficeID(Long officeID) {
        this.officeID = officeID;
    }

    public String toString() {
        return id + "/" + name + "/" + surname + "/" + userType + "/" + officeID + "\n";
    }

}
