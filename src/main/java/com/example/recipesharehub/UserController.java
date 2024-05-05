package com.example.recipesharehub;

import com.example.recipesharehub.model.User;
import com.example.recipesharehub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    //add post request
    @PostMapping("/users")
    public User createUser(@RequestBody User user){

       User savedUser =userRepository.save(user);
        return savedUser;


    }
}
