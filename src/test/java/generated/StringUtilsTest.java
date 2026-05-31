package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testNormalizeSpace() {
        assertEquals("abc", StringUtils.normalizeSpace(null));
        assertEquals("", StringUtils.normalizeSpace(""));
        assertEquals("abc", StringUtils.normalizeSpace("  abc "));
        assertEquals("a b c", StringUtils.normalizeSpace("a   b     c"));
    }

    @Test
    public void testSubstring() {
        assertNull(StringUtils.substring(null, 0, 0));
        assertEquals("", StringUtils.substring("", 0, 0));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("", StringUtils.substring("abc", 2, 0));
        assertEquals("c", StringUtils.substring("abc", 2, 4));
        assertEquals("", StringUtils.substring("abc", 4, 6));
        assertEquals("", StringUtils.substring("abc", 2, 2));
        assertEquals("b", StringUtils.substring("abc", -2, -1));
        assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }

    @Test
    public void testStartsWithIgnoreCase() {
        assertTrue(StringUtils.startsWithIgnoreCase(null, null));
        assertTrue(StringUtils.startsWithIgnoreCase("", ""));
        assertTrue(StringUtils.startsWithIgnoreCase("abc", "a"));
        assertFalse(StringUtils.startsWithIgnoreCase("abc", "A"));
    }

    @Test
    public void testEndsWithIgnoreCase() {
        assertTrue(StringUtils.endsWithIgnoreCase(null, null));
        assertTrue(StringUtils.endsWithIgnoreCase("", ""));
        assertTrue(StringUtils.endsWithIgnoreCase("abc", "c"));
        assertFalse(StringUtils.endsWithIgnoreCase("abc", "C"));
    }

    @Test
    public void testJoin() {
        assertEquals("", StringUtils.join((String[]) null));
        assertEquals("", StringUtils.join(new String[0]));
        assertEquals("a,b,c", StringUtils.join(new String[]{"a", "b", "c"}));
    }

    @Test
    public void testSplitPreserveAllTokens() {
        assertNull(StringUtils.splitPreserveAllTokens(null));
        assertEquals(0, StringUtils.splitPreserveAllTokens("").length);
        assertEquals(3, StringUtils.splitPreserveAllTokens("a,b,c").length);
    }

    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("cba", StringUtils.reverse("abc"));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertEquals("abc", StringUtils.trimToNull("  abc  "));
    }

    @Test
    public void testIsNumeric() {
        assertTrue(StringUtils.isNumeric(null));
        assertTrue(StringUtils.isNumeric(""));
        assertTrue(StringUtils.isNumeric("123"));
        assertFalse(StringUtils.isNumeric("abc"));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("a"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("a"));
    }

    @Test
    public void testEscapeHtml4() {
        assertNull(StringUtils.escapeHtml4(null));
        assertEquals("&quot;", StringUtils.escapeHtml4("\""));
        assertEquals("&lt; &gt;", StringUtils.escapeHtml4("< >"));
    }

    @Test
    public void testUnescapeHtml4() {
        assertNull(StringUtils.unescapeHtml4(null));
        assertEquals("\"", StringUtils.unescapeHtml4("&quot;"));
        assertEquals("< >", StringUtils.unescapeHtml4("&lt; &gt;"));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null, ""));
        assertEquals("abc", StringUtils.defaultString("abc", "def"));
    }

    @Test
    public void testCenter() {
        assertNull(StringUtils.center(null, 4));
        assertEquals("abcd", StringUtils.center("ab", 4));
        assertEquals(" abcd ", StringUtils.center("ab", 6));
    }

    @Test
    public void testAbbreviateMidWord() {
        assertNull(StringUtils.abbreviateMidWord(null, 10, 2));
        assertEquals("ab...de", StringUtils.abbreviateMidWord("abcdefg", 10, 2));
        assertEquals("ab..d", StringUtils.abbreviateMidWord("abcdefghi", 8, 3));
    }

    @Test
    public void testAbbreviate() {
        assertNull(StringUtils.abbreviate(null, 4));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        assertEquals("abc...", StringUtils.abbreviate("abcdefg", -1));
    }

    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("abc", StringUtils.deleteWhitespace(" a b c "));
    }

    @Test
    public void testDefaultIfBlank() {
        assertEquals("", StringUtils.defaultIfBlank(null, ""));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "def"));
    }

    @Test
    public void testLength() {
        assertTrue(StringUtils.length(null) == -1);
        assertTrue(StringUtils.length("") == 0);
        assertTrue(StringUtils.length("abc") == 3);
    }

    @Test
    public void testCharAt() {
        assertEquals('a', StringUtils.charAt("abc", 0));
        assertEquals('b', StringUtils.charAt("abc", 1));
        assertEquals('c', StringUtils.charAt("abc", 2));
        assertThrows(StringIndexOutOfBoundsException.class, () -> StringUtils.charAt("abc", -1));
        assertThrows(StringIndexOutOfBoundsException.class, () -> StringUtils.charAt("abc", 3));
    }

    @Test
    public void testIndexOfIgnoreCase() {
        assertTrue(StringUtils.indexOfIgnoreCase(null, "a") == -1);
        assertTrue(StringUtils.indexOfIgnoreCase("", "a") == -1);
        assertTrue(StringUtils.indexOfIgnoreCase("abcdefg", "c") == 2);
        assertTrue(StringUtils.indexOfIgnoreCase("ABCDEFg", "C") == 2);
    }

    @Test
    public void testLastIndexOfIgnoreCase() {
        assertTrue(StringUtils.lastIndexOfIgnoreCase(null, "a") == -1);
        assertTrue(StringUtils.lastIndexOfIgnoreCase("", "a") == -1);
        assertTrue(StringUtils.lastIndexOfIgnoreCase("abcdefg", "c") == 2);
        assertTrue(StringUtils.lastIndexOfIgnoreCase("ABCDEFg", "C") == 2);
    }

    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 3));
        assertEquals("", StringUtils.repeat("", 3));
        assertEquals("abcabcabc", StringUtils.repeat("abc", 3));
    }

    @Test
    public void testSubstringAfterLast() {
        assertNull(StringUtils.substringAfterLast(null, "a"));
        assertEquals("", StringUtils.substringAfterLast("", "a"));
        assertEquals("xyz", StringUtils.substringAfterLast("abc.xyz", "."));
    }

    @Test
    public void testSubstringBeforeFirst() {
        assertNull(StringUtils.substringBeforeFirst(null, "a"));
        assertEquals("", StringUtils.substringBeforeFirst("", "a"));
        assertEquals("abc", StringUtils.substringBeforeFirst("abc.def", "."));
    }

    @Test
    public void testSubstringAfter() {
        assertNull(StringUtils.substringAfter(null, "a"));
        assertEquals("", StringUtils.substringAfter("", "a"));
        assertEquals(".xyz", StringUtils.substringAfter("abc.xyz", "abc"));
    }

    @Test
    public void testSubstringBeforeLast() {
        assertNull(StringUtils.substringBeforeLast(null, "a"));
        assertEquals("", StringUtils.substringBeforeLast("", "a"));
        assertEquals("abc.", StringUtils.substringBeforeLast("abc.xyz", "."));
    }

    @Test
    public void testPadStart() {
        assertNull(StringUtils.padStart(null, 4));
        assertEquals("00ab", StringUtils.padStart("ab", 4));
        assertEquals(" ab ", StringUtils.padStart("ab", 6));
    }

    @Test
    public void testPadEnd() {
        assertNull(StringUtils.padEnd(null, 4));
        assertEquals("ab00", StringUtils.padEnd("ab", 4));
        assertEquals(" ab ", StringUtils.padEnd("ab", 6));
    }

    @Test
    public void testDefaultStringToNull() {
        assertNull(StringUtils.defaultStringToNull(""));
        assertEquals("abc", StringUtils.defaultStringToNull("abc"));
    }

    @Test
    public void testAbbreviateMiddle() {
        assertNull(StringUtils.abbreviateMiddle(null, "1234567890", 5));
        assertEquals("12...67890", StringUtils.abbreviateMiddle("1234567890", "1234567890", 5));
        assertEquals("1...0", StringUtils.abbreviateMiddle("1234567890", "1234567890", 2));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("abc", StringUtils.strip(" abc "));
        assertEquals("ab c ", StringUtils.strip(" ab c "));
    }

    @Test
    public void testSubstringBefore() {
        assertNull(StringUtils.substringBefore(null, "a"));
        assertEquals("", StringUtils.substringBefore("", "a"));
        assertEquals("abc", StringUtils.substringBefore("abc.def", "."));
    }

    @Test
    public void testReplaceChars() {
        assertNull(StringUtils.replaceChars(null, '1', '2'));
        assertEquals("", StringUtils.replaceChars("", '1', '2'));
        assertEquals("abcbcd", StringUtils.replaceChars("abc1bcd2", '1', '2'));
    }

    @Test
    public void testDefaultIfNull() {
        assertEquals("", StringUtils.defaultIfNull(""));
        assertEquals("abc", StringUtils.defaultIfNull(null, "abc"));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertTrue(StringUtils.equalsIgnoreCase(null, null));
        assertTrue(StringUtils.equalsIgnoreCase("", ""));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", "DEF"));
    }
}