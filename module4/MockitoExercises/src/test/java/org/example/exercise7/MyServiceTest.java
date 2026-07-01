package org.example.exercise7;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    void testVoidMethodWithException() {

        ExternalApi mockApi =
                Mockito.mock(ExternalApi.class);

        doThrow(new RuntimeException("Delete Failed"))
                .when(mockApi)
                .deleteData();

        MyService service =
                new MyService(mockApi);

        assertThrows(
                RuntimeException.class,
                () -> service.performDelete()
        );

        verify(mockApi).deleteData();
    }
}