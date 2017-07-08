package com.DAO;

import com.Entity.Product;
import com.Entity.GoodsType;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

    @PersistenceContext
    EntityManager entityManager;

    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public Product addProduct(Product product) {
        entityManager.persist(product);
        return product;
    }

    @Override
    public Product getProduct(Long id) {
        Session session = getSession();
        Query query = session.createQuery("from Product where id = :id");
        query.setParameter("id", id);
        //TODO: Check if works
        List<Product> list = query.list();

        if (list.size() == 0)
            return null;
        return list.get(0);
    }

    @Override
    public Product getProduct(String batch) {
        Session session = getSession();
        Query query = session.createQuery("from Product where batch = :batch");
        query.setParameter("batch", batch);
        //TODO: Check if works
        List<Product> list = query.list();

        if (list.size() == 0)
            return null;
        return list.get(0);
    }

    public Product updateProduct(Product product){
        Session session = getSession();
        session.update(product);
        return product;
    }

    @Override
    public List<Product> getByType(GoodsType type) {
        Session session = getSession();
        Query query = session.createQuery("from Product where goodsType = :goodsType");
        query.setParameter("goodsType", type);
        //TODO: Check if works
        List<Product> list = query.list();

        if (list.size() == 0)
            return null;
        return list;
    }

    @Override
    public List<Product> getNotNull() {
        Session session = getSession();
        List<Product> list = session.createQuery("from Product").list();
        /*for (Product product: list) {
            if (product.getKg()<=0)list.remove(product);
        }*/
        //TODO: Check if works
        return list;
    }

    @Override
    public Product deleteProduct(Product product){
        entityManager.remove(product);

        return product;
    }
}
