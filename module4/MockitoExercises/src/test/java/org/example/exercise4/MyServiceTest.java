package org.example.exercise4;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    void testVoidMethod() {

        ExternalApi mockApi =
                Mockito.mock(ExternalApi.class);

        doNothing().when(mockApi).saveData();

        MyService service =
                new MyService(mockApi);

        service.performSave();

        verify(mockApi).saveData();
    }
}