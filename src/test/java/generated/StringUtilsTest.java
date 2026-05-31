package generated;

import org.apache.commons.lang3.StringUtils;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @org.junit.jupiter.api.Test
    public void testIsBlank() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank(" "));
        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }

    @org.junit.jupiter.api.Test
    public void testIsNotBlank() {
        assertFalse(StringUtils.isNotBlank(null));
        assertFalse(StringUtils.isNotBlank(""));
        assertFalse(StringUtils.isNotBlank(" "));
        assertTrue(StringUtils.isNotBlank("bob"));
        assertTrue(StringUtils.isNotBlank("  bob  "));
    }

    @org.junit.jupiter.api.Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertFalse(StringUtils.isEmpty(" "));
        assertFalse(StringUtils.isEmpty("bob"));
        assertFalse(StringUtils.isEmpty("  bob  "));
    }

    @org.junit.jupiter.api.Test
    public void testIsNotEmpty() {
        assertFalse(StringUtils.isNotEmpty(null));
        assertFalse(StringUtils.isNotEmpty(""));
        assertTrue(StringUtils.isNotEmpty(" "));
        assertTrue(StringUtils.isNotEmpty("bob"));
        assertTrue(StringUtils.isNotEmpty("  bob  "));
    }

    @org.junit.jupiter.api.Test
    public void testTrim() {
        assertNull(StringUtils.trim(null));
        assertEquals("", StringUtils.trim(""));
        assertEquals("", StringUtils.trim(" "));
        assertEquals("bob", StringUtils.trim(" bob "));
        assertEquals("bob", StringUtils.trim("bob"));
        assertEquals(" bob ", StringUtils.trim(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testTrimToEmpty() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("", StringUtils.trimToEmpty(" "));
        assertEquals("bob", StringUtils.trimToEmpty(" bob "));
        assertEquals("bob", StringUtils.trimToEmpty("bob"));
        assertEquals(" bob ", StringUtils.trimToEmpty(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testTrimToNull() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull(" "));
        assertEquals("bob", StringUtils.trimToNull(" bob "));
        assertEquals("bob", StringUtils.trimToNull("bob"));
        assertEquals(" bob ", StringUtils.trimToNull(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStrip() {
        assertNull(StringUtils.strip(null));
        assertEquals("", StringUtils.strip(""));
        assertEquals("", StringUtils.strip(" "));
        assertEquals("bob", StringUtils.strip(" bob "));
        assertEquals("bob", StringUtils.strip("bob"));
        assertEquals(" bob ", StringUtils.strip(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripToEmpty() {
        assertEquals("", StringUtils.stripToEmpty(null));
        assertEquals("", StringUtils.stripToEmpty(""));
        assertEquals("", StringUtils.stripToEmpty(" "));
        assertEquals("bob", StringUtils.stripToEmpty(" bob "));
        assertEquals("bob", StringUtils.stripToEmpty("bob"));
        assertEquals(" bob ", StringUtils.stripToEmpty(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripToNull() {
        assertNull(StringUtils.stripToNull(null));
        assertNull(StringUtils.stripToNull(""));
        assertNull(StringUtils.stripToNull(" "));
        assertEquals("bob", StringUtils.stripToNull(" bob "));
        assertEquals("bob", StringUtils.stripToNull("bob"));
        assertEquals(" bob ", StringUtils.stripToNull(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripIfPresent() {
        assertNull(StringUtils.stripIfPresent(null, " "));
        assertEquals("", StringUtils.stripIfPresent("", " "));
        assertEquals("", StringUtils.stripIfPresent(" ", " "));
        assertEquals("bob", StringUtils.stripIfPresent(" bob ", " "));
        assertEquals("bob", StringUtils.stripIfPresent("bob", " "));
        assertEquals(" bob ", StringUtils.stripIfPresent(" bob ", " "));
    }

    @org.junit.jupiter.api.Test
    public void testStripStart() {
        assertNull(StringUtils.stripStart(null));
        assertEquals("", StringUtils.stripStart(""));
        assertEquals("", StringUtils.stripStart(" "));
        assertEquals("bob", StringUtils.stripStart(" bob "));
        assertEquals("bob", StringUtils.stripStart("bob"));
        assertEquals(" bob ", StringUtils.stripStart(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripEnd() {
        assertNull(StringUtils.stripEnd(null));
        assertEquals("", StringUtils.stripEnd(""));
        assertEquals("", StringUtils.stripEnd(" "));
        assertEquals(" bob", StringUtils.stripEnd(" bob "));
        assertEquals("bob", StringUtils.stripEnd("bob"));
        assertEquals(" bob ", StringUtils.stripEnd(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripAll() {
        assertNull(StringUtils.stripAll(null));
        assertEquals("", StringUtils.stripAll(""));
        assertEquals("", StringUtils.stripAll(" "));
        assertEquals("bob", StringUtils.stripAll(" bob "));
        assertEquals("bob", StringUtils.stripAll("bob"));
        assertEquals(" bob ", StringUtils.stripAll(" bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripAny() {
        assertNull(StringUtils.stripAny(null, " "));
        assertEquals("", StringUtils.stripAny("", " "));
        assertEquals("", StringUtils.stripAny(" ", " "));
        assertEquals("bob", StringUtils.stripAny(" bob ", " "));
        assertEquals("bob", StringUtils.stripAny("bob", " "));
        assertEquals(" bob ", StringUtils.stripAny(" bob ", " "));
    }

    @org.junit.jupiter.api.Test
    public void testStripIgnoreCase() {
        assertNull(StringUtils.stripIgnoreCase(null));
        assertEquals("", StringUtils.stripIgnoreCase(""));
        assertEquals("", StringUtils.stripIgnoreCase(" "));
        assertEquals("bob", StringUtils.stripIgnoreCase(" bob "));
        assertEquals("bob", StringUtils.stripIgnoreCase("Bob"));
        assertEquals(" Bob ", StringUtils.stripIgnoreCase(" Bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripToEmptyIgnoreCase() {
        assertEquals("", StringUtils.stripToEmptyIgnoreCase(null));
        assertEquals("", StringUtils.stripToEmptyIgnoreCase(""));
        assertEquals("", StringUtils.stripToEmptyIgnoreCase(" "));
        assertEquals("bob", StringUtils.stripToEmptyIgnoreCase(" bob "));
        assertEquals("Bob", StringUtils.stripToEmptyIgnoreCase("Bob"));
        assertEquals(" Bob ", StringUtils.stripToEmptyIgnoreCase(" Bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripToNullIgnoreCase() {
        assertNull(StringUtils.stripToNullIgnoreCase(null));
        assertNull(StringUtils.stripToNullIgnoreCase(""));
        assertNull(StringUtils.stripToNullIgnoreCase(" "));
        assertEquals("bob", StringUtils.stripToNullIgnoreCase(" bob "));
        assertEquals("Bob", StringUtils.stripToNullIgnoreCase("Bob"));
        assertEquals(" Bob ", StringUtils.stripToNullIgnoreCase(" Bob "));
    }

    @org.junit.jupiter.api.Test
    public void testStripAnyIgnoreCase() {
        assertNull(StringUtils.stripAnyIgnoreCase(null, " "));
        assertEquals("", StringUtils.stripAnyIgnoreCase("", " "));
        assertEquals("", StringUtils.stripAnyIgnoreCase(" ", " "));
        assertEquals("bob", StringUtils.stripAnyIgnoreCase(" bob ", " "));
        assertEquals("Bob", StringUtils.stripAnyIgnoreCase("BoB", " "));
        assertEquals(" Bob ", StringUtils.stripAnyIgnoreCase(" BoB ", " "));
    }
}