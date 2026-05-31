package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.apache.commons.lang3.CharSetUtils;
import java.nio.charset.UnsupportedCharsetException;

public class CharSetUtilsTest {

    @org.junit.jupiter.api.Test
    public void testSqueeze_CharSeq_Char() {
        assertEquals("hello", CharSetUtils.squeeze(null, 'l'));
        assertNull(CharSetUtils.squeeze("hello", null));
        assertEquals("helo", CharSetUtils.squeeze("hello", 'l'));
    }

    @org.junit.jupiter.api.Test
    public void testSqueeze_String_String() {
        assertNull(CharSetUtils.squeeze(null, null));
        assertEquals("hello", CharSetUtils.squeeze("hello", null));
        assertEquals("helo", CharSetUtils.squeeze("hello", "l"));
    }

    @org.junit.jupiter.api.Test
    public void testToString_byteArr_String() throws UnsupportedCharsetException {
        assertThrows(NullPointerException.class, () -> CharSetUtils.toString(null, null));
        assertEquals("hello", CharSetUtils.toString("hello".getBytes(), null));
    }
}