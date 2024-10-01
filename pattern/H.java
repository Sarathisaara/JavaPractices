
public class H {

    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i <= n / 2; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");

            }

            for (int j = n - (i + i); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n / 2; i++) {
            for (int k = n / 2 - i; k >= 1; k--) {
                System.out.print(" ");
            }

            for (int j = 2 * i + 1; j >= 1; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}