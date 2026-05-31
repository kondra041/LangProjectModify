import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.StringUtils;

class StripTest {

    @Test
    void testNull() {
        assertNull(StringUtils.strip(null, "test"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringUtils.strip("", "test"));
    }

    @Test
    void testStripWhitespace() {
        assertEquals("abc", StringUtils.strip("   abc   ", null));
    }

    @Test
    void testCustomCharsBothSides() {
        String str = "xabcx";
        String expected = "abc";
        assertEquals(expected, StringUtils.strip(str, "x"));
    }

    @Test
    void testCustomCharsOnlyLeading() {
        String str = "xabcy";
        String expected = "abcy";
        assertEquals(expected, StringUtils.strip(str, "x"));
    }

    @Test
    void testCustomCharsOnlyTrailing() {
        String str = "abcx";
        String expected = "abc";
        assertEquals(expected, StringUtils.strip(str, "x"));
    }

    @Test
    void testNoChange() {
        String str = "abcdef";
        String stripChars = "xyz";
        assertEquals(str, StringUtils.strip(str, stripChars));
    }

    @Test
    void testEmptyStripChars() {
        String str = "  abc  ";
        assertEquals("  abc  ", StringUtils.strip(str, ""));
    }

    @Test
    void testMultipleCharsStripped() {
        String str = "yxabcxy";
        String expected = "abc";
        assertEquals(expected, StringUtils.strip(str, "xy"));
    }
}