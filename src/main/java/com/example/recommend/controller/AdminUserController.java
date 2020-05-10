package com.example.recommend.controller;

import com.example.recommend.entity.ResponseBean;
import com.example.recommend.entity.User;
import com.example.recommend.entity.Users;
import com.example.recommend.service.AdminUserService;
import com.example.recommend.service.LoginService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/adminUser")
public class AdminUserController {
    @Autowired
    private LoginService loginService;

    @Autowired
    private AdminUserService adminUserService;

    @PostMapping("/adminLogin")
    public @ResponseBody
    ResponseBean login(@RequestBody String data, HttpSession session){
        JSONObject json = JSONObject.fromObject(data);
        String username = json.getString("username");
        String password = json.getString("password");
        boolean flag = loginService.checkAccount(username,password);
        ResponseBean responseBean = new ResponseBean();
        responseBean.setSuccess(flag);
        if(flag){
            session.setAttribute("adminUser",username);
        }
        else {
            session.invalidate();
            responseBean.setErrMsg("账号或密码错误");
        }
        return responseBean;
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

    @GetMapping("/getUserList")
    public @ResponseBody Map<String, Object> deleteUser(){
        Map<String, Object> map = new HashMap<>();
        try{
            List<Users> users = adminUserService.getAllUserList();
            map.put("userList",users);
        }catch (Exception e){
            Object sucess = map.put("sucess", false);
        }
        return map;
    }

}
