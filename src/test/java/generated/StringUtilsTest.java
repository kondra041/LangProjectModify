package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
import static org.apache.commons.lang3.StringUtils.stripEnd;

import org.junit.jupiter.api.Test;

public class StringUtilsStripEndTest {

    @Test
    public void testNullInput() {
        assertEquals(null, stripEnd(null, null));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", stripEnd("", null));
    }

    @Test
    public void testEmptyStripChars() {
        assertEquals("abc", stripEnd("abc", ""));
    }

    @Test
    public void testNullStripChars() {
        assertEquals("abc", stripEnd("abc", null));
        assertEquals("  abc", stripEnd("  abc", null));
        assertEquals("abc", stripEnd("abc  ", null));
        assertEquals(" abc ", stripEnd(" abc ", null));
    }

    @Test
    public void testStripChars() {
        assertEquals("  abc", stripEnd("  abcyx", "xyz"));
        assertEquals("12", stripEnd("120.00", ".0"));
    }
}