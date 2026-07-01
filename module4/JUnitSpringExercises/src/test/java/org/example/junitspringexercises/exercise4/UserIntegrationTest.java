package org.example.junitspringexercises.exercise4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserIntegrationTest {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserService service;

    @Test
    void testFullFlow() {

        User user = new User(1L, "Sravya");

        repository.save(user);

        User result = service.getUserById(1L);

        assertNotNull(result);
        assertEquals("Sravya", result.getName());
    }
}