package com.DAO;

import com.Entity.Agent;
import com.Entity.AgentType;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class AgentDAOImpl implements AgentDAO{
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
    public Object read(Object o) {
        Session session = getSession();

        //session.get(o);
        return null;
    }

    @Override
    public Object getById(Long id) {
        return null;
        //entityManager.find(Agent,id);
    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public List<Object> getAll() {
        return null;
    }

    @Override
    public Agent getAgent(String name) {
        return null;
    }

    @Override
    public Agent getAllByType(AgentType agentType) {
        return null;
    }
}
