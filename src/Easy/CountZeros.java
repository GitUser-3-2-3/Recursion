package Easy;
/**
 * CountZeros
 */
public class CountZeros {
    public static void main(String[] args) {
        System.out.println();

        System.out.println(count(203102));

        System.out.println();
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        if (n % 10 == 0) {
            return helper(n / 10, c + 1);
        } else {
            return helper(n / 10, c);
        }
    }
}