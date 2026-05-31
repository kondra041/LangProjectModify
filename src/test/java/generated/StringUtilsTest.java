import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsRemoveEndTest {

    @org.junit.jupiter.api.Test
    void testNullStr() {
        // Test when source string is null
        assertNull(StringUtils.removeEnd(null, "test"), "Expected null when source string is null");
    }

    @org.junit.jupiter.api.Test
    void testNullToRemove() {
        // Test when substring to remove is null
        assertEquals("test", StringUtils.removeEnd("test", null), 
            "Expected original string when substring to remove is null");
    }

    @org.junit.jupiter.api.Test
    void testEmptyStr() {
        // Test with empty source string
        assertEquals("", StringUtils.removeEnd("", "test"), 
            "Expected empty string when source string is empty");
    }

    @org.junit.jupiter.api.Test
    void testEmptyToRemove() {
        // Test with empty substring to remove
        assertEquals("test", StringUtils.removeEnd("test", ""), 
            "Expected original string when substring to remove is empty");
    }

    @org.junit.jupiter.api.Test
    void testSubstringToEnd() {
        // Test removing substring exactly at the end
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"), 
            "Expected removal of substring from end");
    }

    @org.junit.jupiter.api.Test
    void testSubstringNotAtEnd() {
        // Test when substring is not at the end
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"),
            "Expected original string when substring is not at the end");
    }

    @org.junit.jupiter.api.Test
    void testExactMatch() {
        // Test removing entire string (exact match)
        assertEquals("", StringUtils.removeEnd("test", "test"), 
            "Expected empty string when removal matches exactly");
    }

    @org.junit.jupiter.api.Test
    void testPartialOverlap() {
        // Test when substring is longer than source string
        assertSame("abc", StringUtils.removeEnd("abc", "abcd"),
            "Expected original string when removal substring is longer");
    }
}