package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsBlankNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    public void testIsBlankEmptyString() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlankWhitespaceString() {
        assertTrue(StringUtils.isBlank(" "));
    }

    @Test
    public void testIsBlankNonWhitespaceString() {
        assertFalse(StringUtils.isBlank("bob"));
    }

    @Test
    public void testIsBlankTrimmedNonWhitespaceString() {
        assertFalse(StringUtils.isBlank("  bob  "));
    }
}