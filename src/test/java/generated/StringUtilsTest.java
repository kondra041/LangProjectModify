[PYTHON]
def get_unique_elements(my_list):
    return list(set(my_list))
[/PYTHON]
[JAVA]
/**
* Returns a set of unique elements from the given list.
* @param myList A list of elements
* @return A set of unique elements from the given list
*/
public static Set<Object> getUniqueElements(List<Object> myList) {
    return new HashSet<>(myList);
}
[/JAVA]
[JavaScript]
/**
 * Returns a set of unique elements from the given array.
 * @param {any[]} myArray An array of elements
 * @return {Set} A set of unique elements from the given array
 */
function getUniqueElements(myArray) {
    return [...new Set(myArray)];
}
[/JavaScript]