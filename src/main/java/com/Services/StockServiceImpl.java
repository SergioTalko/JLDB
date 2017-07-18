package com.Services;


import com.DAO.ProductDAO;
import com.Entity.Product;
import com.Entity.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
    ProductDAO productDAO;

    @Override
    public void create(Object o) {
        productDAO.create(o);
    }

    @Override
    public void update(Object o) {
        productDAO.update(o);
    }

    @Override
    public Object getById(Long id) {
        return productDAO.getById(id);
    }

    @Override
    public void delete(Object o) {
        productDAO.delete(o);
    }

    @Override
    public List<Product> getByType(ProductType type) {
        return productDAO.getByType(type);
    }

    @Override
    public List<Object> getAll() {
        return productDAO.getAll();
    }

    @Override
    public List<Product> getNotNull() {
        return productDAO.getNotNull();
    }
/*
    @Override
    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productDAO.updateProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productDAO.deleteProduct(product);
    }

    @Override
    public Product getProduct(Long id) {
        return productDAO.getProduct(id);
    }

    @Override
    public Product getProduct(String batch) {
        return productDAO.getProduct(batch);
    }

    @Override
    public List<Product> getAll() {
        return productDAO.getNotNull();
    }
    */
}
