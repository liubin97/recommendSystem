package com.example.recommend.service;


import com.example.recommend.entity.User;
import com.example.recommend.entity.UserInfo;
import net.sf.json.JSONObject;

import java.util.List;

public interface UserService {
    List<UserInfo> getUsers();
    List<User> selcetAllUser();
    int checkOpenid(String openid);
    void insertUserInfo(JSONObject jsonObject);
    String getUserType(String openid);
    UserInfo getUserInfoByOpenid(String openid);
    void updateUserInfo(JSONObject jsonObject);

    //List<Users> getUserInfoById(String userid);
    List<Users> selectUserInfoById(String userid);
    Map<String,Object> regiter(String username,String password);
}
