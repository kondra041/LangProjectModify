package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.CharSet;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testRemoveEnd() {
        // Test cases where the input string is null or empty
        assertNull(StringUtils.removeEnd(null, "suffix"));
        assertEquals("", StringUtils.removeEnd("", "suffix"));

        // Test cases with non-matching suffixes
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
        assertEquals("abc", StringUtils.removeEnd("abc", ""));

        // Test cases where the suffix matches and is removed
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));

        // Additional test case with a different encoding scenario using toString method
        byte[] bytes = new byte[]{97, 98, 99}; // "abc" in ASCII
        String result;
        try {
            result = StringUtils.toString(bytes, StandardCharsets.UTF_8.name());
            assertEquals("abc", result);
            
            result = StringUtils.toString(bytes, null); // Platform default encoding
            assertEquals(new String(bytes), result);

        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }

    }
}