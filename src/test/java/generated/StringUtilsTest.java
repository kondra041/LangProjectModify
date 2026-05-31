package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

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
    public void testIsBlankWhitespaceOnly() {
        assertTrue(StringUtils.isBlank(" "));
    }

    @Test
    public void testIsBlankNonWhitespace() {
        assertFalse(StringUtils.isBlank("bob"));
    }

    @Test
    public void testIsBlankTrimmedNonWhitespace() {
        assertFalse(StringUtils.isBlank("  bob  "));
    }
}