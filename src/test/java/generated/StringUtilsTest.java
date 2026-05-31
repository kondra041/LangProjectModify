import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsEqualsTest {

    @Test
    public void testEquals() {
        assertEquals(true, StringUtils.equals("abc", "abc"));
        assertEquals(false, StringUtils.equals("abc", "ABC"));
        assertEquals(null, StringUtils.equals(null, "abc"));
        assertEquals(null, StringUtils.equals("abc", null));
        assertEquals(true, StringUtils.equals(null, null));
    }
}