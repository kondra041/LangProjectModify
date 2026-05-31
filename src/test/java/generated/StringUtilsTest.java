package generated;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsStripStartTest {

    @Test
    public void testStripStartNullString() {
        // Given
        String input = null;

        // When & Then
        assertNull(StringUtils.stripStart(input, "xyz"));
    }

    @Test
    public void testStripStartEmptyString() {
        // Given
        String input = "";

        // When & Then
        assertEquals("", StringUtils.stripStart(input, "xyz"));
    }

    @Test
    public void testStripStartNoMatch() {
        // Given
        String input = "abc";

        // When & Then
        assertEquals("abc", StringUtils.stripStart(input, "xyz"));
    }

    @Test
    public void testStripStartNullStripChars() {
        // Given
        String input = "  abc";
        
        // When
        String result = StringUtils.stripStart(input, null);

        // Then
        assertEquals("abc", result);
    }

    @Test
    public void testStripStartSpacesOnly() {
        // Given
        String input = "   ";
        
        // When & Then
        assertEquals("", StringUtils.stripStart(input, null));
    }

    @Test
    public void testStripStartNoWhitespaceMatchNullCharSet() {
        // Given
        String input = "abc  ";

        // When & Then
        assertEquals("abc  ", StringUtils.stripStart(input, null));
    }
    
    @Test
    public void testStripStartWithChars() {
        // Given
        String input = "yxabc  ";
        
        // When
        String result = StringUtils.stripStart(input, "xyz");

        // Then
        assertEquals("abc  ", result);
    }

    @Test
    public void testStripStartEmptyCharSet() {
        // Given
        String input = " abc ";

        // When & Then
        assertEquals(" abc ", StringUtils.stripStart(input, ""));
    }
}