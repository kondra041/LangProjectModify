package generated;

import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsEqualsTest {

    @Test
    void shouldReturnTrueWhenBothCharSequencesAreNull() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    void shouldReturnFalseWhenFirstIsNotNullSecondIsNull() {
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    void shouldReturnFalseWhenFirstIsNullSecondIsNotNull() {
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    void shouldReturnTrueWhenBothCharSequencesAreEqual() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    void shouldReturnFalseWhenCharSequencesHaveDifferentCase() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    void shouldHandleNullAsEmpty() {
        assertEquals("", StringUtils.toString((byte[]) null, "UTF-8"));
    }

    // Additional test cases can be added as needed to cover more scenarios
}