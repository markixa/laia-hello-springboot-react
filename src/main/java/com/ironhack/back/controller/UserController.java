package com.ironhack.back.controller;

import com.ironhack.back.model.User;
import com.ironhack.back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

}
