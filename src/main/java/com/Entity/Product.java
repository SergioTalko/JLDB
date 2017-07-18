package com.Entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Date;

@Entity
@Transactional
@Table(name = "STOCK")
public class Product {
    private Long id;
    private String batch;
    private Long supplierId;
    private Long officeId;
    private ProductType pType;
    private String descr;
    private Double kg;
    private Double price;
    private Date date;
    private Integer cbd;
    private Integer cbda;
    private Integer thc;
    private Integer thca;
    private Long userId;
    //Unbinded object fiekds
    private Integer totalCBD;
    private Integer totalTHC;
    private Double totalEUR;

    //Constructors
    public Product(){

    }

    public Product(String batch, Long supplierId, Long officeId, ProductType pType, String descr, Double kg, Double price, Date date, Integer cbd, Integer cbda, Integer thc, Integer thca, Long userId) {
        this.batch = batch;
        this.supplierId = supplierId;
        this.officeId = officeId;
        this.pType = pType;
        this.descr = descr;
        this.kg = kg;
        this.price = price;
        this.date = date;
        this.cbd = cbd;
        this.cbda = cbda;
        this.thc = thc;
        this.thca = thca;
        this.userId = userId;
        this.totalCBD = cbd + cbda;
        this.totalTHC = thc + thca;
        this.totalEUR = kg * price;
    }

    // Getters
    @Id
    @SequenceGenerator(name = "STOCKID_SEQ", sequenceName = "STOCKID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STOCKID_SEQ")
    @Column(name = "ID")
    public Long getId() {
        return id;
    }
    @Column(name = "BATCH")
    public String getBatch() {
        return batch;
    }
    @Column(name = "SUPPLIERID")
    public Long getSupplierId(){
        return supplierId;
    }
    @Column(name = "OFFICEID")
    public Long getOfficeId(){
        return officeId;
    }
    @Column(name = "PTYPE")
    public ProductType getpType(){
        return pType;
    }
    @Column(name = "DESCR")
    public String getDescr() {
        return descr;
    }
    @Column(name = "KGS")
    public double getKg() {
        return kg;
    }
    @Column(name = "PRICE")
    public double getPrice() {
        return price;
    }
    @Column(name = "DATEZ")
    public Date getDate() {
        return date;
    }
    @Column(name = "CBD")
    public int getCbd() {
        return cbd;
    }
    @Column(name = "CBDA")
    public int getCbda() {
        return cbda;
    }
    @Column(name = "THC")
    public int getThc() {
        return thc;
    }
    @Column(name = "THCA")
    public int getThca() {
        return thca;
    }
    @Column(name = "USERID")
    public Long getUserId(){
        return userId;
    }

    //Unbinded object fields
    public Integer getTotalCBD() {
        return totalCBD;
    }
    public Integer getTotalTHC() {
        return totalTHC;
    }
    public Double getTotalEUR() {
        return totalEUR;
    }

    //Setters //TODO CHECK Think they are unnecessary as we manipulate data in DB, not raw objects in memory.
    public void setId(Long id) {
        this.id = id;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }
    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }
    public void setpType(ProductType pType) {
        this.pType = pType;
    }
    public void setDescr(String descr) {
        this.descr = descr;
    }
    public void setKg(Double kg) {
        this.kg = kg;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setCbd(Integer cbd) {
        this.cbd = cbd;
    }
    public void setCbda(Integer cbda) {
        this.cbda = cbda;
    }
    public void setThc(Integer thc) {
        this.thc = thc;
    }
    public void setThca(Integer thca) {
        this.thca = thca;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public void setTotalCBD(Integer totalCBD) {
        this.totalCBD = totalCBD;
    }
    public void setTotalTHC(Integer totalTHC) {
        this.totalTHC = totalTHC;
    }
    public void setTotalEUR(Double totalEUR) {
        this.totalEUR = totalEUR;
    }
}
