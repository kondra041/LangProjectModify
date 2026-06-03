package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.CharSequenceWrapper;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StringUtilsTest {

    @Test
    public void testIsBlank() {
        // Test with null input
        assertTrue(StringUtils.isBlank(null));

        // Test with empty string
        assertTrue(StringUtils.isBlank(""));

        // Test with only whitespace characters
        assertTrue(StringUtils.isBlank(" "));
        assertTrue(StringUtils.isBlank("\t"));
        assertTrue(StringUtils.isBlank("\n"));
        assertTrue(StringUtils.isBlank("\r"));
        assertTrue(StringUtils.isBlank("\f"));
        assertTrue(StringUtils.isBlank("\b"));

        // Test with non-whitespace character
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));

        // Test with mixed whitespace and non-whitespace characters
        assertFalse(StringUtils.isBlank(" a "));
        assertFalse(StringUtils.isBlank("\tabc\n"));
    }

    @Test
    public void testIsBlankWithCharSequenceWrapper() {
        CharSequenceWrapper wrapper = new CharSequenceWrapper();
        when(wrapper.length()).thenReturn(0);
        assertTrue(StringUtils.isBlank(wrapper));

        reset(wrapper);
        when(wrapper.charAt(anyInt())).thenAnswer(invocation -> ' ');
        assertTrue(StringUtils.isBlank(wrapper));
        
        reset(wrapper);
        when(wrapper.charAt(anyInt())).thenAnswer(invocation -> 'a');
        assertFalse(StringUtils.isBlank(wrapper));
    }

    @Test
    public void testToStringWithByteArray() {
        try {
            assertEquals("", StringUtils.toString(new byte[]{}, StandardCharsets.UTF_8.name()));
            
            // Test with non-null charset name and valid input bytes
            String expected = new String("hello".getBytes(StandardCharsets.US_ASCII), "US-ASCII");
            assertEquals(expected, StringUtils.toString("hello".getBytes(), "US-ASCII"));
        } catch (UnsupportedEncodingException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

}