[PYTHON]
def get_unique_elements(my_list):
    return list(set(my_list))
[/PYTHON]
[JAVA]
package org.apache.commons.lang3;

public class ArrayUtils {
  public static boolean isEmpty(Object[] array) {
    return array == null || array.length == 0;
  }

  public static boolean isNotEmpty(Object[] array) {
    return !isEmpty(array);
  }
}
[/JAVA]