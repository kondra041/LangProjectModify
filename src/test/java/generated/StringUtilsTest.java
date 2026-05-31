package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTests {

    @Test
    public void testStripAllWithNullInput() {
        // Arrange
        String[] strs = null;
        
        // Act
        String[] result = StringUtils.stripAll(strs, " ");
        
        // Assert
        assertNull(result);
    }

    @Test
    public void testStripAllWithEmptyInput() {
        // Arrange
        String[] strs = {};
        
        // Act
        String[] result = StringUtils.stripAll(strs, " ");
        
        // Assert
        assertEquals(0, result.length);
    }

    @Test
    public void testStripAllWithNullAndWhitespace() {
        // Arrange
        String[] strs = {"  abc", null};
        
        // Act
        String[] result = StringUtils.stripAll(strs, " ");
        
        // Assert
        assertEquals("abc", result[0]);
        assertNull(result[1]);
    }

    @Test
    public void testStripAllWithCustomStripChars() {
        // Arrange
        String[] strs = {"yabcz", null};
        
        // Act
        String[] result = StringUtils.stripAll(strs, "yz");
        
        // Assert
        assertEquals("abc", result[0]);
        assertNull(result[1]);
    }
}