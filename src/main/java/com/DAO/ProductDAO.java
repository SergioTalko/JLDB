package com.DAO;

import com.Entity.ProductType;
import com.Entity.Product;

import java.util.List;

public interface ProductDAO extends AbstractDAO{
    List<Product> getByType(ProductType type);
    List<Product> getNotNull();
}
