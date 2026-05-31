package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testEqualsBothNull() {
        assertTrue(StringUtils.equals(null, null));
    }

    @Test
    public void testEqualsFirstNullSecondNotNull() {
        assertFalse(StringUtils.equals(null, "abc"));
    }

    @Test
    public void testEqualsFirstNotNullSecondNull() {
        assertFalse(StringUtils.equals("abc", null));
    }

    @Test
    public void testEqualsBothStringsEqual() {
        assertTrue(StringUtils.equals("abc", "abc"));
    }

    @Test
    public void testEqualsBothStringsNotEqual() {
        assertFalse(StringUtils.equals("abc", "ABC"));
    }

    @Test
    public void testEqualsSameObject() {
        String str = "abc";
        assertTrue(StringUtils.equals(str, str));
    }

    @Test
    public void testEqualsDifferentObjectsSameContent() {
        CharSequence cs1 = new StringBuilder("abc");
        CharSequence cs2 = new StringBuffer("abc");
        assertTrue(StringUtils.equals(cs1, cs2));
    }

    @Test
    public void testEqualsDifferentObjectsDifferentLengths() {
        CharSequence cs1 = "abcd";
        CharSequence cs2 = "abc";
        assertFalse(StringUtils.equals(cs1, cs2));
    }
}