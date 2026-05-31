package generated;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StringUtilsTest {

    @Test
    public void testToString() throws UnsupportedEncodingException {
        byte[] bytes = "Hello, World!".getBytes();
        String result = StringUtils.toString(bytes, "UTF-8");
        assertEquals("Hello, World!", result);
    }

    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, null));
        assertEquals("", StringUtils.stripEnd("", null));
        assertEquals("abc", StringUtils.stripEnd("abc", null));
        assertEquals("  abc", StringUtils.stripEnd("  abc", null));
        assertEquals("abc  ", StringUtils.stripEnd("abc  ", null));
        assertEquals(" abc ", StringUtils.stripEnd(" abc ", null));
        assertEquals("  abcyx", StringUtils.stripEnd("  abcyx", "xyz"));
        assertEquals("120.00", StringUtils.stripEnd("120.00", ".0"));
    }
}