package generated;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void substring() {
        assertEquals("abc", StringUtils.substring("abcde", 0, 3));
        assertEquals("", StringUtils.substring("abcde", 10, 3));
        assertEquals("", StringUtils.substring("abcde", 2, -8));
        assertEquals("ab", StringUtils.substring("abcde", -4, 4));
        assertEquals("bc", StringUtils.substring("abcde", 1, -1));
    }

    @Test
    void substring safety() {
        final String s = "abc";
        for (int i = -3; i < 3; ++i) {
            for (int j = -2; j < 4; ++j) {
                assertEquals(s.substring(Math.max(0, i), Math.min(s.length(), j)), StringUtils.substring(s, i, j));
            }
        }
    }

    @Test
    void toStringUsingEncoding() throws UnsupportedEncodingException {
        final byte[] bytes = new byte[]{1, 2, 3};
        assertEquals(new String(bytes, "UTF-8"), StringUtils.toString(bytes, "UTF-8"));
        assertEquals(new String(bytes), StringUtils.toString(bytes));
    }
}