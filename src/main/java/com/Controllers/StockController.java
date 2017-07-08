package com.Controllers;

import com.Services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StockController {

    @Autowired
    StockService stockService;

    @RequestMapping("/stock")
    ModelAndView stock(){
        ModelAndView modelAndView = new ModelAndView("stock.vm");
        modelAndView.addObject("productlist",stockService.getAll());
        return modelAndView;
    }
}
