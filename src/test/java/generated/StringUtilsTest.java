package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty((String) null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("", StringUtils.trimToEmpty(" "));
        assertEquals("bob", StringUtils.trimToEmpty(" bob "));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue(StringUtils.equalsIgnoreCase("Hello", "hello"));
        assertFalse(StringUtils.equalsIgnoreCase("Hello", "world"));
    }

    @Test
    public void testJoin() {
        String[] array = {"a", "b", "c"};
        assertEquals("a,b,c", StringUtils.join(array));
    }

    @Test
    public void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    public void testSubstring() {
        assertEquals("world", StringUtils.substring("Hello, world!", 7));
    }

    @Test
    public void testDefaultString() {
        assertEquals("default", StringUtils.defaultString(null, "default"));
        assertEquals("hello", StringUtils.defaultString("hello", "default"));
    }

    @Test
    public void testToCamelCase() {
        assertEquals("camelCase", StringUtils.toCamelCase("camel_case_string"));
    }

    @Test
    public void testToTitleCase() {
        assertEquals("Title Case String", StringUtils.toTitleCase("title case string"));
    }

    @Test
    public void testSubstringBetween() {
        assertEquals("world", StringUtils.substringBetween("Hello, [world]!", "[", "]"));
    }

    @Test
    public void testReplaceOnce() {
        assertEquals("hello, world2!", StringUtils.replaceOnce("hello, world!", "world", "world2"));
    }

    @Test
    public void testToString() throws UnsupportedEncodingException {
        byte[] bytes = "test".getBytes();
        assertEquals("test", StringUtils.toString(bytes, null));
        assertEquals("test", StringUtils.toString(bytes, "UTF-8"));
    }
}