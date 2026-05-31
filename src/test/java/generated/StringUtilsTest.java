package generated;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsRemoveEndTest {

    @Test
    public void testRemoveEnd_nullSourceString() {
        String result = StringUtils.removeEnd(null, "suffix");
        assertNull(result);
    }

    @Test
    public void testRemoveEnd_emptySourceString() {
        String result = StringUtils.removeEnd("", "suffix");
        assertEquals("", result);
    }

    @Test
    public void testRemoveEnd_nullSuffix() {
        String result = StringUtils.removeEnd("www.domain.com", null);
        assertEquals("www.domain.com", result);
    }

    @Test
    public void testRemoveEnd_suffixNotAtEnd() {
        String result = StringUtils.removeEnd("www.domain.com", ".com.");
        assertEquals("www.domain.com", result);
    }

    @Test
    public void testRemoveEnd_suffixAtEnd() {
        String result = StringUtils.removeEnd("www.domain.com", ".com");
        assertEquals("www.domain", result);
    }

    @Test
    public void testRemoveEnd_exactMatchButNotSuffix() {
        String result = StringUtils.removeEnd("www.domain.com", "domain");
        assertEquals("www.domain.com", result);
    }

    @Test
    public void testRemoveEnd_emptySuffix() {
        String result = StringUtils.removeEnd("abc", "");
        assertEquals("abc", result);
    }
}