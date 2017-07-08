package com.Services;

import com.DAO.OfficeDAO;
import com.Entity.Office;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeServiceImpl implements OfficeService {

    @Autowired
    private OfficeDAO officeDAO;

    @Override
    public void addOffice(Office office) {
        officeDAO.addOffice(office);
    }

    @Override
    public void deleteOffice(Office office) {
        officeDAO.deleteOffice(office);
    }

    @Override
    public void updateOffice(Office office) {
        officeDAO.updateOffice(office);
    }

    @Override
    public Office getOffice(Long officeID){
        return officeDAO.getOffice(officeID);
    }

    @Override
    public Office getOffice(String name){
        return officeDAO.getOffice(name);
    }

    @Override
    public List<Office> getAll() {
        return officeDAO.getAllOffices();
    }
}
