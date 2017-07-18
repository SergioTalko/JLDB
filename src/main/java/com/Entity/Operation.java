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
    private Long id;
    private String doc;
    private Long supplierId;
    private Long buyerId;
    private String descr;
    private OperationType opType;
    private Date date;
    private Long userId;

    private Double kgsIn;
    private Double priceIn;
    private Integer cbdIn;
    private Integer cbdaIn;
    private Integer thcIn;
    private Integer thcaIn;

    private Double kgsOut;
    private Double priceOut;
    private Integer cbdOut;
    private Integer cbdaOut;
    private Integer thcOut;
    private Integer thcaOut;

    private Long accId;
    private Date payday;
    private double totalEUR;

    //Constructors
    public Operation() {
    }
    //Other operations constructor
    public Operation(String doc, Long supplierId, Long buyerId, String descr, OperationType opType, Date date, Long userId, Double kgsIn, Double priceIn) {
        this.doc = doc;
        this.supplierId = supplierId;
        this.buyerId = buyerId;
        this.descr = descr;
        this.opType = opType;
        this.date = date;
        this.userId = userId;
        this.kgsIn = 1.0;
        this.priceIn = null;
        this.cbdIn = null;
        this.cbdaIn = null;
        this.thcIn = null;
        this.thcaIn = null;
        this.kgsOut = null;
        this.priceOut = null;
        this.cbdOut = null;
        this.cbdaOut = null;
        this.thcOut = null;
        this.thcaOut = null;
        this.accId = accId;
        this.payday = null;
        this.totalEUR = kgsIn * priceIn;
    }

    //BUY-SELL operation constructor
    public Operation(String doc, Long supplierId, Long buyerId, String descr, OperationType opType, Date date, Long userId, Double kgsIn, Double priceIn, Long accId) {
        this.doc = doc;
        this.supplierId = supplierId;
        this.buyerId = buyerId;
        this.descr = descr;
        this.opType = opType;
        this.date = date;
        this.userId = userId;
        this.kgsIn = kgsIn;
        this.priceIn = priceIn;
        this.cbdIn = null;
        this.cbdaIn = null;
        this.thcIn = null;
        this.thcaIn = null;
        this.kgsOut = null;
        this.priceOut = null;
        this.cbdOut = null;
        this.cbdaOut = null;
        this.thcOut = null;
        this.thcaOut = null;
        this.accId = accId;
        this.payday = null;
        this.totalEUR = kgsIn * priceIn;
    }

    //Transformation operation constructor
    public Operation(Long buyerId, OperationType opType, Date date, Long userId, Double kgsIn, Double priceIn, Integer cbdIn, Integer cbdaIn, Integer thcIn, Integer thcaIn, Double kgsOut, Integer cbdOut, Integer cbdaOut, Integer thcOut, Integer thcaOut) {
        this.doc = null;
        this.supplierId = null;
        this.buyerId = buyerId;
        this.descr = null;
        this.opType = opType;
        this.date = date;
        this.userId = userId;
        this.kgsIn = kgsIn;
        this.priceIn = priceIn;
        this.cbdIn = cbdIn;
        this.cbdaIn = cbdaIn;
        this.thcIn = thcIn;
        this.thcaIn = thcaIn;
        this.kgsOut = kgsOut;
        this.priceOut = kgsIn * priceIn / kgsOut;
        this.cbdOut = cbdOut;
        this.cbdaOut = cbdaOut;
        this.thcOut = thcOut;
        this.thcaOut = thcaOut;
        this.accId = null;
        this.payday = null;
        this.totalEUR = 0.0;
    }

    //Getters
    @Id
    @SequenceGenerator(name = "OPERATIONID_SEQ", sequenceName = "OPERATIONID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OPERATIONID_SEQ")
    @Column(name = "ID")
    public Long getId() {
        return id;
    }
    @Column(name = "DOC")
    public String getDoc() {
        return doc;
    }
    @Column(name = "SUPPLIERID")
    public Long getSupplierId() {
        return supplierId;
    }
    @Column(name = "BUYERID")
    public Long getBuyerId() {
        return buyerId;
    }
    @Column(name = "DESCR")
    public String getDescr() {
        return descr;
    }
    @Column(name = "OPTYPE")
    public OperationType getOpType() {
        return opType;
    }
    @Column(name = "DATEM")
    public Date getDate() {
        return date;
    }
    @Column(name = "USERID")
    public Long getUserId() {
        return userId;
    }
    @Column(name = "KGSIN")
    public Double getKgsIn() {
        return kgsIn;
    }
    @Column(name = "PRICEIN")
    public Double getPriceIn() {
        return priceIn;
    }
    @Column(name = "CBDIN")
    public Integer getCbdIn() {
        return cbdIn;
    }
    @Column(name = "CBDAIN")
    public Integer getCbdaIn() {
        return cbdaIn;
    }
    @Column(name = "THCIN")
    public Integer getThcIn() {
        return thcIn;
    }
    @Column(name = "THCAIN")
    public Integer getThcaIn() {
        return thcaIn;
    }
    @Column(name = "KGSOUT")
    public Double getKgsOut() {
        return kgsOut;
    }
    @Column(name = "PRICEOUT")
    public Double getPriceOut() {
        return priceOut;
    }
    @Column(name = "CBDOUT")
    public Integer getCbdOut() {
        return cbdOut;
    }
    @Column(name = "CBDAOUT")
    public Integer getCbdaOut() {
        return cbdaOut;
    }
    @Column(name = "THCOUT")
    public Integer getThcOut() {
        return thcOut;
    }
    @Column(name = "THCAOUT")
    public Integer getThcaOut() {
        return thcaOut;
    }
    @Column(name = "ACCID")
    public Long getAccId() {
        return accId;
    }
    @Column(name = "PAYDAY")
    public Date getPayday() {
        return payday;
    }

    //Unbinded object field
    public double getTotalEUR() {
        return totalEUR;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }
    public void setDescr(String descr) {
        this.descr = descr;
    }
    public void setOpType(OperationType opType) {
        this.opType = opType;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setKgsIn(Double kgsIn) {
        this.kgsIn = kgsIn;
    }
    public void setPriceIn(Double priceIn) {
        this.priceIn = priceIn;
    }
    public void setCbdIn(Integer cbdIn) {
        this.cbdIn = cbdIn;
    }
    public void setCbdaIn(Integer cbdaIn) {
        this.cbdaIn = cbdaIn;
    }
    public void setThcIn(Integer thcIn) {
        this.thcIn = thcIn;
    }
    public void setThcaIn(Integer thcaIn) {
        this.thcaIn = thcaIn;
    }
    public void setKgsOut(Double kgsOut) {
        this.kgsOut = kgsOut;
    }
    public void setPriceOut(Double priceOut) {
        this.priceOut = priceOut;
    }
    public void setCbdOut(Integer cbdOut) {
        this.cbdOut = cbdOut;
    }
    public void setCbdaOut(Integer cbdaOut) {
        this.cbdaOut = cbdaOut;
    }
    public void setThcOut(Integer thcOut) {
        this.thcOut = thcOut;
    }
    public void setThcaOut(Integer thcaOut) {
        this.thcaOut = thcaOut;
    }
    public void setAccId(Long accId) {
        this.accId = accId;
    }
    public void setPayday(Date payday) {
        this.payday = payday;
    }
    public void setTotalEUR(double totalEUR) {
        this.totalEUR = totalEUR;
    }
}
