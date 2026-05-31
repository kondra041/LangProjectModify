package generated;

import org.apache.commons.lang3.CharSequenceUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStringMethods {

    @Test
    public void testEquals() {
        assertEquals(true, StringUtils.equals(null, null));
        assertEquals(false, StringUtils.equals(null, "abc"));
        assertEquals(false, StringUtils.equals("abc", null));
        assertEquals(true, StringUtils.equals("abc", "abc"));
        assertEquals(false, StringUtils.equals("abc", "ABC"));

        String s1 = new String("Hello");
        String s2 = "World";
        assertEquals(false, StringUtils.equals(s1, s2));

        String s3 = "Hello";
        assertEquals(true, StringUtils.equals(s3, s3));
    }

    @Test
    public void testEqualsIgnoreCase() {
        assertEquals(true, StringUtils.equals("hello", "HELLO"));
        assertEquals(false, StringUtils.equals("hello", "world"));

        String s1 = new String("Hello");
        String s2 = "World";
        assertEquals(false, StringUtils.equals(s1, s2));

        String s3 = "Hello";
        assertEquals(true, StringUtils.equals(s3, s3));
    }

    @Test
    public void testEqualsIgnoreCaseArray() {
        assertEquals(true, StringUtils.equals(new String[] {"hello", "world"}, new String[] {"HELLO", "WORLD"}));
        assertEquals(false, StringUtils.equals(new String[] {"hello", "world"}, new String[] {"hello", "wOrLd"}));

        String s1 = new String("Hello");
        String s2 = "World";
        String s3 = new String[]{"abc"};
        String s4 = new String[]{"def"};

        assertEquals(false, StringUtils.equals(s1, s2));
        assertEquals(false, StringUtils.equals(s3, s4));
    }

    @Test
    public void testEqualsArray() {
        assertEquals(true, StringUtils.equals(new String[] {"hello", "world"}, new String[] {"hello", "world"}));
        assertEquals(false, StringUtils.equals(new String[] {"hello", "world"}, new String[] {"hello", "wOrLd"}));

        String s1 = new String("Hello");
        String s2 = "World";
        String s3 = new String[]{"abc"};
        String s4 = new String[]{"def"};

        assertEquals(false, StringUtils.equals(s1, s2));
        assertEquals(false, StringUtils.equals(s3, s4));
    }

    @Test
    public void testEqualsArrayIgnoreCase() {
        assertEquals(true, StringUtils.equals(new String[] {"hello", "world"}, new String[] {"HELLO", "WORLD"}));
        assertEquals(false, StringUtils.equals(new String[] {"hello", "world"}, new String[] {"hello", "wOrLd"}));

        String s1 = new String("Hello");
        String s2 = "World";
        String s3 = new String[]{"abc"};
        String s4 = new String[]{"def"};

        assertEquals(false, StringUtils.equals(s1, s2));
        assertEquals(false, StringUtils.equals(s3, s4));
    }

    @Test
    public void testEqualsArrayIgnoreCaseAndCaseSensitive() {
        String[] s1 = new String[] {"hello", "world"};
        String[] s2 = new String[] {"HELLO", "WORLD"};

        assertEquals(true, StringUtils.equals(s1, s2));

        String s3 = new String[]{"abc"};
        String s4 = new String[]{"def"};

        assertEquals(false, StringUtils.equals(s3, s4));
    }

    @Test
    public void testEmptyString() {
        assertEquals(true, StringUtils.isEmpty(""));
        assertEquals(true, StringUtils.isEmpty(null));
        assertEquals(false, StringUtils.isEmpty("a"));
    }
}