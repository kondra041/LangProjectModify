package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

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
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));
        assertFalse(StringUtils.isEmpty("  bob  "));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
        assertTrue(StringUtils.isNotEmpty("  bob  "));
    }

    @Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank(" "));
        assertTrue(StringUtils.isNotBlank("bob"));
        assertTrue(StringUtils.isNotBlank("  bob  "));
    }

    @Test
    public void testDefaultString() {
        assertEquals("", StringUtils.defaultString(null));
        assertEquals("", StringUtils.defaultString(""));
        assertEquals(" ", StringUtils.defaultString(" "));
        assertEquals("default", StringUtils.defaultString(null, "default"));
        assertEquals("default", StringUtils.defaultString("", "default"));
        assertEquals(" ", StringUtils.defaultString(" ", "default"));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("default", StringUtils.defaultIfEmpty(null, "default"));
        assertEquals("default", StringUtils.defaultIfEmpty("", "default"));
        assertEquals(" ", StringUtils.defaultIfEmpty(" ", "default"));
        assertEquals("not empty", StringUtils.defaultIfEmpty("not empty", "default"));
    }

    @Test
    public void testDefaultIfBlank() {
        assertEquals("default", StringUtils.defaultIfBlank(null, "default"));
        assertEquals("default", StringUtils.defaultIfBlank("", "default"));
        assertEquals("default", StringUtils.defaultIfBlank(" ", "default"));
        assertEquals("not blank", StringUtils.defaultIfBlank("not blank", "default"));
    }

    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("", StringUtils.trim(" "));
        assertEquals("abc", StringUtils.trim(" abc "));
        assertEquals("abc", StringUtils.trim("  abc"));
        assertEquals("abc", StringUtils.trim("abc  "));
    }

    @Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull(" "));
        assertEquals("abc", StringUtils.trimToNull(" abc "));
        assertEquals("abc", StringUtils.trimToNull("  abc"));
        assertEquals("abc", StringUtils.trimToNull("abc  "));
    }

    @Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("", StringUtils.trimToEmpty(" "));
        assertEquals("abc", StringUtils.trimToEmpty(" abc "));
        assertEquals("abc", StringUtils.trimToEmpty("  abc"));
        assertEquals("abc", StringUtils.trimToEmpty("abc  "));
    }

    @Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("", StringUtils.strip(" "));
        assertEquals("abc", StringUtils.strip(" abc "));
        assertEquals("abc", StringUtils.strip("  abc"));
        assertEquals("abc", StringUtils.strip("abc  "));
    }

    @Test
    public void testStripToNull() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull(""));
        assertNull(StringUtils.stripToNull(" "));
        assertEquals("abc", StringUtils.stripToNull(" abc "));
        assertEquals("abc", StringUtils.stripToNull("  abc"));
        assertEquals("abc", StringUtils.stripToNull("abc  "));
    }

    @Test
    public void testStripToEmpty() {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty(""));
        assertEquals("", StringUtils.stripToEmpty(" "));
        assertEquals("abc", StringUtils.stripToEmpty(" abc "));
        assertEquals("abc", StringUtils.stripToEmpty("  abc"));
        assertEquals("abc", StringUtils.stripToEmpty("abc  "));
    }

    @Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null, null));
        assertEquals("", StringUtils.stripStart("", null));
        assertEquals("", StringUtils.stripStart(" ", null));
        assertEquals("", StringUtils.stripStart("   ", " "));
        assertEquals("abc", StringUtils.stripStart("   abc", " "));
        assertEquals("abc", StringUtils.stripStart("abc  ", null));
    }

    @Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null, null));
        assertEquals("", StringUtils.stripEnd("", null));
        assertEquals("", StringUtils.stripEnd(" ", null));
        assertEquals("", StringUtils.stripEnd("   ", " "));
        assertEquals("abc", StringUtils.stripEnd("abc   ", " "));
        assertEquals("abc", StringUtils.stripEnd("  abc", null));
    }

    @Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll((String[]) null));
        assertArrayEquals(new String[] { "", "" }, StringUtils.stripAll("", ""));
        assertArrayEquals(new String[] { "", "b" }, StringUtils.stripAll(" ", " b"));
        assertArrayEquals(new String[] { "a", "b" }, StringUtils.stripAll(" a ", " b "));
    }

    @Test
    public void testStripToNullArray() {
        assertNull(StringUtils.stripToNull((String[]) null));
        assertArrayEquals(new String[] { null, null }, StringUtils.stripToNull("", ""));
        assertArrayEquals(new String[] { null, "b" }, StringUtils.stripToNull(" ", " b"));
        assertArrayEquals(new String[] { "a", "b" }, StringUtils.stripToNull(" a ", " b "));
    }

    @Test
    public void testStripToEmptyArray() {
        assertNull(StringUtils.stripToEmpty((String[]) null));
        assertArrayEquals(new String[] { "", "" }, StringUtils.stripToEmpty("", ""));
        assertArrayEquals(new String[] { "", "b" }, StringUtils.stripToEmpty(" ", " b"));
        assertArrayEquals(new String[] { "a", "b" }, StringUtils.stripToEmpty(" a ", " b "));
    }

    @Test
    public void testDeleteWhitespace() {
        assertNull(StringUtils.deleteWhitespace(null));
        assertEquals("", StringUtils.deleteWhitespace(""));
        assertEquals("", StringUtils.deleteWhitespace(" "));
        assertEquals("abc", StringUtils.deleteWhitespace("   abc  "));
        assertEquals("abc", StringUtils.deleteWhitespace("a b c"));
        assertEquals("ab", StringUtils.deleteWhitespace(" a b "));
    }

    @Test
    public void testRemoveStart() {
        assertNull(StringUtils.removeStart(null, null));
        assertEquals("", StringUtils.removeStart("", "x"));
        assertEquals("", StringUtils.removeStart("abc", null));
        assertEquals("", StringUtils.removeStart("abc", ""));
        assertEquals("bc", StringUtils.removeStart("abc", "a"));
        assertEquals("abc", StringUtils.removeStart("abc", "b"));
    }

    @Test
    public void testRemoveEnd() {
        assertNull(StringUtils.removeEnd(null, null));
        assertEquals("", StringUtils.removeEnd("", "x"));
        assertEquals("", StringUtils.removeEnd("abc", null));
        assertEquals("", StringUtils.removeEnd("abc", ""));
        assertEquals("ab", StringUtils.removeEnd("abc", "c"));
        assertEquals("abc", StringUtils.removeEnd("abc", "b"));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertNull(StringUtils.removeStartIgnoreCase(null, null));
        assertEquals("", StringUtils.removeStartIgnoreCase("", "x"));
        assertEquals("", StringUtils.removeStartIgnoreCase("abc", null));
        assertEquals("", StringUtils.removeStartIgnoreCase("abc", ""));
        assertEquals("bc", StringUtils.removeStartIgnoreCase("abc", "a"));
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", "b"));
        assertEquals("bc", StringUtils.removeStartIgnoreCase("Abc", "A"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertNull(StringUtils.removeEndIgnoreCase(null, null));
        assertEquals("", StringUtils.removeEndIgnoreCase("", "x"));
        assertEquals("", StringUtils.removeEndIgnoreCase("abc", null));
        assertEquals("", StringUtils.removeEndIgnoreCase("abc", ""));
        assertEquals("ab", StringUtils.removeEndIgnoreCase("abc", "c"));
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", "b"));
        assertEquals("ab", StringUtils.removeEndIgnoreCase("Abc", "C"));
    }

    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals(" ", StringUtils.reverse(" "));
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("dcba", StringUtils.reverse("abcd"));
    }

    @Test
    public void testCapitalize() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("A", StringUtils.capitalize("a"));
        assertEquals("Hello", StringUtils.capitalize("hello"));
        assertEquals("Hello world", StringUtils.capitalize("hello world"));
    }

    @Test
    public void testUncapitalize() {
        assertNull(StringUtils.uncapitalize(null));
        assertEquals("", StringUtils.uncapitalize(""));
        assertEquals("a", StringUtils.uncapitalize("A"));
        assertEquals("hello", StringUtils.uncapitalize("Hello"));
        assertEquals("hello world", StringUtils.uncapitalize("Hello World"));
    }

    @Test
    public void testSwapCase() {
        assertNull(StringUtils.swapCase(null));
        assertEquals("", StringUtils.swapCase(""));
        assertEquals("A", StringUtils.swapCase("a"));
        assertEquals("aBc", StringUtils.swapCase("AbC"));
        assertEquals("1234", StringUtils.swapCase("1234"));
    }

    @Test
    public void testSubstring() {
        assertNull(StringUtils.substring(null, 0));
        assertNull(StringUtils.substring(null, -1, 1));
        assertEquals("", StringUtils.substring("", 0));
        assertEquals("", StringUtils.substring("", 2));
        assertEquals("c", StringUtils.substring("abc", 2));
        assertEquals("ab", StringUtils.substring("abc", 0, 2));
        assertEquals("b", StringUtils.substring("abc", 1, 2));
    }

    @Test
    public void testSubstringsBetween() {
        assertNull(StringUtils.substringsBetween(null, "*", "*"));
        assertArrayEquals(new String[] {}, StringUtils.substringsBetween("", "*", "*"));
        assertArrayEquals(new String[] { "a" }, StringUtils.substringsBetween("abc*def*ghi", "*", "*"));
        assertArrayEquals(new String[] { "ab", "de" }, StringUtils.substringsBetween("abc*def**ghi*", "*", "*"));
    }

    @Test
    public void testSubstringBefore() {
        assertNull(StringUtils.substringBefore(null, "*"));
        assertEquals("", StringUtils.substringBefore("", "*"));
        assertEquals("", StringUtils.substringBefore("abc", "*"));
        assertEquals("abc", StringUtils.substringBefore("abc*def", "*"));
    }

    @Test
    public void testSubstringAfter() {
        assertNull(StringUtils.substringAfter(null, "*"));
        assertEquals("", StringUtils.substringAfter("", "*"));
        assertEquals("def", StringUtils.substringAfter("abc*def", "*"));
        assertEquals("", StringUtils.substringAfter("abc", "*"));
    }

    @Test
    public void testSubstringBeforeLast() {
        assertNull(StringUtils.substringBeforeLast(null, "*"));
        assertEquals("", StringUtils.substringBeforeLast("", "*"));
        assertEquals("abc", StringUtils.substringBeforeLast("abc*def*", "*"));
        assertEquals("", StringUtils.substringBeforeLast("abc", "*"));
    }

    @Test
    public void testSubstringAfterLast() {
        assertNull(StringUtils.substringAfterLast(null, "*"));
        assertEquals("", StringUtils.substringAfterLast("", "*"));
        assertEquals("def", StringUtils.substringAfterLast("abc*def*", "*"));
        assertEquals("", StringUtils.substringAfterLast("abc", "*"));
    }

    @Test
    public void testReplace() {
        assertNull(StringUtils.replace(null, "*", "#"));
        assertEquals("", StringUtils.replace("", "*", "#"));
        assertEquals("a#b#c", StringUtils.replace("a*b*c", "*", "#"));
        assertEquals("a*b*c", StringUtils.replace("a*b*c", "*", "$"));
    }

    @Test
    public void testReplaceEach() {
        assertNull(StringUtils.replaceEach(null, new String[] {}, new String[] {}));
        assertArrayEquals(new String[] {}, StringUtils.replaceEach(new String[] {}, new String[] {}, new String[] {}));
        assertArrayEquals(new String[] { "a#b#c" }, StringUtils.replaceEach(new String[] { "a*b*c" }, new String[] { "*" }, new String[] { "#" }));
        assertArrayEquals(new String[] { "a$b$c" }, StringUtils.replaceEach(new String[] { "a*b*c" }, new String[] { "*" }, new String[] { "$" }));
    }

    @Test
    public void testReplaceChars() {
        assertNull(StringUtils.replaceChars(null, "*", "#"));
        assertEquals("", StringUtils.replaceChars("", "*", "#"));
        assertEquals("abc", StringUtils.replaceChars("abc", "*", "#"));
        assertEquals("a#b#c", StringUtils.replaceChars("a*b*c", "*", "#"));
    }

    @Test
    public void testReplaceOnce() {
        assertNull(StringUtils.replaceOnce(null, "*", "#"));
        assertEquals("", StringUtils.replaceOnce("", "*", "#"));
        assertEquals("a#bc", StringUtils.replaceOnce("abc*def", "*", "#"));
        assertEquals("a*bcd", StringUtils.replaceOnce("a*b*c*d", "*", "#"));
    }

    @Test
    public void testOverlay() {
        assertNull(StringUtils.overlay(null, "xyz", 2, 4));
        assertEquals("abcdefg", StringUtils.overlay("abcdefg", null, 2, 4));
        assertEquals("abxyzfg", StringUtils.overlay("abcdefg", "xyz", 2, 4));
        assertEquals("abxyzefg", StringUtils.overlay("abcdefg", "xyz", 2, 6));
        assertEquals("abcdexyzg", StringUtils.overlay("abcdefg", "xyz", 4, 4));
    }

    @Test
    public void testChop() {
        assertNull(StringUtils.chop(null));
        assertEquals("", StringUtils.chop(""));
        assertEquals("", StringUtils.chop("a"));
        assertEquals("ab", StringUtils.chop("abc"));
        assertEquals("abcde", StringUtils.chop("abcdef\n"));
        assertEquals("abcde", StringUtils.chop("abcdef\r\n"));
    }

    @Test
    public void testChomp() {
        assertNull(StringUtils.chomp(null));
        assertEquals("", StringUtils.chomp(""));
        assertEquals("a", StringUtils.chomp("a"));
        assertEquals("ab", StringUtils.chomp("abc"));
        assertEquals("abcde", StringUtils.chomp("abcdef\n"));
        assertEquals("abcde", StringUtils.chomp("abcdef\r\n"));
    }

    @Test
    public void testLeft() {
        assertNull(StringUtils.left(null, 2));
        assertEquals("", StringUtils.left("", 2));
        assertEquals("a", StringUtils.left("a", 1));
        assertEquals("ab", StringUtils.left("abc", 2));
        assertEquals("ab", StringUtils.left("abc", 4));
    }

    @Test
    public void testRight() {
        assertNull(StringUtils.right(null, 2));
        assertEquals("", StringUtils.right("", 2));
        assertEquals("a", StringUtils.right("a", 1));
        assertEquals("bc", StringUtils.right("abc", 2));
        assertEquals("bc", StringUtils.right("abc", 4));
    }

    @Test
    public void testMid() {
        assertNull(StringUtils.mid(null, 2, 3));
        assertEquals("", StringUtils.mid("", 2, 3));
        assertEquals("", StringUtils.mid("a", 2, 3));
        assertEquals("b", StringUtils.mid("abcdef", 2, 1));
        assertEquals("bcd", StringUtils.mid("abcdef", 2, 3));
        assertEquals("cd", StringUtils.mid("abcdef", 4, 2));
    }

    @Test
    public void testCapitalizeFully() {
        assertNull(StringUtils.capitalizeFully(null));
        assertEquals("", StringUtils.capitalizeFully(""));
        assertEquals("A", StringUtils.capitalizeFully("a"));
        assertEquals("Hello World", StringUtils.capitalizeFully("hello world"));
        assertEquals("Hello World", StringUtils.capitalizeFully("HELLO WORLD"));
        assertEquals("Hello World", StringUtils.capitalizeFully("hElLo WoRlD"));
    }

    @Test
    public void testUncapitalizeFully() {
        assertNull(StringUtils.uncapitalizeFully(null));
        assertEquals("", StringUtils.uncapitalizeFully(""));
        assertEquals("a", StringUtils.uncapitalizeFully("A"));
        assertEquals("hello world", StringUtils.uncapitalizeFully("Hello World"));
        assertEquals("hello world", StringUtils.uncapitalizeFully("HELLO WORLD"));
        assertEquals("hElLo WoRlD", StringUtils.uncapitalizeFully("hElLo WoRlD"));
    }

    @Test
    public void testReverseDelimited() {
        assertNull(StringUtils.reverseDelimited(null, 'x'));
        assertEquals("", StringUtils.reverseDelimited("", 'x'));
        assertEquals("abc", StringUtils.reverseDelimited("abc", 'x'));
        assertEquals("cba", StringUtils.reverseDelimited("a,b,c", ','));
    }

    @Test
    public void testJoin() {
        assertNull(StringUtils.join((Object[]) null, ","));
        assertEquals("", StringUtils.join(new Object[] {}, ","));
        assertEquals("a,b,c", StringUtils.join(new String[] { "a", "b", "c" }, ","));
        assertEquals("1,2,3", StringUtils.join(new Integer[] { 1, 2, 3 }, ","));
    }

    @Test
    public void testJoinWithNullElements() {
        assertNull(StringUtils.join((Object[]) null, ","));
        assertEquals(",", StringUtils.join(new Object[] { null, null }, ","));
        assertEquals("a,,c", StringUtils.join(new String[] { "a", null, "c" }, ","));
    }

    @Test
    public void testJoinWithEmptyArray() {
        assertNull(StringUtils.join((Object[]) null, ","));
        assertEquals("", StringUtils.join(new Object[] {}, ","));
    }

    @Test
    public void testRepeat() {
        assertNull(StringUtils.repeat(null, 2));
        assertEquals("", StringUtils.repeat("", 2));
        assertEquals("a", StringUtils.repeat("a", 1));
        assertEquals("aaaa", StringUtils.repeat("a", 4));
        assertEquals("", StringUtils.repeat("a", -1));
    }

    @Test
    public void testRepeatWithSeparator() {
        assertNull(StringUtils.repeat(null, ",", 2));
        assertEquals("", StringUtils.repeat("", ",", 2));
        assertEquals("a", StringUtils.repeat("a", ",", 1));
        assertEquals("a,a,a", StringUtils.repeat("a", ",", 3));
        assertEquals("", StringUtils.repeat("a", ",", -1));
    }

    @Test
    public void testReverseStringBuffer() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals(" ", StringUtils.reverse(" "));
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("dcba", StringUtils.reverse("abcd"));
    }

    @Test
    public void testToString() {
        assertNull(StringUtils.toString(null, "UTF-8"));
        assertEquals("", StringUtils.toString(new byte[] {}, "UTF-8"));
        assertEquals("abc", StringUtils.toString("abc".getBytes(StandardCharsets.UTF_8), "UTF-8"));
    }

    @Test
    public void testBytesToString() throws UnsupportedEncodingException {
        assertNull(StringUtils.bytesToString(null));
        assertEquals("", StringUtils.bytesToString(""));
        assertEquals("abc", StringUtils.bytesToString("abc".getBytes("UTF-8")));
    }
}