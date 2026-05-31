package generated;

import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsSubstringTest {

    private final String testString = "abc";

    @BeforeEach
    void setUp() {
        // Setup can be expanded if needed, but currently it's not necessary for this test.
    }

    @Test
    void substringWithPositiveStartAndEnd() {
        assertEquals("ab", StringUtils.substring(testString, 0, 2));
    }

    @Test
    void substringWithStartGreaterThanEnd() {
        assertEquals("", StringUtils.substring(testString, 2, 0));
    }

    @Test
    void substringWithinBoundsButReverseOrder() {
        assertEquals("", StringUtils.substring(testString, 4, 6));
    }

    @Test
    void exactStartPositionToEnd() {
        assertEquals("", StringUtils.substring(testString, 2, 2));
    }

    @Test
    void substringWithNegativeIndices() {
        assertEquals("b", StringUtils.substring(testString, -2, -1));
    }

    @Test
    void substringWithStartNegativeAndEndPositive() {
        assertEquals("ab", StringUtils.substring(testString, -4, 2));
    }

    @Test
    void nullInputShouldReturnNull() {
        assertEquals(null, StringUtils.substring((String) null, 0, 2));
    }
}