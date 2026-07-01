package com.example.exercise8.service;

import com.example.exercise8.model.User;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    public User getUser(Long id) {

        throw new NoSuchElementException("User not found");

    }

}