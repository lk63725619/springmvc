package com.home.mapper;

import com.home.entity.User;

import java.util.List;

public interface UserMapper
{
     List<User> selectUser(User user);
     void insertUser(User user);
     List<User> selectUserByUserName(String username);
}
