package com.home.service;

import com.home.entity.User;

import java.util.List;

public interface UserService {

     void insertUser(User user);

     List<User> selectUser(User user);

     boolean existUser(String username);

}