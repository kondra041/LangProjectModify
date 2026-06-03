package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsBlank_Null_ReturnsTrue() {
        boolean result = StringUtils.isBlank(null);
        assertTrue(result);
    }

    @Test
    public void testIsBlank_EmptyString_ReturnsTrue() {
        boolean result = StringUtils.isBlank("");
        assertTrue(result);
    }

    @Test
    public void testIsBlank_WhitespaceString_ReturnsTrue() {
        boolean result = StringUtils.isBlank(" ");
        assertTrue(result);
    }

    @Test
    public void testIsBlank_NonBlankString_ReturnsFalse() {
        boolean result = StringUtils.isBlank("bob");
        assertFalse(result);
    }

    @Test
    public void testIsBlank_WhitespaceWithNonBlankString_ReturnsFalse() {
        boolean result = StringUtils.isBlank("  bob  ");
        assertFalse(result);
    }
}