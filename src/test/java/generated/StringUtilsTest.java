package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testCapitalize() {
        assertEquals(null, StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Cat", StringUtils.capitalize("cat"));
        assertEquals("CAt", StringUtils.capitalize("cAt"));
    }

    @Test
    public void testToStringWithCharsetName() throws UnsupportedEncodingException {
        byte[] bytes = "test".getBytes(StandardCharsets.UTF_8);
        assertEquals("test", StringUtils.toString(bytes, StandardCharsets.UTF_8.name()));
    }
}