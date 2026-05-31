package generated;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TestClass {
    @Test
    void testMethod() {
        // Set up mock behavior
        List<String> names = Arrays.asList("Alice", "Bob");
        when(service.getNames()).thenReturn(names);

        // Execute method and verify its behavior
        String result = service.doSomething();
        assertEquals("Hello Alice, Hello Bob!", result);
    }
}