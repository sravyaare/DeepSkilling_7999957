package org.example.mockitomockdependencies.exercise3.repository;

import org.example.mockitomockdependencies.exercise3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}