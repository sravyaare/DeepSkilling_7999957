package com.example.exercise6;

import com.example.exercise6.exception.UserNotFoundException;
import com.example.exercise6.repository.UserRepository;
import com.example.exercise6.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    void setUp() {

        userRepository = mock(UserRepository.class);

        userService = new UserService(userRepository);

    }

    @Test
    void testUserNotFoundException() {

        when(userRepository.findById(1L))
                .thenReturn(Optional.empty());

        UserNotFoundException exception =
                assertThrows(UserNotFoundException.class, () -> {

                    userService.getUserById(1L);

                });

        assertEquals("User not found with id: 1", exception.getMessage());

        verify(userRepository, times(1)).findById(1L);

    }

}