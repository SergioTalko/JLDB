package com.Entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

//TODO recheck to make offices and buyer be separate tables but have possibility to called as parent class from UIs.

@Entity
@Transactional
@Table(name = "OFFICES")
public class Office {
    private Long officeID;
    private String name;
    private String adress;
    private String tel;

    //Constructors
    public Office(){
    }
    public Office(String name, String adress, String tel) {
        this.name = name;
        this.adress = adress;
        this.tel = tel;
    }

    //Getters
    @Id
    @SequenceGenerator(name = "OFFICEID_SEQ", sequenceName = "OFFICEID_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OFFICEID_SEQ")
    public Long getOfficeID() {
        return officeID;
    }
    @Column(name = "NAME")
    public String getName() {
        return name;
    }
    @Column(name = "ADRESS")
    public String getAdress() {
        return adress;
    }
    @Column(name = "TEL")
    public String getTel() {
        return tel;
    }

    //Setters //TODO CHECK Think they are unnecessary as we manipulate data in DB, not raw objects in memory.

    public void setOfficeID(Long officeID) {
        this.officeID = officeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
