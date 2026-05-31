package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.CharSequenceUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsBlank() {
        // Test null input
        assertTrue(StringUtils.isBlank(null));

        // Test empty string
        assertTrue(StringUtils.isBlank(""));

        // Test whitespace only strings
        assertTrue(StringUtils.isBlank(" "));
        assertTrue(StringUtils.isBlank("\t"));
        assertTrue(StringUtils.isBlank("\n"));
        assertTrue(StringUtils.isBlank("\r"));
        assertTrue(StringUtils.isBlank("\f"));
        assertTrue(StringUtils.isBlank("\b"));

        // Test non-whitespace characters
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));

        // Test leading and trailing whitespace with non-whitespace in the middle
        assertFalse(StringUtils.isBlank(" \t\n\r\f\bhello\t\n\r\f\b "));
    }

}