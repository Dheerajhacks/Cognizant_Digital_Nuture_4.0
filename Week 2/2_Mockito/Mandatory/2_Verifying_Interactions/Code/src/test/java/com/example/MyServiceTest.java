package com.example;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // 1️⃣ Create the mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2️⃣ Use the mock in your service
        MyService service = new MyService(mockApi);

        // 3️⃣ Call the method that should trigger the interaction
        service.fetchData();

        // 4️⃣ Verify the interaction happened
        verify(mockApi).getData();
    }
}
