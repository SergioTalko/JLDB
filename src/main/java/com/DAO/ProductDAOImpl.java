package com.DAO;

import com.Entity.Product;
import com.Entity.ProductType;
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
    public Object create(Object o) {
        entityManager.persist(o);
        return o;
    }

    @Override
    public Object update(Object o) {
        Session session = getSession();
        session.update(o);
        return o;
    }

    @Override
    public List<Product> getByType(ProductType type) {
        Session session = getSession();
        Query query = session.createQuery("from Product where pType = :goodsType");
        query.setParameter("goodsType", type);
        //TODO: Check if works
        List<Product> list = query.list();

        if (list.size() == 0)
            return null;
        return list;
    }

    @Override
    public Object getById(Long id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public void delete(Object o) {
        entityManager.remove(o);
    }

    @Override
    public List<Product> getNotNull() {
        Session session = getSession();
        List<Product> list = session.createQuery("from Product").list();
        for (Product product: list) {
            if (product.getKg()<=0)list.remove(product);
        }
        //TODO: Check if works
        return list;
    }

    @Override
    public List<Object> getAll() {
        Session session = getSession();
        return session.createQuery("from Product").list();
    }

    /*
    @Override
    public List<Product> getByType(ProductType type) {
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
        }
        //TODO: Check if works
        return list;
    }

    @Override
    public Product deleteProduct(Product product){
        entityManager.remove(product);

        return product;
    }*/
}
