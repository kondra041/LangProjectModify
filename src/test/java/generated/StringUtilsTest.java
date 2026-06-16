package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testToString() {
        String result = StringUtils.toString("Hello".getBytes(), "UTF-8");
        assertNotNull(result);
        assertEquals("Hello", result);
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty(null));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsNull() {
        assertTrue(StringUtils.isNull(null));
        assertFalse(StringUtils.isNull("abc"));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank(null));
        assertTrue(StringUtils.isNotBlank("abc"));
    }

    @Test
    public void testTrim() {
        String result = StringUtils.trim("  abc  ");
        assertEquals("abc", result);
    }

    @Test
    public void testNullToEmptyString() {
        assertEquals("", StringUtils.nullToEmpty(null));
        assertEquals("abc", StringUtils.nullToEmpty("abc"));
    }

    @Test
    public void testCapitalize() {
        String result = StringUtils.capitalize("cat");
        assertEquals("Cat", result);
    }

    @Test
    public void testUncapitalize() {
        String result = StringUtils.uncapitalize("Cat");
        assertEquals("cat", result);
    }

    @Test
    public void testHasLength() {
        assertTrue(StringUtils.hasLength("abc"));
        assertFalse(StringUtils.hasLength(""));
        assertFalse(StringUtils.hasLength(null));
    }

    @Test
    public void testJoin() {
        String result = StringUtils.join("a", "b", "c");
        assertEquals("abc", result);
    }

    @Test
    public void testLeftMargin() {
        String result = StringUtils.leftMargin(5, 3);
        assertEquals("     ", result);
    }

    @Test
    public void testRightMargin() {
        String result = StringUtils.rightMargin(5, 3);
        assertEquals("   ", result);
    }
}