package Arrays;

/** * LinearSearch */
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println();
        int[] arr = { 2, 4, 32, 111, 123, 999 };
        System.out.println(searchIndex(arr, 111, 0));
        System.out.println();
    }

    static boolean search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || search(arr, target, index + 1);
    }

    static int searchIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return searchIndex(arr, target, index + 1);
    }
}
