package generated;

import java.nio.charset.UnsupportedEncodingException;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testIsBlank() {
        // Test case 1: null input
        assertTrue(StringUtils.isBlank(null));

        // Test case 2: empty string
        assertTrue(StringUtils.isBlank(""));

        // Test case 3: only whitespace
        assertTrue(StringUtils.isBlank(" "));

        // Test case 4: non-empty string without leading/trailing spaces
        assertFalse(StringUtils.isBlank("bob"));

        // Test case 5: string with leading and trailing spaces
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    void testToString() {
        try {
            // Test case 1: empty byte array
            assertEquals("", StringUtils.toString(new byte[]{}, "UTF-8"));

            // Test case 2: non-empty byte array with UTF-8 encoding
            assertEquals("\u00e9", StringUtils.toString(new byte[]{'\u00c3', '\u00a9'}, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            fail("Should not throw UnsupportedEncodingException");
        }
    }

    @Test
    void testIsBlankEdgeCases() {
        // Test case 6: string with only tab characters
        assertTrue(StringUtils.isBlank("\t\t"));

        // Test case 7: string with carriage return and newline
        assertTrue(StringUtils.isBlank("\r\n"));

        // Test case 8: null input (should still pass)
        assertTrue(StringUtils.isBlank(null));

        // Test case 9: empty string (should still pass)
        assertTrue(StringUtils.isBlank(""));

        // Test case 10: single character which is not a whitespace
        assertFalse(StringUtils.isBlank("a"));
    }
}