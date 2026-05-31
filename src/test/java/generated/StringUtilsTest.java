import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testEqualsIgnoreCase() {
        assertEquals(true, StringUtils.equalsIgnoreCase("abc", "ABC"));
        assertEquals(false, StringUtils.equalsIgnoreCase("abc", "def"));
    }
}