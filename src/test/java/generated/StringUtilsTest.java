package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import java.nio.charset.UnsupportedEncodingException;

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
        byte[] bytes = {65, 66, 67}; // "ABC" in ASCII
        String result = StringUtils.toString(bytes, "US-ASCII");
        assertEquals("ABC", result);
    }

    @Test
    public void testToStringDefaultCharset() throws UnsupportedEncodingException {
        byte[] bytes = {65, 66, 67}; // "ABC" in ASCII
        String result = StringUtils.toString(bytes, null);
        assertEquals("ABC", result);
    }

    @Test
    public void testUnsupportedEncodingException() {
        byte[] bytes = {65, 66, 67}; // "ABC" in ASCII
        MockedConstruction<UnsupportedEncodingException> mocked = mockConstruction(UnsupportedEncodingException.class);
        try {
            StringUtils.toString(bytes, "NON_EXISTENT");
        } catch (UnsupportedEncodingException e) {
            verify(mocked).exceptionThrown();
        } finally {
            mocked.close();
        }
    }
}