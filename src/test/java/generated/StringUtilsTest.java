package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtilsStripAllTest {

    @Test
    void testStripAllWithNullArray() {
        String[] result = StringUtils.stripAll(null, " ");
        assertNull(result);
    }

    @Test
    void testStripAllWithEmptyArray() {
        String[] input = {};
        String[] result = StringUtils.stripAll(input, " ");
        assertEquals(Arrays.toString(input), Arrays.toString(result));
    }

    @Test
    void testStripAllWithValidCharactersAndNullStripChars() {
        String[] input = {"abc", "  abc"};
        String[] expected = {"abc", "abc"};
        String[] result = StringUtils.stripAll(input, null);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void testStripAllWithValidCharactersAndNullEntry() {
        String[] input = {"abc  ", null};
        String[] expected = {"abc", null};
        String[] result = StringUtils.stripAll(input, null);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void testStripAllWithNoMatchingStripChars() {
        String[] input = {"abc  ", null};
        String[] expected = {"abc  ", null};
        String[] result = StringUtils.stripAll(input, "yz");
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void testStripAllWithValidStripChars() {
        String[] input = {"yabcz", null};
        String[] expected = {"abc", null};
        String[] result = StringUtils.stripAll(input, "yz");
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
}