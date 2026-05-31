import org.apache.commons.lang3.StringUtils;
import static org.junit.jupiter.api.Assertions.*;

public class TestSubstring {

    @org.junit.jupiter.api.Test
    public void testSubstring() {
        // Test with null input
        assertNull(StringUtils.substring(null, 0));
        assertNull(StringUtils.substring(null, -1));

        // Test with empty string
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("", StringUtils.substring("", -1));

        // Test with positive start index
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("bc", StringUtils.substring("abc", 2));
        assertEquals("", StringUtils.substring("abc", 4));

        // Test with negative start index
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("abc", StringUtils.substring("abc", -4));
    }
}