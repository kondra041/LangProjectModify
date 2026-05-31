package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtilsTest {

    @BeforeEach
    void setUp() {
        // Any setup if needed can be done here.
    }

    @Test
    void testSubstring_nullString() {
        String result = StringUtils.substring(null, 3);
        assertNull(result);
    }

    @Test
    void testSubstring_emptyString() {
        String result = StringUtils.substring("", 0);
        assertEquals("", result);
    }

    @Test
    void testSubstring_normalCase_positiveStart() {
        String result = StringUtils.substring("abc", 2);
        assertEquals("c", result);
    }

    @Test
    void testSubstring_startBeyondLength() {
        String result = StringUtils.substring("abc", 4);
        assertEquals("", result);
    }

    @Test
    void testSubstring_negativeStartPosition() {
        String result = StringUtils.substring("abc", -2);
        assertEquals("bc", result);
    }

    @Test
    void testSubstring_startNegativeBeyondLength() {
        String result = StringUtils.substring("abc", -4);
        assertEquals("abc", result);
    }
}