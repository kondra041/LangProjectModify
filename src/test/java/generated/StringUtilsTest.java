package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringUtilsTest {

    @Test
    public void testRemoveStart() {
        // Test when str is null
        assertNull(StringUtils.removeStart(null, "www."));
        
        // Test when remove is null
        assertEquals("www.domain.com", StringUtils.removeStart("www.domain.com", null));
        
        // Test when both str and remove are empty strings
        assertEquals("", StringUtils.removeStart("", ""));
        
        // Test when str starts with the remove string
        assertEquals("domain.com", StringUtils.removeStart("www.domain.com", "www."));
        
        // Test when str does not start with the remove string
        assertEquals("www.domain.com", StringUtils.removeStart("domain.com", "www."));
        
        // Test when remove is an empty string
        assertEquals("abc", StringUtils.removeStart("abc", ""));
    }
}