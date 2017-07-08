package com.Controllers;

import com.Services.OfficeService;
import com.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private OfficeService officeService;

    @RequestMapping("/users")
    ModelAndView users(){
        ModelAndView modelAndView = new ModelAndView("users.vm");
        modelAndView.addObject("userslist",userService.getAll());
        modelAndView.addObject("officeslist",officeService.getAll());
        modelAndView.addObject("positionslist",userService.getPositions());
        return modelAndView;
    }

}
