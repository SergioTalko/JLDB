package com.Services;

import com.DAO.OperationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationsServiceImpl implements OperationsService {

    @Autowired
    OperationDAO operationDAO;

    @Override
    public void create(Object o) {
        operationDAO.create(o);
    }

    @Override
    public void update(Object o) {
        operationDAO.update(o);
    }

    @Override
    public Object getById(Long id) {
        return operationDAO.getById(id);
    }

    @Override
    public void delete(Object o) {
        operationDAO.delete(o);
    }

    @Override
    public List<Object> getAll() {
        return operationDAO.getAll();
    }

    /*
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
    */
}
