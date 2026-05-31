package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", null));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testJoin() {
        assertEquals("a,b,c", StringUtils.join(new String[]{"a", "b", "c"}, ','));
    }

    @Test
    public void testSplit() {
        String[] result = StringUtils.split("a,b,c");
        assertArrayEquals(new String[]{"a", "b", "c"}, result);
    }

    @Test
    public void testSubstring() {
        assertEquals("bc", StringUtils.substring("abc", 1));
    }

    @Test
    public void testTrim() {
        assertEquals("abc", StringUtils.trim(" abc "));
    }
}