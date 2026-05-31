import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {

    @org.junit.jupiter.api.Test
    public void testSubstring() {
        // Test null input
        assertNull(StringUtils.substring(null, 0, 0));

        // Test empty string input
        assertEquals("", StringUtils.substring("", 0, 0));

        // Test valid input
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("", StringUtils.substring("abc", 2, 0));
        assertEquals("c", StringUtils.substring("abc", 2, 4));
        assertEquals("", StringUtils.substring("abc", 4, 6));
        assertEquals("", StringUtils.substring("abc", 2, 2));

        // Test negative start position
        assertEquals("b", StringUtils.substring("abc", -2, -1));

        // Test negative end position
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }
}