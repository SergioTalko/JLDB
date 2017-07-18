package com.Services;


import com.Entity.Agent;
import com.Entity.AgentType;

public interface AgentService extends AbstractService {
    Agent getAgent(String name);
    Agent getAllByType(AgentType agentType);
}
