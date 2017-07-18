package com.Services;


import com.Entity.Agent;
import com.Entity.AgentType;

import java.util.List;

public interface AgentService extends AbstractService {
    Agent getAgent(String name);
    List<Agent> getAllByType(AgentType agentType);
}
