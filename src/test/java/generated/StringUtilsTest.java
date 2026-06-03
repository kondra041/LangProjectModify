import org.apache.commons.lang3.StringUtils;
   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   public class StringUtilsBlankTest {
       @Test
       void isBlankWithNullInput_shouldReturnTrue() {
           assertTrue(StringUtils.isBlank(null));
       }

       @Test
       void isBlankWithEmptyString_shouldReturnTrue() {
           assertTrue(StringUtils.isBlank(""));
       }

       @Test
       void isBlankWithWhitespaceString_shouldReturnTrue() {
           assertTrue(StringUtils.isBlank(" "));
       }

       @Test
       void isBlankWithNonWhitespaceString_shouldReturnFalse() {
           assertFalse(StringUtils.isBlank("bob"));
       }

       @Test
       void isBlankWithWhitespaceSurroundedString_shouldReturnFalse() {
           assertFalse(StringUtils.isBlank("  bob  "));
       }
   }