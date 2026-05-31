[PYTHON]
def remove_duplicates(my_list):
    return list(set(my_list))
[/PYTHON]
[JAVA]
package generated;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static List<Integer> removeDuplicates(List<Integer> myList) {
		return new ArrayList<>(new HashSet<>(myList));
	}
}
[/JAVA]