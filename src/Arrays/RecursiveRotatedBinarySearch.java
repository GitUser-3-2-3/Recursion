package Arrays;

/**
 * RecursiveRotatedBinarySearch
 */
public class RecursiveRotatedBinarySearch {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 6, 8, 9, 11, 3, 4, 5};
        System.out.println(search(arr, 5, 0, arr.length - 1));

        System.out.println();
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid - 1);
    }
}
