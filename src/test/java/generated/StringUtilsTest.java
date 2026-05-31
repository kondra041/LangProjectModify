package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {

    @Test
    public void testSubstringBetween() {
        String result = StringUtils.substringBetween("wx[b]yz", "[", "]");
        assertEquals("b", result);
    }

    @Test
    public void testSubstringBetweenWithNullInput() {
        assertNull(StringUtils.substringBetween(null, "a", "b"));
        assertNull(StringUtils.substringBetween("a", null, "b"));
        assertNull(StringUtils.substringBetween("a", "b", null));
    }

    @Test
    public void testSubstringBetweenWithEmptyOpenClose() {
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertNull(StringUtils.substringBetween("", "", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]"));
    }

    @Test
    public void testSubstringBetweenNoMatch() {
        assertNull(StringUtils.substringBetween("yabcz", "x", "z"));
    }

    @Test
    public void testSubstringBetweenMultipleMatches() {
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
    }
}