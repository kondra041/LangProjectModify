package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testStripEnd() {
        // Test cases for null input string
        assertNull(StringUtils.stripEnd(null, "abc"));
        
        // Test case for empty string
        assertEquals("", StringUtils.stripEnd("", "abc"));
        
        // Test case where stripChars is null and whitespace needs to be stripped
        assertEquals("abc", StringUtils.stripEnd("  abc ", null));
        
        // Test case with specific characters to strip from end
        assertEquals("120", StringUtils.stripEnd("120.00", ".0"));
        
        // Additional test cases with different scenarios
        assertEquals("abc  ", StringUtils.stripEnd("abc  ", "xyz"));
        assertEquals("  abcyx", StringUtils.stripEnd("  abcyx", "xyz"));
    }

    @Test
    public void testStripEndWithEmptyStringInParams() {
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
        assertEquals("", StringUtils.stripEnd("", ""));
    }
    
    @Test
    public void testStripEndNoChangesRequired() {
        assertEquals("  abc ", StringUtils.stripEnd("  abc ", "xyz"));
    }

    @Test
    public void testStripEndWithNonExistingCharsInString() {
        // The method should return the original string if no matching characters are found at the end.
        String input = "abc";
        String charsToStrip = "xy";
        assertEquals(input, StringUtils.stripEnd(input, charsToStrip));
    }

}