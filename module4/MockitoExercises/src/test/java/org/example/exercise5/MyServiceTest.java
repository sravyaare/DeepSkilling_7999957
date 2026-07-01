package org.example.exercise5;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    void testMultipleReturns() {

        ExternalApi mockApi =
                Mockito.mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First Call")
                .thenReturn("Second Call");

        MyService service =
                new MyService(mockApi);

        String firstResult =
                service.fetchData();

        String secondResult =
                service.fetchData();

        assertEquals(
                "First Call",
                firstResult
        );

        assertEquals(
                "Second Call",
                secondResult
        );
    }
}