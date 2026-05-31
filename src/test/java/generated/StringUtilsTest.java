package generated;

import org.apache.commons.lang3.StringUtils;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.io.UnsupportedEncodingException;

public class StringUtilsTest {

    @org.junit.jupiter.api.Test
    public void testSubstringBetween() {
        // Test cases for substringBetween method
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        assertNull(StringUtils.substringBetween(null, "*", "*"));
        assertNull(StringUtils.substringBetween("*", null, "*"));
        assertNull(StringUtils.substringBetween("*", "*", null));
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertNull(StringUtils.substringBetween("", "", "]"));
        assertNull(StringUtils.substringBetween("", "[", "]"));
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
        assertEquals("abc", StringUtils.substringBetween("yabcz", "y", "z"));
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
    }

    @org.junit.jupiter.api.Test
    public void testToString() throws UnsupportedEncodingException {
        // Test cases for toString method
        assertNull(StringUtils.toString(null, null));
        assertNotNull(StringUtils.toString("test".getBytes(), "UTF-8"));
        assertEquals("test", StringUtils.toString("test".getBytes(), "UTF-8"));
    }

    @org.junit.jupiter.api.Test
    public void testSubstringBetweenWithNullInputs() {
        // Test cases for substringBetween method with null inputs
        assertNull(StringUtils.substringBetween(null, null, null));
        assertNull(StringUtils.substringBetween("test", null, null));
        assertNull(StringUtils.substringBetween("test", null, "end"));
        assertNull(StringUtils.substringBetween("test", "start", null));
    }

    @org.junit.jupiter.api.Test
    public void testToStringWithNullCharset() throws UnsupportedEncodingException {
        // Test cases for toString method with null charset
        assertNotNull(StringUtils.toString("test".getBytes(), null));
        assertEquals("test", StringUtils.toString("test".getBytes(), null));
    }
}