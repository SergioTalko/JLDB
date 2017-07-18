package com.Controllers;

import com.Entity.AgentType;
import com.Entity.User;
import com.Entity.UserType;
import com.Services.AgentService;
import com.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AgentService officeService;

    @RequestMapping("/users")
    public ModelAndView users(){
        ModelAndView modelAndView = new ModelAndView("users.vm");
        modelAndView.addObject("userslist",userService.getAll());
        modelAndView.addObject("officeslist",officeService.getAllByType(AgentType.OFFICE));
        modelAndView.addObject("positionslist",userService.getPositions());
        return modelAndView;
    }
    @RequestMapping("/newuser")
    public ModelAndView newuser(){
        ModelAndView modelAndView = new ModelAndView("newuser.vm");
        modelAndView.addObject("officeslist",officeService.getAllByType(AgentType.OFFICE));
        modelAndView.addObject("positionslist",userService.getPositions());
        return modelAndView;
    }
    @RequestMapping("/edituser_db")
        public ModelAndView edituser_db(@RequestParam Long id){
        ModelAndView modelAndView = new ModelAndView("edituser.vm");
        modelAndView.addObject("user", userService.getById(id));
        return modelAndView;
    }

    @RequestMapping("/edituser")
    public ModelAndView edituser(/*@RequestParam Long id*/){
           Long id = Long.parseLong("1");
        ModelAndView modelAndView = new ModelAndView("edituser.vm");
        modelAndView.addObject("user", userService.getById(id));
        modelAndView.addObject("officeslist",officeService.getAll());
        modelAndView.addObject("positionslist",userService.getPositions());
        return modelAndView;
    }




    @RequestMapping("/adduser_db")
    public ResponseEntity<String> ajaxLoginValidator (@RequestParam String name, @RequestParam String tel,
                                                      @RequestParam String email, @RequestParam String password,
                                                      @RequestParam UserType usertype, @RequestParam Long office){

        User curUser = new User(usertype, email, password, name, tel, office);
        ResponseEntity<String> responce = new ResponseEntity<String>(HttpStatus.OK);

        try { userService.create(curUser);}
        catch (Exception e){
            System.out.println("SOMETHING GOES WRONG!!!!");
            responce = new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }
        return responce;
    }
    @RequestMapping("/removeuser_db")
    public ResponseEntity<String> ajaxLoginValidator (@RequestParam String id){
        ResponseEntity<String> responce = new ResponseEntity<String>(HttpStatus.OK);

        try { userService.delete(userService.getById(Long.parseLong(id)));}
        catch (Exception e){
            System.out.println("SOMETHING GOES WRONG!!!!");
            responce = new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }
        return responce;
    }
}
