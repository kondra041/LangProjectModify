import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsRemoveEndTest {

    @Test
    public void testRemoveEndWithNullString() {
        assertNull(StringUtils.removeEnd(null, "test"));
    }

    @Test
    public void testRemoveEndWithEmptyString() {
        assertEquals("", StringUtils.removeEnd("", "test"));
    }

    @Test
    public void testRemoveEndWithNullSubstring() {
        assertEquals("abc", StringUtils.removeEnd("abc", null));
    }

    @Test
    public void testRemoveEndWithSubstringAtEnd() {
        assertEquals("www.domain", StringUtils.removeEnd("www.domain.com", ".com"));
    }

    @Test
    public void testRemoveEndWithSubstringNotAtEnd() {
        assertEquals("www.domain.com", StringUtils.removeEnd("www.domain.com", "domain"));
    }

    @Test
    public void testRemoveEndWithEmptySubstring() {
        assertEquals("abc", StringUtils.removeEnd("abc", ""));
    }
}