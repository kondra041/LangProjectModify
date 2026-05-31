package generated;

import static org.junit.jupiter.api.Assertions.*;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testToString() throws UnsupportedEncodingException {
        byte[] bytes = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        assertEquals("Hello, World!", StringUtils.toString(bytes, StandardCharsets.UTF_8.name()));
    }

    @Test
    void testToStringWithNullCharset() throws UnsupportedEncodingException {
        byte[] bytes = "Hello, World!".getBytes(StandardCharsets.UTF_8);
        assertEquals("Hello, World!", StringUtils.toString(bytes, null));
    }

    @Test
    void testToStringWithInvalidCharset() {
        assertThrows(UnsupportedEncodingException.class, () -> {
            byte[] bytes = "Hello, World!".getBytes(StandardCharsets.UTF_8);
            StringUtils.toString(bytes, "INVALID_ENCODING");
        });
    }

    @Test
    void testSubstring() {
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("c", StringUtils.substring("abc", 2, 3));
        assertEquals("b", StringUtils.substring("abc", -1, 0));
        assertEquals("bc", StringUtils.substring("abc", -2, 0));
    }

    @Test
    void testSubstringWithEmptyString() {
        assertEquals("", StringUtils.substring("", 0, 0));
    }

    @Test
    void testSubstringWithNegativeStartAndEnd() {
        assertEquals("", StringUtils.substring("abc", -1, -2));
    }
}