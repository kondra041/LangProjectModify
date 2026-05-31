package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTests {

    @Test
    void testStripAll() {
        String[] strs = {"abc  ", null, "  xyz"};
        String[] expected = {"abc", null, "xyz"};
        assertArrayEquals(expected, StringUtils.stripAll(strs));
    }
}