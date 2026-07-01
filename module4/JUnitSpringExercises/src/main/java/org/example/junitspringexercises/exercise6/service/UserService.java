package com.example.exercise6.service;

import com.example.exercise6.exception.UserNotFoundException;
import com.example.exercise6.model.User;
import com.example.exercise6.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with id: " + id));

    }

}