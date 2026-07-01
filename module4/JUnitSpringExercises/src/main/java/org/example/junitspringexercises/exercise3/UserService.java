package org.example.junitspringexercises.exercise3;

import org.springframework.stereotype.Service;

@Service("exercise3UserService")
public class UserService {

    public User getUserById(Long id) {
        return new User(id, "Default User");
    }
}