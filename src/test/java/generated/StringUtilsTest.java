import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testStripStart() {
        assertEquals("abc", StringUtils.stripStart("abc", null));
        assertEquals("abc", StringUtils.stripStart("  abc", null));
        assertEquals("abc  ", StringUtils.stripStart("abc  ", null));
        assertEquals("abc ", StringUtils.stripStart(" abc ", null));
        assertEquals("abc  ", StringUtils.stripStart("yxabc  ", "xyz"));
    }

    @Test
    public void testToString_ByteArray() throws UnsupportedEncodingException {
        byte[] bytes = "test".getBytes(StandardCharsets.UTF_8);
        assertEquals("test", StringUtils.toString(bytes, StandardCharsets.UTF_8.name()));
    }
}