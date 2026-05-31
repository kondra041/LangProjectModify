package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsRemoveEndTest {

    @Test
    public void testRemoveEndNull() {
        String result = StringUtils.removeEnd(null, "test");
        assertNull(result);
    }

    @Test
    public void testRemoveEndEmptyString() {
        String result = StringUtils.removeEnd("", "test");
        assertEquals("", result);
    }

    @Test
    public void testRemoveEndNullToRemove() {
        String result = StringUtils.removeEnd("test", null);
        assertEquals("test", result);
    }

    @Test
    public void testRemoveEndNotEnding() {
        String result = StringUtils.removeEnd("teststring", "ing");
        assertEquals("teststring", result);
    }

    @Test
    public void testRemoveEndEnding() {
        String result = StringUtils.removeEnd("teststring", "string");
        assertEquals("test", result);
    }

    @Test
    public void testRemoveEndTrailingDot() {
        String result = StringUtils.removeEnd("test.com.", ".com.");
        assertEquals("test.com.", result);
    }
}