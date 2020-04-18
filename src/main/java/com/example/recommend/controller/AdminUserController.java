package com.example.recommend.controller;

import com.example.recommend.service.LoginService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/adminuser")
public class AdminUserController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/adminlogin")
    public @ResponseBody  Map<String,Object> login(@RequestBody String data){
        JSONObject json = JSONObject.fromObject(data);
        System.out.println(json);
        String usermame = json.getString("username");
        String password = json.getString("password");
        Map<String, Object> map = new HashMap<>();
        map.put("sucess",loginService.checkAccount(usermame, password));
        return map;
    }

}
