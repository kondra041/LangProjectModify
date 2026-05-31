package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.nio.charset.UnsupportedCharsetException;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @BeforeEach
    void setUp() {
        // No setup required for these tests
    }

    @Test
    void testToString() throws UnsupportedEncodingException {
        byte[] bytes = "Hello, World!".getBytes("UTF-8");
        String expected = new String(bytes, "UTF-8");
        String result = StringUtils.toString(bytes, "UTF-8");
        assertEquals(expected, result);
    }

    @Test
    void testToStringWithNullCharset() {
        byte[] bytes = "Hello, World!".getBytes();
        String expected = new String(bytes);
        String result = StringUtils.toString(bytes, null);
        assertEquals(expected, result);
    }

    @Test
    void testToStringWithUnsupportedEncoding() {
        byte[] bytes = "Hello, World!".getBytes();
        assertThrows(UnsupportedEncodingException.class, () -> StringUtils.toString(bytes, "NonExistentCharset"));
    }

    @Test
    void testStripStartWithNullInput() {
        String result = StringUtils.stripStart(null, "");
        assertNull(result);
    }

    @Test
    void testStripStartWithEmptyInput() {
        String result = StringUtils.stripStart("", "");
        assertEquals("", result);
    }

    @Test
    void testStripStartWithWhitespaceChars() {
        String input = "  abc  ";
        String result = StringUtils.stripStart(input, null);
        assertEquals("abc  ", result);
    }

    @Test
    void testStripStartWithSpecificChars() {
        String input = "yxabc  ";
        String result = StringUtils.stripStart(input, "xyz");
        assertEquals("abc  ", result);
    }
}