package com.example.recommend.service;


import com.example.recommend.entity.User;
import com.example.recommend.entity.UserInfo;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
public interface UserService {
    List<UserInfo> getUsers();
    List<User> selcetAllUser();
    int checkOpenid(String openid);
    void insertUserInfo(JSONObject jsonObject);
    String getUserType(String openid);
    UserInfo getUserInfoByOpenid(String openid);
    void updateUserInfo(JSONObject jsonObject);
    Map<String,Object> regiter(String username,String password);
}
