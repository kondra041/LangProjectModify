package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {

    @Test
    public void testStripStartNullInput() {
        assertNull(StringUtils.stripStart(null, null));
    }

    @Test
    public void testStripStartEmptyString() {
        assertEquals("", StringUtils.stripStart("", null));
    }

    @Test
    public void testStripStartNoCharsToRemove() {
        assertEquals("abc", StringUtils.stripStart("abc", null));
    }

    @Test
    public void testStripStartWhitespaceChars() {
        assertEquals("abc", StringUtils.stripStart("  abc", null));
    }

    @Test
    public void testStripStartNonWhitespaceChars() {
        assertEquals("abc  ", StringUtils.stripStart("abc  ", null));
    }

    @Test
    public void testStripStartMixedWhitespace() {
        assertEquals("abc ", StringUtils.stripStart(" abc ", null));
    }

    @Test
    public void testStripStartWithCustomChars() {
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }

    @Test
    public void testStripStartEmptyStripChars() {
        assertEquals("abc", StringUtils.stripStart("abc", ""));
    }
}