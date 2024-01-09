package Easy;
public class Palindrome {

    static int rev = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        rev = rev * 10 + rem;
        rev1(n / 10);
    }

    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument. In that
        // case, make another function

        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static boolean check(int n) {
        return (n == rev2(n));
    }

    public static void main(String[] args) {
        System.out.println();

        System.out.println(check(12321));
    }
}
