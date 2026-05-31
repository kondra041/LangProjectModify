package generated;

   import static org.junit.jupiter.api.Assertions.*;
   import static org.mockito.Mockito.*;

   import java.nio.charset.UnsupportedCharsetException;
   import org.apache.commons.lang3.StringUtils;
   import org.junit.jupiter.api.Test;

   public class StringUtilsTest {

       @Test
       public void testStripAll() {
           // Test with null array
           assertNull(StringUtils.stripAll(null, null));
           assertNull(StringUtils.stripAll(null, "yz"));

           // Test with empty array
           assertArrayEquals(new String[]{}, StringUtils.stripAll(new String[]{}, null));
           assertArrayEquals(new String[]{}, StringUtils.stripAll(new String[]{}, "yz"));

           // Test with null and non-null stripChars
           assertArrayEquals(new String[]{"abc", "abc"}, StringUtils.stripAll(new String[]{"abc", "  abc"}, null));
           assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(new String[]{"abc  ", null}, null));
           assertArrayEquals(new String[]{"abc  ", null}, StringUtils.stripAll(new String[]{"abc  ", null}, "yz"));
           assertArrayEquals(new String[]{"abc", null}, StringUtils.stripAll(new String[]{"yabcz", null}, "yz"));
       }

       @Test
       public void testToString() throws UnsupportedCharsetException {
           // Test with null bytes and charsetName
           assertThrows(NullPointerException.class, () -> StringUtils.toString(null, null));
           assertThrows(NullPointerException.class, () -> StringUtils.toString(null, "UTF-8"));

           // Test with empty bytes and charsetName
           assertEquals("", StringUtils.toString(new byte[]{}, null));
           assertEquals("", StringUtils.toString(new byte[]{}, "UTF-8"));

           // Test with non-empty bytes and charsetName
           byte[] bytes = new byte[]{65, 66, 67};
           assertEquals("ABC", StringUtils.toString(bytes, null));
           assertEquals("ABC", StringUtils.toString(bytes, "UTF-8"));
       }
   }