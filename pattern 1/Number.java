package pattern;

public class Number {
    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            int k = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k += n - j;
            }
            num++;
            System.out.println();
        }
    }
}
