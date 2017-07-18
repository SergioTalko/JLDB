package com.Services;

import java.util.List;

public interface AbstractService {
    void create(Object o);
    void update(Object o);
    Object getById(Long id);
    void delete(Object o);
    List<Object> getAll();

    //Object read(Object o);
}
