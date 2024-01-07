public class RevOfNum {

    static int rev = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        rev = rev * 10 + rem;
        rev1(n / 10);
    }

    static void rev2(int n, int args) {
        // sometimes you might need some additional variables in the argument. In that case, make another function

    }

    public static void main(String[] args) {
        System.out.println();

        rev1(1234);
        System.out.println(rev);
    }
}
