package generated;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.lang3.CharSequenceUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class CharSequenceUtilsTests {

    @Test
    public void testEquals() {
        // Both nulls should return true
        assertTrue(CharSequenceUtils.equals(null, null));

        // One null and one non-null should return false
        assertFalse(CharSequenceUtils.equals(null, "abc"));
        assertFalse(CharSequenceUtils.equals("abc", null));

        // Same content with different cases should return false
        assertFalse(CharSequenceUtils.equals("abc", "ABC"));

        // Same content should return true
        assertTrue(CharSequenceUtils.equals("abc", "abc"));
    }
}