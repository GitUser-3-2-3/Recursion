package Intro;
public class ProdOfDigits {
    public static void main(String[] args) {
        System.out.println();

        int ans = prod(1234);
        System.out.println(ans);
        System.out.println();
    }

    private static int prod(int i) {
        if (i%10 == i) {
            return i;
        }

        return (i % 10) * prod(i / 10);
    }
}