package com.DAO;

import com.Entity.StockSubOp;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class StockSubOpDAOImpl implements StockSubOpDAO {

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
        return entityManager.find(StockSubOp.class, id);
    }

    @Override
    public void delete(Object o) {
        entityManager.remove(o);
    }

    @Override
    public List<Object> getAll() {
        Session session = getSession();
        return session.createQuery("from StockSubOp").list();
    }
}
