package com.example.recommend.service.impl;

import com.example.recommend.dao.UsersDao;
import com.example.recommend.entity.Users;
import com.example.recommend.service.UsersService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
@Service
public class UsersServicelmpl implements UsersService {
    @Autowired
    UsersDao usersDao;
    @Transactional

    @Override
    public  void addUser(Users user) {
         usersDao.addUser(user);
    }

    @Override
    public Users selectByUserName(String username) {
        return usersDao.selectByUserName(username);
    }

    /*注册功能
    * */
    @Override
    public Map<String, Object> register(String username, String password,String prefer) {
        Map<String,Object> map = new HashMap<String, Object>();
        if(StringUtils.isBlank(username)){
            map.put("msg","用户名不能为空");
            return map;
        }
        if(StringUtils.isBlank(password)){
            map.put("msg","用户名不能为空");
            return map;
        }
        if(usersDao.selectByUserName(username)!=null){
            map.put("msg","用户已被注册");
            return map;
        }
        Users user= new Users();
        user.setUsername(username);
        user.setPassword(password);
        user.setPrefer(prefer);
        usersDao.addUser(user);
        map.put("success","注册成功");
        return map;
    }

    @Override
    public Map<String, Object> logIn(String username, String password) {
        Map<String,Object> map = new HashMap<String, Object>();
        if(StringUtils.isBlank(username)){
            map.put("msg","用户名不能为空");
            return map;
        }
        if(StringUtils.isBlank(password)){
            map.put("msg","用户名不能为空");
            return map;
        }
        if(usersDao.selectByUserName(username)==null){
            map.put("msg","用户不存在，请注册");
            return map;
        }
        if(!usersDao.selectByUserName(username).getPassword().equals(password)){
            map.put("msg","密码错误");
            return map;
        }
        map.put("success","登录成功");
        return map;
    }
}
