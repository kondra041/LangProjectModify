package generated;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        String input = "  This is a test  ";
        String expectedOutput = "This is a test";

        String actualOutput = StringUtils.strip(input, null);

        assertEquals(expectedOutput, actualOutput);
    }
}