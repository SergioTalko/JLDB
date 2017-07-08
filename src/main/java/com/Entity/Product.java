package com.Entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.Date;

@Entity
@Transactional
@Table(name = "PRODUCTS")
public class Product {
    private Long productId;
    private String batch;
    private GoodsType goodsType;
    private String desc;
    private double kg;
    private double px;
    private int cbd;
    private int thc;
    private Date date;

    //Constructors
    public Product(){

    }
    public Product(String batch, GoodsType goodsType, String desc, double kg, double px, int cbd, int thc, Date date) {
        this.batch = batch;
        this.goodsType = goodsType;
        this.desc = desc;
        this.kg = kg;
        this.px = px;
        this.cbd = cbd;
        this.thc = thc;
        this.date = date;
    }

    // Getters
    @Id
    @SequenceGenerator(name = "PRODUCTID_SEQ", sequenceName = "PRODUCTID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCTID_SEQ")
    public Long getProductId() {
        return productId;
    }
    @Column(name = "BATCH")
    public String getBatch() {
        return batch;
    }
    @Column(name = "DESCR")
    public String getDesc() {
        return desc;
    }
    @Column(name = "GOODSTYPE")
    public GoodsType getGoodsType(){
        return goodsType;
    }
    @Column(name = "KG")
    public double getKg() {
        return kg;
    }
    @Column(name = "PX")
    public double getPx() {
        return px;
    }
    @Column(name = "CBD")
    public int getCbd() {
        return cbd;
    }
    @Column(name = "THC")
    public int getThc() {
        return thc;
    }
    @Column(name = "DATE")
    public Date getDate() {
        return date;
    }

    //Setters //TODO CHECK Think they are unnecessary as we manipulate data in DB, not raw objects in memory.
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setGoodsType(GoodsType goodsType){
        this.goodsType = goodsType;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public void setCbd(int cbd) {
        this.cbd = cbd;
    }

    public void setThc(int thc) {
        this.thc = thc;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
