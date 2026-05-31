package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsBlankNull() {
        assertFalse(StringUtils.isBlank(null));
    }

    @Test
    public void testIsBlankEmptyString() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlankWhitespace() {
        assertTrue(StringUtils.isBlank(" "));
    }

    @Test
    public void testIsBlankNotWhitespace() {
        assertFalse(StringUtils.isBlank("bob"));
    }

    @Test
    public void testIsBlankTrimmedString() {
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testToStringByteArrayDefaultCharset() throws Exception {
        byte[] bytes = "Hello, World!".getBytes();
        String string = StringUtils.toString(bytes);
        assertEquals("Hello, World!", string);
    }

    @Test
    public void testToStringByteArrayCustomCharset() throws Exception {
        byte[] bytes = "Hello, World!".getBytes();
        String charsetName = "UTF-8";
        String string = StringUtils.toString(bytes, charsetName);
        assertEquals("Hello, World!", string);
    }

    // Add more tests for other methods in StringUtils class
}