package com.Services;

import com.Entity.Office;

import java.util.List;

public interface OfficeService {
    void addOffice(Office office);
    void deleteOffice(Office office);
    void updateOffice(Office office);
    Office getOffice(Long officeID);
    Office getOffice(String name);
    List<Office> getAll();
}
