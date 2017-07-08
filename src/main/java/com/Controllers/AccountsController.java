package com.Controllers;

import com.Services.AccountService;
import com.Services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountsController {

    @Autowired
    AccountService accountService;

    @Autowired
    OfficeService officeService;

    @RequestMapping("/accounts")
    ModelAndView accounts(){
        ModelAndView modelAndView = new ModelAndView("/accounts.vm");
        modelAndView.addObject("accountslist", accountService.getAccounts());

        return modelAndView;
    }

    @RequestMapping("/officeoperations")
    ModelAndView accountStatus(Long officeID){
        ModelAndView modelAndView = new ModelAndView("/officeoperations.vm");



        if (officeID==null)
        modelAndView.addObject("status",accountService.getAccounts());
        else
            modelAndView.addObject("status",accountService.getAccountsByOffice(officeID));

        return modelAndView;
    }
}
