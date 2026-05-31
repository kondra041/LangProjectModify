package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyTest {

    @org.junit.jupiter.api.Test
    void testMyMethod() {
        String input = "Hello World!";
        String expectedOutput = "Hello";

        assertEquals(expectedOutput, MyClass.myMethod(input));
    }
}