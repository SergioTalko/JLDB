package com.Controllers;

import com.Entity.AccType;
import com.Entity.Account;
import com.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountsController {

    @Autowired
    AccountService accountService;

    /*@Autowired
    OfficeService officeService;*/

    @RequestMapping("/accounts")
    ModelAndView accounts(){
        ModelAndView modelAndView = new ModelAndView("/accounts.vm");
        modelAndView.addObject("accountslist", accountService.getAll());

        return modelAndView;
    }

    @RequestMapping("/officeoperations")
    ModelAndView accountStatus(Long officeID){
        ModelAndView modelAndView = new ModelAndView("/officeoperations.vm");



        if (officeID==null)
        modelAndView.addObject("status",accountService.getAll());
        else
            modelAndView.addObject("status",accountService.getAccountsByOffice(officeID));

        return modelAndView;
    }
    @RequestMapping("/newaccount")
    ModelAndView newaccount(){
        ModelAndView modelAndView = new ModelAndView("newaccount.vm");
       /* modelAndView.addObject("officeslist",officeService.getAll());*/
        return modelAndView;
    }
    @RequestMapping("/addaccount_db")
    public ResponseEntity<String> ajaxLoginValidator (@RequestParam String acctype, @RequestParam String name,
                                                      @RequestParam String address,@RequestParam int accnr,
                                                      @RequestParam String swift,@RequestParam String iban,
                                                      @RequestParam String tel,@RequestParam Double ballance,
                                                      @RequestParam Long office){

        Account curAccount = new Account(AccType.valueOf(acctype), name, address, accnr, swift, iban, tel, ballance, office);
        ResponseEntity<String> responce = new ResponseEntity<String>(HttpStatus.OK);

        try { accountService.create(curAccount);}
        catch (Exception e){
            System.out.println("SOMETHING GOES WRONG!!!!");
            responce = new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }
        return responce;
    }
}
