package generated;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testRemoveEnd() {
        assertEquals("www.domain.com", StringUtils.removeEnd(null, ""));
        assertEquals("", StringUtils.removeEnd("", ""));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", null));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".com."));
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
        assertEquals("abc", StringUtils.removeEnd("abc", ""));
        assertNull(StringUtils.removeEnd(null, "domain"));
    }
}