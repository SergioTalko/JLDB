package com.Services;

import com.DAO.StockSubOpDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockSubOpServiceImpl implements StockSubOpService{
    @Autowired
    StockSubOpDAO stockSubOpDAO;

    @Override
    public void create(Object o) {
        stockSubOpDAO.create(o);
    }

    @Override
    public void update(Object o) {
        stockSubOpDAO.update(o);
    }

    @Override
    public Object getById(Long id) {
        return stockSubOpDAO.getById(id);
    }

    @Override
    public void delete(Object o) {
        stockSubOpDAO.delete(o);
    }

    @Override
    public List<Object> getAll() {
        return stockSubOpDAO.getAll();
    }
}
