package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {

    @Test
    public void testSubstring_nullInput() {
        assertNull(StringUtils.substring(null, 0, 2));
    }

    @Test
    public void testSubstring_emptyString() {
        assertEquals("", StringUtils.substring("", 0, 2));
    }

    @Test
    public void testSubstring_withinBounds() {
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
    }

    @Test
    public void testSubstring_startGreaterThanEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 0));
    }

    @Test
    public void testSubstring_endBeyondLength() {
        assertEquals("c", StringUtils.substring("abc", 2, 4));
    }

    @Test
    public void testSubstring_startEndSame() {
        assertEquals("", StringUtils.substring("abc", 2, 2));
    }

    @Test
    public void testSubstring_negativeStartPositiveEnd() {
        assertEquals("b", StringUtils.substring("abc", -2, -1));
    }

    @Test
    public void testSubstring_negativeStartBeyondLength() {
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }

    @Test
    public void testSubstring_negativeStartEnd() {
        assertEquals("b", StringUtils.substring("abc", -2, -1));
    }

    @Test
    public void testSubstring_startNegativeBeyondLength() {
        assertEquals("", StringUtils.substring("abc", -5, -4));
    }
}