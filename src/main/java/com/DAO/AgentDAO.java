package com.DAO;

import com.Entity.Agent;
import com.Entity.AgentType;

import java.util.List;

public interface AgentDAO extends AbstractDAO{
    Agent getAgent(String name);
    List<Agent> getAllByType(AgentType agentType);
}
