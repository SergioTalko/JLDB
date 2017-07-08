package com.DAO;

import com.Entity.Office;

import java.util.List;

public interface OfficeDAO {
    Office addOffice(Office office);
    Office deleteOffice(Office office);
    Office updateOffice(Office office);
    Office getOffice(Long officeID);
    Office getOffice(String name);
    List<Office> getAllOffices();
}
