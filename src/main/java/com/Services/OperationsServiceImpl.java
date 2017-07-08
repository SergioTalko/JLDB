package com.Services;

import com.DAO.OperationDAO;
import com.Entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationsServiceImpl implements OperationsService {

    @Autowired
    OperationDAO operationDAO;

    @Override
    public void addOperation(Operation operation) {
        operationDAO.addOperation(operation);
    }

    @Override
    public void deleteOperation(Operation operation) {
        operationDAO.deleteOperation(operation);
    }

    @Override
    public void updateOperation(Operation operation) {
        operationDAO.updateOperation(operation);
    }

    @Override
    public Operation getOperation(Long operationID) {
        return operationDAO.getOperation(operationID);
    }

    @Override
    public List<Operation> getAll() {
        return operationDAO.getAll();
    }
}
