package generated;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

  @Test
  void substringBetween_shouldReturnNullIfStrIsNullOrEmpty() {
    // given
    String str = null;

    // when
    String result = StringUtils.substringBetween(str, "open", "close");

    // then
    assertNull(result);
  }

  @Test
  void substringBetween_shouldReturnNullIfOpenAndCloseIsNullOrEmpty() {
    // given
    String str = "wx[b]yz";
    String open = null;
    String close = null;

    // when
    String result = StringUtils.substringBetween(str, open, close);

    // then
    assertNull(result);
  }

  @Test
  void substringBetween_shouldReturnNullIfOpenAndCloseIsEmpty() {
    // given
    String str = "wx[b]yz";
    String open = "";
    String close = "";

    // when
    String result = StringUtils.substringBetween(str, open, close);

    // then
    assertNull(result);
  }

  @Test
  void substringBetween_shouldReturnNullIfOpenAndCloseIsNotFound() {
    // given
    String str = "yabcz";
    String open = "x";
    String close = "y";

    // when
    String result = StringUtils.substringBetween(str, open, close);

    // then
    assertNull(result);
  }

  @Test
  void substringBetween_shouldReturnNullIfOpenAndCloseIsNotFoundWithNestedSubstring() {
    // given
    String str = "yabczyabcz";
    String open = "x";
    String close = "y";

    // when
    String result = StringUtils.substringBetween(str, open, close);

    // then
    assertNull(result);
  }

  @Test
  void substringBetween_shouldReturnNestedSubstring() {
    // given
    String str = "yabczyabcz";
    String open = "[";
    String close = "]";

    // when
    String result = StringUtils.substringBetween(str, open, close);

    // then
    assertEquals("b", result);
  }
}