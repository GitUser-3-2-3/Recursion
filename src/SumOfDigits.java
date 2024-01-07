public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println();

        int ans = sum(1234);
        System.out.println(ans);
        System.out.println();
    }

    private static int sum(int i) {
        if (i == 0) {
            return 0;
        }

        return (i % 10) + sum(i / 10);
    }
}