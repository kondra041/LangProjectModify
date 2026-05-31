package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import java.io.UnsupportedEncodingException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testRemoveStart() {
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        assertEquals("domain.com", StringUtils.removeStart("domain.com", "www."));
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", "domain"));
        assertNull(StringUtils.removeStart(null, "www."));
        assertEquals("", StringUtils.removeStart("", "www."));
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }

    @Test
    public void testToString() throws UnsupportedEncodingException {
        assertNotNull(StringUtils.toString(new byte[0], null));
        assertNotNull(StringUtils.toString(new byte[0], "UTF-8"));
        assertEquals("test", StringUtils.toString("test".getBytes(), "UTF-8"));
        assertThrows(NullPointerException.class, () -> StringUtils.toString(null, "UTF-8"));
    }
}