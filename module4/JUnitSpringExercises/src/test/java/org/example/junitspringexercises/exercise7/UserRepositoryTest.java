package com.example.exercise7;

import com.example.exercise7.model.User;
import com.example.exercise7.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void testFindByName() {

        userRepository.save(new User("Sravya"));
        userRepository.save(new User("Rahul"));
        userRepository.save(new User("Sravya"));

        List<User> users = userRepository.findByName("Sravya");

        assertEquals(2, users.size());

        assertEquals("Sravya", users.get(0).getName());
        assertEquals("Sravya", users.get(1).getName());

    }

}