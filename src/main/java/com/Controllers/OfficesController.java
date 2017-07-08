package com.Controllers;

import com.Services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
