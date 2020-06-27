package com.example.recommend.service;


import com.example.recommend.entity.User;
import com.example.recommend.entity.UserInfo;
import com.example.recommend.entity.Users;
import net.sf.json.JSONObject;

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

    //List<Users> getUserInfoById(String userid);
<<<<<<< HEAD
    List<Users> selectUserInfoByName(String username);
=======
    List<Users> selectUserInfoById(String userid);
>>>>>>> Initial commit
    Map<String,Object> regiter(String username, String password);
}
