package com.Controllers;

import com.Entity.Office;
import com.Services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OfficesController {

    @Autowired
    OfficeService officeService;

    @RequestMapping("/offices")
    ModelAndView offices(){
        ModelAndView modelAndView = new ModelAndView("offices.vm");
        modelAndView.addObject("officeslist",officeService.getAll());

        return modelAndView;
    }
    @RequestMapping("/newoffice")
    ModelAndView newoffice(){
        ModelAndView modelAndView = new ModelAndView("newoffice.vm");
        return modelAndView;
    }
    @RequestMapping("/addoffice_db")
    public ResponseEntity<String> ajaxLoginValidator (@RequestParam String name, @RequestParam String address,
                                                      @RequestParam String tel){

        Office curOffice = new Office(name, address, tel);
        ResponseEntity<String> responce = new ResponseEntity<String>(HttpStatus.OK);

        try { officeService.addOffice(curOffice);}
        catch (Exception e){
            System.out.println("SOMETHING GOES WRONG!!!!");
            responce = new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }
        return responce;
    }
}
