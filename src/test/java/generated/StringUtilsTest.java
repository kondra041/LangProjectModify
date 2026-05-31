import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.apache.commons.lang3.StringUtils;

class EqualsTest {

    @org.junit.jupiter.api.Test
    void equalsGivenBothNullShouldReturnTrue() {
        assertTrue(StringUtils.equals(null, null));
    }

    @org.junit.jupiter.api.Test
    void equalsGivenOneNullAndOtherNotNullShouldReturnFalse() {
        assertFalse(StringUtils.equals(null, "abc"));
        assertFalse(StringUtils.equals("abc", null));
    }

    @org.junit.jupiter.api.Test
    void equalsGivenEmptyStringsShouldReturnTrue() {
        assertTrue(StringUtils.equals("", ""));
    }

    @org.junit.jupiter.api.Test
    void equalsGivenDifferentLengthsShouldReturnFalse() {
        assertFalse(StringUtils.equals("a", "ab"));
        assertFalse(StringUtils.equals("ab", "a"));
    }

    @org.junit.jupiter.api.Test
    void equalsGivenSameContentShouldReturnTrue() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @org.junit.jupiter.api.Test
    void equalsGivenDifferentCasesShouldReturnFalse() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }
}