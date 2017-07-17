package com.DAO;

import com.Entity.ProductType;
import com.Entity.Product;

import java.util.List;

public interface ProductDAO {
    Product addProduct(Product product);
    Product getProduct(Long id);
    Product getProduct(String batch);
    Product updateProduct(Product product);
    List<Product> getByType(ProductType type);
    List<Product> getNotNull();
    Product deleteProduct(Product product);
}
