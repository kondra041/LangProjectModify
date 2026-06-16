package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class StringUtilsTests {
    @Test
    void testIsBlank() {
        assert StringUtils.isBlank(null);
        assert StringUtils.isBlank("");
        assert StringUtils.isBlank(" ");

        assertFalse(StringUtils.isBlank("bob"));
        assertFalse(StringUtils.isBlank("  bob  "));
    }
}