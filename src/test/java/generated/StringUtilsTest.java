package generated;

import java.io.UnsupportedEncodingException;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsRemoveStartTest {

    @Test
    public void testRemoveStartNullSource() {
        assertNull(StringUtils.removeStart(null, "www."));
    }

    @Test
    public void testRemoveStartEmptySource() {
        assertEquals("", StringUtils.removeStart("", "www."));
    }

    @Test
    public void testRemoveStartNullPattern() {
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", null));
    }

    @Test
    public void testRemoveStartExactMatch() {
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
    }

    @Test
    public void testRemoveStartNoMatch() {
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));
    }

    @Test
    public void testRemoveStartNonMatchingPattern() {
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveStartEmptyPattern() {
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }
}