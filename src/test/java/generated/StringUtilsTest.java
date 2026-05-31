import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {

    @org.junit.jupiter.api.Test
    public void testSubstring() {
        assertEquals("abc", StringUtils.substring("abc", 0));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("", StringUtils.substring("abc", 4));
        assertEquals("bc", StringUtils.substring("abc", -2));
        assertEquals("abc", StringUtils.substring("abc", -4));
        assertEquals(null, StringUtils.substring(null, 0));
        assertEquals("", StringUtils.substring("", 0));
    }
}