package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testStrip_nullInput() {
        String result = StringUtils.strip(null, "*");
        assertNull(result);
    }

    @Test
    public void testStrip_emptyStringInput() {
        String result = StringUtils.strip("", "*");
        assertEquals("", result);
    }

    @Test
    public void testStrip_nonNullStringNoCharactersToStrip() {
        String result = StringUtils.strip("abc", null);
        assertEquals("abc", result);
    }

    @Test
    public void testStrip_stringWithLeadingWhitespace() {
        String result = StringUtils.strip("  abc", null);
        assertEquals("abc", result);
    }

    @Test
    public void testStrip_stringWithTrailingWhitespace() {
        String result = StringUtils.strip("abc  ", null);
        assertEquals("abc", result);
    }

    @Test
    public void testStrip_stringWithLeadingAndTrailingWhitespace() {
        String result = StringUtils.strip(" abc ", null);
        assertEquals("abc", result);
    }

    @Test
    public void testStrip_stringWithCharactersToStripAtEnd() {
        String result = StringUtils.strip("  abcyx", "xyz");
        assertEquals("  abc", result);
    }

    @Test
    public void testStrip_stringWithLeadingCharsToStrip() {
        String result = StringUtils.strip("*abc*", "*");
        assertEquals("abc", result);
    }

    @Test
    public void testStrip_stringWithTrailingCharsToStrip() {
        String result = StringUtils.strip("*abc*", "c*");
        assertEquals("*ab", result);
    }

    @Test
    public void testStrip_stringWithLeadingAndTrailingCharsToStrip() {
        String result = StringUtils.strip("*abc*", "*");
        assertEquals("abc", result);
    }
}