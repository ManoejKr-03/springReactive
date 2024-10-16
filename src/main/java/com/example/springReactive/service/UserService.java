package com.example.springReactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springReactive.entity.User;
import com.example.springReactive.repository.UserRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService {

  public final  UserRepo userRepository;

    public UserService(UserRepo userRepository)
    {
        this.userRepository = userRepository;
    }


    public Flux<User> findAll() {
        return  userRepository.findAll();
    }

    public Mono<User> findById(String id) {
        return userRepository.findById(id); // it is
    }

    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    public Mono<Void> deleteById(String id) {
        return userRepository.deleteById(id);
    }
    
}
