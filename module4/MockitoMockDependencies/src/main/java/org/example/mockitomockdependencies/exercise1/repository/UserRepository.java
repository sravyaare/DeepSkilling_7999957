package org.example.mockitomockdependencies.exercise1.repository;

import org.example.mockitomockdependencies.exercise1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}