import static org.junit.Assert.assertEquals;

public class MyClassTest {

    @Test
    public void testMyMethod() {
        // arrange
        String input = "Hello, World!";

        // act
        String output = myClass.myMethod(input);

        // assert
        assertEquals("Goodbye, World!", output);
    }

}