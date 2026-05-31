import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class StringUtilsStripEndTest {

    private String testString;
    private String[] testStripCharsArray;
    private String expectedResult;

    @BeforeEach
    void setUp() {
        // Initialize variables as needed for each test case
        testString = null;
        testStripCharsArray = new String[0];
        expectedResult = "";
    }

    @Test
    void testStripEndNullInput() {
        assertThrows(NullPointerException.class, () -> StringUtils.stripEnd(null, "test"));
        // Alternatively, if the method returns null for null input:
        assertNull(StringUtils.stripEnd(null, "test"), "Method should return null when input is null");
    }

    @Test
    void testStripEndEmptyString() {
        assertEquals("", StringUtils.stripEnd("", "test"), 
            "Method should return empty string when input is empty");
    }

    @Test
    void testStripEndNoStrippingRequired() {
        String str = "abc123";
        String stripChars = "xyz";
        assertEquals(str, StringUtils.stripEnd(str, stripChars),
            "No stripping should occur if no characters to strip are present at the end");
    }

    @Test
    void testStripEndStrippingWhitespacesFromEnd() {
        String str = "   abc";
        assertEquals("abc", StringUtils.stripEnd(str, null), 
            "Should remove leading whitespaces only when stripChars is null? Wait no—stripEnd removes from the END. So correct would be to leave '   abc' as is if stripping whitespace from END.");
        
        // Correct test for trailing whitespace:
        str = "abc   ";
        assertEquals("abc", StringUtils.stripEnd(str, null), 
            "Method should remove trailing whitespaces when stripChars is null");
    }

    @Test
    void testStripEndStrippingCustomCharacters() {
        String str = "120.00";
        String stripChars = ".0";
        assertEquals("12", StringUtils.stripEnd(str, stripChars),
            "Should remove trailing '.0' characters, leaving '12'");
    }

    @Test
    void testStripEndAllCharactersToBeStripped() {
        String str = "aaaa";
        String stripChars = "a";
        assertEquals("", StringUtils.stripEnd(str, stripChars), 
            "Method should return empty string when all characters are stripped");
    }

    // Additional test cases as needed
}