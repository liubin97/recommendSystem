package com.example.recommend.dao;

import com.example.recommend.entity.User;
import com.example.recommend.entity.Users;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UsersDao {
    @Insert("insert into users(gender,age,zip,occupation,username,password,prefer)values" +
            "(#{gender},#{age},#{zip},#{occupation},#{username},#{password},#{prefer})")
    int addUser(Users user);

    @Select({"select * from users where username=#{username}"})
    Users selectByUserName(String username);
    @Delete("delete from users where userId=#{userId}")
    void deleteByUserId(int userId);



    @Update({"update users set password=#{password} where username=#{username}"})
    void updatePassword(User user);

    @Delete({"delete from users where username=#{username}"})
    void deleteByUserName(String username);
}
