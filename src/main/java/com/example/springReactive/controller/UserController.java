package com.example.springReactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springReactive.entity.User;
import com.example.springReactive.service.UserService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/users")
    public Flux<User> getAllTheUser()
    {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public Mono<User> getById(@PathVariable String id)
    {
        return userService.findById(id);
    }

    @PostMapping("/user")
    public Mono<User>addUser(@RequestBody User user)
    {
        return userService.save(user);
    }

    @DeleteMapping("/duser/{id}")
    public Mono<Void> deleteById(@PathVariable String id)
    {
        return userService.deleteById(id);
    }
    
}
