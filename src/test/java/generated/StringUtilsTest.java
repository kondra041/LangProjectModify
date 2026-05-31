package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.CharSet;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.SystemUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testSubstring() {
        // Test null input
        assertNull(StringUtils.substring(null, 0, 1));

        // Test empty string
        assertEquals("", StringUtils.substring("", 0, 1));
        
        // Test normal substring extraction
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("c", StringUtils.substring("abc", 2, 4));
        assertEquals("", StringUtils.substring("abc", 2, 2));

        // Test negative start and end positions
        assertEquals("b", StringUtils.substring("abc", -2, -1));
        
        // Test when start > end
        assertEquals("", StringUtils.substring("abc", 2, 0));
    }
    
    @Test
    void testToString() {
        byte[] bytes = "Hello World".getBytes(StandardCharsets.UTF_8);
        try {
            String result = StringUtils.toString(bytes, "UTF-8");
            assertEquals("Hello World", result);
            
            // Test with null charset name (uses platform default)
            String defaultResult = StringUtils.toString(bytes, null);
            assertEquals(new String(bytes), defaultResult);
        } catch (UnsupportedEncodingException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testAppendIfMissing() {
        // Test prepend if missing with one prefix
        assertEquals("xyzabc", StringUtils.prependIfMissing("abc", "xyz"));
        
        // Test prepend if missing with multiple prefixes
        assertEquals("xyzabc", StringUtils.prependIfMissing("abc", "mno", new String[]{"xyz"}));
    }

}