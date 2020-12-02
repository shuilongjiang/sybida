package com.sy.controller;



import com.sy.pojo.User;
import com.sy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user1")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("user")
    public User selectUser(User user){
        System.out.println("========");
        userService.selectUser();
     return user;
    }
}
