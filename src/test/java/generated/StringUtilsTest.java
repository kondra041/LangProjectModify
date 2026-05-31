package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testStripEnd_NullInput_ReturnsNull() {
        assertNull(StringUtils.stripEnd(null, null));
    }

    @Test
    public void testStripEnd_EmptyString_ReturnsEmptyString() {
        assertEquals("", StringUtils.stripEnd("", null));
    }

    @Test
    public void testStripEnd_NoStripChars_ReturnsOriginalString() {
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
    }

    @Test
    public void testStripEnd_NullStripChars_StripsWhitespace() {
        assertEquals("  abc", StringUtils.stripEnd("  abc", null));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals(" abc", StringUtils.stripEnd(" abc ", null));
    }

    @Test
    public void testStripEnd_CustomStripChars() {
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
        assertEquals("12", StringUtils.stripEnd("120.00", ".0"));
    }
}