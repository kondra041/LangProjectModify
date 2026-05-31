package generated;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StripAllTest {

    @Test
    public void testStripAll() {
        String[] strs = new String[]{"abc  ", "def", null};
        String stripChars = null;

        String[] result = StringUtils.stripAll(strs, stripChars);
        assertArrayEquals(new String[]{"abc  ", "def", null}, result);

        result = StringUtils.stripAll(null, null);
        assertNull(result);

        result = StringUtils.stripAll(ArrayUtils.EMPTY_STRING_ARRAY, null);
        assertNotNull(result);
        assertEquals(0, result.length);

        result = StringUtils.stripAll(strs, "");
        assertArrayEquals(new String[]{"abc  ", "def", null}, result);

        result = StringUtils.stripAll(strs, "yz");
        assertArrayEquals(new String[]{"abc  ", "def", null}, result);
    }
}