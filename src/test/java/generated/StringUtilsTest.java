package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class RemoveStartTest {

    @Test
    public void testRemoveStart() {
        String str = "www.domain.com";
        String remove = "www.";
        assertEquals("domain.com", StringUtils.removeStart(str, remove));

        str = "domain.com";
        remove = "www.";
        assertEquals("domain.com", StringUtils.removeStart(str, remove));

        str = "www.domain.com";
        remove = "domain";
        assertEquals("www.domain.com", StringUtils.removeStart(str, remove));
    }
}