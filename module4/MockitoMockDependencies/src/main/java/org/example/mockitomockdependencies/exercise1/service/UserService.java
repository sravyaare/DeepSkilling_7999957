package org.example.mockitomockdependencies.exercise1.service;

import org.example.mockitomockdependencies.exercise1.entity.User;
import org.example.mockitomockdependencies.exercise1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}