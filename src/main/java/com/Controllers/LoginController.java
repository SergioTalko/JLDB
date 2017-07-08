package com.Controllers;

import com.Entity.User;
import com.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login.vm");
        return modelAndView;
    }

    @RequestMapping("/login_db")
    public ResponseEntity<String> ajaxLoginValidator (@RequestParam String login, @RequestParam String password){
        User curUser = userService.loginUser(login, password);
        ResponseEntity<String> responce;
        if (curUser!=null)
            responce = new ResponseEntity<String>(HttpStatus.OK);
        else {
            responce = new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
            login().addObject("error", "Your username and password is invalid.");
        }

        return responce;
    }


}
