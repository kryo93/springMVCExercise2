package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController
{
    @RequestMapping(value = "/add")

public ModelAndView add(@RequestParam("t1") String name, @RequestParam("t2") String password)
{
    User user1 = new User();
     user1.setName(name);
     user1.setPassword(password);


    ModelAndView mv = new ModelAndView();
//    int c = a+b;
    mv.setViewName("display");
    mv.addObject("result", user1);

    return mv;
}
}
