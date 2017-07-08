package com.Controllers;

import com.Services.OperationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OperationsController {

    @Autowired
    OperationsService operationService;

    @RequestMapping
    ModelAndView operations(){
        ModelAndView modelAndView = new ModelAndView("operations.vm");

        return modelAndView;
    }
}
