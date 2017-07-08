package com.Services;


import com.Entity.Product;

import java.util.List;

public interface StockService {

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);

    Product getProduct(Long id);

    Product getProduct(String batch);

    List<Product> getAll();
}
