package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testStripStartNullInput() {
        assertNull(StringUtils.stripStart(null, "x"));
    }

    @Test
    public void testStripStartEmptyString() {
        assertEquals("", StringUtils.stripStart("", "x"));
    }

    @Test
    public void testStripStartNoStripChars() {
        assertEquals("abc", StringUtils.stripStart("abc", null));
        assertEquals("abc", StringUtils.stripStart("abc", ""));
    }

    @Test
    public void testStripStartWhitespaceOnly() {
        assertEquals("abc", StringUtils.stripStart("  abc", null));
        assertEquals("abc", StringUtils.stripStart("  abc", ""));
    }

    @Test
    public void testStripStartWithStripChars() {
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }
}