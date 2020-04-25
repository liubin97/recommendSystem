package com.example.recommend.controller;

import com.example.recommend.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LogInController {
    @Autowired
    UsersService usersService;

    @PostMapping("/register")
    @ResponseBody
    public String register(Model model, @RequestParam("username") String username,
                      @RequestParam("password") String password,
                      @RequestParam("prefer") String prefer){
        Map<String,Object> map;
        map = usersService.register(username,password,prefer);
        if(map.get("msg")!=null){
            return map.get("msg").toString();
        }else {
            return map.get("success").toString();
        }


    }
    @PostMapping("/login")
    @ResponseBody
    public String login(Model model, @RequestParam("username") String username,
                      @RequestParam("password") String password){
        Map<String,Object> map;
        map = usersService.logIn(username,password);
        if(map.get("msg")!=null){
            return map.get("msg").toString();
        }else {
            return map.get("success").toString();
        }



    }

}
