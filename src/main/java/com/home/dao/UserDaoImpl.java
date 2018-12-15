package com.home.dao;

import com.home.entity.User;
import com.home.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUser(User user) {
        return userMapper.selectUser(user);
    }

    @Override
    public void insertUser(User user) {
        String userId = UUID.randomUUID().toString();
        if(user.getUserId()==null||user.getUserId()=="")
            user.setUserId(userId.replace("-", ""));
        System.out.println(user.getUserId());
        userMapper.insertUser(user);
    }

    @Override
    public List<User> selectUserByUserName(String username) {
        return userMapper.selectUserByUserName(username);
    }

}