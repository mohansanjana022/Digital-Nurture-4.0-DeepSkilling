
package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

	@Test
	public void testVerifyInteraction() {
	    ExternalApi mockApi = mock(ExternalApi.class);
	    MyService service = new MyService(mockApi);

	    service.fetchData();
	    service.fetchData();

	    verify(mockApi, atLeastOnce()).getData();  
	    verify(mockApi, times(2)).getData();      
	    verify(mockApi, atMost(2)).getData();      
	}
}
