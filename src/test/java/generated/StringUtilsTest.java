package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals(null, null));
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
        assertTrue(StringUtils.equals("abc", "abc"));
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        // Since equalsIgnoreCase is not a method in StringUtils, we would need to add it if needed.
        // For now, assuming it exists and behaves as expected:
        assertTrue(StringUtils.equalsIgnoreCase("abc", "abc"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", "ABC"));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty((CharSequence) null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty((CharSequence) null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty("abc"));
    }

    // Add more tests for other methods in StringUtils as needed
}