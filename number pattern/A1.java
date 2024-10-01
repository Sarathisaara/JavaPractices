public class A1 {
    public static void main(String[] args) {
        // number triangle
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // number incresing pyramid:
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // number increase with reverse pyramid
        // int n = 6;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // number changing pyramid
        // int num = 1;
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num++;
        // }
        // System.out.println();
        // }

        // number down increase pyramid
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // int k = n - 1;
        // int num = i;
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // num += k;
        // k--;
        // }
        // System.out.println();
        // }

        // zero-one pyramid
        // int n = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if ((i + j) % 2 == 0) {
        // System.out.print(1 + " ");
        // } else {
        // System.out.print(0 + " ");
        // }
        // }
        // System.out.println();
        // }

        // palindrome pyramid
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // for (int j = 2; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // reverse num triangle
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j <= n; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // mirror imagr triangle
        // int n = 6;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j <= n; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // for (int i = n - 1; i >= 1; i--) {
        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = i; j <= n; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // pascal triangle
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
}