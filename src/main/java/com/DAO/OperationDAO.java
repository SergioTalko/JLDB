package com.DAO;

import com.Entity.Operation;

import java.util.List;

public interface OperationDAO {
    Operation addOperation(Operation operation);
    Operation getOperation(long id);
    List<Operation> getAll();
    Operation updateOperation(Operation operation);
    Operation deleteOperation(Operation operation);

}
