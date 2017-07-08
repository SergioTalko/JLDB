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
    public Operation addOperation(Operation operation) {
        entityManager.persist(operation);
        return operation;
    }

    @Override
    public Operation getOperation(long id) {
        Session session = getSession();
        Query query = session.createQuery("from Operation where id = :id");
        query.setParameter("id", id);
        //TODO: Check if works
        List<Operation> list = query.list();

        if (list.size() == 0)
            return null;
        return list.get(0);
    }

    @Override
    public List<Operation> getAll() {
        return getSession().createQuery("from Operation").list();
    }

    @Override
    public Operation updateOperation(Operation operation) {
        Session session = getSession();
        session.update(operation);
        return operation;
    }

    @Override
    public Operation deleteOperation(Operation operation) {
        entityManager.remove(operation);
        return operation;
    }
}
