package generated;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.StringUtils;

public class TestStripStart {
    
    @Test
    void testNullInput() {
        assertEquals(null, StringUtils.stripStart(null, "test"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringUtils.stripStart("", "test"));
    }

    @Test
    void testNoStrippingNeeded() {
        String str = "abc";
        String stripChars = "xyz";
        assertEquals("abc", StringUtils.stripStart(str, stripChars));
    }

    @Test
    void testStripWhitespace() {
        String str = "  abc";
        String expected = "abc";
        assertEquals(expected, StringUtils.stripStart(str, null));
    }

    @Test
    void testStripSpecificChars() {
        String str = "yxabc  ";
        String stripChars = "xyz";
        String expected = "abc  ";
        assertEquals(expected, StringUtils.stripStart(str, stripChars));
    }

    @Test
    void testAllLeadingStripped() {
        String str = "1234";
        String stripChars = "1234";
        String expected = "";
        assertEquals(expected, StringUtils.stripStart(str, stripChars));
    }

    @Test
    void testStripCharsIsEmpty() {
        String str = "test";
        String stripChars = "";
        assertEquals("test", StringUtils.stripStart(str, stripChars));
    }
}