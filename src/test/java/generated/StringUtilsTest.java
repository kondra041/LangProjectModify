package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringUtilsTest {

    @Test
    void testStripEnd() {
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals("abc", StringUtils.stripEnd(" abc ", null));
        assertEquals("12", StringUtils.stripEnd("120.00", ".0"));
        assertEquals("xyz", StringUtils.stripEnd("  abcyx", "xyz"));
    }

}