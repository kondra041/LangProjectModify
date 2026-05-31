package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null, "xyz"));
        assertEquals("", StringUtils.strip("", "xyz"));
        assertEquals("abc", StringUtils.strip("abc", null));
        assertEquals("abc", StringUtils.strip("  abc", null));
        assertEquals("abc", StringUtils.strip("abc  ", null));
        assertEquals("abc", StringUtils.strip(" abc ", null));
        assertEquals("  abc", StringUtils.strip("  abcyx", "xyz"));
    }

    @Test
    public void testToString() throws Exception {
        byte[] bytes = new byte[]{1, 2, 3};
        assertNotNull(StringUtils.toString(bytes, null));
        assertNotNull(StringUtils.toString(bytes, "UTF-8"));
    }
}