package Pattern;

/**
 * Trianlge
 */
public class Trianlge {
    public static void main(String[] args) {
        System.out.println();

        triangle(4, 0);

        System.out.println();
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            triangle(r, c + 1);
            System.out.print("* ");
        } else {
            System.out.println();
            triangle(r - 1, 0);
            System.out.println();
        }
    }
}