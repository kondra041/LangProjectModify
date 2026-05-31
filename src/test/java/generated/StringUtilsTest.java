package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testEquals() {
        assertEquals(true, StringUtils.equals(null, null));
        assertEquals(false, StringUtils.equals(null, "abc"));
        assertEquals(false, StringUtils.equals("abc", null));
        assertEquals(true, StringUtils.equals("abc", "abc"));
        assertEquals(false, StringUtils.equals("abc", "ABC"));
    }
}