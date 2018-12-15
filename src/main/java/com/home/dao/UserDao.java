package com.home.dao;

import com.home.entity.User;

import java.util.List;

public interface UserDao
{
     List<User> selectUser(User user);

     void insertUser(User user);

     List<User> selectUserByUserName(String username);
}
