package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testToString() {
        byte[] bytes = "Hello, World!".getBytes();
        try {
            assertNotNull(StringUtils.toString(bytes));
            assertEquals("Hello, World!", StringUtils.toString(bytes, "UTF-8"));
            assertThrows(UnsupportedEncodingException.class, () -> StringUtils.toString(bytes, "InvalidEncoding"));
        } catch (UnsupportedEncodingException e) {
            fail("Unexpected UnsupportedEncodingException");
        }
    }

    @Test
    void testSubstring() {
        assertEquals(null, StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 2));
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("abc", StringUtils.substring("abc", -3));
    }
}