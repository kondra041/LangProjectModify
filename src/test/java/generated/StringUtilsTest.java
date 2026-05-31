package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testSubstringNullInput() {
        assertNull(StringUtils.substring(null, 0));
    }

    @Test
    public void testSubstringEmptyString() {
        assertEquals("", StringUtils.substring("", 0));
    }

    @Test
    public void testSubstringWithinBounds() {
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("c", StringUtils.substring("abc", 2));
    }

    @Test
    public void testSubstringOutsideBounds() {
        assertEquals("", StringUtils.substring("abc", 4));
    }

    @Test
    public void testSubstringNegativeStartWithinBounds() {
        assertEquals("bc", StringUtils.substring("abc", -2));
    }

    @Test
    public void testSubstringNegativeStartOutsideBounds() {
        assertEquals("abc", StringUtils.substring("abc", -4));
    }
}