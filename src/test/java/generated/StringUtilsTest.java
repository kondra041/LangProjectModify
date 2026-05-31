package generated;

import java.util.Arrays;
import java.nio.charset.UnsupportedEncodingException;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class StringUtilsTest {

    @Test
    public void testRemoveStart() {
        // Test with null source string
        assertEquals(null, StringUtils.removeStart(null, "www."));

        // Test with empty source string
        assertEquals("", StringUtils.removeStart("", "www."));

        // Test with null remove string
        assertEquals("abc", StringUtils.removeStart("abc", null));

        // Test with matching prefix to remove
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));

        // Test with non-matching prefix
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));

        // Test with no match at start
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));

        // Test with empty remove string
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testToString() throws UnsupportedEncodingException {
        byte[] bytes = new byte[]{97, 98, 99}; // "abc" in ASCII

        // Test with null charset name
        assertEquals("abc", StringUtils.toString(bytes, null));

        // Test with UTF-8 encoding
        when(new String(bytes, "UTF-8")).thenReturn("abc");
        assertEquals("abc", StringUtils.toString(bytes, "UTF-8"));

        // Test with unsupported encoding
        assertThrows(UnsupportedEncodingException.class, () -> {
            new String(bytes, "unsupported-encoding");
        });
    }
}