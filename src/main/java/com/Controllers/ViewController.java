package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

    @RequestMapping("/logo")
    public ModelAndView logo(){
        ModelAndView modelAndView = new ModelAndView("/logo");
        String src = "/WEB-INF/images/logo_300-150.png";
        modelAndView.addObject("logo", src);
        return modelAndView;
    }

}
