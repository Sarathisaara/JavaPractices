package pattern;

/**
 * Binary
 */
public class Binary {

    public static void main(String[] args) {
        int b = 6;
        int a = 3;
        int res = 1;

        while (b != 0) {
            int temp = b & 1;
            if (temp == 0)
                res *= a;
            a *= a;
            b /= 2;
        }
        System.out.println(res);
    }
}