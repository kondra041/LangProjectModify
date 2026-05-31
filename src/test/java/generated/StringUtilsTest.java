import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;

class generated.SubstringTest {

    @org.junit.jupiter.api.Test
    void testNullInput() {
        String result = StringUtils.substring(null, 0, 2);
        assertNull(result);
    }

    @org.junit.jupiter.api.Test
    void testEmptyString() {
        String input = "";
        String result = StringUtils.substring(input, 0, 2);
        assertEquals("", result);
    }

    @org.junit.jupiter.api.Test
    void testPositiveIndicesWithinBounds() {
        String input = "abcdef";
        assertAll(
            () -> assertEquals("ab", StringUtils.substring(input, 0, 2)),
            () -> assertEquals("bcde", StringUtils.substring(input, 1, 5)),
            () -> assertEquals("f", StringUtils.substring(input, 5, 6))
        );
    }

    @org.junit.jupiter.api.Test
    void testNegativeStart() {
        String input = "abcdef";
        assertAll(
            () -> assertEquals("bcdef", StringUtils.substring(input, -5, -1)),
            () -> assertEquals("cde", StringUtils.substring(input, -3, -0))
        );
    }

    @org.junit.jupiter.api.Test
    void testNegativeEnd() {
        String input = "abcdef";
        assertAll(
            () -> assertEquals("abcd", StringUtils.substring(input, 0, -2)),
            () -> assertEquals("abcde", StringUtils.substring(input, 1, -1))
        );
    }

    @org.junit.jupiter.api.Test
    void testStartAfterEnd() {
        String input = "abcdef";
        assertAll(
            () -> assertEquals("", StringUtils.substring(input, 4, 2)),
            () -> assertEquals("", StringUtils.substring(input, -1, -5))
        );
    }

    @org.junit.jupiter.api.Test
    void testOutOfBounds() {
        String input = "abc";
        assertAll(
            () -> assertEquals("abc", StringUtils.substring(input, 0, 10)),
            () -> assertEquals("a", StringUtils.substring(input, -4, 2)),
            () -> assertEquals("", StringUtils.substring(input, 5, 6))
        );
    }

    @org.junit.jupiter.api.Test
    void testBothNegative() {
        String input = "abc";
        assertAll(
            () -> assertEquals("b", StringUtils.substring(input, -2, -1)),
            () -> assertEquals("ab", StringUtils.substring(input, -4, -3))
        );
    }

    @org.junit.jupiter.api.Test
    void testZeroLength() {
        String input = "";
        assertAll(
            () -> assertEquals("", StringUtils.substring(input, 0, 0)),
            () -> assertEquals("", StringUtils.substring(input, -1, -2))
        );
    }

    @org.junit.jupiter.api.Test
    void testLargeStartValue() {
        String input = "abc";
        assertEquals("", StringUtils.substring(input, 5, 6));
    }

    @org.junit.jupiter.api.Test
    void testLargeEndValue() {
        String input = "abc";
        assertAll(
            () -> assertEquals("abc", StringUtils.substring(input, 0, 10)),
            () -> assertEquals("ab", StringUtils.substring(input, -2, 10))
        );
    }

    @org.junit.jupiter.api.Test
    void testStartZeroEndZero() {
        String input = "a";
        assertEquals("", StringUtils.substring(input, 0, 0));
    }

    @org.junit.jupiter.api.Test
    void testLargeNegativeIndices() {
        String input = "abcdef";
        assertAll(
            () -> assertEquals("def", StringUtils.substring(input, -3, -1)),
            () -> assertEquals("", StringUtils.substring(input, -6, -5))
        );
    }
}