package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @Test
    public void testToString() throws Exception {
        byte[] bytes = "test".getBytes(StandardCharsets.UTF_8);
        assertEquals("test", StringUtils.toString(bytes, StandardCharsets.UTF_8.name()));
    }

    // Additional tests can be added here for other methods in StringUtils class
}