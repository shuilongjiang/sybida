package com.sy.service;


import com.sy.mapper.UserMapper;
import com.sy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper ;

    @Override
    public User selectUser() {
        System.out.println(userMapper.toString() + "======");
        System.out.println("servcie->selectUser");
        return null;
    }
}
