package com.Services;

import com.Entity.Operation;

import java.util.List;

public interface OperationsService {
    void addOperation(Operation operation);
    void deleteOperation(Operation operation);
    void updateOperation(Operation operation);
    Operation getOperation(Long operationID);
    List<Operation> getAll();
}
