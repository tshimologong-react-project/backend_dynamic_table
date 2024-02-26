package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.User;
import com.algoExpert.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/saveUser")
    public User create( User user){
        return userRepository.save(user);
    }



}
