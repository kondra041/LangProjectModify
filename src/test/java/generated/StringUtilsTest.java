package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTests {

    @Test
    public void testRemoveEnd_NullInput() {
        // Arrange
        String str = null;
        String remove = "remove";

        // Act
        String result = StringUtils.removeEnd(str, remove);

        // Assert
        assertNull(result);
    }

    @Test
    public void testRemoveEnd_EmptyInput() {
        // Arrange
        String str = "";
        String remove = "remove";

        // Act
        String result = StringUtils.removeEnd(str, remove);

        // Assert
        assertEquals("", result);
    }

    @Test
    public void testRemoveEnd_NullRemove() {
        // Arrange
        String str = "testString";
        String remove = null;

        // Act
        String result = StringUtils.removeEnd(str, remove);

        // Assert
        assertEquals("testString", result);
    }

    @Test
    public void testRemoveEnd_EmptyRemove() {
        // Arrange
        String str = "testString";
        String remove = "";

        // Act
        String result = StringUtils.removeEnd(str, remove);

        // Assert
        assertEquals("testString", result);
    }

    @Test
    public void testRemoveEnd_SubstringAtEnd() {
        // Arrange
        String str = "www.domain.com";
        String remove = ".com";

        // Act
        String result = StringUtils.removeEnd(str, remove);

        // Assert
        assertEquals("www.domain", result);
    }

    @Test
    public void testRemoveEnd_NoSubstringAtEnd() {
        // Arrange
        String str = "www.domain.com";
        String remove = ".com.";

        // Act
        String result = StringUtils.removeEnd(str, remove);

        // Assert
        assertEquals("www.domain.com", result);
    }
}