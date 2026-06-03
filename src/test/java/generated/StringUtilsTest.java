import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class StringUtilsTest {
    
    @Test
    void isBlank_ShouldReturnTrueForNull() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    void isBlank_ShouldReturnTrueForEmptyString() {
        assertTrue(StringUtils.isBlank(""));
    }

    @Test
    void isBlank_ShouldReturnTrueForAllWhitespace() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    void isBlank_ShouldReturnFalseForNonWhitespaceString() {
        assertFalse(StringUtils.isBlank("bob"));
    }

    @Test
    void isBlank_ShouldReturnFalseForMixedWithNonWhitespace() {
        assertFalse(StringUtils.isBlank("  bob  "));
    }
}