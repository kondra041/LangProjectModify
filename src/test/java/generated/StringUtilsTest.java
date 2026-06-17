package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testSubstringBetween() {
        // Test with null input strings
        assertNull(StringUtils.substringBetween(null, "[", "]"));
        assertNull(StringUtils.substringBetween("wx[b]yz", null, "]"));
        assertNull(StringUtils.substringBetween("wx[b]yz", "[", null));
        
        // Test with empty open/close strings
        assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
        
        // Test without match
        assertNull(StringUtils.substringBetween("yabcz", "y", "x"));
        assertNull(StringUtils.substringBetween("yabcz", "x", "z"));
        
        // Test with single match
        assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
        
        // Test with multiple matches, should return only the first one
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));

        // Additional test cases
        assertNull(StringUtils.substringBetween("", "", "]"));  // No match case
        assertNull(StringUtils.substringBetween("yabcz", "[", "z")); // Partial match case
    }
    
    @Test
    public void testToString() throws UnsupportedEncodingException {
        byte[] bytes = new byte[]{65, 66, 67}; // ASCII codes for 'A', 'B', 'C'
        
        assertEquals("ABC", StringUtils.toString(bytes, null)); // Platform default encoding
        assertEquals("ABC", StringUtils.toString(bytes, "UTF-8")); // Specific encoding
        
        assertThrows(UnsupportedEncodingException.class, () -> {
            StringUtils.toString(bytes, "UnsupportedEncoding");
        });
    }
    
    @Test
    public void testOtherMethods() {
        // Test startsWith method
        assertTrue(StringUtils.startsWith("abcde", "ab"));
        
        assertFalse(StringUtils.startsWith("abcde", "ABC"));  // Case sensitive
        
        assertNull(StringUtils.startsWith((String)null, "")); // Null input
        
        assertTrue(StringUtils.startsWith("", ""));
        
        // Test appendIfMissing
        assertEquals("prefixabc", StringUtils.appendIfMissing("abc", "prefix"));
        assertEquals("abc", StringUtils.appendIfMissing("abc", "suffix"));
        
        // Test prependIfMissing
        assertEquals("prefixabc", StringUtils.prependIfMissing("abc", "prefix"));
        assertEquals("abc", StringUtils.prependIfMissing("abc", "prefix"));
    }
}