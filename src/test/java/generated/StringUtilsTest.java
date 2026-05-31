package generated;

import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsCapitalizeTest {

    @Test
    void testCapitalizeNullInput() {
        assertNull(StringUtils.capitalize(null), "Capitalizing null should return null.");
    }

    @Test
    void testCapitalizeEmptyString() {
        assertEquals("", StringUtils.capitalize(""), "Capitalizing an empty string should return an empty string.");
    }

    @Test
    void testCapitalizeSingleCharacterLowerCase() {
        assertEquals("C", StringUtils.capitalize("c"), "Capitalizing 'c' should return 'C'.");
    }

    @Test
    void testCapitalizeSingleCharacterUpperCase() {
        assertEquals("C", StringUtils.capitalize("C"), "Capitalizing 'C' should return 'C'.");
    }

    @Test
    void testCapitalizeTitleCaseFirstChar() {
        assertEquals("Cat", StringUtils.capitalize("Cat"), "'Cat' should remain 'Cat'.");
    }

    @Test
    void testCapitalizeLowercaseWord() {
        assertEquals("Cat", StringUtils.capitalize("cat"), "Capitalizing 'cat' should return 'Cat'.");
    }

    @Test
    void testCapitalizeMixedCaseWord() {
        assertEquals("CAt", StringUtils.capitalize("cAt"), "Capitalizing 'cAt' should return 'CAt'.");
    }
}