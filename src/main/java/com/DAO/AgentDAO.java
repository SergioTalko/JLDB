package com.DAO;

import com.Entity.Agent;
import com.Entity.AgentType;

public interface AgentDAO extends AbstractDAO{
    Agent getAgent(String name);
    Agent getAllByType(AgentType agentType);
}
