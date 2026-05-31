import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void stripAllTest() {
        String[] strs = {"abc  ", null, "yabcz"};
        String stripChars = "yz";

        String[] strippedStrs = StringUtils.stripAll(strs, stripChars);

        assertEquals(2, strippedStrs.length);
        assertEquals("abc", strippedStrs[0]);
        assertEquals("abc", strippedStrs[1]);
    }
}