package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testStripAllWithNullInput() {
        assertArrayEquals(null, StringUtils.stripAll(null, null));
    }

    @Test
    public void testStripAllWithEmptyArray() {
        String[] result = StringUtils.stripAll(new String[]{}, "yz");
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testStripAllWithNullElement() {
        String[] input = new String[]{"abc  ", null};
        String[] result = StringUtils.stripAll(input, null);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("abc", result[0]);
        assertNull(result[1]);
    }

    @Test
    public void testStripAllWithEmptyString() {
        String[] input = new String[]{"abc  ", "yzabc"};
        String[] result = StringUtils.stripAll(input, "yz");
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("abc", result[0]);
        assertEquals("abc", result[1]);
    }

    @Test
    public void testStripAllWithWhitespaces() {
        String[] input = new String[]{"  abc  ", "\tdef\t"};
        String[] result = StringUtils.stripAll(input, null);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals("abc", result[0]);
        assertEquals("def", result[1]);
    }
}