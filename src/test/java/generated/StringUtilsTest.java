package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testStripAll() {
        assertNull(StringUtils.stripAll(null, null));
        assertArrayEquals(new String[] {}, StringUtils.stripAll(new String[] {}, null));

        String[] strs = new String[] {"abc  ", "  abc", "yabcz"};
        String[] strippedStrs = StringUtils.stripAll(strs, null);
        assertArrayEquals(new String[] {"abc", "abc", "abc"}, strippedStrs);

        String[] strs2 = new String[] {"abc  ", "  abc", "yabcz"};
        String[] strippedStrs2 = StringUtils.stripAll(strs2, "yz");
        assertArrayEquals(new String[] {"abc  ", "  abc", "yabcz"}, strippedStrs2);
    }

}