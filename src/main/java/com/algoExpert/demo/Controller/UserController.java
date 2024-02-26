package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.User;
import com.algoExpert.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public User saveUser(@RequestBody User user){
        return userService.create(user);
    }
}
