package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testToString() throws UnsupportedEncodingException {
        byte[] bytes = "test".getBytes("UTF-8");
        assertEquals("test", StringUtils.toString(bytes, "UTF-8"));
    }

    @Test
    void testToStringWithNullCharset() throws UnsupportedEncodingException {
        byte[] bytes = "test".getBytes();
        assertThrows(UnsupportedEncodingException.class, () -> {
            StringUtils.toString(bytes, null);
        });
    }

    @Test
    void testSubstringBetween() {
        assertEquals("b", StringUtils.substringBetween("[b]yz", "[", "]"));
        assertNull(StringUtils.substringBetween(null, "", ""));
        assertNull(StringUtils.substringBetween("", "[", "]"));
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
    }
}