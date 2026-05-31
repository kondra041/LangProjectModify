package generated;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.CharSequenceUtils;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.text.StrSubstitutor;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testEquals() {
        // Test case: both null should return true
        assertTrue(StringUtils.equals(null, null));
        
        // Test case: one null should return false
        assertFalse(StringUtils.equals("abc", null));
        assertFalse(StringUtils.equals(null, "abc"));
        
        // Test case: equal strings should return true
        assertTrue(StringUtils.equals("abc", "abc"));
        
        // Test case: different strings should return false
        assertFalse(StringUtils.equals("abc", "ABC"));
        
        // Test case: one empty string and other non-empty should return false
        assertFalse(StringUtils.equals("", "nonEmptyString"));
    }
    
    @Test
    void testEqualsWithCharSequences() {
        // Test case with String and StringBuilder instances
        assertTrue(StringUtils.equals(new StringBuilder("abc"), new String("abc")));
        
        // Test case with different content in StringBuilder and String
        assertFalse(StringUtils.equals(new StringBuilder("ABC"), "abc"));
    }
    
    @Test
    void testEqualsWithSpecialCases() {
        // Test case with empty strings should return true
        assertTrue(StringUtils.equals("", ""));
        
        // Test case with same reference should return true
        String str = new String();
        assertTrue(StringUtils.equals(str, str));
    }

}