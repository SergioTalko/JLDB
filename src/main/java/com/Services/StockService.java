package com.Services;


import com.Entity.Product;
import com.Entity.ProductType;

import java.util.List;

public interface StockService extends AbstractService{

    List<Product> getByType(ProductType type);
    List<Product> getNotNull();

    //TODO somthing here?
    /*
    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(Product product);

    Product getProduct(Long id);

    Product getProduct(String batch);

    List<Product> getAll();
    */
}
