package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.User;
import com.algoExpert.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAll(){
        return userService.getUsers();
    }
}
