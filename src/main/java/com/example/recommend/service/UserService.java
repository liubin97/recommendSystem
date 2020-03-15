package com.example.recommend.service;


import com.example.recommend.entity.UserInfo;
import net.sf.json.JSONObject;

import java.util.List;

public interface UserService {
    List<UserInfo> getUsers();
    int checkOpenid(String openid);
    void insertUserInfo(JSONObject jsonObject);
    String getUserType(String openid);
    UserInfo getUserInfoByOpenid(String openid);
    void updateUserInfo(JSONObject jsonObject);
}
