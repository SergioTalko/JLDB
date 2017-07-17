package com.Entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Date;

@Entity
@Transactional
@Table(name = "STOCKSUBOP")
public class StockSubOp {
    private Long id;
    private Long opId;
    private OperationType opType;
    private Long productId;
    private Long officeId;
    private Long userId;
    private Date date;
    private Double kgs;
    private Double price;
    private Double totalEUR;

    //Constructors
    public StockSubOp() {
    }

    public StockSubOp(Long opId, OperationType opType, Long productId, Long officeId, Long userId, Date date, Double kgs, Double price) {
        this.opId = opId;
        this.opType = opType;
        this.productId = productId;
        this.officeId = officeId;
        this.userId = userId;
        this.date = date;
        this.kgs = kgs;
        this.price = price;
        this.totalEUR = kgs * price;
    }

    //Getters
    @Id
    @SequenceGenerator(name = "STOCKSUBOPID_SEQ", sequenceName = "STOCKSUBOPID_SEQ",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STOCKSUBOPID_SEQ")
    public Long getId() {
        return id;
    }
    @Column(name = "OPID")
    public Long getOpId(){
        return opId;
    }
    @Column(name = "OPTYPE")
    public OperationType getOpType() {
        return opType;
    }
    @Column(name = "STOCKID")
    public Long getProductId() {
        return productId;
    }
    @Column(name = "OFFICEID")
    public Long getOfficeId() {
        return officeId;
    }
    @Column(name = "USERID")
    public Long getUserId() {
        return userId;
    }
    @Column(name = "DATEM")
    public Date getDate() {
        return date;
    }
    @Column(name = "KGS")
    public Double getKgs() {
        return kgs;
    }
    @Column(name = "PRICE")
    public Double getPrice() {
        return price;
    }

    //Unbinded object field
    public Double getTotalEUR() {
        return totalEUR;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setOpId(Long opId) {
        this.opId = opId;
    }
    public void setOpType(OperationType opType) {
        this.opType = opType;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setKgs(Double kgs) {
        this.kgs = kgs;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setTotalEUR(Double totalEUR) {
        this.totalEUR = totalEUR;
    }
}

