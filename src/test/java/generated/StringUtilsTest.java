import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {
    @org.junit.jupiter.api.Test
    void testBlankWhenNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @org.junit.jupiter.api.Test
    void testBlankWhenEmpty() {
        assertTrue(StringUtils.isBlank(""));
    }

    @org.junit.jupiter.api.Test
    void testBlankWithOnlySpaces() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @org.junit.jupiter.api.Test
    void testBlankWithTabAndNewline() {
        assertTrue(StringUtils.isBlank("\t\n"));
    }

    @org.junit.jupiter.api.Test
    void testNotBlankWithNonWhitespace() {
        assertFalse(StringUtils.isBlank("a"));
        assertFalse(StringUtils.isBlank(" a "));
        assertFalse(StringUtils.isBlank("abc def"));
    }
}