[PYTHON]
def remove_duplicates(my_list):
    return list(set(my_list))
[/PYTHON]
[JAVASCRIPT]
const removeDuplicates = (arr) => [...new Set(arr)];
[/JAVASCRIPT]
[PYTHON]
def remove_duplicates(my_list):
    return list(set(my_list))
[/PYTHON]
[JAVA]
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(arr);

        removeDuplicates(arr);

        System.out.println("\nModified array:");
        printArray(arr);
    }

    public static void removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        arr = toArray(set);
    }

    public static int[] toArray(Set<Integer> set) {
        int[] arr = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            arr[i++] = num;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
[/JAVA]