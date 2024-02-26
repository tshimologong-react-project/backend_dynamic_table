package com.algoExpert.demo.Controller;

import com.algoExpert.demo.Entity.Comment;
import com.algoExpert.demo.Entity.User;
import com.algoExpert.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/all")
    private List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/comments/{userId}")
    List<Comment> userComments(@PathVariable int userId){
      return   userService.userComments(userId);
    }

    @DeleteMapping("/delete/{userId}")
    private List<User> deleteUser(@PathVariable int userId){
        return userService.deleteUser(userId);
    }
}
