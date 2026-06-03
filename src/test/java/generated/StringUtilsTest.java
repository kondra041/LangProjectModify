package generated;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.CharSequenceUtils;
import org.junit.jupiter.api.Test;

class CharSequenceUtilsTest {

    @Test
    void testIsBlankWithNull() {
        assertTrue(CharSequenceUtils.isBlank(null), "Expected isBlank to return true for null input");
    }

    @Test
    void testIsBlankWithEmptyString() {
        assertTrue(CharSequenceUtils.isBlank(""), "Expected isBlank to return true for empty string");
    }

    @Test
    void testIsBlankWithSingleSpace() {
        assertTrue(CharSequenceUtils.isBlank(" "), "Expected isBlank to return true for a single space");
    }

    @Test
    void testIsNotBlankWithNonWhitespaceString() {
        assertFalse(CharSequenceUtils.isBlank("bob"), "Expected isBlank to return false for non-whitespace string 'bob'");
    }

    @Test
    void testIsNotBlankWithWhitespacesAroundText() {
        assertFalse(CharSequenceUtils.isBlank("  bob  "), "Expected isBlank to return false for string with whitespaces around text");
    }
}