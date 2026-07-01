package com.example.exercise6.repository;

import com.example.exercise6.model.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);

}