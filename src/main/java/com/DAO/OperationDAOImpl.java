package com.DAO;

import com.Entity.Operation;
import com.Entity.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class OperationDAOImpl implements OperationDAO{
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
    public Object getById(Long id) {
        return entityManager.find(Operation.class, id);
    }

    @Override
    public void delete(Object o) {
        entityManager.remove(o);
    }

    @Override
    public List<Object> getAll() {
        return getSession().createQuery("from Operation").list();
    }
}
