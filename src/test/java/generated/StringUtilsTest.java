package generated;

import java.io.UnsupportedEncodingException;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StringUtilsSubstringTest {

    @Test
    void testSubStringNull() {
        String result = StringUtils.substring(null, 0);
        assertNull(result, "Expected null when input string is null");
    }

    @Test
    void testSubStringEmpty() {
        String result = StringUtils.substring("", 0);
        assertEquals("", result, "Expected empty string when input is an empty string");
    }

    @Test
    void testSubStringNormalStartZero() {
        String result = StringUtils.substring("abc", 0);
        assertEquals("abc", result, "Expected full string when start position is zero");
    }

    @Test
    void testSubStringNormalPositiveIndex() {
        String result = StringUtils.substring("abc", 2);
        assertEquals("c", result, "Expected 'c' when start index is within the length of the string");
    }

    @Test
    void testSubStringNormalBeyondEndIndex() {
        String result = StringUtils.substring("abc", 4);
        assertEquals("", result, "Expected empty string when start index is beyond the end of the string");
    }

    @Test
    void testSubStringNegativeIndexWithinRange() {
        String result = StringUtils.substring("abc", -2);
        assertEquals("bc", result, "Expected substring from two characters back in a positive direction");
    }

    @Test
    void testSubStringNegativeIndexBeyondStart() {
        String result = StringUtils.substring("abc", -4);
        assertEquals("abc", result, "Expected full string when negative index is beyond the start of the string");
    }
}