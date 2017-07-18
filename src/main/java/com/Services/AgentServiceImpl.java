package com.Services;

import com.DAO.AgentDAO;
import com.Entity.Agent;
import com.Entity.AgentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService{
    @Autowired
    AgentDAO agentDAO;

    @Override
    public void create(Object o) {
        agentDAO.create(o);
    }

    @Override
    public void update(Object o) {
        agentDAO.update(o);
    }

    @Override
    public Object getById(Long id) {
        return agentDAO.getById(id);
    }

    @Override
    public void delete(Object o) {
        agentDAO.delete(o);
    }

    @Override
    public List<Object> getAll() {
        return agentDAO.getAll();
    }

    @Override
    public Agent getAgent(String name) {
        return agentDAO.getAgent(name);
    }

    @Override
    public List <Agent> getAllByType(AgentType agentType) {
        return agentDAO.getAllByType(agentType);
    }
}
