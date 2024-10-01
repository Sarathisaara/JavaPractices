package pattern;

import java.util.Scanner;

public class Rowandloop {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int k = 1;
            int j = i;
            while (j < i * 3 && k <= i) {
                System.out.print(j);
                j += (n - k);
                k++;
            }
            System.out.println();
        }
    }
}