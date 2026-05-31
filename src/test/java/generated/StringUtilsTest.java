package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testSubstringBetween() {
        // Test case where the input string is null
        assertNull(StringUtils.substringBetween(null, "[", "]"));

        // Test case where the open or close strings are null
        assertNull(StringUtils.substringBetween("wx[b]yz", null, "]"));
        assertNull(StringUtils.substringBetween("wx[b]yz", "[", null));

        // Test case where the open and close strings are empty
        assertEquals("", StringUtils.substringBetween("", "", ""));

        // Test case where there is no match for open or close
        assertNull(StringUtils.substringBetween("yabcz", "", "]"));
        assertNull(StringUtils.substringBetween("yabcz", "[", "]"));

        // Test case where the open and close strings are present but not in order
        assertEquals("", StringUtils.substringBetween("yabczyabcz", "z", "y"));

        // Test case where the substring is found between open and close
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
    }
}