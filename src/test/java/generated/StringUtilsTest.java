package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsStripStartTest {

    @Test
    void testStripStartNull() {
        assertNull(StringUtils.stripStart(null, "abc"));
    }

    @Test
    void testStripStartEmpty() {
        assertEquals("", StringUtils.stripStart("", "abc"));
    }

    @Test
    void testStripStartNormal() {
        assertEquals("abc", StringUtils.stripStart("abc", ""));
    }

    @Test
    void testStripStartWhitespace() {
        assertEquals("abc", StringUtils.stripStart("  abc", null));
    }

    @Test
    void testStripStartNonWhitespace() {
        assertEquals("bc", StringUtils.stripStart("xabc", "a"));
    }

}