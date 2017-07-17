package com.Entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@Transactional
@Table(name = "AGENTS")
public class Agent {
    private long id;
    private String name;
    private String adress;
    private String tel;
    private String contact;
    private AgentType type;

    //Constructors
    public Agent() {
    }

    public Agent(String name, String adress, String tel, String contact, AgentType type) {
        this.name = name;
        this.adress = adress;
        this.tel = tel;
        this.contact = contact;
        this.type = type;
    }

    //Getters

    @Id
    @SequenceGenerator(name = "AGENTID_SEQ", sequenceName = "AGENTID_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AGENTID_SEQ")
    public long getAgentId() {
        return id;
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
    @Column(name = "CONTACT")
    public String getContact() {
        return contact;
    }
    @Column(name = "TYPE")
    public AgentType getType() {
        return type;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
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
    public void setContact(String contact) {
        this.contact = contact;
    }
    public void setType(AgentType type) {
        this.type = type;
    }
}
