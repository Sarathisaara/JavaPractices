/**
 * X
 */
public class X {
    public static void main(String[] args) {
        int n = 4;
        // for (int i = 1; i <= n; i++) {
        // int k = 0;
        // for (int j = i; j < n * i && k < n; j = j + n - k) {
        // System.out.print(j + " ");
        // k++;
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= n; i++) {
            int k = n - 1;
            int next = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(next + " ");
                next += k;
                k--;
            }
            System.out.println();

        }
    }

}