package com.example.exercise5.service;

import org.springframework.stereotype.Service;

import com.example.exercise5.model.User;

@Service
public class UserService {

    public User saveUser(User user) {
        return user;
    }

}