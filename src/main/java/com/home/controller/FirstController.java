package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/views")
public class FirstController
{
    @RequestMapping("/showName")
    public ModelAndView showName(String username){
        System.out.println (username);
        ModelAndView modelAndView = new ModelAndView ();
        modelAndView.addObject ("username", username);
        modelAndView.setViewName ("showName");
        return modelAndView;
    }

}
