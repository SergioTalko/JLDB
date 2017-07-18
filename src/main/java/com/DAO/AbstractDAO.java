package com.DAO;

import java.util.List;

public interface AbstractDAO {
    Object create(Object o);
    Object update(Object o);
    //Object read(Object o);
    Object getById(Long id);
    void delete(Object o);
    List<Object> getAll();
}
