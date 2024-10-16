package com.example.springReactive.repository;

import org.springframework.data.mongodb.core.mapping.event.ReactiveAfterConvertCallback;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.springReactive.entity.User;

public interface UserRepo extends ReactiveMongoRepository<User,String> {
    
}
