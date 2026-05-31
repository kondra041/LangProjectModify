package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.CharSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testStripStart() {
        // Test with null input
        assertNull(StringUtils.stripStart(null, "abc"));

        // Test with empty string input
        assertEquals("", StringUtils.stripStart("", "abc"));

        // Test with no characters to strip
        assertEquals("abc", StringUtils.stripStart("abc", ""));

        // Test with whitespace stripping when stripChars is null
        assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
        
        // Test with custom character set for stripping
        assertEquals("def", StringUtils.stripStart("abcdef", "ab"));

        // Additional test cases
        assertEquals("", StringUtils.stripStart("   ", " "));
        assertEquals("hello world", StringUtils.stripStart("     hello world", " "));
    }

    @Test
    public void testToString() {
        try {
            // Test with default charset
            byte[] bytes = new byte[]{72, 101, 108, 108, 111}; // "Hello"
            assertEquals("Hello", StringUtils.toString(bytes, null));

            // Test with custom charset
            String result = StringUtils.toString(new byte[]{65}, StandardCharsets.ISO_8859_1.name());
            assertEquals("A", result);

            // Check exception handling for unsupported charset
            assertThrows(UnsupportedEncodingException.class, () -> {
                StringUtils.toString(new byte[]{65}, "UnknownCharset");
            });
        } catch (UnsupportedEncodingException e) {
            fail("Should not throw an UnsupportedEncodingException if a default is available.");
        }
    }

}