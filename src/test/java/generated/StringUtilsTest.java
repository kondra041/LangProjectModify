package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTests {

    @Test
    public void testStripEndWithNullInput() {
        String result = StringUtils.stripEnd(null, "xyz");
        assertNull(result);
    }

    @Test
    public void testStripEndWithEmptyString() {
        String result = StringUtils.stripEnd("", "xyz");
        assertEquals("", result);
    }

    @Test
    public void testStripEndWithoutStripChars() {
        String result = StringUtils.stripEnd("abc", null);
        assertEquals("abc", result);
    }

    @Test
    public void testStripEndWithWhitespaceStripChars() {
        String result = StringUtils.stripEnd("  abc  ", null);
        assertEquals("  abc", result);
    }

    @Test
    public void testStripEndWithSpecifiedStripChars() {
        String result = StringUtils.stripEnd("abcxyz", "xyz");
        assertEquals("abc", result);
    }

    @Test
    public void testStripEndWithMultipleStripChars() {
        String result = StringUtils.stripEnd("120.00", ".0");
        assertEquals("12", result);
    }
}