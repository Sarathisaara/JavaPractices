package pattern;

public class Alphabets {
    public static void main(String[] args) {
        int n = 26;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (n - i + j + 64) + " ");
            }
            System.out.println();
        }

    }
}