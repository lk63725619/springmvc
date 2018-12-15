package com.home.service;

import com.home.dao.UserDao;
import com.home.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public List<User> selectUser(User user) {
        return userDao.selectUser(user);
    }

    @Override
    public boolean existUser(String username) {
        List<User> userList = userDao.selectUserByUserName(username);
        if(userList.size()>0)
            return true;
        else
            return false;
    }

}