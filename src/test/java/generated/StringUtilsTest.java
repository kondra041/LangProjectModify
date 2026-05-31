import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void testSubstringBetween() {
        String str = "wx[b]yz";
        String open = "[";
        String close = "]";

        String expected = "b";
        String actual = StringUtils.substringBetween(str, open, close);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubstringBetweenNullInput() {
        String str = null;
        String open = "[";
        String close = "]";

        String expected = null;
        String actual = StringUtils.substringBetween(str, open, close);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubstringBetweenNullOpen() {
        String str = "wx[b]yz";
        String open = null;
        String close = "]";

        String expected = null;
        String actual = StringUtils.substringBetween(str, open, close);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubstringBetweenNullClose() {
        String str = "wx[b]yz";
        String open = "[";
        String close = null;

        String expected = null;
        String actual = StringUtils.substringBetween(str, open, close);

        assertEquals(expected, actual);
    }
}