package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringUtilsTest {

    @Test
    public void testStripAll() {
        // Test case where input is null
        assertArrayEquals(null, StringUtils.stripAll(null, "yz"));

        // Test case where input array is empty
        assertArrayEquals(new String[]{}, StringUtils.stripAll(new String[]{}, "yz"));

        // Test case where stripChars is null, treated as whitespace
        assertArrayEquals(new String[]{"abc", "abc"}, StringUtils.stripAll(new String[]{"abc", "  abc"}, null));

        // Test case with normal input
        assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(new String[]{"abc  ", null}, "yz"));

        // Test case where characters to strip are present
        assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(new String[]{"yabcz", null}, "yz"));
    }
}