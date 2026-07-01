package org.example.junitspringexercises.exercise2;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);
}