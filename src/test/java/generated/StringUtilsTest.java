package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void stripEnd_Null_ReturnsNull() {
        // Arrange and Act
        String result = StringUtils.stripEnd(null, "abc");
        
        // Assert
        assertNull(result);
    }

    @Test
    public void stripEnd_EmptyString_ReturnsEmptyString() {
        // Arrange and Act
        String result = StringUtils.stripEnd("", "abc");
        
        // Assert
        assertEquals("", result);
    }

    @Test
    public void stripEnd_Abc_Null_StripsNoChars() {
        // Arrange and Act
        String result = StringUtils.stripEnd("abc", null);
        
        // Assert
        assertEquals("abc", result);
    }

    @Test
    public void stripEnd_Abc_Whitespace_StripsNoChars() {
        // Arrange and Act
        String result = StringUtils.stripEnd(" abc ", "abc");
        
        // Assert
        assertEquals(" abc ", result);
    }

    @Test
    public void stripEnd_Abc_StripChars_RemovesCharacters() {
        // Arrange and Act
        String result = StringUtils.stripEnd("abcyx", "xyz");
        
        // Assert
        assertEquals("  ab", result);
    }

    @Test
    public void stripEnd_12000_RemoveZeroes() {
        // Arrange and Act
        String result = StringUtils.stripEnd("120.00", ".0");
        
        // Assert
        assertEquals("12", result);
    }
}