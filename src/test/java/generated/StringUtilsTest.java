package generated;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.CharSetUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StringUtilsTest {

    @Test
    public void testStripStart() {
        String result = StringUtils.stripStart("   hello world ", null);
        assertEquals("hello world", result);

        result = StringUtils.stripStart(null, "xyz");
        assertNull(result);

        result = StringUtils.stripStart("", "xyz");
        assertEquals("", result);

        result = StringUtils.stripStart("abc  ", null);
        assertEquals("abc", result);

        result = StringUtils.stripStart("   abc   ", " ");
        assertEquals("abc", result);
    }

    @Test
    public void testStripStartWithEmptyString() {
        String result = StringUtils.stripStart(null, "");
        assertNull(result);

        result = StringUtils.stripStart("", "");
        assertEquals("", result);

        result = StringUtils.stripStart("hello world", "");
        assertEquals("hello world", result);

        result = StringUtils.stripStart("   hello world ", "");
        assertEquals("hello world", result);
    }

    @Test
    public void testStripStartWithNull() {
        String result = StringUtils.stripStart(null, null);
        assertNull(result);

        result = StringUtils.stripStart("", null);
        assertEquals("", result);

        result = StringUtils.stripStart("   hello world ", null);
        assertEquals("hello world", result);
    }

    @Test
    public void testStripStartWithEmptyStringChars() {
        String result = StringUtils.stripStart(null, "");
        assertNull(result);

        result = StringUtils.stripStart("", "");
        assertEquals("", result);

        result = StringUtils.stripStart("hello world", "");
        assertEquals("hello world", result);

        result = StringUtils.stripStart("   hello world ", "");
        assertEquals("hello world", result);
    }

    @Test
    public void testStripStartWithEmptyStringStripChars() {
        String result = StringUtils.stripStart(null, null);
        assertNull(result);

        result = StringUtils.stripStart("", null);
        assertEquals("", result);

        result = StringUtils.stripStart("   hello world ", null);
        assertEquals("hello world", result);
    }
}