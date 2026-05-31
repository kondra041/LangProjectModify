package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testSubstringBetween() {
        // Test cases for substringBetween method
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertNull(StringUtils.substringBetween(null, "a", "b"));
        assertNull(StringUtils.substringBetween("abc", null, "b"));
        assertNull(StringUtils.substringBetween("abc", "a", null));
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertNull(StringUtils.substringBetween("", "", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]"));
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
    }

    @Test
    public void testSubstringBetweenEdgeCases() {
        // Test cases for substringBetween method with edge cases
        assertThrows(NullPointerException.class, () -> StringUtils.substringBetween(null, "a", "b"));
        assertThrows(NullPointerException.class, () -> StringUtils.substringBetween("abc", null, "b"));
        assertThrows(NullPointerException.class, () -> StringUtils.substringBetween("abc", "a", null));
    }

    @Test
    public void testSubstringBetweenEmptyStrings() {
        // Test cases for substringBetween method with empty strings
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertNull(StringUtils.substringBetween("", "[", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]"));
    }
}