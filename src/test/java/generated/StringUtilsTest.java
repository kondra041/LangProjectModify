import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;

class substringBetweenTest {
    
    @Test
    void nullInputsReturnNull() {
        // Any of str, open, or close is null should return null
        assertNull(StringUtils.substringBetween(null, "open", "close"));
        assertNull(StringUtils.substringBetween("string", null, "close"));
        assertNull(StringUtils.substringBetween("string", "open", null));
    }

    @Test
    void emptyStrings() {
        // str is empty
        assertEquals("", StringUtils.substringBetween("", "", ""));
        assertNull(StringUtils.substringBetween("", "a", "b"));

        // open or close is empty
        assertEquals("", StringUtils.substringBetween("test", "", ""));
        assertEquals("", StringUtils.substringBetween("abc", "", "c"));
    }

    @Test
    void noMatchFound() {
        // Open not found after start
        assertNull(StringUtils.substringBetween("text", "notfound", "]"));
        
        // Close not found after open
        assertNull(StringUtils.substringBetween("onlyopen", "[", "]"));
    }

    @Test
    void firstOccurrenceOnly() {
        // Only the first occurrence should be considered
        assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
        assertEquals("", StringUtils.substringBetween("yabczyabcz", "y", ""));
    }

    @Test
    void edgeCases() {
        // Substring is empty between delimiters
        assertEquals("", StringUtils.substringBetween("[[]]", "[", "]"));
        
        // Delimiters are at start and end of string
        assertEquals("content", StringUtils.substringBetween("[content]", "[", "]"));
        
        // Multiple possible matches but only first is taken
        assertEquals("a", StringUtils.substringBetween("xaybz", "x", "y"));
    }
}