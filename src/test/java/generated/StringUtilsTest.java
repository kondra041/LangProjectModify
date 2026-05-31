package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {

    @BeforeEach
    public void setUp() {
        // Setup code if needed
    }

    @Test
    public void testStripStart_NullInput() {
        assertNull(StringUtils.stripStart(null, "xyz"));
    }

    @Test
    public void testStripStart_EmptyString() {
        assertEquals("", StringUtils.stripStart("", "xyz"));
    }

    @Test
    public void testStripStart_NoStripChars() {
        assertEquals("abc", StringUtils.stripStart("abc", null));
    }

    @Test
    public void testStripStart_WhitespaceAsStripChars() {
        assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
    }

    @Test
    public void testStripStart_CustomStripChars() {
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }
}