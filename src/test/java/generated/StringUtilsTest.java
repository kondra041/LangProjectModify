package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testSubstring() {
        // Test null input
        assertNull(StringUtils.substring(null, 0));

        // Test empty string input
        assertEquals("", StringUtils.substring("", 0));

        // Test normal substring
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("", StringUtils.substring("abc", 4));

        // Test negative start index
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("abc", StringUtils.substring("abc", -4));
    }
}