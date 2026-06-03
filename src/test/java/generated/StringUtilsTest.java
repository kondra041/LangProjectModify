package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testIsEmpty() {
        assertEquals(true, StringUtils.isBlank(null));
        assertEquals(true, StringUtils.isBlank(""));
        assertEquals(true, StringUtils.isBlank(" "));
        assertEquals(false, StringUtils.isBlank("bob"));
        assertEquals(false, StringUtils.isBlank("  bob  "));
    }
}