package com.Entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Date;

// General operation class. Represents a buy/sell/transform/trash operation in general.
// Contains general information on each operation.
// Each in reality has several sub operations.
// Example: Buy op: Stock add products, Account money-value of goods bought. Can buy several goods ata a time.
//TODO: NOT READY AT ALL MATTER TO DISCUS AS DESIGN AND ARCHITECTURE IS NOT READY. ANDREY.
@Entity
@Transactional
@Table(name = "OPERATIONS")
public class Operation {
    private long id;
    private String opDescription;
    private Date date;
    private long officeId;
    private String agent; //TODO this is a test
    //private Customer customer; //TODO
    private double opResultEUR;
    private String type;

    public Operation() {
    }

    public Operation(long id, String opDescription, Date date, long office, String agent, double opResultEUR, String type) {
        this.id = id;
        this.opDescription = opDescription;
        this.date = date;
        this.officeId = office;
        this.agent = agent;
        this.opResultEUR = opResultEUR;
        this.type = type;
    }
    @Id
    @SequenceGenerator(name = "OPERATION_SEQ", sequenceName = "OPERATION_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OPERATION_SEQ")
    public long getId() {
        return id;
    }
    @Column(name = "OPDESCRIPTION")
    public String getOpDescription() {
        return opDescription;
    }
    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }
    @Column(name = "OFFICEID")
    public long getOfficeId() {
        return officeId;
    }
    @Column(name = "AGENT")
    public String getAgent() {
        return agent;
    }
    @Column(name = "OPRESULTEUR")
    public double getOpResultEUR() {
        return opResultEUR;
    }
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOpDescription(String opDescription) {
        this.opDescription = opDescription;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public void setOpResultEUR(double opResultEUR) {
        this.opResultEUR = opResultEUR;
    }

    public void setType(String type) {
        this.type = type;
    }
}
