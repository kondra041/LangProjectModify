import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsTest {

    @Test
    public void testRemoveEnd() {
        assertNull(StringUtils.removeEnd(null, ""));
        assertEquals("", StringUtils.removeEnd("", ""));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", ".com."));
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
        assertEquals("abc", StringUtils.removeEnd("abc", ""));
    }
}