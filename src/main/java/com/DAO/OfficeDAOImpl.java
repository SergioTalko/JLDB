package com.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class OfficeDAOImpl implements OfficeDAO{
/*
    @PersistenceContext
    EntityManager entityManager;

    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public Office addOffice(Office office) {
        entityManager.persist(office);
        return office;
    }

    @Override
    public Office deleteOffice(Office office) {
        entityManager.remove(office);
        return office;
    }

    public Office updateOffice(Office office){
        Session session = getSession();
        session.update(office);
        return office;
    }

    @Override
    public Office getOffice(Long officeID) {
        Session session = getSession();
        Query query = session.createQuery("from Office where officeID = :id");
        query.setParameter("id", officeID);
        //TODO: Check if works
        List<Office> list = query.list();

        if (list.size() == 0)
            return null;
        return list.get(0);
    }

    @Override
    public Office getOffice(String name) {
        Session session = getSession();
        Query query = session.createQuery("from Office where name = :name");
        query.setParameter("name", name);
        //TODO: Check if works
        List<Office> list = query.list();

        if (list.size() == 0)
            return null;
        return list.get(0);
    }

    @Override
    public List<Office> getAllOffices() {
        Session session = getSession();
        return session.createQuery("from Office").list();
    }*/
}
