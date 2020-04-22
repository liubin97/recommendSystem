package com.example.recommend.controller;

import com.example.recommend.entity.User;
import com.example.recommend.service.AdminUserService;
import com.example.recommend.service.LoginService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/adminUser")
public class AdminUserController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("/adminLogin")
    public @ResponseBody  Map<String,Object> login(@RequestBody String data){
        JSONObject json = JSONObject.fromObject(data);
        String usermame = json.getString("username");
        String password = json.getString("password");
        Map<String, Object> map = new HashMap<>();
        map.put("sucess",loginService.checkAccount(usermame, password));
        return map;

    }

    @PostMapping("/deleteUser")
    public @ResponseBody Map<String, Object> deleteUser(@RequestBody String data){
        JSONObject json = JSONObject.fromObject(data);
        String userid = json.getString("userid");
        Map<String, Object> map = new HashMap<>();
        try{
            adminUserService.deleteUserById(userid);
            map.put("sucess",true);
        }catch (Exception e){
            Object sucess = map.put("sucess", false);
        }
        return map;
    }

}
