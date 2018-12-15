package com.home.controller;

import com.home.entity.User;
import com.home.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView login(String username, String password, HttpServletRequest request){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        List<User> userList = userService.selectUser(user);
        if(userList.size()>0){
            request.setAttribute("userList", userList);return new ModelAndView("index");
        }else
            return new ModelAndView("login");
    }

    @RequestMapping("/regist")
    public ModelAndView regist(String username,String password,HttpServletRequest request){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        boolean flag = true;
        flag = userService.existUser(username);
        if(!flag)
            userService.insertUser(user);
        return new ModelAndView("login");
    }

}
