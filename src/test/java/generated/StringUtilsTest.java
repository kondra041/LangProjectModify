package generated;

import java.io.UnsupportedEncodingException;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringUtilsTest {

    @Test
    void testStripEndWithNullInput() {
        assertEquals(null, StringUtils.stripEnd(null, null));
        assertEquals(null, StringUtils.stripEnd(null, "xyz"));
    }

    @Test
    void testStripEndWithEmptyString() {
        assertEquals("", StringUtils.stripEnd("", null));
        assertEquals("", StringUtils.stripEnd("", "xyz"));
    }

    @Test
    void testStripEndWithNoCharactersToStrip() {
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
        assertEquals("abc  ", StringUtils.stripEnd(" abc ", ""));
    }

    @Test
    void testStripEndWhitespaceStripping() {
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals("abc", StringUtils.stripEnd("  abc", null));
        assertEquals(" abc", StringUtils.stripEnd(" abc ", null));
    }

    @Test
    void testStripEndWithSpecificCharacters() {
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
        assertEquals("12", StringUtils.stripEnd("120.00", ".0"));
        assertEquals("abc", StringUtils.stripEnd("abc", "123"));
    }

    @Test
    void testToStringHandlesNullBytesWithDefaultCharset() {
        byte[] bytes = {72, 101, 108, 108, 111};
        String result = StringUtils.toString(bytes, null);
        assertEquals("Hello", result);
    }

    @Test
    void testToStringHandlesNonNullCharset() throws UnsupportedEncodingException {
        byte[] bytes = {72, 101, 108, 108, 111};
        String result = StringUtils.toString(bytes, "UTF-8");
        assertEquals("Hello", result);
    }

    @Test
    void testToStringThrowsUnsupportedEncodingException() {
        byte[] bytes = {0xC3, 0xA9}; // é in UTF-8

        assertThrows(UnsupportedEncodingException.class, () -> {
            StringUtils.toString(bytes, "ISO-8859-1");
        });
    }
}