package com.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    /*
    @Autowired
    private UserService userService;

    @Autowired
    private OfficeService officeService;

    @RequestMapping("/users")
    public ModelAndView users(){
        ModelAndView modelAndView = new ModelAndView("users.vm");
        modelAndView.addObject("userslist",userService.getAll());
        modelAndView.addObject("officeslist",officeService.getAll());
        modelAndView.addObject("positionslist",userService.getPositions());
        return modelAndView;
    }
    @RequestMapping("/newuser")
    public ModelAndView newuser(){
        ModelAndView modelAndView = new ModelAndView("newuser.vm");
        modelAndView.addObject("officeslist",officeService.getAll());
        modelAndView.addObject("positionslist",userService.getPositions());
        return modelAndView;
    }
    @RequestMapping("/edituser_db")
        public ModelAndView edituser_db(@RequestParam Long id){
        ModelAndView modelAndView = new ModelAndView("edituser.vm");
        modelAndView.addObject("user", userService.getUser(id));
        return modelAndView;
        }
    @RequestMapping("/edituser")
    public ModelAndView edituser(/*@RequestParam Long id*/
 /*   }){
           Long id = Long.parseLong("1");
        ModelAndView modelAndView = new ModelAndView("edituser.vm");
        modelAndView.addObject("user", userService.getUser(id));
        modelAndView.addObject("officeslist",officeService.getAll());
        modelAndView.addObject("positionslist",userService.getPositions());
        return modelAndView;
    }




    @RequestMapping("/adduser_db")
    public ResponseEntity<String> ajaxLoginValidator (@RequestParam String name, @RequestParam String surname,
           @RequestParam String tel, @RequestParam String email, @RequestParam String password,
           @RequestParam UserType usertype, @RequestParam Long office){

        User curUser = new User(name, surname, tel, email, password, usertype, office);
        ResponseEntity<String> responce = new ResponseEntity<String>(HttpStatus.OK);

        try { userService.addUser(curUser);}
        catch (Exception e){
            System.out.println("SOMETHING GOES WRONG!!!!");
            responce = new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }
        return responce;
    }
    @RequestMapping("/removeuser_db")
    public ResponseEntity<String> ajaxLoginValidator (@RequestParam String id){
        ResponseEntity<String> responce = new ResponseEntity<String>(HttpStatus.OK);

        try { userService.deleteUser(Long.parseLong(id));}
        catch (Exception e){
            System.out.println("SOMETHING GOES WRONG!!!!");
            responce = new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);
        }
        return responce;
    }*/
}
