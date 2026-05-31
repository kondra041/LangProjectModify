import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.InjectMocks;

public class StringUtilsSubstringTest {

    @Mock
    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        // Since we're testing a static method, mocking might not be necessary here.
        // However, if using mocks for dependencies, initialize them here.
    }

    @Test
    void testNullInput() {
        String result = StringUtils.substring(null, 0, 2);
        assertNull(result);
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringUtils.substring("", 0, 2));
    }

    @Test
    void testPositiveIndicesWithinBounds() {
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("cd", StringUtils.substring("abcd", 2, 4));
        assertEquals("xyz", StringUtils.substring("abcdefg", 2, 5));
    }

    @Test
    void testNegativeIndices() {
        // Test case: start = -2 (second character), end = -1 (second to last)
        assertEquals("b", StringUtils.substring("abc", -2, -1));

        // Test case: start = -4 (start of string if length is 4), end = 2
        String testStr = "abcd";
        assertEquals("ab", StringUtils.substring(testStr, -4, 2));
    }

    @Test
    void testStartGreaterThanEnd() {
        assertEquals("", StringUtils.substring("abcde", 3, 1));
    }

    @Test
    void testEndBeyondStringLength() {
        String testStr = "abcdef";
        // end index is beyond length (6), should return substring up to the last character
        assertEquals("abcdef", StringUtils.substring(testStr, 0, 7));
        // start negative beyond string length, adjusted to 0
        assertEquals("abcdef", StringUtils.substring(testStr, -10, testStr.length()));
    }

    @Test
    void testBothNegativeIndices() {
        String testStr = "abc";
        assertEquals("a", StringUtils.substring(testStr, -3, -2));
        assertEquals("", StringUtils.substring(testStr, -3, 0));
    }

    @Test
    void testEdgeCases() {
        // Test case: start equals end
        assertEquals("", StringUtils.substring("abcd", 2, 2));

        // Test when start is negative and within bounds after adjustment
        String testStr = "abcdefgh";
        assertEquals("gh", StringUtils.substring(testStr, -2, -1));
    }

    @Test
    void testInvalidIndices() {
        // After adjustment, start could be less than zero?
        String testStr = "abc";
        assertEquals("a", StringUtils.substring(testStr, -5, 1)); // start adjusted to 0

        // end is negative and beyond the string length (e.g., end=-10)
        assertEquals("", StringUtils.substring(testStr, -4, -10));
    }
}