package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void removeEnd_ReturnsEmptyString_WhenSourceAndRemoveAreEmpty() {
        assertEquals("", StringUtils.removeEnd("", ""));
    }

    @Test
    public void removeEnd_ReturnsNull_WhenSourceIsNull() {
        assertNull(StringUtils.removeEnd(null, "test"));
    }

    @Test
    public void removeEnd_ReturnsNull_WhenRemoveIsNull() {
        String source = "www.domain.com";
        assertEquals(source, StringUtils.removeEnd(source, null));
    }

    @Test
    public void removeEnd_RemovesSuffix() {
        String source = "www.domain.com";
        String remove = ".com.";
        String expected = "www.domain.com";
        String actual = StringUtils.removeEnd(source, remove);
        assertEquals(expected, actual);
    }

    @Test
    public void removeEnd_RemovesExactMatch() {
        String source = "www.domain.com";
        String remove = ".com";
        String expected = "www.domain";
        String actual = StringUtils.removeEnd(source, remove);
        assertEquals(expected, actual);
    }

    @Test
    public void removeEnd_DoesNotRemoveNonMatchingSuffix() {
        String source = "www.domain.com";
        String remove = "domain";
        String expected = "www.domain.com";
        String actual = StringUtils.removeEnd(source, remove);
        assertEquals(expected, actual);
    }
}