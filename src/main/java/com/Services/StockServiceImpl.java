package com.Services;


import com.DAO.ProductDAO;
import com.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
    ProductDAO productDAO;

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
}
