package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create a mock of the ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub the method getData() to return a predefined string
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject the mock into MyService
        MyService service = new MyService(mockApi);

        // Step 4: Call the method and assert the result
        String result = service.fetchData();

        // Step 5: Validate the result using assertion
        assertEquals("Mock Data", result);
    }
}
