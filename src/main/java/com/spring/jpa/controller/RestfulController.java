package com.spring.jpa.controller;

import com.spring.jpa.model.User;
import com.spring.jpa.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Rest/V1")
public class RestfulController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("HelloWorld")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("Save")
    public boolean saveUser() {
        User user = new User(0, "Test", 123);
        this.userRepo.save(user);
        return true;
    }

    @GetMapping("Get")
    public List<User> findUserByName(String name){
        return userRepo.findUserByName(name);
    }
}
