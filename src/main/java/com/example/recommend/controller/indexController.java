package com.example.recommend.controller;

import com.example.recommend.dao.UsersDao;
import com.example.recommend.entity.ResponseBean;
import com.example.recommend.entity.Users;
import com.example.recommend.service.MoviehomeService;
import com.example.recommend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class indexController {
    @Autowired
    MoviehomeService moviehomeService;
    @Autowired
    UsersDao usersDao;
    @RequestMapping(path = {"/", "/index"}, method = {RequestMethod.GET, RequestMethod.POST})
    private String index(Model model){
       Users user= new Users();
       user = usersDao.selectByUserName("1");
        System.out.println(user.getPrefer());
        System.out.println("====================");
        model.addAttribute("user",user);
        model.addAttribute("value","comeout");
        ResponseBean response = new ResponseBean();
        response.setSuccess(true);
        return "index";
    }
    @RequestMapping("/test")
    private String hello(Model model){
        model.addAttribute("a","aaa");
        model.addAttribute("value","comeout");
        model.addAttribute("value1", "vvvvv1");
        return "test";
    }


    @RequestMapping(path = {"/ssvm"}, method = {RequestMethod.GET})
    public String ssvm(Model model) {
        model.addAttribute("value1", "vvvvv1");
        return "home";
    }
}


