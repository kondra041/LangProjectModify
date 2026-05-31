import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsSubstringTest {

    @Test
    public void testNullStr() {
        assertNull(StringUtils.substring(null, 0, 2));
    }

    @Test
    public void testEmptyStr() {
        assertEquals("", StringUtils.substring("", 0, 2));
    }

    @Test
    public void testPositiveStartAndEnd() {
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
    }

    @Test
    public void testSwappedStartAndEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 0));
    }

    @Test
    public void testEndBeyondStrLength() {
        assertEquals("c", StringUtils.substring("abc", 2, 4));
    }

    @Test
    public void testStartAndEndOutOfBounds() {
        assertEquals("", StringUtils.substring("abc", 4, 6));
    }

    @Test
    public void testSameStartAndEnd() {
        assertEquals("", StringUtils.substring("abc", 2, 2));
    }

    @Test
    public void testNegativeStartAndEnd() {
        assertEquals("b", StringUtils.substring("abc", -2, -1));
    }

    @Test
    public void testNegativeStartPositiveEnd() {
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }
}