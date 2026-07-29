package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testStripWithNullString() {
        String result = StringUtils.strip(null, "abc");
        assertNull(result);
    }

    @Test
    public void testStripWithEmptyString() {
        String result = StringUtils.strip("", "abc");
        assertEquals("", result);
    }

    @Test
    public void testStripWithoutStripChars() {
        String result = StringUtils.strip("  abc  ", null);
        assertEquals("abc", result);
    }

    @Test
    public void testStripWithWhitespaceStripChars() {
        String result = StringUtils.strip("  abc  ", " ");
        assertEquals("abc", result);
    }

    @Test
    public void testStripWithCustomStripChars() {
        String result = StringUtils.strip("  abcyx", "xyz");
        assertEquals("  abc", result);
    }
}