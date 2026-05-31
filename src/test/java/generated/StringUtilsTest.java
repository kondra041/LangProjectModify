import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    public void isBlank_ShouldReturnTrueForNullOrEmptyString() {
        assertEquals(true, StringUtils.isBlank(null));
        assertEquals(true, StringUtils.isBlank(""));
    }

    @Test
    public void isBlank_ShouldReturnFalseForNonWhitespaceString() {
        assertEquals(false, StringUtils.isBlank("bob"));
    }

    @Test
    public void isBlank_ShouldReturnFalseForStringWithWhitespace() {
        assertEquals(false, StringUtils.isBlank("  bob  "));
    }
}