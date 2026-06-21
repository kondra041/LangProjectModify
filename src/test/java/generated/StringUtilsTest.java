package generated;

   import org.apache.commons.lang3.StringUtils;
   import org.junit.jupiter.api.Test;

   import java.nio.charset.StandardCharsets;
   import java.util.Arrays;
   import java.util.List;

   import static org.junit.jupiter.api.Assertions.*;
   import static org.mockito.Mockito.*;

   public class StringUtilsTest {

       @Test
       public void testSubstringBetween() {
           assertEquals("b", StringUtils.substringBetween("wx[b]yz", "[", "]"));
           assertNull(StringUtils.substringBetween(null, "*", "*"));
           assertNull(StringUtils.substringBetween("*", null, "*"));
           assertNull(StringUtils.substringBetween("*", "*", null));
           assertEquals("", StringUtils.substringBetween("", "", ""));
           assertNull(StringUtils.substringBetween("", "", "]"));
           assertNull(StringUtils.substringBetween("", "[", "]"));
           assertEquals("", StringUtils.substringBetween("yabcz", "", ""));
           assertEquals("abc", StringUtils.substringBetween("yabczyabcz", "y", "z"));
       }

       // More tests for other methods can be added similarly...
   }