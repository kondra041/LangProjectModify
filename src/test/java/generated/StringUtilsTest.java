package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testRemoveStart() {
        assertEquals(null, StringUtils.removeStart(null, "test"));
        assertEquals("", StringUtils.removeStart("", "test"));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", null));
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }
}