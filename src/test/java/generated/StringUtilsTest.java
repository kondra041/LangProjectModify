package generated;

import org.apache.commons.lang3.StringUtils;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class StringUtilsTest {

    @Test
    public void testSubstringNull() {
        String result = StringUtils.substring(null, 0, 2);
        assertNull(result);
    }

    @Test
    public void testSubstringEmpty() {
        String result = StringUtils.substring("", 0, 2);
        assertEquals("", result);
    }

    @Test
    public void testSubstringStartEndEqual() {
        String result = StringUtils.substring("abc", 2, 2);
        assertEquals("", result);
    }

    @Test
    public void testSubstringNegativeStart() {
        String result = StringUtils.substring("abc", -3, 2);
        assertEquals("ab", result);
    }

    @Test
    public void testSubstringNegativeEnd() {
        String result = StringUtils.substring("abc", 0, -1);
        assertEquals("ab", result);
    }

    @Test
    public void testSubstringOutOfBounds() {
        String result = StringUtils.substring("abc", 4, 6);
        assertEquals("", result);
    }
}