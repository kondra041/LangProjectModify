package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsSubstringBetweenTest {

    @Test
    public void testSubstringBetweenValid() {
        String result = StringUtils.substringBetween("wx[b]yz", "[", "]");
        assertEquals("b", result);
    }

    @Test
    public void testSubstringBetweenNullInputString() {
        assertNull(StringUtils.substringBetween(null, "[", "]"));
    }

    @Test
    public void testSubstringBetweenNullOpen() {
        assertNull(StringUtils.substringBetween("wx[b]yz", null, "]"));
    }

    @Test
    public void testSubstringBetweenNullClose() {
        assertNull(StringUtils.substringBetween("wx[b]yz", "[", null));
    }

    @Test
    public void testSubstringBetweenEmptyOpenAndClose() {
        String result = StringUtils.substringBetween("", "", "");
        assertEquals("", result);
    }

    @Test
    public void testSubstringBetweenOpenNotInString() {
        assertNull(StringUtils.substringBetween("wx[b]yz", "{", "}"));
    }

    @Test
    public void testSubstringBetweenCloseNotAfterOpen() {
        assertNull(StringUtils.substringBetween("wx[b]yz", "[", "x"));
    }

    @Test
    public void testSubstringBetweenNoMatchInString() {
        assertNull(StringUtils.substringBetween("yabcz", "a", "c"));
    }

    @Test
    public void testSubstringBetweenMultipleMatchesReturnFirst() {
        String result = StringUtils.substringBetween("yabczyabcz", "y", "z");
        assertEquals("abc", result);
    }
}