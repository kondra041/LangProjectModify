package generated;

import org.apache.commons.lang3.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testToString() {
        byte[] bytes = "Hello, World!".getBytes();
        try {
            assertEquals("Hello, World!", StringUtils.toString(bytes));
            assertEquals("Hello, World!", StringUtils.toString(bytes, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            fail("Unsupported encoding exception should not be thrown");
        }
    }

    @Test
    void testRemoveStart() {
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("abc", StringUtils.removeStart("abc", ""));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
    }
}