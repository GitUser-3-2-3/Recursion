public class Recursion {
    public static void main(String[] args) {
        System.out.println();

        print(1);
    }

    public static void print(int n) {
        System.out.println(n);

        if (n == 1000) {
            return;
        } else {
            print(n + 1);
        }
    }
}