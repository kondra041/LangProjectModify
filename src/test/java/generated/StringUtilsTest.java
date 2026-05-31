package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsStripAllTest {

    @ParameterizedTest
    @CsvSource({
        "null, null",
        "[] , []",
        "[\"abc\", \"  abc\"], null, [\"abc\", \"abc\"]",
        "[\"abc  \", null], null, [\"abc\", null]",
        "[\"abc  \", null], yz, [\"abc  \", null]",
        "[\"yabcz\", null], yz, [\"abc\", null]"
    })
    public void testStripAll(String[] strsStr, String stripChars, String[] expected) {
        // Convert the string array representation to actual String[]
        String[] strs = (String[]) convertArray(strsStr);

        // Call the method under test
        String[] result = StringUtils.stripAll(strs, stripChars);

        // Assert the result
        assertArrayEquals(expected, result);
    }

    @Test
    public void testStripAllWithNullInput() {
        assertNull(StringUtils.stripAll(null, "abc"));
    }

    private Object convertArray(String arrayStr) {
        if (arrayStr == null || arrayStr.equals("[]")) {
            return new String[0];
        }
        // Remove brackets and split by comma
        String[] elements = arrayStr.substring(1, arrayStr.length() - 1).split(", ");
        return elements;
    }
}