package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testRemoveStart() {
        // Test with non-empty strings where the prefix to remove is at the start
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));

        // Test with a mismatched prefix
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));

        // Test with an empty string as the source
        assertEquals("", StringUtils.removeStart("", "prefix"));

        // Test with an empty string as the remove parameter
        assertEquals("source", StringUtils.removeStart("source", ""));

        // Test with a null source string
        assertNull(StringUtils.removeStart(null, "prefix"));
    }
}