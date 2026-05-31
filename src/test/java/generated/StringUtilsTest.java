package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTest {

    @Test
    public void testRemoveStart() {
        String result1 = StringUtils.removeStart(null, "test");
        assertNull(result1);

        String result2 = StringUtils.removeStart("", "");
        assertEquals("", result2);

        String result3 = StringUtils.removeStart("www.domain.com", "www.");
        assertEquals("domain.com", result3);

        String result4 = StringUtils.removeStart("www.domain.com", "domain");
        assertEquals("www.domain.com", result4);

        String result5 = StringUtils.removeStart("abc", "");
        assertEquals("abc", result5);
    }
}