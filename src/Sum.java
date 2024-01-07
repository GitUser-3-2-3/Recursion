/**
 * Fact
 */
public class Sum{
    public static void main(String[] args) {
        System.out.println();

        int ans = sum(5);
        System.out.println(ans);

        System.out.println();
    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }

        return n + sum(n - 1);
    }
}