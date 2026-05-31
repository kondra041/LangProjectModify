package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testStripAll() {
        // Test with null array input
        String[] result = StringUtils.stripAll(null, " ");
        assertEquals(null, result);

        // Test with empty array input
        result = StringUtils.stripAll(new String[]{}, " ");
        assertArrayEquals(new String[]{}, result);

        // Test with mixed inputs and strip characters
        result = StringUtils.stripAll(new String[]{"abc  ", null}, null);
        assertArrayEquals(new String[]{"abc", null}, result);

        // Test with specified strip characters
        result = StringUtils.stripAll(new String[]{"yabcz", null, " xyz"}, "yz");
        assertArrayEquals(new String[]{"abcz", null, " abc"}, result);

        // Test with whitespace stripping only
        result = StringUtils.stripAll(new String[]{"   hello   ", "\tworld\t"}, null);
        assertArrayEquals(new String[]{"hello", "world"}, result);

        // Test with empty string in array
        result = StringUtils.stripAll(new String[]{""}, null);
        assertArrayEquals(new String[]{""}, result);  // Empty strings should remain unchanged

        // Test with characters that are not in stripChars
        result = StringUtils.stripAll(new String[]{"123abc"}, "456");
        assertArrayEquals(new String[]{"123abc"}, result);

        // Test with null string entries in array
        result = StringUtils.stripAll(new String[]{null, "", "  test  ", "data"}, null);
        assertArrayEquals(new String[]{null, "", "test", "data"}, result);
    }
}