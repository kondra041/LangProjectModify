package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testStripEnd() {
        assertEquals("abc", StringUtils.stripEnd("abc", ""));
        assertEquals("abc", StringUtils.stripEnd("abc", null));
        assertEquals("  abc", StringUtils.stripEnd("  abc", null));
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
        assertEquals(" abc", StringUtils.stripEnd(" abc ", null));
        assertEquals("  abc", StringUtils.stripEnd("  abcyx", "xyz"));
        assertEquals("12", StringUtils.stripEnd("120.00", ".0"));
    }

    @Test
    public void testToString() throws UnsupportedEncodingException {
        byte[] bytes = {72, 101, 108, 108, 111};
        assertEquals("Hello", StringUtils.toString(bytes, null));
        assertEquals("Hello", StringUtils.toString(bytes, "UTF-8"));
    }

    @Test
    public void testPrependIfMissing() {
        assertEquals("abc", StringUtils.prependIfMissing("abc", "xyz"));
        assertEquals("xyzabc", StringUtils.prependIfMissing(null, "xyz"));
        assertEquals("xyzabc", StringUtils.prependIfMissing("", "xyz"));
        assertEquals("abcyxabc", StringUtils.prependIfMissing("abcyxabc", "xyz"));
    }

    @Test
    public void testPrependIfMissingIgnoreCase() {
        assertEquals("Abc", StringUtils.prependIfMissingIgnoreCase("Abc", "xyz"));
        assertEquals("XyzAbc", StringUtils.prependIfMissingIgnoreCase(null, "xyz"));
        assertEquals("XyzAbc", StringUtils.prependIfMissingIgnoreCase("", "xyz"));
        assertEquals("Xyzabcyxabc", StringUtils.prependIfMissingIgnoreCase("abcyxabc", "xyz"));
    }

    @Test
    public void testPrependIfMissingWithNullPrefixes() {
        assertEquals("abc", StringUtils.prependIfMissing("abc", null, (CharSequence[])null));
        assertEquals("xyzabc", StringUtils.prependIfMissing(null, null, "xyz"));
        assertEquals("xyzabc", StringUtils.prependIfMissing("", null, "xyz"));
    }

    @Test
    public void testPrependIfMissingIgnoreCaseWithNullPrefixes() {
        assertEquals("Abc", StringUtils.prependIfMissingIgnoreCase("Abc", null, (CharSequence[])null));
        assertEquals("XyzAbc", StringUtils.prependIfMissingIgnoreCase(null, null, "xyz"));
        assertEquals("XyzAbc", StringUtils.prependIfMissingIgnoreCase("", null, "xyz"));
    }

    @Test
    public void testAppendIfMissing() {
        assertEquals("abc", StringUtils.appendIfMissing("abc", "xyz"));
        assertEquals("xyzabc", StringUtils.appendIfMissing(null, "xyz"));
        assertEquals("xyzabc", StringUtils.appendIfMissing("", "xyz"));
        assertEquals("abcyxxyz", StringUtils.appendIfMissing("abcyxabc", "xyz"));
    }

    @Test
    public void testAppendIfMissingIgnoreCase() {
        assertEquals("Abc", StringUtils.appendIfMissingIgnoreCase("Abc", "xyz"));
        assertEquals("XyzAbc", StringUtils.appendIfMissingIgnoreCase(null, "xyz"));
        assertEquals("XyzAbc", StringUtils.appendIfMissingIgnoreCase("", "xyz"));
        assertEquals("Xyzabcyxabc", StringUtils.appendIfMissingIgnoreCase("abcyxabc", "xyz"));
    }

    @Test
    public void testAppendIfMissingWithNullSuffixes() {
        assertEquals("abc", StringUtils.appendIfMissing("abc", null, (CharSequence[])null));
        assertEquals("xyzabc", StringUtils.appendIfMissing(null, null, "xyz"));
        assertEquals("xyzabc", StringUtils.appendIfMissing("", null, "xyz"));
    }

    @Test
    public void testAppendIfMissingIgnoreCaseWithNullSuffixes() {
        assertEquals("Abc", StringUtils.appendIfMissingIgnoreCase("Abc", null, (CharSequence[])null));
        assertEquals("XyzAbc", StringUtils.appendIfMissingIgnoreCase(null, null, "xyz"));
        assertEquals("XyzAbc", StringUtils.appendIfMissingIgnoreCase("", null, "xyz"));
    }

    @Test
    public void testStripEndWithEmptyString() {
        assertEquals("", StringUtils.stripEnd("", ""));
    }

    @Test
    public void testStripEndWithWhitespace() {
        assertEquals("abc", StringUtils.stripEnd("abc  ", null));
    }

    @Test
    public void testStripEndWithCharsToRemove() {
        assertEquals("abc", StringUtils.stripEnd("abcyx", "xyz"));
    }
}