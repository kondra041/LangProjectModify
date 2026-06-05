package generated;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.StringUtils; // Explicit import
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testIsBlank_NullInput() {
        // Testing with null input, expecting true as the result
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    public void testIsBlank_EmptyString() {
        // Testing with an empty string, expecting true as the result
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlank_SingleSpace() {
        // Testing with a single space character, expecting true as the result
        assertTrue(StringUtils.isBlank(" "));
    }

    @Test
    public void testIsBlank_NonBlankString() {
        // Testing with a non-blank string without any leading or trailing spaces, expecting false as the result
        assertFalse(StringUtils.isBlank("bob"));
    }

    @Test
    public void testIsBlank_NonBlankStringWithSpaces() {
        // Testing with a non-blank string that contains only leading and trailing spaces, expecting false as the result
        assertFalse(StringUtils.isBlank("  bob  "));
    }
}