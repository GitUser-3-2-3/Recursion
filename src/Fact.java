public class Fact {
    public static void main(String[] args) {
        System.out.println();

        int ans = fact(5);
        System.out.println(ans);

        System.out.println();
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }
}