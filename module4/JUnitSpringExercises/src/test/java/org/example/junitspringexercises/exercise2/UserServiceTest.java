package org.example.junitspringexercises.exercise2;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUserById() {

        UserRepository mockRepository =
                mock(UserRepository.class);

        User user =
                new User(1L, "Sravya");

        when(mockRepository.findById(1L))
                .thenReturn(Optional.of(user));

        UserService service =
                new UserService();

        service.setUserRepository(mockRepository);

        User result =
                service.getUserById(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("Sravya", result.getName());
    }
}