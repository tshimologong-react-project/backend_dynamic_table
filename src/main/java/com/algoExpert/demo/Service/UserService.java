package com.algoExpert.demo.Service;

import com.algoExpert.demo.Entity.*;
import com.algoExpert.demo.Repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


//random users generator( use once)

//    @PostConstruct
//    public List<User> createUsers(){
//
//        List<User> users = IntStream.
//                range(1,10)
//                .mapToObj(i ->new User(0,"user"+i,"email@gmail.com"+i,null,null,null))
//                .collect(Collectors.toList());
//       return userRepository.saveAll(users);
//    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public List<Comment> userComments(int userId){
        User findUser = userRepository.findById(userId).orElseThrow();
        return findUser.getComments();
    }

    public List<User> deleteUser(int userId){
        userRepository.deleteById(userId);
        return userRepository.findAll();
    }
}
