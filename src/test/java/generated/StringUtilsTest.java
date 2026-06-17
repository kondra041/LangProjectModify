package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsBlank_Null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    public void testIsBlank_EmptyString() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    public void testIsBlank_WhitespaceOnly() {
        assertTrue(StringUtils.isBlank(" "));
    }

    @Test
    public void testIsBlank_NotBlank() {
        assertFalse(StringUtils.isBlank("bob"));
    }

    @Test
    public void testIsBlank_WithSpaces() {
        assertFalse(StringUtils.isBlank("  bob  "));
    }
}