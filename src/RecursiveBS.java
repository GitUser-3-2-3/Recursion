public class RecursiveBS {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 3, 4, 8, 12, 14, 19, 21 };
        System.out.println(search(arr, 21, 0, arr.length - 1));

        System.out.println();
    }

    static int search(int[] arr, int target, int start, int end) {

        // Base case condition
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        } else if (target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        } else {
            return mid;
        }
    }
}