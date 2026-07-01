package org.example.mockitomockdependencies.exercise2.repository;

import org.example.mockitomockdependencies.exercise2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}