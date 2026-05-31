package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testSubstringWithNullString() {
        String str = null;
        int start = 0;
        assertNull(StringUtils.substring(str, start));
    }

    @Test
    public void testSubstringWithEmptyString() {
        String str = "";
        int start = 0;
        assertEquals("", StringUtils.substring(str, start));
    }

    @Test
    public void testSubstringWithPositiveStart() {
        String str = "abc";
        int start = 0;
        assertEquals("abc", StringUtils.substring(str, start));
    }

    @Test
    public void testSubstringWithMiddleStart() {
        String str = "abc";
        int start = 2;
        assertEquals("c", StringUtils.substring(str, start));
    }

    @Test
    public void testSubstringWithOutOfBoundsStart() {
        String str = "abc";
        int start = 4;
        assertEquals("", StringUtils.substring(str, start));
    }

    @Test
    public void testSubstringWithNegativeStart() {
        String str = "abc";
        int start = -2;
        assertEquals("bc", StringUtils.substring(str, start));
    }

    @Test
    public void testSubstringWithVeryNegativeStart() {
        String str = "abc";
        int start = -4;
        assertEquals("abc", StringUtils.substring(str, start));
    }
}