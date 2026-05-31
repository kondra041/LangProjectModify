import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.lang3.StringUtils;

import org.junit.jupiter.api.Test;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class StringUtilsSubstringTest {
    @Test
    void testNullString() {
        assertNull(StringUtils.substring(null, 0));
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("", StringUtils.substring("", 5));
        assertEquals("", StringUtils.substring("", -3));
    }

    @Test
    void testPositiveStartWithinBounds() {
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("bc", StringUtils.substring("abc", 1));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("", StringUtils.substring("abc", 3));
        assertEquals("", StringUtils.substring("abc", 4));
    }

    @Test
    void testNegativeStartWithinBounds() {
        assertEquals("bc", StringUtils.substring("abc", -1));
        assertEquals("abc", StringUtils.substring("abc", -4)); // should return entire string
        assertEquals("c", StringUtils.substring("abc", -3));
        assertEquals("", StringUtils.substring("abc", -5)); // start beyond beginning, returns empty?
    }

    @Test
    void testEmptyResult() {
        assertEquals("", StringUtils.substring("a", 1));
        assertEquals("", StringUtils.substring("ab", 2));
        assertEquals("", StringUtils.substring("test", 10));
    }
}