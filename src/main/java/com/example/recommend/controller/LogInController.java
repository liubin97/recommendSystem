package com.example.recommend.controller;

import com.example.recommend.service.UsersService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;
=======
>>>>>>> Initial commit
import java.util.HashMap;
import java.util.Map;

@Controller
public class LogInController {
    @Autowired
    UsersService usersService;

    @PostMapping("/register")
    @ResponseBody
    public Map<String, Object> register(Model model, @RequestParam("username") String username,
                                        @RequestParam("password") String password,
                                        @RequestParam("prefer") String prefer){
        Map<String,Object> map;
        map = usersService.register(username,password,prefer);
        if(map.get("msg")!=null){
            map.put("success",true);

        }else {
            map.put("success",false);
        }
        return map;

    }
    @PostMapping("/login")
    @ResponseBody
<<<<<<< HEAD
    public Map<String, Object> login(@RequestBody String data, HttpSession session){
=======
    public Map<String, Object> login(@RequestBody String data){
>>>>>>> Initial commit
        JSONObject jsonObject = JSONObject.fromObject(data);
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        Map<String,Object> map;
        map = usersService.logIn(username,password);

        if(map.get("msg")!=null){
<<<<<<< HEAD
            session.invalidate();
            map.put("success",false);
        }else {
            session.setAttribute("username",username);
=======
            map.put("success",false);
        }else {
>>>>>>> Initial commit
            map.put("data",username);
            map.put("success",true);
        }
        return map;



    }

}
