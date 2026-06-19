package generated;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testStrip() {
        assertEquals(null, StringUtils.strip(null, null));
        assertEquals("", StringUtils.strip("", null));
        assertEquals("abc", StringUtils.strip("abc", null));
        assertEquals("abc", StringUtils.strip("  abc", null));
        assertEquals("abc", StringUtils.strip("abc  ", null));
        assertEquals("abc", StringUtils.strip(" abc ", null));
        assertEquals("abc", StringUtils.strip("  abcyx", "xyz"));
    }

    @Test
    public void testStripWithChars() {
        String str = "  \tHello, World! \r\n";
        String stripChars = " \t\r\n";
        assertEquals("Hello, World!", StringUtils.strip(str, stripChars));
    }

    @Test
    public void testStripEmptyString() {
        assertEquals("", StringUtils.strip("", " "));
    }
}