package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank((CharSequence) null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testToString() throws UnsupportedEncodingException {
        byte[] bytes = {65, 66, 67}; // ASCII for ABC
        String result = StringUtils.toString(bytes, "UTF-8");
        assertEquals("ABC", result);
    }
}