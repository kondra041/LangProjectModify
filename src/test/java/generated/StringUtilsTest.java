import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.apache.commons.lang3.StringUtils;

class StringUtilsTest {

    @Test
    void testRemoveStartWithNullStr() {
        String result = StringUtils.removeStart(null, "test");
        assertNull(result);
    }

    @Test
    void testRemoveStartWithEmptyStr() {
        String result = StringUtils.removeStart("", "test");
        assertEquals("", result);
    }

    @Test
    void testRemoveStartWithNullToRemove() {
        String result = StringUtils.removeStart("test", null);
        assertEquals("test", result);
    }

    @Test
    void testRemoveLongerSubstring() {
        String result = StringUtils.removeStart("test", "testing");
        assertEquals("test", result);
    }

    @Test
    void testExactMatchAtStart() {
        String result = StringUtils.removeStart("www.example.com", "www.");
        assertEquals("example.com", result);
    }

    @Test
    void testNoMatchAtStart() {
        String result = StringUtils.removeStart("domain.com", "www.");
        assertEquals("domain.com", result);
    }

    @Test
    void testCaseSensitiveMismatch() {
        String result = StringUtils.removeStart("HelloWorld", "hello");
        assertEquals("HelloWorld", result);
    }

    @Test
    void testEmptyStringToRemove() {
        String result = StringUtils.removeStart("test", "");
        assertEquals("test", result);
    }
}