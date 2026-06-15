import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StringUtilsIsBlankTest {

    @ParameterizedTest
    @MethodSource("provideNullEmptyStrings")
    public void shouldReturnTrueForNullOrEmpty(String input) {
        boolean result = StringUtils.isBlank(input);
        assertTrue(result);
    }

    static String[] provideNullEmptyStrings() {
        return new String[] { null, "" };
    }

    @ParameterizedTest
    @MethodSource("provideWhitespaceStrings")
    public void shouldReturnTrueForAllWhitespace(String input) {
        boolean result = StringUtils.isBlank(input);
        assertTrue(result);
    }

    static String[] provideWhitespaceStrings() {
        return new String[] { "   ", "\t\n  ", "   " };
    }

    @ParameterizedTest
    @MethodSource("provideNonBlankStrings")
    public void shouldReturnFalseForNonBlank(String input) {
        boolean result = StringUtils.isBlank(input);
        assertFalse(result);
    }

    static String[] provideNonBlankStrings() {
        return new String[] { "a", "  a ", "! " };
    }

    @Test
    public void testWithMixOfWhitespacesAndNonBlanks() {
        String input = "   a\nb ";
        boolean result = StringUtils.isBlank(input);
        assertFalse(result);
    }

    @Test
    public void testEmptyStringIsBlank() {
        boolean result = StringUtils.isBlank("");
        assertTrue(result);
    }

    @Test
    public void testNullInputIsBlank() {
        boolean result = StringUtils.isBlank(null);
        assertTrue(result);
    }
}