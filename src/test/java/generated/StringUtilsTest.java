import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

class StringUtilsTest {
    @Test
    void testStripAllNullInput() {
        String[] result = StringUtils.stripAll(null, "test");
        assertNull(result);
    }

    @Test
    void testStripAllEmptyArray() {
        String[] input = new String[0];
        String[] result = StringUtils.stripAll(input, "test");
        assertTrue(Arrays.equals(new String[0], result));
    }

    @Test
    void testStripAllWithNullElement() {
        String[] input = {"abc  ", null, "   def"};
        String[] expected = {"abc", null, "def"};
        String[] actual = StringUtils.stripAll(input, null);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testStripAllStrippingWhitespace() {
        String[] input = {"   abc   ", "  def ", "ghi   "};
        String[] expected = {"abc", "def", "ghi"};
        String[] actual = StringUtils.stripAll(input, null);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testStripAllStrippingSpecifiedCharacters() {
        String[] input = {"yabcz", "xyzw", "  yyyzzzy  ", null};
        String[] expected = {"abc", "w", "yyyzzzy", null};
        String[] actual = StringUtils.stripAll(input, "yz");
        assertArrayEquals(expected, actual);
    }
}