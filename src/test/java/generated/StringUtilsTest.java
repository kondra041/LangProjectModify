package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testIsBlankWithEmptyString() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    public void testIsBlankWithNonWhitespaceCharacters() {
        assertFalse(StringUtils.isBlank("abc123!@#"));
    }
}