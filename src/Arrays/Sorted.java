package Arrays;

public class Sorted {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 2, 5, 8, 9, 11 };
        System.out.println(sorted(arr, 0));

        System.out.println();
    }

    static boolean sorted(int[] arr, int index) {
        // base case condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }
}