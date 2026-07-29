package generated;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.lang3.StringUtils;

import org.junit.jupiter.api.Test;

class StringUtilsIsBlankTest {

    @Test
    void testIsBlankNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    void testIsBlankEmptyString() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    void testIsBlankWhitespaceString() {
        assertTrue(StringUtils.isBlank(" "));
    }

    @Test
    void testIsNotBlankNonWhitespaceString() {
        assertFalse(StringUtils.isBlank("bob"));
    }

    @Test
    void testIsNotBlankWhitespaceSurroundedString() {
        assertFalse(StringUtils.isBlank("  bob  "));
    }
}