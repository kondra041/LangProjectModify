package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testSubstring() {
        String result = StringUtils.substring("Hello, World!", 7, 12);
        assertEquals("World", result);
    }

    @Test
    public void testSubstringNegativeStart() {
        String result = StringUtils.substring("Hello, World!", -6, 12);
        assertEquals("World", result);
    }

    @Test
    public void testSubstringNegativeEnd() {
        String result = StringUtils.substring("Hello, World!", 7, -3);
        assertEquals("", result);
    }

    @Test
    public void testSubstringOutsideRange() {
        String result = StringUtils.substring("Hello, World!", 17, 12);
        assertEquals("", result);
    }

    @Test
    public void testSubstringNullInput() {
        String result = StringUtils.substring(null, 7, 12);
        assertEquals(null, result);
    }
}