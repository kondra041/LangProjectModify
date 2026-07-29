package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.LocaleUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testStrip() {
        // Test case 1: Null input should return null
        assertNull(StringUtils.strip(null, "stripChars"));

        // Test case 2: Empty string input should return empty string
        assertEquals("", StringUtils.strip("", "stripChars"));

        // Test case 3: No stripping characters specified (null), whitespace should be stripped
        assertEquals("abc", StringUtils.strip("  abc  ", null));

        // Test case 4: Specific stripping characters
        assertEquals("123", StringUtils.strip("123***", "*"));
        assertEquals("*123*", StringUtils.strip("**123**", "123"));

        // Additional test cases with different stripChars
        assertEquals("abc ", StringUtils.strip("abc ", " "));
        assertEquals(" abc", StringUtils.strip(" abc", " "));
        assertEquals("", StringUtils.strip("  ", ""));
    }

    @Test
    public void testStripStart() {
        // Test case 1: Strip specific characters from the start of a string
        assertEquals("bc123", StringUtils.stripStart("abc123", "a"));
        
        // Additional cases
        assertEquals("bc123", StringUtils.stripStart("abbc123", "a"));
        assertEquals("b123", StringUtils.stripStart("ba123", "ab"));

        // Test with null as stripChars should remove leading whitespace
        assertEquals("abc  ", StringUtils.stripStart("   abc  ", null));
    }

    @Test
    public void testStripEnd() {
        // Test case 1: Strip specific characters from the end of a string
        assertEquals("abc123", StringUtils.stripEnd("abc123c", "c"));

        // Additional cases
        assertEquals("abc123", StringUtils.stripEnd("abc123cc", "c"));
        assertEquals("", StringUtils.stripEnd("***", "*"));

        // Test with null as stripChars should remove trailing whitespace
        assertEquals("   abc  ", StringUtils.stripEnd("   abc    ", null));
    }
}