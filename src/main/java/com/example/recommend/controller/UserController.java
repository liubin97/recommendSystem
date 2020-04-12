package com.example.recommend.controller;

import com.example.recommend.entity.UserInfo;
import com.example.recommend.service.UserService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class  UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/listusers")
    public Map<String,Object> listUser(){
        Map<String,Object> modelMap = new HashMap<>();
        List<UserInfo> list = userService.getUsers();
//        JSONArray jsonArray = JSONArray.fromObject(list);
//        System.out.println(jsonArray);
        modelMap.put("userList",list);
        return modelMap;
    }

    @GetMapping("/getUserInfoByOpenid")
    public Map<String,Object> listUser(String openid){
        Map<String,Object> modelMap = new HashMap<>();
        UserInfo u = userService.getUserInfoByOpenid(openid);
        JSONObject jsonObject = JSONObject.fromObject(u);
        System.out.println(jsonObject);
        modelMap.put("userInfo",u);
        return modelMap;
    }

    @PostMapping("/register")
    public String login(@RequestBody String data){
        JSONObject json = JSONObject.fromObject(data);
        System.out.println(json);
        userService.insertUserInfo(json);
        return json.getString("userType");
    }


    @PostMapping("/updateUserInfo")
    public String updateUserInfo(@RequestBody String data){
        JSONObject json = JSONObject.fromObject(data);
        System.out.println(json);
        userService.updateUserInfo(json);
        return json.getString("userType");
    }
}
