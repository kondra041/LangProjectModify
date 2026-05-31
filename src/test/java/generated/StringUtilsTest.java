package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testCapitalize() {
        // Test null input
        assertNull(StringUtils.capitalize(null));

        // Test empty string
        assertEquals("", StringUtils.capitalize(""));

        // Test single character string
        assertEquals("A", StringUtils.capitalize("a"));

        // Test already capitalized string
        assertEquals("Cat", StringUtils.capitalize("Cat"));

        // Test lowercase string
        assertEquals("Cat", StringUtils.capitalize("cat"));

        // Test mixed case string
        assertEquals("CAt", StringUtils.capitalize("cAt"));
    }

    @Test
    public void testUncapitalize() {
        // Test null input
        assertNull(StringUtils.uncapitalize(null));

        // Test empty string
        assertEquals("", StringUtils.uncapitalize(""));

        // Test single character string
        assertEquals("a", StringUtils.uncapitalize("A"));

        // Test already uncapitalized string
        assertEquals("cat", StringUtils.uncapitalize("cat"));

        // Test uppercase string
        assertEquals("cat", StringUtils.uncapitalize("CAT"));

        // Test mixed case string
        assertEquals("cAt", StringUtils.uncapitalize("CAt"));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("abc", StringUtils.trim(" abc "));
        assertEquals("abc", StringUtils.trim("abc "));
        assertEquals("abc", StringUtils.trim(" abc"));
    }

    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals(" ", StringUtils.reverse(" "));
    }

    @Test
    public void testAppendIfMissing() {
        assertEquals("abcxyz", StringUtils.appendIfMissing("abc", "xyz"));
        assertEquals("abc", StringUtils.appendIfMissing("abc", ""));
        assertEquals("abc", StringUtils.appendIfMissing("abc", null));
        assertEquals("abcxyz", StringUtils.appendIfMissing("abc", "xyz", "abc"));
    }

    @Test
    public void testPrependIfMissing() {
        assertEquals("xyzabc", StringUtils.prependIfMissing("abc", "xyz"));
        assertEquals("abc", StringUtils.prependIfMissing("abc", ""));
        assertEquals("abc", StringUtils.prependIfMissing("abc", null));
        assertEquals("xyzabc", StringUtils.prependIfMissing("abc", "xyz", "abc"));
    }

    @Test
    public void testAppendIfMissingIgnoreCase() {
        assertEquals("abcXYZ", StringUtils.appendIfMissingIgnoreCase("abc", "XYZ"));
        assertEquals("abc", StringUtils.appendIfMissingIgnoreCase("abc", ""));
        assertEquals("abc", StringUtils.appendIfMissingIgnoreCase("abc", null));
        assertEquals("abcXYZ", StringUtils.appendIfMissingIgnoreCase("abc", "xyz", "abc"));
    }

    @Test
    public void testPrependIfMissingIgnoreCase() {
        assertEquals("XYZabc", StringUtils.prependIfMissingIgnoreCase("abc", "XYZ"));
        assertEquals("abc", StringUtils.prependIfMissingIgnoreCase("abc", ""));
        assertEquals("abc", StringUtils.prependIfMissingIgnoreCase("abc", null));
        assertEquals("XYZabc", StringUtils.prependIfMissingIgnoreCase("abc", "xyz", "abc"));
    }

    @Test
    public void testDefaultString() {
        assertEquals("default", StringUtils.defaultString(null, "default"));
        assertEquals("abc", StringUtils.defaultString("abc", "default"));
        assertEquals("", StringUtils.defaultString("", "default"));
    }

    @Test
    public void testDefaultIfBlank() {
        assertEquals("default", StringUtils.defaultIfBlank(null, "default"));
        assertEquals("default", StringUtils.defaultIfBlank("", "default"));
        assertEquals("default", StringUtils.defaultIfBlank(" ", "default"));
        assertEquals("abc", StringUtils.defaultIfBlank("abc", "default"));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("default", StringUtils.defaultIfEmpty(null, "default"));
        assertEquals("default", StringUtils.defaultIfEmpty("", "default"));
        assertEquals("abc", StringUtils.defaultIfEmpty("abc", "default"));
        assertEquals(" ", StringUtils.defaultIfEmpty(" ", "default"));
    }

    @Test
    public void testReverseDelimitedString() {
        assertNull(StringUtils.reverseDelimitedString(null, '.'));
        assertEquals("", StringUtils.reverseDelimitedString("", '.'));
        assertEquals("c.b.a", StringUtils.reverseDelimitedString("a.b.c", '.'));
        assertEquals("b.a", StringUtils.reverseDelimitedString("a.b", '.'));
    }

    @Test
    public void testRemove() {
        assertNull(StringUtils.remove(null, "a"));
        assertEquals("", StringUtils.remove("", "a"));
        assertEquals("abc", StringUtils.remove("abc", null));
        assertEquals("bb", StringUtils.remove("abcb", "b"));
        assertEquals("ac", StringUtils.remove("abca", "a"));
    }

    @Test
    public void testRemoveStart() {
        assertNull(StringUtils.removeStart(null, "l"));
        assertEquals("", StringUtils.removeStart("", "l"));
        assertEquals("abc", StringUtils.removeStart("abc", null));
        assertEquals("bc", StringUtils.removeStart("abc", "ab"));
        assertEquals("c", StringUtils.removeStart("abc", "a"));
        assertEquals("abc", StringUtils.removeStart("abc", "z"));
    }

    @Test
    public void testRemoveEnd() {
        assertNull(StringUtils.removeEnd(null, "l"));
        assertEquals("", StringUtils.removeEnd("", "l"));
        assertEquals("abc", StringUtils.removeEnd("abc", null));
        assertEquals("ab", StringUtils.removeEnd("abc", "bc"));
        assertEquals("a", StringUtils.removeEnd("abc", "c"));
        assertEquals("abc", StringUtils.removeEnd("abc", "z"));
    }

    @Test
    public void testRemoveStartIgnoreCase() {
        assertNull(StringUtils.removeStartIgnoreCase(null, "l"));
        assertEquals("", StringUtils.removeStartIgnoreCase("", "l"));
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", null));
        assertEquals("bc", StringUtils.removeStartIgnoreCase("Abc", "ab"));
        assertEquals("c", StringUtils.removeStartIgnoreCase("aBc", "a"));
        assertEquals("abc", StringUtils.removeStartIgnoreCase("abc", "z"));
    }

    @Test
    public void testRemoveEndIgnoreCase() {
        assertNull(StringUtils.removeEndIgnoreCase(null, "l"));
        assertEquals("", StringUtils.removeEndIgnoreCase("", "l"));
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", null));
        assertEquals("ab", StringUtils.removeEndIgnoreCase("abc", "Bc"));
        assertEquals("a", StringUtils.removeEndIgnoreCase("AbC", "c"));
        assertEquals("abc", StringUtils.removeEndIgnoreCase("abc", "z"));
    }

    @Test
    public void testRemovePattern() {
        assertNull(StringUtils.removePattern(null, ".b."));
        assertEquals("", StringUtils.removePattern("", ".b."));
        assertEquals("a c", StringUtils.removePattern("a.b.c", ".b."));
        assertEquals("abca", StringUtils.removePattern("abca", ".b."));
    }

    @Test
    public void testSwapCase() {
        assertNull(StringUtils.swapCase(null));
        assertEquals("", StringUtils.swapCase(""));
        assertEquals("AbC", StringUtils.swapCase("aBc"));
        assertEquals("123abcXYZ", StringUtils.swapCase("123ABCxyz"));
    }

    @Test
    public void testContainsAnyChar() {
        assertFalse(StringUtils.containsAnyChar(null, new char[]{'a', 'b'}));
        assertFalse(StringUtils.containsAnyChar("", new char[]{'a', 'b'}));
        assertTrue(StringUtils.containsAnyChar("abc", new char[]{'b', 'z'}));
        assertFalse(StringUtils.containsAnyChar("abc", new char[]{'x', 'y'}));
    }

    @Test
    public void testContainsNoneChar() {
        assertTrue(StringUtils.containsNoneChar(null, new char[]{'a', 'b'}));
        assertTrue(StringUtils.containsNoneChar("", new char[]{'a', 'b'}));
        assertFalse(StringUtils.containsNoneChar("abc", new char[]{'b', 'z'}));
        assertTrue(StringUtils.containsNoneChar("abc", new char[]{'x', 'y'}));
    }

    @Test
    public void testContainsAny() {
        assertFalse(StringUtils.containsAny(null, "ab"));
        assertFalse(StringUtils.containsAny("", "ab"));
        assertTrue(StringUtils.containsAny("abc", "b"));
        assertFalse(StringUtils.containsAny("abc", "z"));
    }

    @Test
    public void testContainsNone() {
        assertTrue(StringUtils.containsNone(null, "ab"));
        assertTrue(StringUtils.containsNone("", "ab"));
        assertFalse(StringUtils.containsNone("abc", "b"));
        assertTrue(StringUtils.containsNone("abc", "z"));
    }

    @Test
    public void testEqualsAnyIgnoreCase() {
        assertFalse(StringUtils.equalsAnyIgnoreCase(null, new String[]{"a", "b"}));
        assertFalse(StringUtils.equalsAnyIgnoreCase("", new String[]{"a", "b"}));
        assertTrue(StringUtils.equalsAnyIgnoreCase("abc", new String[]{"B", "c"}));
        assertFalse(StringUtils.equalsAnyIgnoreCase("abc", new String[]{"x", "y"}));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertFalse(StringUtils.equalsIgnoreCase(null, "abc"));
        assertFalse(StringUtils.equalsIgnoreCase("", "abc"));
        assertTrue(StringUtils.equalsIgnoreCase("abc", "ABC"));
        assertFalse(StringUtils.equalsIgnoreCase("abc", "def"));
    }

    @Test
    public void testIndexDifference() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(0, StringUtils.indexOfDifference("", ""));
        assertEquals(0, StringUtils.indexOfDifference("a", "b"));
        assertEquals(3, StringUtils.indexOfDifference("abcdefg", "abcxyz"));
        assertEquals(6, StringUtils.indexOfDifference("abcdefg", "abcdefx"));
    }

    @Test
    public void testIndexDifferenceCS() {
        assertEquals(-1, StringUtils.indexOfDifference(null, null));
        assertEquals(0, StringUtils.indexOfDifference("", ""));
        assertEquals(0, StringUtils.indexOfDifference("a", "b"));
        assertEquals(3, StringUtils.indexOfDifference("abcdefg", "abcxyz"));
        assertEquals(6, StringUtils.indexOfDifference("abcdefg", "abcdefx"));
    }

    @Test
    public void testIndexOfAny() {
        assertEquals(-1, StringUtils.indexOfAny(null, new char[]{'a', 'b'}));
        assertEquals(-1, StringUtils.indexOfAny("", new char[]{'a', 'b'}));
        assertEquals(0, StringUtils.indexOfAny("abc", new char[]{'b', 'z'}));
        assertEquals(2, StringUtils.indexOfAny("abc", new char[]{'x', 'y', 'c'}));
    }

    @Test
    public void testIndexOfAnyBut() {
        assertEquals(-1, StringUtils.indexOfAnyBut(null, "ab"));
        assertEquals(-1, StringUtils.indexOfAnyBut("", "ab"));
        assertEquals(2, StringUtils.indexOfAnyBut("abc", "b"));
        assertEquals(-1, StringUtils.indexOfAnyBut("abc", "a"));
    }

    @Test
    public void testLastIndexOfAny() {
        assertEquals(-1, StringUtils.lastIndexOfAny(null, new char[]{'a', 'b'}));
        assertEquals(-1, StringUtils.lastIndexOfAny("", new char[]{'a', 'b'}));
        assertEquals(2, StringUtils.lastIndexOfAny("abc", new char[]{'b', 'z'}));
        assertEquals(0, StringUtils.lastIndexOfAny("abc", new char[]{'x', 'y', 'a'}));
    }

    @Test
    public void testIndexOfAnyChars() {
        assertEquals(-1, StringUtils.indexOfAnyChars(null, "ab"));
        assertEquals(-1, StringUtils.indexOfAnyChars("", "ab"));
        assertEquals(0, StringUtils.indexOfAnyChars("abc", "b"));
        assertEquals(-1, StringUtils.indexOfAnyChars("abc", "xyz"));
    }

    @Test
    public void testIndexOfAnyCharsBut() {
        assertEquals(-1, StringUtils.indexOfAnyCharsBut(null, "ab"));
        assertEquals(-1, StringUtils.indexOfAnyCharsBut("", "ab"));
        assertEquals(2, StringUtils.indexOfAnyCharsBut("abc", "b"));
        assertEquals(-1, StringUtils.indexOfAnyCharsBut("abc", "a"));
    }

    @Test
    public void testLastIndexOfAnyChars() {
        assertEquals(-1, StringUtils.lastIndexOfAnyChars(null, "ab"));
        assertEquals(-1, StringUtils.lastIndexOfAnyChars("", "ab"));
        assertEquals(2, StringUtils.lastIndexOfAnyChars("abc", "b"));
        assertEquals(0, StringUtils.lastIndexOfAnyChars("abc", "a"));
    }

    @Test
    public void testContainsOnly() {
        assertFalse(StringUtils.containsOnly(null, new char[]{'a', 'b'}));
        assertFalse(StringUtils.containsOnly("", new char[]{'a', 'b'}));
        assertTrue(StringUtils.containsOnly("abc", new char[]{'a', 'b', 'c'}));
        assertFalse(StringUtils.containsOnly("abc", new char[]{'x', 'y'}));
    }

    @Test
    public void testContainsAny() {
        assertFalse(StringUtils.containsAny(null, "ab"));
        assertFalse(StringUtils.containsAny("", "ab"));
        assertTrue(StringUtils.containsAny("abc", "b"));
        assertFalse(StringUtils.containsAny("abc", "z"));
    }

    @Test
    public void testGetDigits() {
        assertNull(StringUtils.getDigits(null));
        assertEquals("", StringUtils.getDigits(""));
        assertEquals("1234567890", StringUtils.getDigits("abc123def456ghi7890"));
        assertEquals("", StringUtils.getDigits("abcdef"));
    }

    @Test
    public void testGetLetters() {
        assertNull(StringUtils.getLetters(null));
        assertEquals("", StringUtils.getLetters(""));
        assertEquals("abcdefghij", StringUtils.getLetters("abc123def456ghi7890"));
        assertEquals("abcdef", StringUtils.getLetters("abcdef"));
    }

    @Test
    public void testClean() {
        assertNull(StringUtils.clean(null));
        assertEquals("", StringUtils.clean(""));
        assertEquals("abc", StringUtils.clean("   abc   "));
        assertEquals("abc", StringUtils.clean("\t\n abc \r"));
    }
}