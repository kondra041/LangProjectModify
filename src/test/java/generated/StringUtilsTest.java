package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testRemoveEnd_nullString() {
        assertNull(StringUtils.removeEnd(null, "remove"));
    }

    @Test
    public void testRemoveEnd_emptyString() {
        assertEquals("", StringUtils.removeEnd("", "remove"));
    }

    @Test
    public void testRemoveEnd_nullRemove() {
        String input = "www.domain.com";
        assertEquals(input, StringUtils.removeEnd(input, null));
    }

    @Test
    public void testRemoveEnd_notFound() {
        String input = "www.domain.com";
        String remove = "domain";
        assertEquals(input, StringUtils.removeEnd(input, remove));
    }

    @Test
    public void testRemoveEnd_foundAtEnd() {
        String input = "www.domain.com";
        String remove = ".com";
        assertEquals("www.domain", StringUtils.removeEnd(input, remove));
    }

    @Test
    public void testRemoveEnd_emptyRemove() {
        String input = "abc";
        assertEquals(input, StringUtils.removeEnd(input, ""));
    }
}