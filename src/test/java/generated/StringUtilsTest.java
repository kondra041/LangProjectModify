package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testStripNullInput() {
        assertNull(StringUtils.strip(null, null));
    }

    @Test
    public void testStripEmptyString() {
        assertEquals("", StringUtils.strip("", null));
    }

    @Test
    public void testStripNoCharsToRemove() {
        assertEquals("abc", StringUtils.strip("abc", null));
    }

    @Test
    public void testStripLeadingWhitespace() {
        assertEquals("abc", StringUtils.strip("  abc", null));
    }

    @Test
    public void testStripTrailingWhitespace() {
        assertEquals("abc", StringUtils.strip("abc  ", null));
    }

    @Test
    public void testStripSurroundingWhitespace() {
        assertEquals("abc", StringUtils.strip(" abc ", null));
    }

    @Test
    public void testStripCustomChars() {
        assertEquals("  abc", StringUtils.strip("  abcyx", "xyz"));
    }
}