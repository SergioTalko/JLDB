package com.DAO;

import com.Entity.Agent;
import com.Entity.AgentType;
import org.hibernate.Query;
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
    public Object getById(Long id) {
        return entityManager.find(Agent.class ,id);

    }

    @Override
    public void delete(Object o) {
        entityManager.remove(o);
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
    public List<Agent> getAllByType(AgentType agentType) {
        Session session = getSession();
        Query query = session.createQuery("from Agent where type = :agentType");
        query.setParameter("agentType", AgentType.OFFICE);
        //TODO: Check if works
        List<Agent> list = query.list();

        if (list.size() == 0)
            return null;
        return list;
    }
}