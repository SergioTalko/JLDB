package com.Controllers;

import com.Entity.Agent;
import com.Entity.AgentType;
import com.Services.AgentService;
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
    AgentService officeService;

    @RequestMapping("/offices")
    ModelAndView offices(){
        ModelAndView modelAndView = new ModelAndView("offices.vm");
        modelAndView.addObject("officeslist",officeService.getAllByType(AgentType.OFFICE));

        return modelAndView;
    }
    @RequestMapping("/newoffice")
    ModelAndView newoffice(){
        ModelAndView modelAndView = new ModelAndView("newoffice.vm");
        return modelAndView;
    }
    @RequestMapping("/addoffice_db")
    public ResponseEntity<String> ajaxLoginValidator (@RequestParam String name, @RequestParam String address,
                                                      @RequestParam String tel, @RequestParam String contact,
                                                      @RequestParam AgentType type){

        Agent curOffice = new Agent(name, address, tel, contact, type);
        ResponseEntity<String> responce = new ResponseEntity<String>(HttpStatus.OK);

        try { officeService.create(curOffice);}
        catch (Exception e){
            System.out.println("SOMETHING GOES WRONG!!!!");
            responce = new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }
        return responce;
    }
}
